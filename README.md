# Unit Testability Learning Hour 3 Hexagonal Architecture kata

Spec:  Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".

Sample output:

1  
2  
Fizz  
4  
Buzz  
Fizz  
7  
8  
Fizz  
Buzz  
11  
Fizz  
13  
14  
FizzBuzz
... etc up to 100

## Step 2

Now write a decoupled version to print the numbers.

The class ```ProgramShould``` contains a test that is failing to compile.
Create your own test double spy ```Printer``` which should have a method ```void print(String output)```
Create a ```count``` variable to record how many times the ```print``` method is invoked and return it via the ```int count()```
Note there should be no calls to ```System.out``` in ```Printer```

Call ```print``` in ```Program``` the correct number of times until the ```ProgramShould.print_numbers``` test passes.

Now add the below code to ```Main```

```Java
    Program program = new Program(new Printer());
    program.printNumbers(100);
```

What do you notice about the output of when you run ```Main```?

Now move onto branch step_3