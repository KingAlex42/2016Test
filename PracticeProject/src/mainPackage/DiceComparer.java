package mainPackage;

public class DiceComparer {
	int highDie;
	int[] inOrder;
	int totalNumbers;
	int clargest;
	int[] rolls;
	//boolean excludedValue;
	public DiceComparer(int numbers[]) {
		rolls = numbers;
		totalNumbers = rolls.length;
		clargest = rolls[0];
		inOrder = new int[totalNumbers];
		for(int j=0; j<inOrder.length; j++) {
			for(int i=1; i < totalNumbers; i++) {
				if(rolls[i] > clargest) {
				clargest = rolls[i];
				}  //github insert the third
			}
		inOrder[j] = clargest;
		}
	}
	
	public DiceComparer() {
		
	}
	
	public int findOrdered(int position) {   // hrrmmphhh
		

		return inOrder[position-1];
	}
	
	
	public int findHigh(int d1, int d2, int d3) {
		if (d1 >= d2 && d1 >= d3) {
			return d1;
		}
		if (d2 >= d1 && d2 >= d3) {
			return d2;
		}
		else {
			return d3;
		}
		
	}
	
	public int findHigh2(int d1, int d2, int d3) {
		if (d1 >= d2) {
			if (d1 <= d3) {
				return d1;				
			}
			if (d2 >= d3) {
				return d2;
			}
			else {
				return d3;
			}
		}
		else {
			if (d2 <= d3) {
				return d2;
		}
			if (d1 <= d3) {
				return d3;
		}
			else {
				return d1;
		}}
		 
	}
	

}
