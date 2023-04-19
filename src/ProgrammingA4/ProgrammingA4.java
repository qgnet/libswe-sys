
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