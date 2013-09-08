package main;

import java.util.Scanner;

import classesDeConexao.ConexaoComWsDeputados;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ConexaoComWsDeputados serviceDeputados = new ConexaoComWsDeputados();
		
		serviceDeputados.listarPartidos();
		
	}

}
