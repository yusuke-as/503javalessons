import java.util.*;
public class Special{
	public static void main(String[] args){
		int numA=0;
		int numB=1;
		int numC=numA+numB;
		while(numA<1000){
			System.out.print(numA+" ");
			numA=numB;
			numB=numC;
			numC=numA+numB;
		}
	}
}
