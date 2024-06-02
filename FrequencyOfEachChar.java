package coding.practice51;

public class FrequencyOfEachChar {
	public void countFrequencyOfChar(String s) {
		s=s.toLowerCase();
		for(char ch='a';ch<='z';ch++) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) 
					count++;
				
			}
			if(count!=0) {
				System.out.println("frequency of char "+ch+" is "+count);
			}
		}
	}

}
