package hackerrank;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class HackLandElection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String votes[] = {"ab", "bc", "de", "bc", "de"};
		System.out.println(electionWinner(votes));
	}
	
	static String electionWinner(String[] votes) {
		TreeMap<String, Integer> results = new TreeMap<>();
		for(String candidate : votes) {
			results.put(candidate, results.getOrDefault(candidate, 0) + 1);
		}
		
		int maxVotes = 0;
		for(int value : results.values()) {
			if(value > maxVotes)
				maxVotes = value;
		}
		
		String winner = new String();
		for(String key : results.keySet()) {
			if(results.get(key) == maxVotes)
				winner = key;
		}
		
		return winner;
	}

}
