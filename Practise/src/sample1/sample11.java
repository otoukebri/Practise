package sample1;

public class sample11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"1.1837 1.3829 0.6102", "1.1234 1.2134 1.2311"};
		int res[] = arbitrage(arr);
		for(int i=0; i<res.length; i++) {
			System.out.println(res[i]);
		}
	}

public static int[] arbitrage(String[] quotes){
		
		
		double temp = 100000;
		
		int[] res = new int[quotes.length];
		
		int count = quotes.length;
		
		for (int i=0; i<count; i++){
			String[] quote = quotes[i].split(" ");

			double a = Double.parseDouble(quote[0]);
			double b = Double.parseDouble(quote[1]);
			double c = Double.parseDouble(quote[2]);

			double e = (double) (temp/a);
			
			double g = (double) (e/b);
			double u = (double) (g/c);
			
			//System.out.println(u);
			
			if(u-temp > 0)
				res[i] = (int) (u-temp);
			
			else 
				res[i] = 0;
			
		}
		
		
		return res;
		 
		 
	 }
	
	
}
