import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		double dog = 0;
		double food = 0;
		double price = 0;
		
		StringTokenizer str;
		double sum;
		String sumStr;
		for (int i = 0; i < n; i++) {
			str = new StringTokenizer(br.readLine());
			dog = Double.parseDouble(str.nextToken());
			food = Double.parseDouble(str.nextToken());
			price = Double.parseDouble(str.nextToken());
			sum = dog*food*price;
			sum *= 100;
			sum = Math.round(sum) / 100.0;
            bw.write("$");
			bw.write(String.format("%.2f", sum));
            bw.newLine();
		    bw.flush();
		}
        bw.close();
	}
}