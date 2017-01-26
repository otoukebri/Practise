package sandy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class one {

	public static void main(String[] args) throws Exception {
		
//		BufferedReader br = new BufferedReader(new FileReader("/Users/prashanth.mudhelli/Desktop/CMPE 295B/sample.txt"));
//		String line;
//		while((line = br.readLine()) != null) {
//			System.out.println(line);
//		}
//		br.close();
		
		String fileName = "/Users/prashanth.mudhelli/Desktop/CMPE 295B/sample.txt";
		File textFile = new File(fileName);
		Scanner in = new Scanner(new FileReader(textFile));
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		while(in.hasNext()) {
			String line = in.nextLine();
			String arr[] = line.split(" ");
			if(arr[1].equals("Error")) {
				int count = 0;
				if(map.containsKey(arr[2])) {
					count = map.get(arr[2]);
				}
				map.put(arr[2], count+1);
			}
		}
		int max = 0;
		String error = "";
		
		for(String key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				error = key;
			}
		}
		System.out.println(error +max);
	}
}