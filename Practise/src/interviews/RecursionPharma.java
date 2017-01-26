package interviews;

import java.util.*;

public class RecursionPharma {

	public static void main(String[] args) {
		Customers c = new Customers();
		ArrayList<String> list = c.randomInput();
		
		Queue<String> cust = new ArrayDeque<>(list);
		
		int count = 0;
		BarberShop bs = new BarberShop();
		bs.open("9:00");
		
		while(!cust.isEmpty()) {
			bs.serve("Customer-" +(++count), cust.poll());
		}
	}

}

class BarberShop {
	String shift1[];
	String shift2[];
	ArrayList<String> availableBarbers;
	ArrayList<String> busyBarbers;
	ArrayList<Pair> pairedUp;
	Random rn;
	
	BarberShop() {
		shift1 = new String[]{"Alto", "Basil", "Camphor", "Diogenes"};
		shift2 = new String[]{"Eros", "Fatoush", "Glorio", "Heber"};
		availableBarbers = new ArrayList<>();
		busyBarbers = new ArrayList<>();
		pairedUp = new ArrayList<>();
		rn = new Random();
	}
	
	void open(String startTime) {
		System.out.println(startTime +" Barber shop opened");
		for(int i=0; i<shift1.length; i++) {
			availableBarbers.add(shift1[i]);
			System.out.println(startTime +" " +shift1[i] +" started shift");
		}
	}
	
	void serve(String cust, String time) {
		if(pairedUp.size() == 0) {
			addCust(cust, time);
		}
		else {
			freeUpBarbers(cust, time);
		}
	}
	
	void addCust(String cust, String entryTime) {
		String barber = availableBarbers.remove(0);
		busyBarbers.add(barber);
		int totalMins = 20+rn.nextInt(21);
		String enteredTime[] = entryTime.split(":");
		int mins = Integer.parseInt(enteredTime[1]);
		int hrs = Integer.parseInt(enteredTime[0]);
		if(mins+totalMins > 59) {
			hrs++;
			mins = (mins+totalMins)-60;
		}
		
		Pair p = new Pair(barber, cust, hrs +":" +mins);
		pairedUp.add(p);
		System.out.println(entryTime +" " +cust +" entered");
	}
	
	void freeUpBarbers(String cust, String entryTime) {
		Iterator<Pair> it = pairedUp.iterator();
		//verify if time is up for any of the pairs
		while(it.hasNext()) {
			Pair p = it.next();
			String endTime = p.endTime;
			if(endTime.compareTo(entryTime) <= 0) {
				System.out.println(endTime +" " +p.cust +" left satisfied");
				//remove barber from busy list and add to available list
				it.remove();
				addCust(cust, entryTime);
			}
			else {
				//add customer to wait queue
			}
		}
	}
}

class Pair {
	String barber;
	String cust;
	String endTime;
	Pair(String barber, String cust, String endTime) {
		this.barber = barber;
		this.cust = cust;
		this.endTime = endTime;
	}
}

class Customers {
	ArrayList<String> list;
	int count;
	Random rn;
	
	Customers() {
		list = new ArrayList<>();
		rn = new Random();
		count = rn.nextInt(100);
	}
	
	ArrayList<String> randomInput() {
		for(int i=0; i<count; i++) {
			list.add((9 + rn.nextInt(9)) +":" +rn.nextInt(60));
		}
		Collections.sort(list);
		return list;
	}
}