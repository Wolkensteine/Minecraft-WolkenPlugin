package Main.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PluginFileReader {

	public String Reader(String filename, String PATH) {
		try {
			File myObj = new File(PATH + "/" + filename);
			Scanner myReader = new Scanner(myObj);
			String data = "";
			while (myReader.hasNextLine()) {
				String line = myReader.nextLine();
				System.out.println("WolkenPlugin> Read the following line: " + line);
				data += line;
			}
			myReader.close();
			return data;
		} catch (FileNotFoundException e) {
			System.out.println("WolkenPlugin> An error occurred in FileReader: " + e);
			e.printStackTrace();
			return "error";
		}
	}

}
