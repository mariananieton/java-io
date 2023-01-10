package br.com.alura.java.io.teste;

import java.io.*;
import java.net.Socket;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {

		//Socket s = new Socket();

		InputStream fis = System.in; //new FileInputStream("lorem.txt"); //s.getInputStream();
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		OutputStream fos = System.out; //new FileOutputStream("lorem2.txt"); //s.getOutputStream();
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();

		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}

		br.close();
		bw.close();
	}
}
