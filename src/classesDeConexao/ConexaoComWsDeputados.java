package classesDeConexao;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.xml.rpc.ServiceException;

import org.apache.axis.message.MessageElement;
import org.w3c.dom.NodeList;

import br.gov.camara.www.SitCamaraWS.Deputados.DeputadosLocator;
import br.gov.camara.www.SitCamaraWS.Deputados.DeputadosSoapStub;
import br.gov.camara.www.SitCamaraWS.Deputados.ObterDeputadosResponseObterDeputadosResult;
import br.gov.camara.www.SitCamaraWS.Deputados.ObterPartidosCDResponseObterPartidosCDResult;

public class ConexaoComWsDeputados {

	public ConexaoComWsDeputados() {
		
		
	}
	
	public static DeputadosSoapStub obterConexao()
	throws MalformedURLException, ServiceException{
		URL url;
		url = new URL("http://www.camara.gov.br/SitCamaraWS/Deputados.asmx");
		DeputadosSoapStub service = (DeputadosSoapStub)
		new DeputadosLocator().getDeputadosSoap(url);
		
		return service;
	}
	
	public static ObterDeputadosResponseObterDeputadosResult
		receberElementDeputados(DeputadosSoapStub service){
		
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
	
	private ObterPartidosCDResponseObterPartidosCDResult 
		receberElementPartidos(DeputadosSoapStub service){
		
		try {
			ObterPartidosCDResponseObterPartidosCDResult partidos =
					service.obterPartidosCD();
			
			return partidos;
		} catch (RemoteException e) {
			e.printStackTrace();
			
			return null;
		}
		
		
	}	
}


