package mainPackage;

public class MainClass {


	public static void main(String[] args) {
	int a1, a2, a3, d1, d2;
	int attackerWin = 0;
	int	defenderWin = 0;
	int even = 0;
	DiceComparer compare = new DiceComparer();
		for(int i=0; i<60000; i++) { 
			
			d1 = i%10;  // defenders first die.  Taken from ones place
			d2 = (i%100) / 10; // defenders second die.  Taken from tens place
			a3 = (i%1000)/100;  // hundreds place
			a2 = (i%10000)/1000; //thousands place
			a1 = (i)/10000; // ten thousands place
		
			if(d1 < 6 && d2 < 6 && a3 < 6 && a2 < 6) {
				if(compare.findHigh(d1, d2, 0) >= compare.findHigh(a1, a2, a3) && 
						compare.findHigh2(d1, d2, 0) >= compare.findHigh2(a1, a2, a3)) {
					defenderWin++;
				}
				else if(compare.findHigh(d1, d2, 0) >= compare.findHigh(a1, a2, a3) ||
						compare.findHigh2(d1, d2, 0) >= compare.findHigh2(a1, a2, a3)) {
					even++;
				}
				else {
					attackerWin++;
				}
			}

			}
		
			System.out.println("Attacker wins " + attackerWin + " of the possible outcomes");
			System.out.println("Defender wins " + defenderWin + " of the possible outcomes");
			System.out.println("There is an even split in " + even + " of the possible outcomes");
			
		}
	
		// TODO Auto-generated method stub

	}


