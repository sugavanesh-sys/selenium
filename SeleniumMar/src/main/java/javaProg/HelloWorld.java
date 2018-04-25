package javaProg;

import java.util.Scanner;

import org.testng.annotations.Test;

public class HelloWorld {

@Test
public void simpleJava() {
	Scanner s=new Scanner(System.in);
	String input = s.next();
	s.close();
	System.out.println("Input is : "+input);
}
}
