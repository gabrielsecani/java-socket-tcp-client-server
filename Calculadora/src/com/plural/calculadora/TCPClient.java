package com.plural.calculadora;

import java.io.*;
import java.net.*;

public class TCPClient {
	public static void main(String argv[]) throws Exception {
		String sentence;
		String modifiedSentence;
		BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
		String host = "localhost";
		int port = 1264;
		Socket clientSocket = new Socket(host, port);
		DataOutputStream server = new DataOutputStream(clientSocket.getOutputStream());
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
		System.out.println("Insira o calculo no seguinte formato: 50 + 12 ");
		sentence = inFromUser.readLine();
		server.writeBytes(sentence + '\n');
		modifiedSentence = inFromServer.readLine();
		System.out.println(modifiedSentence);

		clientSocket.close();
	}
}