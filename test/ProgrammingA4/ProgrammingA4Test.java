
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
        int total = 0;
	Assert.assertEquals(0, ProgrammingA4.p(array, total));
    }   
    
    @Test(expected = IllegalArgumentException.class)
    public void test2(){
        int array[] = {};
        int total = 0;
	Assert.assertEquals(0, ProgrammingA4.p(array, total));
    }
    @Test
    public void test3(){
        int array[] = {25,10,5,1};
        int total = 50;
        int expected[] = {25,25};
        Assert.assertEquals(2, ProgrammingA4.p(array, total));
    }
    @Test
    public void test4(){
        int array[] = {7,2,4,6};
        int total = 13;
        Assert.assertEquals(2, ProgrammingA4.p(array, total));
    }
    @Test
    public void test5(){
        int array[] = {8,6,5,1};
        int total = 11;
        Assert.assertEquals(2, ProgrammingA4.p(array, total));
    }

}