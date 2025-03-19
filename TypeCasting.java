//Time casting is the process of changing from one data type to another
public class TypeCasting{
	public static void main (String[] args){
		//widening type casting
		double weight=678;
		System.out.printf("your weight is %f%n",weight);
		
		//narrowing type casting
		char alpha = '?';
		
		int asciiCode =(char)alpha;
		System.out.printf("The ASCII code for ? is %d",asciiCode);
		
	}
}