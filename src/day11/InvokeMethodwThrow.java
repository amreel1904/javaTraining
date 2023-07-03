package day11;

//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class InvokeMethodwThrow {
	public static void main(String[] args) {
		String fileName = "./src/system/AttendanceManagementSystem.java";
		try {
			String sourceCode = readTextFile(fileName);
			System.out.println(sourceCode);

		} catch (IOException ioex) {
			System.err.println("Cannot read file: " + fileName);
			ioex.printStackTrace();
		}
	}

	static String readTextFile(String fName) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(fName));
		StringBuilder result = new StringBuilder();
		try {
			String line;
			while ((line = reader.readLine()) != null)
				result.append(line + System.lineSeparator());
		} finally {
			reader.close();
		}
		return result.toString();
	}

}
