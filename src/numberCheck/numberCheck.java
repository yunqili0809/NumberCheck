package numberCheck;
import java.util.Scanner;
public class numberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray=new int [10];
		Scanner s = new Scanner(System.in);
		for(int i=0;i< myArray.length; i++) {
			System.out.println("number,Please:");
			myArray[i]=s.nextInt();
		}
	if(getSeven(myArray))
		System.out.println("this one has seven");
	else
		System.out.print("no seven :-(");
	if(otherMethod (myArray))
		System.out.print("Allnumber smaller than 7 and odd");
	else
		System.out.print("some numbers bigger than seven or even");	
	}
public static boolean getSeven(int[] someArray){
	for(int i=0;i< someArray.length; i++) {
	if (someArray[i]==7) 
		return true;
}
	return false;
}
/**
 * Checks that the values of the given array are smaller than7 and are all odd
 * @param someArray
 * @return
 */
public static boolean otherMethod(int[] someArray){
	for(int i=0;i< someArray.length; i++) {
	if (someArray[i]>=7 || someArray[i]%2==0 ) 
		return false;
}
	return true;
}
}