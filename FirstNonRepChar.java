package coding.practice51;

public class FirstNonRepChar {
	public void firstNonRepeatedChar(String st) {
		/*
		 *  THIS CODE IS RUNNING IN ALPHABATICAL ORDER SO A-Z IN ORDER NOT GIVES OUTPUT THAT I WANT
		st=st.toLowerCase();
		for(char ch='a'; ch<='z';ch++) {
			int count=0;
			for(int i=0;i<st.length();i++) {
				if(ch==st.charAt(i)) {
					count++;
				} 
			}
			
			if(count==1) 
				System.out.println("first non-rep char is "+ch);
			break;
			}
			*/
		
		for(int i=0; i<st.length();i++) {
			boolean unique=true;
			for(int j=0;j<st.length();j++) {
				if(i!=j && st.charAt(i)==st.charAt(j)) {
					unique=false;
					break;
				} 
			}
			
			if(unique) {
				System.out.println("first non-rep char is "+st.charAt(i));
				break;
			} 
		}
	}

}
