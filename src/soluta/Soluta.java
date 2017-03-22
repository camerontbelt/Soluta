/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soluta;

/**
 *
 * @author cameronbelt
 */
public class Soluta {

    //compare if any two, inclusive, integers in the array x[] equal integer y
        //assumptions: 1) that it is inclusive. 2) that it breaks only if equal and not equal or greater than
        //No test cases were provided
	public static boolean compare(int x[],int y){
		for(int i = 0;i<x.length;i++){
                    for(int j = 0;j<x.length;j++){
                        //System.out.print(x[i]+x[j] + " ");//for debug                     
                        if((x[i]+x[j]) == y)
                            return true;
                    }
                    //System.out.println();//for debug
		}
		return false;
	}
	
        //compares if any two integers equal y, and counts how many times that occurs and returns true if count equals z
	public static boolean compareCount(int x[], int y, int z){
            int count = 0;
                for(int i = 0;i<x.length;i++){
                    for(int j = 0;j<x.length;j++){
                        //System.out.print(x[i]+x[j] + " ");//for debug                    
                        if((x[i]+x[j]) == y)
                            count++;
                    }
                    //System.out.println();//for debug
		}
                if(count == z)
                    return true;
                else
                    return false;
	}
	
	public static void main (String[] args) throws java.lang.Exception{
		int[] x = {1,2,3,4,5,6,7,8,9,1};//array of integers
		int y = 18;//integer to compare to
		int z = 2;//comparisions to count to
                
		System.out.println(compare(x,y));
		System.out.println(compareCount(x,y,z));
	}
    
}
