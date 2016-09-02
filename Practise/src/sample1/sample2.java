package sample1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class sample2 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek());
		System.out.println("Start of this week:       " + cal.getTime());
		Date startDayOfWeek = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Start date: " +sdf.format(startDayOfWeek));
		
		System.out.println((new Date().getTime())/1000);
		String[] a = new String[5];
		a[0] = "hi";
		a[1] = "bye";
		System.out.println(a[0] +a[1]);
		sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String today = sdf.format(date).toString();
		System.out.println("date: " +date);
		System.out.println(today);
		
		String start = "2016-05-06 23:59:59";
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
		try {
			System.out.println(sdf.parse(start));
			cal.setTime(sdf.parse(start));
			System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<String> abcd = new ArrayList<>();
		abcd.add("a");
		abcd.add("b");
		abcd.add("c");
		System.out.println();
		HashMap<String, ArrayList<String>> hash = new HashMap<String, ArrayList<String>>();
		hash.put("1", abcd);
		System.out.println(hash.get("1").size());
		//1462482814814
		int error = -1;
		for(int i=1; i<100; i++) {
			if(error == -1) {
				error = 35;
			}
		}
		
		String[] aaaa = new String[0];
		System.out.println(aaaa.length);
		
		HashMap<String, String> aabb = new HashMap<>();
		aabb.put("a", "a");
		HashMap<String, String> aabb1 = aabb;
		System.out.println(aabb1.get("a"));
		
		HashSet<String> hs = new HashSet<String>();
	      // add elements to the hash set
	      hs.add("B");
	      hs.add("A");
	      hs.add("D");
	      hs.add("E");
	      hs.add("C");
	      hs.add("F");
	      System.out.println(hs);
	}
}