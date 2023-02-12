package Main.utils;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class PluginFileWriter {

	public boolean Writer(String value, String PATH, String filename) {

		File directory = new File(PATH);

		if (!directory.exists()) {

			directory.mkdir();

		}

		File file = new File(PATH + "/" + filename);

		System.out.println("Wolkenplugin> FileWriter checks if file to write to exists.");

		try {
			if (file.createNewFile()) {
				System.out.println("File was not found. Created file: " + file.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("WolkenPlugin> An error occured in FileWriter: " + e);
			return false;
		}

		try {
			FileWriter myWriter = new FileWriter(file);
			myWriter.write(value);
			myWriter.close();
			System.out.println("WolkenPlugin> FileWriter successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("WolkenPlugin> An error occurred in FileWriter: " + e);
			e.printStackTrace();
			return false;
		}

		return true;

	}

}
