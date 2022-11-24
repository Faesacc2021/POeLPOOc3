package POC3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;

import Model.Conta;
import Model.ContaEspecial;

public class FilesOperations {
	String caminhoLeitura =  "C:\\Users\\aluno.laboratorio\\Desktop\\Arquivos\\cliente500inv.txt";
	String caminhoEscrita =  "D:\\Heitor\\Desktop\\ArquivoResultado\\Shell50000ord.txt";

	public static ArrayList<Conta> fileReaderConta(String fileName) throws IOException {
		ArrayList<Conta> meuArray = new ArrayList<Conta>();
		FileReader arqLeitura = new FileReader(fileName);
		BufferedReader lerArq = new BufferedReader(arqLeitura);

		String confereNull = "";
		String linha = "";
		String[] valorComSplit;

		while (confereNull != null) {
			confereNull = lerArq.readLine();
			if (confereNull != null) {
				linha = confereNull;
				valorComSplit = linha.split(";");
				if (valorComSplit[0].charAt(1) == '1') {

					meuArray.add(new Conta(Integer.parseInt(linha.split(";")[0]), linha.split(";")[1], linha.split(";")[2]));

				} else {

					meuArray.add(new ContaEspecial(Integer.parseInt(linha.split(";")[0]), linha.split(";")[1], linha.split(";")[2], Double.parseDouble(linha.split(";")[4])));

				}
			}
		}
		arqLeitura.close();

		return meuArray;
	}
	
	public static ArrayList<String> fileReaderString(String fileName) throws IOException {
		ArrayList<String> meuArray = new ArrayList<String>();
		FileReader arqLeitura = new FileReader(fileName);
		BufferedReader lerArq = new BufferedReader(arqLeitura);

		String confereNull = "";

		while (confereNull != null) {
			confereNull = lerArq.readLine();
			if (confereNull != null) {
				meuArray.add(confereNull);
			}
		}
		
		arqLeitura.close();
		return meuArray;
	}

	public static boolean fileWriter(ArrayList<Conta> array, String fileNameResult) throws IOException {
		FileWriter arqEscrita = new FileWriter(fileNameResult);
		PrintWriter gravarArq = new PrintWriter(arqEscrita);
		boolean isFileCreate = false;	
		try {
			for (int i = 0; i < array.size(); i++) {
				if (array.get(i) instanceof ContaEspecial) {
					ContaEspecial contaEspecial = (ContaEspecial) array.get(i);
					gravarArq.println(contaEspecial.getNumero() + ";" + contaEspecial.getNome() + ";" + contaEspecial.getCpf() + ";" + contaEspecial.getValorNaConta() + ";" + contaEspecial.getLimite());
				} else {
					gravarArq.println(array.get(i).getNumero() + ";" + array.get(i).getNome() + ";" + array.get(i).getCpf() + ";" + array.get(i).getValorNaConta());
				}
			}
			gravarArq.close();
			isFileCreate = true;
		} catch(Exception e) {
			isFileCreate = false;
			e.printStackTrace();
		}
		return isFileCreate;
	}

}	





//	//ler
//	FileReader arqLeitura = new FileReader(caminhoLeitura);
//	BufferedReader lerArq = new BufferedReader(arqLeitura);
//
//	String confereNull = "";
//	String linha = "";
//	String[] valorComSplit;
//
//	while (confereNull != null) {
//		confereNull = lerArq.readLine();
//		if (confereNull != null) {
//			linha = confereNull;
//			valorComSplit = linha.split(";");
//			if (valorComSplit.length == 4) {
//
//				lista.insere(new Conta(Integer.parseInt(linha.split(";")[0]), linha.split(";")[1], linha.split(";")[2]));
//
//			} else {
//
//				lista.insere(new ContaEspecial(Integer.parseInt(linha.split(";")[0]), linha.split(";")[1], linha.split(";")[2], Double.parseDouble(linha.split(";")[4])));
//
//			}
//		}
//	}
//	arqLeitura.close();
//
//	long start = System.currentTimeMillis(); // get time
//	lista.shellsort();
//	long end = System.currentTimeMillis();	
//
//	//escrever
//	FileWriter arqEscrita = new FileWriter(caminhoEscrita);
//	PrintWriter gravarArq = new PrintWriter(arqEscrita);
//
//	for (int i = 0; i < array.size(); i++) {
//		if (lista.getConta(i) instanceof ContaEspecial) {
//
//			ContaEspecial contaEspecial = (ContaEspecial) array.get(i);
//			gravarArq.println(contaEspecial.getNumero() + ";" + contaEspecial.getNome() + ";" + contaEspecial.getCpf() + ";" + contaEspecial.getValorNaConta() + ";" + contaEspecial.getLimite());
//
//		} else {
//
//			gravarArq.println(array.get(i).getNumero() + ";" + array.get(i).getNome() + ";" + array.get(i).getCpf() + ";" + array.get(i).getValorNaConta());
//
//		}
//	}
//	gravarArq.close();
//
//	System.out.println(end - start + "ms");
//}
