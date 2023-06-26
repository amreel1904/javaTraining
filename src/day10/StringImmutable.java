package day10;

//import java.util.*;
//import java.util.Arrays;

public class StringImmutable {
	public static void main(String[] args) {
		
		String text = "Hello"+","+"World";
		System.out.println(text);
		String tex= "Hello, ";
		tex+= "Sayang";
		System.out.println(tex);
		String greet ="Hi,";
		String name = "Sayang";
		String result = greet.concat(name);
		System.out.println(result);
		
		String t = String.join(",","s","a","y","a","n","g");
		System.out.println(t);
				
		String s="sayang";
		String []arr=new String[3];
		for (int i=0; i<arr.length;i++) {
			arr[i]=s;}
		String repeated= String.join("", arr);
		System.out.println(repeated);
	
		}
//		Scanner sc = new Scanner(System.in);
//		String greeting = "สวัสดี";
//		String stri = "Hello, Java";
//		char ch = stri.charAt(1);
//		String name = sc.nextLine();
//		String str = new String(new char[] {'s','t','r'});
//		char[] charArr = str.toCharArray();
//
//		System.out.println(Arrays.toString(charArr));
		
		
//		System.out.println("Hi, " + name);

//		System.out.println(ch);
//		System.out.println(stri);
//		System.out.println(greeting);
	}

