package files;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Main {
	private static File file = new File("info.txt");
	public static void main(String[] args) {
		try {
			saveOnDisk();
			System.out.println("FILE SCRITTO");
			System.out.println("Ecco il contenuto:");
			System.out.println(readFileFromDisk());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void saveOnDisk() throws IOException {
		FileUtils.writeStringToFile(file, "CIAOOOOOOOOOOO" + System.lineSeparator(), "UTF-8", true);
	}

	public static String readFileFromDisk() throws IOException {
		if (file.exists()) {
			String content = FileUtils.readFileToString(file, "UTF-8");
			return content;
		} else {
			System.out.println("FILE NON TROVATO!");
			return "";
		}
	}
}
