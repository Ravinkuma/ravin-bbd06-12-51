package coding.practice51;

public class Capitlize {
    public void capitlizeFirstChar(String str) {
    	str=" "+str;
    	String f="";
    	for(int i=0;i<str.length();i++) {
    		char ch=str.charAt(i);
    		if(ch==' ') {
    			f=f+ch;
    			i++;
    			ch=str.charAt(i);
    			f=f+Character.toUpperCase(ch);
    		} else {
    			f=f+ch;
    		}
    	}
    	f=f.trim();// without it printing output after an space
    	System.out.println(f);
    }
}
