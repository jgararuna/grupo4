package model;

import java.net.MalformedURLException;
import java.util.ArrayList;

import javax.xml.rpc.ServiceException;

import classesDeConexao.ConexaoComWsDeputados;

import org.apache.axis.message.MessageElement;
import org.w3c.dom.NodeList;

import br.gov.camara.www.SitCamaraWS.Deputados.ObterDeputadosResponseObterDeputadosResult;


public class MostrarTodosDeputados {

	public MostrarTodosDeputados() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> getDeputados()
	{
		ArrayList<String> lista = new ArrayList<String>();
		
		ObterDeputadosResponseObterDeputadosResult deputados;
		try {
			deputados = ConexaoComWsDeputados.receberElementDeputados
			(ConexaoComWsDeputados.obterConexao());
			
			
			
			NodeList nome = deputados.get_any()[0].getElementsByTagName("nome");
			for(int i = 0; i<nome.getLength(); i++)
			{
				MessageElement nomeTemp = (MessageElement) nome.item(i);
				String nomeText = nomeTemp.getFirstChild().getNodeValue();
				lista.add(nomeText);
			}
		} catch (MalformedURLException e) {
			lista.add("Erro de Conexão");
		} catch (ServiceException e) {
			lista.add("Erro de Conexão");
		}
		return lista;
	}
}
