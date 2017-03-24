package com.plural.calculadora;

import java.io.*;
import java.net.*;

public class TCPServer {
	public static void main(String argv[]) throws Exception {
		String clientSentence;
		String capitalizedSentence;
		int port=1264;
		ServerSocket socketTCP = new ServerSocket(port);
		Calculadora calc=new Calculadora();
		System.out.println("Rodando... porta: "+String.valueOf(port));

		while (true) {
			Socket connectionSocket = socketTCP.accept();
			BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
			DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
			
			clientSentence = inFromClient.readLine();
			System.out.println("Recebido: " + clientSentence);
			
			clientSentence = calc.calcular(clientSentence);			
			System.out.println("Resultado: " + clientSentence);
			
			capitalizedSentence = clientSentence.toUpperCase() + '\n';
			
			outToClient.writeBytes(capitalizedSentence);			
		}
	}
}