import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ConvertToPseudocode {
	public static void main (String[] args) throws FileNotFoundException {
		
		FileReader file = new FileReader("file.txt");
		BufferedReader buffer = new BufferedReader(file);
	
		String [] lines = new String[1000];
		try {
			int i =0;
		while ((lines[i] = buffer.readLine()) != null) {
			
				lines[i]= lines[i].replace(";", "");
				lines[i]= lines[i].replaceAll("\\bint\\b", "num");
				lines[i]= lines[i].replace("double", "num");
				lines[i]= lines[i].replace("{", "(");
				lines[i]= lines[i].replace("}", ")");
				lines[i]= lines[i].replace("public", "");
				lines[i]= lines[i].replace("static", "");
				lines[i]= lines[i].replace("Math.abs", "absolute");
				lines[i]= lines[i].replace("\\bprivate\\b", "");
				lines[i]= lines[i].replace("final", "");
				lines[i]= lines[i].replace("==", "=");
				lines[i]= lines[i].replace("&&", " and ");
				lines[i]= lines[i].replace("++", " + 1");
				lines[i]= lines[i].replace("--", " - 1");
				lines[i]= lines[i].replace("String.format", " ");
				lines[i]= lines[i].replace("%d", " ");
				lines[i]= lines[i].replace("%n", ( " "));
				lines[i]= lines[i].replace("%.2f", "(2 decimals)");
				lines[i]= lines[i].replace("%.3f", "(3 decimals)");
				lines[i]= lines[i].replace("%.4f", "(4 decimals)");
				lines[i]= lines[i].replace("System.out.println", "print");
				lines[i]= lines[i].replace("System.out.print", "print");
				lines[i]= lines[i].replace("printf", "print");
				lines[i]= lines[i].replace("import java.util.Random", "");
				lines[i]= lines[i].replace("Math.random()", "random");
				lines[i]= lines[i].replace("import java.util.Scanner", "");
				lines[i]= lines[i].replace("Math.pow", "pow");
				lines[i]= lines[i].replace("input.next()", "input");
				lines[i]= lines[i].replace("input.nextInt()", "input");
				lines[i]= lines[i].replace("input.nextChar()", "input");
				lines[i]= lines[i].replace("input.nextDouble()", "input");
				lines[i]= lines[i].replace("Scanner input = new Scanner(System.in)", "");
				lines[i]= lines[i].replace("void main(String[] args)", "start main");
				lines[i]= lines[i].replace("Math.sqrt", "sqrt");
				lines[i]= lines[i].replace("Math.pow", "pow");
				lines[i]= lines[i].replace("input.nextLine()", "");
				lines[i]= lines[i].replace("@return", "return");


					System.out.println(lines[i]);
			i++;
		}
		buffer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}	
		System.out.println("stop");
	}
}
