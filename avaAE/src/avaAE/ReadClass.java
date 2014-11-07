package avaAE;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
 
public class ReadClass {
	
	public static BufferedReader br = null;
	
	public static void readFile(){
		 
		try {
			String lineaString;
			br = new BufferedReader(new FileReader("C:\\source_file.txt"));
 
			while ((lineaString = br.readLine()) != null) {
				System.out.println(lineaString);
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}	
	}
	
	public static void store(){
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0;i<list.size();i++){
			list.add(null);
		}
	}
	
}