package stackofstacks;

public class StackSets {
	public static void main(String[] args) {
		StackOfStacks sos = new StackOfStacks(5);
		sos.push(10);
		sos.push(20);
		sos.push(30);
		sos.push(40);
		sos.push(50);
		sos.push(60);
		sos.display();
	}
}