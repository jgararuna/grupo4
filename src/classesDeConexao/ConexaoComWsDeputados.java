package classesDeConexao;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.axis.message.MessageElement;
import org.w3c.dom.NodeList;

import classesDeEntidades.Deputados;
import br.gov.camara.www.SitCamaraWS.Deputados.DeputadosLocator;
import br.gov.camara.www.SitCamaraWS.Deputados.DeputadosSoapStub;
import br.gov.camara.www.SitCamaraWS.Deputados.ObterDeputadosResponseObterDeputadosResult;
import br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosCDResponseObterPartidosCDResult;

public class ConexaoComWsDeputados {

	public ConexaoComWsDeputados() {
		
		
	}
	
	private DeputadosSoapStub obterConexao(){
		URL url;
		try {
			url = new URL("http://www.camara.gov.br/SitCamaraWS/Deputados.asmx");
			DeputadosSoapStub service = (DeputadosSoapStub)
					new DeputadosLocator().getDeputadosSoap(url);
			
			return service;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	private ObterDeputadosResponseObterDeputadosResult receberElementDeputados(DeputadosSoapStub service){
		
		//conexao criada, agora chamaremos a classe do ws
		try {
			ObterDeputadosResponseObterDeputadosResult deputados =
					service.obterDeputados();
			
			return deputados;
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}	
	}
	
	private ObterPartidosCDResponseObterPartidosCDResult receberElementPartidos(DeputadosSoapStub service){
		
		try {
			ObterPartidosCDResponseObterPartidosCDResult partidos =
					service.obterPartidosCD();
			
			return partidos;
		} catch (RemoteException e) {
			e.printStackTrace();
			
			return null;
		}
		
		
	}
	
	public String procurarDeputadoNome(String nomeDeputado){
		ObterDeputadosResponseObterDeputadosResult deputados = 
				receberElementDeputados(obterConexao());
		
		NodeList nome = deputados.get_any()[0].getElementsByTagName("nome");
		
		for(int i = 0; i<=nome.getLength(); i++)
		{
			if(i<nome.getLength())
			{
				MessageElement nomeTemp = (MessageElement) nome.item(i);
				String nomeText = nomeTemp.getFirstChild().getNodeValue();
				if(nomeText.equalsIgnoreCase(nomeDeputado))
				{
					return "deputado encontrado";
				}
				
			}
			else
			{
				return "deputado nao encontrado";
			}
		}
		return null;
	}
	
	public void listarPartidos()
	{
		ObterPartidosCDResponseObterPartidosCDResult partidos = 
				receberElementPartidos(obterConexao());
		
		NodeList partidosNomes = 
				partidos.get_any()[0].getElementsByTagName("nomePartido");
		NodeList partidosExtintos =
				partidos.get_any()[0].getElementsByTagName("dataExtincao");
		
		for(int i = 0; i<partidosNomes.getLength(); i++)
		{
			MessageElement partidosTemp = 
					(MessageElement) partidosNomes.item(i);
			MessageElement extinto = 
					(MessageElement) partidosExtintos.item(i);
			
			String partidosText = partidosTemp.getFirstChild().getNodeValue();
			
			
			try
			{
				String extintoText = extinto.getFirstChild().getNodeValue();
			}
			catch(NullPointerException e)
			{
				System.out.println(partidosText);
			}
		}
	}
	


}
