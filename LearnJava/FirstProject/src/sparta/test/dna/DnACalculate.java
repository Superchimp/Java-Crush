package sparta.test.dna;

public class DnACalculate {
	
	
	public String calculateSquence(String sequence) {
		int a = 0; int c = 0; int g = 0; int t = 0;
		
		
		
		for (int i = 0; i < sequence.length(); i++) {
			
			switch (sequence.charAt(i)) {
			
			case "A":
				a += 1;
				break;
			case "C":
				c += 1;
				break;
			case "G":
				g += 1;
				break;
			case "T":
				t += 1;
				break;
				
						
			}
		}
		String result = "A: " + String.copyValueOf(a) + ", C: " + String.copyValueOf(c) 
		+ ", G: " + String.copyValueOf(data)
	}

}
