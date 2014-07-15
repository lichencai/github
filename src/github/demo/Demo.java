package github.demo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class Demo {
	public static void main(String[] args) throws Exception{
		String inputPath = "E:\\file.txt";
		String outputPath = "E:\\file1.txt";
		
		FileInputStream fis = new FileInputStream(inputPath);
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");
		BufferedReader br = new BufferedReader(isr);
		StringBuffer sb = new StringBuffer();
		String str = "";
		while ((str = br.readLine()) != null) {
			 sb.append(str);
		}
		br.close();
		System.out.println(sb.toString());
		
		/*File inputFile = new File(inputPath);
		Scanner read = new Scanner(inputFile);
		StringBuffer sb = new StringBuffer();
		while(read.hasNextLine()){
			sb.append(read.nextLine());
		}
		read.close();
		
		File outputFile = new File(outputPath);
		PrintWriter pw = new PrintWriter(outputFile);
		pw.write(sb.toString());
		pw.flush();
		pw.close();*/
	}
}
