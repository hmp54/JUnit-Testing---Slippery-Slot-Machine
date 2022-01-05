import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestSlipperySlot {
	
	
	//betterSlot betterSlot = new betterSlot(); 
	BetterSlot betterSlot = new BetterSlot();
	SlipperySlot slipperySlot = new SlipperySlot(); 
	/*
	 * Expected payouts
	 */
	
	//expected payouts for rules 1-5
	int payout1 = 1000000;
	int payout2 = 10000;
	int payout3 = 5000;
	int payout4 = 100; 
	int payout5 = 10; 
	
	//expected payouts for rules 6-8
	int payout6 = 7; 
	int payout7 = 2; 
	int payout8 = 3; 
	
	//expected payouts for rules 1-5 with rule 6
	int payout61 = payout1 + payout6;
	int payout62 = payout2 + payout6; 
	int payout63 = payout3 + payout6;	
	int payout64 = payout4 + payout6;
	int payout65 = payout5 + payout6;
	
	//expected payouts for rules 1-5 with rule 7
	int payout71 = payout1 + payout7;
	int payout72 = payout2 + payout7;
	int payout73 = payout3 + payout7;
	int payout74 = payout4 + payout7;
	int payout75 = payout5 + payout7;	

	//expected payouts for rules 1-5 with rule 8
	int payout81 = payout1 + payout8;
	int payout82 = payout2 + payout8; 
	int payout83 = payout3 + payout8; 
	int payout84 = payout4 + payout8;	
	int payout85 = payout5 + payout8; 
	
	//arrays which only apply rules 1-5 from the list
	int[] rule1 = {50,50,50,50,50}; 
	int[] rule2 = {3,3,3,3,50};
	int[] rule3 = {3,3,3,50,50};
	int[] rule4 = {50,50,50,3,26}; 
	int[] rule5 = {3,26,50,5,3}; 
	
	//arrays which only apply rules 6-8 but not rules 1-5
	int[] rule6 = {25, 5, 19, 7, 17};
	int[] rule7 = {42, 5, 19, 7, 17};
	int[] rule8 = {8, 5, 19, 7, 17}; 
	
	//arrays which apply rule 6 with rules 1-5
	int[] rule61 = {25,25,25,25,25}; 
	int[] rule62 = {3,3,3,3,25};
	int[] rule63 = {3,3,3,25,25};
	int[] rule64 = {3,3,3,7,25};
	int[] rule65 = {5,6,7,25,25};
	
	//arrays which apply rule 7 with rules 1-5
	int[] rule71 = {42,42,42,42,42}; 
	int[] rule72 = {3,3,3,3,42};
	int[] rule73 = {3,3,3,42,42};
	int[] rule74 = {3,3,3,42,7}; 
	int[] rule75 = {3,3,42,7,17}; 
	
	//arrays which apply rule 8 with rules 1-5
	int[] rule81 = {2,2,2,2,2}; 
	int[] rule82 = {2,2,2,2,50}; 
	int[] rule83 = {2,2,2,7,7};
	int[] rule84 = {2,2,2,7,17};
	int[] rule85 = {2,2,3,7,17}; 	
	
	
	
	
	/*
	 *  
	 * TESTING FOR SLIPPERYSLOT.JAVA
	 * 
	 */
	
	
	//test payouts for rules 1-5 alone
	@Test
	public void testOneToFiveSlipperySlot(){
		int slipperySlotPayout1 = slipperySlot.payOff(rule1);
		int slipperySlotPayout2 = slipperySlot.payOff(rule2);
		int slipperySlotPayout3 = slipperySlot.payOff(rule3);
		int slipperySlotPayout4 = slipperySlot.payOff(rule4);
		int slipperySlotPayout5 = slipperySlot.payOff(rule5);
		
		
		assertEquals(payout1, slipperySlotPayout1, "SlipperySlot: Payout for rule 1 failed");
		assertEquals(payout2, slipperySlotPayout2, "SlipperySlot: Payout for rule 2 failed"); 
		assertEquals(payout3, slipperySlotPayout3, "SlipperySlot: Payout for rule 3 failed");
		assertEquals(payout4, slipperySlotPayout4, "SlipperySlot: Payout for rule 4 failed"); 
		assertEquals(payout5, slipperySlotPayout5, "SlipperySlot: Payout for rule 5 failed"); 
	}
	
	//testing payouts for rules 6-8
	@Test
	public void testSixToEightSlipperySlot() {
		int testPayout6 = slipperySlot.payOff(rule6);
		int testPayout7 = slipperySlot.payOff(rule7);
		int testPayout8 = slipperySlot.payOff(rule8);

		assertEquals(payout6, testPayout6, "Payout for rule 6 failed");
		assertEquals(payout7, testPayout7, "Payout for rule 7 failed");
		assertEquals(payout8, testPayout8, "Payout for rule 8 failed");
	}
	
	//testing payouts applied for rules 6-8 on top of rules 1-5
	@Test
	public void testAllSlipperySlot(){
		int testPayout61 = slipperySlot.payOff(rule61);
		int testPayout62 = slipperySlot.payOff(rule62);
		int testPayout63 = slipperySlot.payOff(rule63);
		int testPayout64 = slipperySlot.payOff(rule64);
		int testPayout65 = slipperySlot.payOff(rule65);
		
		int testPayout71 = slipperySlot.payOff(rule71);
		int testPayout72 = slipperySlot.payOff(rule72);
		int testPayout73 = slipperySlot.payOff(rule73);
		int testPayout74 = slipperySlot.payOff(rule74);
		int testPayout75 = slipperySlot.payOff(rule75);
		
		int testPayout81 = slipperySlot.payOff(rule81);
		int testPayout82 = slipperySlot.payOff(rule82);
		int testPayout83 = slipperySlot.payOff(rule83);
		int testPayout84 = slipperySlot.payOff(rule84);
		int testPayout85 = slipperySlot.payOff(rule85);
		
		assertEquals(payout61, testPayout61, "SlipperySlot: Payout for rules 6 and 1 failed"); 
		assertEquals(payout62, testPayout62, "SlipperySlot: Payout for rules 6 and 2 failed");
		assertEquals(payout63, testPayout63, "SlipperySlot: Payout for rules 6 and 3 failed"); 
		assertEquals(payout64, testPayout64, "SlipperySlot: Payout for rules 6 and 4 failed"); 
		assertEquals(payout65, testPayout65, "SlipperySlot: Payout for rules 6 and 5 failed");
		
		assertEquals(payout71, testPayout71, "SlipperySlot: Payout for rules 7 and 1 failed"); 
		assertEquals(payout72, testPayout72, "SlipperySlot: Payout for rules 7 and 2 failed");
		assertEquals(payout73, testPayout73, "SlipperySlot: Payout for rules 7 and 3 failed");
		assertEquals(payout74, testPayout74, "SlipperySlot: Payout for rules 7 and 4 failed");
		assertEquals(payout75, testPayout75, "SlipperySlot: Payout for rules 7 and 5 failed");
		
		assertEquals(payout81, testPayout81, "SlipperySlot: Payout for rules 8 and 1 failed");
		assertEquals(payout82, testPayout82, "SlipperySlot: Payout for rules 8 and 2 failed");
		assertEquals(payout83, testPayout83, "SlipperySlot: Payout for rules 8 and 3 failed");
		assertEquals(payout84, testPayout84, "SlipperySlot: Payout for rules 8 and 4 failed");
		assertEquals(payout85, testPayout85, "SlipperySlot: Payout for rules 8 and 5 failed");
		
	} 
	
	
	
	
	
	
	/*
	 * 
	 * TESTING FOR BETTERSLOT.JAVA
	 * 
	 */
	
	//test payouts for rules 1-5 alone
	@Test
	public void testOneToFiveBetterSlot() {

		
		int testPayout1 = betterSlot.payOff(rule1);
		int testPayout2 = betterSlot.payOff(rule2);
		int testPayout3 = betterSlot.payOff(rule3);
		int testPayout4 = betterSlot.payOff(rule4);
		int testPayout5 = betterSlot.payOff(rule5);
		
		assertEquals(payout1, testPayout1, "BetterSlot: Payout for rule 1 failed");
		assertEquals(payout2, testPayout2, "BetterSlot: Payout for rule 2 failed"); 
		assertEquals(payout3, testPayout3, "BetterSlot: Payout for rule 3 failed");
		assertEquals(payout4, testPayout4, "BetterSlot: Payout for rule 4 failed"); 
		assertEquals(payout5, testPayout5, "BetterSlot: Payout for rule 5 failed"); 
		
	}

	//testing payouts for rules 6-8
	@Test
	public void testSixToEightBetterSlot() {
		int testPayout6 = betterSlot.payOff(rule6);
		int testPayout7 = betterSlot.payOff(rule7);
		int testPayout8 = betterSlot.payOff(rule8);

		assertEquals(payout6, testPayout6, "BetterSlot: Payout for rule 6 failed");
		assertEquals(payout7, testPayout7, "BetterSlot: Payout for rule 7 failed");
		assertEquals(payout8, testPayout8, "BetterSlot: Payout for rule 8 failed");
	}

	
	//testing payouts applied for rules 6-8 on top of rules 1-5
	@Test
	public void testAllBetterSlot(){
		int testPayout61 = betterSlot.payOff(rule61);
		int testPayout62 = betterSlot.payOff(rule62);
		int testPayout63 = betterSlot.payOff(rule63);
		int testPayout64 = betterSlot.payOff(rule64);
		int testPayout65 = betterSlot.payOff(rule65);
		
		int testPayout71 = betterSlot.payOff(rule71);
		int testPayout72 = betterSlot.payOff(rule72);
		int testPayout73 = betterSlot.payOff(rule73);
		int testPayout74 = betterSlot.payOff(rule74);
		int testPayout75 = betterSlot.payOff(rule75);
		
		int testPayout81 = betterSlot.payOff(rule81);
		int testPayout82 = betterSlot.payOff(rule82);
		int testPayout83 = betterSlot.payOff(rule83);
		int testPayout84 = betterSlot.payOff(rule84);
		int testPayout85 = betterSlot.payOff(rule85);
		
		assertEquals(payout61, testPayout61, "BetterSlot: Payout for rules 6 and 1 failed"); 
		assertEquals(payout62, testPayout62, "BetterSlot: Payout for rules 6 and 2 failed");
		assertEquals(payout63, testPayout63, "BetterSlot: Payout for rules 6 and 3 failed"); 
		assertEquals(payout64, testPayout64, "BetterSlot: Payout for rules 6 and 4 failed"); 
		assertEquals(payout65, testPayout65, "BetterSlot: Payout for rules 6 and 5 failed");
		
		assertEquals(payout71, testPayout71, "BetterSlot: Payout for rules 7 and 1 failed"); 
		assertEquals(payout72, testPayout72, "BetterSlot: Payout for rules 7 and 2 failed");
		assertEquals(payout73, testPayout73, "BetterSlot: Payout for rules 7 and 3 failed");
		assertEquals(payout74, testPayout74, "BetterSlot: Payout for rules 7 and 4 failed");
		assertEquals(payout75, testPayout75, "BetterSlot: Payout for rules 7 and 5 failed");
		
		assertEquals(payout81, testPayout81, "BetterSlot: Payout for rules 8 and 1 failed");
		assertEquals(payout82, testPayout82, "BetterSlot: Payout for rules 8 and 2 failed");
		assertEquals(payout83, testPayout83, "BetterSlot: Payout for rules 8 and 3 failed");
		assertEquals(payout84, testPayout84, "BetterSlot: Payout for rules 8 and 4 failed");
		assertEquals(payout85, testPayout85, "BetterSlot: Payout for rules 8 and 5 failed");
		
	} 
}
