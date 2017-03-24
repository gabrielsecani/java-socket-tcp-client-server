package com.plural.calculadora;

import java.io.*;
import java.net.*;

public class TCPClient {
	public static void main(String argv[]) throws Exception {
		String sentence = "";
		String modifiedSentence;
		BufferedReader inFromUser = new BufferedReader(new InputStreamReader(
				System.in));
		String host = "localhost";
		int port = 1264;
		if (argv.length >= 1) {
			host = argv[0];
		}
		if (argv.length >= 2) {
			port = Integer.parseInt(argv[1]);
		}

		System.out.println(String.format("Conectando em: %s:%d", host, port));

		Socket clientSocket = new Socket(host, port);
		DataOutputStream server = new DataOutputStream(
				clientSocket.getOutputStream());
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(
				clientSocket.getInputStream()));
		System.out
				.println("Insira o calculo no seguinte formato: 50 + 12. ou q para sair");
		while (!sentence.equals("q")) {
			sentence = inFromUser.readLine();
			server.writeBytes(sentence + '\n');
			modifiedSentence = inFromServer.readLine();
			System.out.println("=" + modifiedSentence);
		}
		clientSocket.close();
	}
}