#Soluta Programming Test

###Problem Statement

Create a function that accepts an integer array x, and an integer y then returns true if any two of the integers in x equal y. The first assumption is that the addition is inclusive. The second assumption is that the commutative property is true and if ```x[1] + x[2] = y```
 yields true, then so would ```x[2] + x[1]``` this would also yield two ```true``` comparisons. 

The second step is to create a second function that accepts the same two arguments as above but accepts a third integer ```z``` and also counts the number of true comparisons then compares this to a third integer ```z``` and returns a true of the number of comparisons equals ```z```. 

Code was added for the possibility of excluding the same index of the array, if this is not desired then simply comment out those lines for inclusion. No code was written to take into account the commutative property of the initial problem.  