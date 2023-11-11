# 1. Neptune's Dilemma
Tarter sauce!  Everyone's favorite undersea monarch is losing his cockle shells!  He needs a reliable way to generate his beloved Tritonacci Sequence.  He has enlisted his podna Sponge Bob to help.  Well Sponge showed up at the Envoc lab looking for you.  Now the future of the entire underwater world is in your hands.  In this assignment you will create a program that generates whatever item in the sequence that he desires.  Your solution should involve the use of recursion.  
Your program should include a recursive method called triton.  There should be a separate main method that calls triton.  You will create one class named `Tritonacci` according to the following instructions:

1. One `public long` method named `triton(long index)` that expects one `long` argument. This represents the index which you want the Tritonacci number for.  

Note: there is no requirement regarding the attributes/datafields of your class. You are free to implement it as you wish. However, the methods *must* be implemented as described above.

Boilerplate code:

```java
public class Tritonacci {
    /* Attributes/Data fields/Properties */
    // YOUR CODE HERE

    /* Method(s) */
    // YOUR CODE HERE
}
```

After implementing the `Tritonacci` class, you can create a tester program to test that your code does what it's supposed to do. It is not part of the grade, and you can be creative and test various different scenarios in your tester program.

Example tester program:

```java
public class Main {
    public static void main(String[] args) {
        
        long index = 5;
        long result = triton(index); //
        System.out.println("\nResult of index " + index + " is "
            + result);

        index = 10;
        long result = triton(index); //
        System.out.println("\nResult of index " + index + " is "
               + result);
      
    }
}
```

Hints:
1. Use the Fibonnaci sequence example discussed in class and presented in your text for reference.

2. The first seven items in the Tritonacci Sequence are:
   1 2 3 6 11 20 37 

3. Use your skills of analysis to determine how to generate the next items in the sequence (or check your notes from class)

## Assignment workflow

1. Accept the assignment when posted on Moodle
1. ***Clone*** the assignment repository
1. Solve the assignment
1. Submit (`commit` and `push`) the assignment
    1. Resubmit if necessary or contact the instructor for questions.
