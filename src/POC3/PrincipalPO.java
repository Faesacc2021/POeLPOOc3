package POC3;
import java.io.IOException;
import java.util.ArrayList;

import POC3.FilesOperations;

public class PrincipalPO {

	public static void main(String[] args) throws IOException {
		String caminhoLeituraArquivos =  "C:\\Users\\aluno.laboratorio\\Desktop\\Arquivos\\cliente500ord.txt";
		String caminhoEscrita =  "C:\\Users\\aluno.laboratorio\\Desktop\\ArquivosResultados\\500aleaAbb.txt";
		String caminhoLeituraNomes = "C:\\Users\\aluno.laboratorio\\Desktop\\nome.txt";
		
		
		ArrayList<String> arrayNomesArquivos = new ArrayList<String>();
		arrayNomesArquivos = FilesOperations.fileReaderString(caminhoLeituraNomes);
		
		for (int i = 0; i < arrayNomesArquivos.size(); i++) {
			System.out.println(arrayNomesArquivos.get(i));
		}
		
		
//		if (FilesOperations.fileWriter(FilesOperations.fileReaderConta(caminhoLeituraArquivos), caminhoEscrita)) {
//			System.out.println("Arquivo gerado com sucesso");
//		}
		
		
		
		
	}
}
