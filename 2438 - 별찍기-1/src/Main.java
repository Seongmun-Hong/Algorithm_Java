import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1-i; j++) {
				bw.write(" ");
			}
			for(int j=0; j<=i; j++) {
				bw.write("*");
			}
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		
	}

}
