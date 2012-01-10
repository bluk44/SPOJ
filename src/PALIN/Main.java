package PALIN;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
	static String testFolderPath = "testy/PALIN/";
	static String[] testFiles = { "example" };

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		InputStream sourceLive = System.in;
		try {
			InputStream sourceTestIn = new FileInputStream(testFolderPath + testFiles[0] + ".in");
			InputStream sourceTestOut = new FileInputStream(testFolderPath + testFiles[0] + ".out");
			Scanner scannerIn = new Scanner(sourceTestIn);
			int bt;
			int testsN = sourceTestIn.read() - 48;
			sourceTestIn.read();
			System.out.println(testsN);
			for (int t = 0; t < testsN; t++) {
				byte[] arr = new byte[1000000];
				int ptr = 0;
				while ((bt = sourceTestIn.read()) != 10) {
					if (bt != -1) {
						arr[ptr++] = (byte)bt;
					} else {
						break;
					}
				}
				
				for(int i=0;i<ptr;i++){
					System.out.print(arr[i]+" ");
				}
				System.out.println();
			}
		} catch (FileNotFoundException ex) {
			System.out.println("nie znaleziono pliku !!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// byte[] number = new byte[1000000];

	}
}
