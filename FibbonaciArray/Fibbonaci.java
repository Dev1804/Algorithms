import java.util.*;

public class Fibbonaci {

	public static void main(String[] args) {
		
		int lenght=20;
		long[] series=new long[lenght];
		series[0]=0;
		series[1]=1;
		for(int i=2;i<lenght;i++){
			series[i]=series[i-1]+series[i-2];
		}
		System.out.println("Fibbonaci's array: ");
		System.out.println(Arrays.toString(series));

		
	}

}
/*
 Fibbonaci's array: 
[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181]
*/
