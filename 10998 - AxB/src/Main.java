import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String text[] = br.readLine().split(" ");
		
		bw.write((Integer.parseInt(text[0]) * Integer.parseInt(text[1])) + "" );
		bw.flush();
		bw.close();
		
	}
}
