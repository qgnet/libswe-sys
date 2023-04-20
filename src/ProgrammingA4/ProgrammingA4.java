
package ProgrammingA4;

/*
* Author: Max Carr, Erin Cook, Zac Sliker
* Date: 4/13/2018 
* Overview: Runs a Dynamic Algorithm to determine lowest possible number of coins needed to get the total.
*/

public class ProgrammingA4 {
	public static int p(int[] change, int a) {
////////////////////////////////////Checking for array of 0's//////////////////////////////////////////////
                int p = 0;
                for(int k = 0; k < change.length; k++){
                    p += change[k];
                }
                if(p == 0){
                    throw new IllegalArgumentException("change of size 0 is not allowed");
                }
///////////////////////////////Initialization of T and Result Arrays//////////////////////////////////
		int[] Result = new int[a + 1];
                int[] T = new int[a + 1];
		T[0] = 0;
		for (int i = 1; i <= a; i++) {
			T[i] = Integer.MAX_VALUE-1;
			Result[i] = -1;
		}
///////////////////////////////////Dynamic Algorithm to solve/////////////////////////////////////
		for (int j = 0; j < change.length; j++){
			for (int i = 1; i <= a; i++) {
				if (i >= change[j]) {
					if (T[i - change[j]] + 1 < T[i]) {
						T[i] = 1 + T[i - change[j]];
						Result[i] = j;
					}