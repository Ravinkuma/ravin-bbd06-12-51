package coding.practice51;
import java.util.*;
public class Main_51 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter String");
		//String st=sc.nextLine().toLowerCase();      no need toLower method in base class
		String s=sc.nextLine();
		String st=sc.nextLine();
		String str=sc.nextLine();
		
		FrequencyOfEachChar fr=new FrequencyOfEachChar();
		fr.countFrequencyOfChar(s);
		
		FirstNonRepChar fn= new FirstNonRepChar();
		fn.firstNonRepeatedChar(st);
		
		Capitlize c = new Capitlize();
		c.capitlizeFirstChar(str);
		
		Book db= new Book();
		//db.Display();  it is giving null because did not pass anything
		Book b= new Book("java", "js");
		b.Display();
         
		
		Calculator clt= new Calculator();
		System.out.println(clt.add(5, 5));
		double dbResult=clt.add(5.5, 6.5);
		System.out.println(dbResult);
		String stt=clt.add("Ravin ", "Mehta");
		System.out.println(s);
		
		
		// i did it before, many times to call an static method just write className.methodName
		MathUtils.square(5);
		
		int sq=MathUtils.square2(7);
		System.out.println("square of given number is "+sq);
		
	}

}
