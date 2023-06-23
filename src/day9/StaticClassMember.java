package day9;

import java.time.LocalDateTime;

public class StaticClassMember {
public static void main(String[] args) {
	LocalDateTime today = LocalDateTime.now();
	double cosine = Math.cos(Math.PI);
	
	System.out.println(cosine);
	System.out.println(today);
}
}

//-1.0
//2023-06-23T16:48:08.106550500