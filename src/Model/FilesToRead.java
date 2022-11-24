package Model;

import java.util.ArrayList;

public class FilesToRead {

	public static String getFileNames(int position, String pathName, String searchName) {
		ArrayList<String> fileNames = new ArrayList<String>();
		String PATH_NAME_READ = "C:\\Users\\aluno.laboratorio\\Desktop\\Arquivos\\";
		String PATH_NAME_WRITE = "C:\\Users\\aluno.laboratorio\\Desktop\\ArquivosResultados\\";
		
		fileNames.add("cliente500alea");
		fileNames.add("cliente500inv");
		fileNames.add("cliente500ord");
		fileNames.add("cliente1000ale");
		fileNames.add("cliente1000inv");
		fileNames.add("cliente1000ord");
		fileNames.add("cliente5000alea");
		fileNames.add("cliente5000inv");
		fileNames.add("cliente5000ord");
		fileNames.add("cliente10000alea");
		fileNames.add("cliente10000inv");
		fileNames.add("cliente10000ord");
		fileNames.add("cliente50000alea");
		fileNames.add("cliente50000inv");
		fileNames.add("cliente50000ord");
		
		if (pathName.equals("READ")) {
			return(PATH_NAME_READ + fileNames.get(position) + ".txt");
		} else {
			return(PATH_NAME_WRITE + fileNames.get(position) + searchName + ".txt");
		}
		
	}
	
}

