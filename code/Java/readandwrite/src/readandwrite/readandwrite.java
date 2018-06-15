import java.io.*;
public class readandwrite {

	public static void main(String[] args)  throws IOException {
		String filename = "D:\\hello.txt";
		FileWriter writer = new FileWriter(filename);
		writer.write("hello world\n");
		writer.write("≥¢ ‘ ‰»Î÷–Œƒ");
		writer.close();
		
	}
}

