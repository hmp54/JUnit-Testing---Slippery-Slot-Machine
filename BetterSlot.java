import java.util.Random; 
import java.lang.Math; 

public class BetterSlot {
	/*public static void main(String[] args) {
		int[] array = {1,42,42,42,42}; 
		
		System.out.println("PayOff: " + payOff(array));
	} */
	
	//generate a random array of numbers between 1 and 50 for int[] values
	
	public int [] pullTheLever() {
		int[] values = new int[5]; 
		int random; 
		for(int i = 0; i < 5; i++) {
			random = (int)(1 + Math.random() * 49); 
			values[i] = random; 
		}
		
		return values; 
	}
	
	//determines the payout required for array generated by pullTheLever()
	public int payOff(int[] values){
		int payOut = 0; 
		int matchCount = 0; 
		
		boolean rule1 = (values[4] == values[3]) && (values[3] == values[2]) && (values[2] == values[1]) && (values[1] == values[0]); 
		boolean rule2 = false, rule3 = false, rule4 = false, rule5 = false; 
		boolean rule6 = false, rule7 = false, rule8 = false; 
		
		if(rule1 == false)
			matchCount = calculateMatchCount(values); 
		
		if(matchCount == 6)
			rule2 = true; 
		else if(matchCount == 4)
			rule3 = true; 
		else if(matchCount == 3)
			rule4 = true; 
		else if(matchCount == 1 || matchCount == 2)
			rule5 = true; 
		
		if(rule1)
			payOut = 1000000; 
		else if(rule2)
			payOut = 10000; 
		else if(rule3)
			payOut = 5000; 
		else if(rule4)
			payOut = 100; 
		else if(rule5) {
			payOut = 10;
		}
		
		rule6 = perfectSquare(values); 
		rule7 = fourtyTwo(values); 
		rule8 = powerOfTwo(values); 
		
		if(rule6)
			payOut += 7; 
		
		if(rule7)
			payOut +=2; 
		
		if(rule8)
			payOut +=3; 
		
		return payOut; 
	}
	

	//Counts the number of matching pairs of integers in an array
	private int calculateMatchCount(int[] values){
		int matchCount = 0; 
		
		for(int i = 0; i < 5; i++) {
			for(int j = i+1; j < 5; j++) {	
				if(values[i] == values[j]) {
					matchCount++; 
				}
			}
		}
		
		return matchCount; 	
	}
	
	//determines whether or not there is a perfect square within an array
	private boolean perfectSquare(int[] values) {
		double sqrt;
		int resquared; 
		boolean perfectSq = false; 
		
		for(int i = 0; i < 5; i++) {
			sqrt = Math.sqrt(values[i]); 
			resquared = (int)sqrt * (int)sqrt; 
					
			if(resquared == values[i])
				perfectSq = true; 
		}
		
		return perfectSq; 
	}
	
	//determines whether or not the number 42 is in the array
	private boolean fourtyTwo(int[] value) {
		boolean result = false; 
		
		for(int i = 0; i < 5; i++) {
			if(value[i] == 42)
				result = true; 
		}
		
		return result; 
	}
	
	
	private boolean powerOfTwo(int[] values) {
		boolean result = false; 

		
		for(int i = 0; i < 5; i++) {
			int n = values[i]; 

			if(n == 1)
				result = true; 
			if(n % 2 != 0)
				continue; 
			else {
				while(n > 2) {
					n = n/2;
					if(n%2 != 0) {
						break; 
					}
				}	
			}
	
			if(n%2 == 0) {
				result = true; 
			}
		}
		return result; 
	}	
}