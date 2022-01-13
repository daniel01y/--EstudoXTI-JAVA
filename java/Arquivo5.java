package br.com.xti.java;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

public class Arquivo5 {

	public static void main(String[] args) throws IOException {
		
		FileSystem fs = FileSystems.getDefault();
		for(FileStore store : fs.getFileStores()){
			System.out.println("Unidade:" + store.toString());
			System.out.println("Total:" + store.getTotalSpace());
			System.out.println("Disponível:" + store.getUsableSpace());
			System.out.println("Utilizada:" + (store.getTotalSpace() - store.getUsableSpace()));
			System.out.println();
		}
		
	}

}
/*
 Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
		for (Path path: dirs) {
			System.out.println(path);
		}
		
		 LISTAR O CONTEÚDO 
		Path dir = Paths.get("D:/Programacao/dev/ws/estudo/java/cursoo_xti/xti/");
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
			for (Path path : stream) {
				System.out.println(path.getFileName());
			}
			
		} catch(IOException | DirectoryIteratorException e) {
			e.printStackTrace();
		}
  */
 