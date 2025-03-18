public class PrintMethods{
    public static void main (String[] args){
	//using the print()
	System.out.print("\"Learning Java Is Fun\"\n");
	System.out.print("Hey, come and learn Java with me");
	
	//using the println()
	System.out.println("");
	System.out.println("I want to tell you that java is different from javascript");
	System.out.println("\t this is the indented text");
	
	//using the printf ()(note you must use the print f with the format specifiers)
	System.out.printf("My name is %s and i love %S%n","Gabriel","Java");
	System.out.printf("I am living in No.%d kaduna street",1);
	System.out.printf("I got java JDK with %.2f Naira%n",159.345000);
	System.out.printf("I got java JDK with %.1f Naira%n",159.345000);
	System.out.printf("I got java JDK with %C%f Naira%n",'$',159.345000);
	}
}