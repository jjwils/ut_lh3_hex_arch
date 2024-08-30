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

## Step 3

Now we have a test double lets create an interface (port) from that so we can create our real implementation (adaptor) and get some output when we run ```Main```

On the current ```Printer``` class Use the Refactor->Extract Interface option and choose to 2nd radio button ```Rename original class and use interface where possible```

What would be a good name to Rename ``Printer`` to?

What members do you want to take forward to into the new interface?

```void print(String output)```?  
```int count() ```?  
or both?

Once the new interface is created, run the ```ProgramShould``` test again to check that this is a genuine refactor (test still passes).

Now go to ``Main`` and create a new ```Printer``` to inject into ```new Program(yourNewRealPrinter)```

You should now have two implementations (adapters) for your Printer interface (port).  

One for the test and one for Production.  

Make any further changes you need to in ```Program``` to get the output as defined in the spec above.

Hint...you can find the complete solution in branch step_4.