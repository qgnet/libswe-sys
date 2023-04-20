
package ProgrammingA4;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/*
* Author: Max Carr, Erin Cook, Zac Sliker
* Date: 4/13/2018 
* Overview: Tests the ProgrammingA4.java file with 5 tests, if the array is all 0's
* if the array is empty, if the array is american coins and a total value of 50,
* if the array is american coins and has a total value of 73, and if the array 
* are not american and the total value is 46.
*/

public class ProgrammingA4Test {
    @Test(expected = IllegalArgumentException.class)
    public void test1(){
        int array[] = {0,0,0,0};