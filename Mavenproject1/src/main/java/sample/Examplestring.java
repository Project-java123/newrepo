package sample;

public class Examplestring {
	public static void main(String[] args) {
		String s="Hello";
		System.out.println(s);
		String s1=new String("Hai");
		System.out.println(s1);
		
		//Converting character array into String
		char a[]= {'a','b','c'};
		String s2= new String(a);
		System.out.println(s2);
		
		//charAt:to get the char in the specified index
		char v=s.charAt(4);
		System.out.println(v);
		
		//length:to find the length of the string
		System.out.println(s.length());

		//concate
				System.out.println(s.concat(s1));
				
				//contains
				String q="My name is Neena";
				System.out.println(q.contains("name"));
				
				//equals
				String j="java";
				String j1="java";
				String j2="Java";
				String j3="selenium";
				System.out.println(j.equals(j1));
				System.out.println(j.equals(j2));	
				System.out.println(j.equals(j3));
				
				//equalsIgnore case:to ignore the case sensitivity
				System.out.println(j.equalsIgnoreCase(j2));
				
}

}