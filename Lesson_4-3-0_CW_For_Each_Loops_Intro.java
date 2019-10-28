//Lesson 4-3-0 CW For Each Loops Intro

/*Java For-each Loop | Enhanced For Loop
The Java for-each loop or enhanced for loop is introduced since J2SE 5.0. It provides an alternative approach to traverse 
the array or collection in Java. It is mainly used to traverse the array or collection elements. The advantage of the for-each 
loop is that it eliminates the possibility of bugs and makes the code more readable. It is known as the for-each loop because 
it traverses each element one by one.

The drawback of the enhanced for loop is that it cannot traverse the elements in reverse order. Here, you do not have the 
option to skip any element because it does not work on an index basis. Moreover, you cannot traverse the odd or even elements only.

But, it is recommended to use the Java for-each loop for traversing the elements of array and collection because it makes the code readable.

Advantages
It makes the code more readable.
It eliminates the possibility of programming errors.
Syntax
The syntax of Java for-each loop consists of data_type with the variable followed by a colon (:), then array or collection.

for(data_type variable : array | collection){  
//body of for-each loop  
}  

How it works?
The Java for-each loop traverses the array or collection until the last element. For each element, it stores the element in the 
variable and executes the body of the for-each loop.

For-each loop Example: Traversing the array elements
//An example of Java for-each loop  
*/

public class ForEachExample1{  
  	public static void main(String args[]){  
   		//declaring an array  
   		int myArray [] = {12, 13, 14, 44};  

   		//traversing the array with for-each loop  
   		for(int i : MyArray){  
     	System.out.println(i);  
   		}  
 	}   
}  
//Output:
12
12
14
44

public class ForEachExample2{  
  	public static void main(String args[]){  
	   int smallArray [] = {12, 13, 14, 44};  
	   int total = 0;  

	   for(int i : smallArray){  
	     total = total + i;  
	   }  
	  System.out.println("Total: " + total);  
 	}   
}  
//Output:
Total: 83

public class ForEachExample3 { 
    public static void main(String[] arg) 
    { 
        int[] numbers = { 125, 132, 95, 116, 110 }; 
        int maxSoFar = -1; //Use this because all numbers are postive
          
        // for each loop 
        for (int num : numbers)  
        { 
            if (num > maxSoFar) 
            { 
                maxSoFar = num; 
            }
        } 
        System.out.println("The highest score is " + maxSoFar);
    } 
} 

//Output:
The highest score is 132


/*Limitations of for-each loop

For-each loops are not appropriate when you want to modify the array:*/
for (int num : marks) 
{
    // only changes num, not the array element
    num = num * 2; 
}

//For-each loops do not keep track of index. So we can not obtain array index using For-Each loop
for (int num : numbers) 
{ 
    if (num == target) 
    {
        return ???;   // do not know the index of num
    }
}

//For-each only iterates forward over the array in single steps
// cannot be converted to a for-each loop.  Cannot decrement.
for (int i = numbers.length-1; i > 0; i--) 
{
      System.out.println(numbers[i]);
}

//For-each cannot process two decision making statements at once
// cannot be easily converted to a for-each loop 
for (int i = 0; i < numbers.length; i++) 
{
    if (numbers[i] == arr[i]) 
    { ...
    } 
}