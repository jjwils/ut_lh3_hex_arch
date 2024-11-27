# Unit Testability Learning Hour 3 Hexagonal Architecture kata

Spec:  Write a program that lets you add items to a basket and print a specified number of copies of an itemised receipt with total price.

Sample output one copy:
```
Apple 0.99  
Orange 0.49  
-----------  
Total: 1.48
```
Sample output two copies:
```
Apple 0.99  
Orange 0.49  
----------- 
Total: 1.48

Apple 0.99  
Orange 0.49  
----------- 
Total: 1.48
```


## Step 3


Now we have a test double, lets create an interface (port) from that so we can create our real implementation (adaptor) and get some output when we run ```Main```

On the current ```Printer``` class, use the ```Refactor->Extract Interface``` option and choose the 2nd radio button ```Rename original class and use interface where possible```

What would be a good name to Rename Printer to?  Remember that this will now become an adapter used just as a test double.

What members do you want to take forward to into the new interface/port?

```void print(String output)``` ?  
```int count()``` ?  
or both?  Think about the functionality that both adapters must have and that only the test adapter might need

Once you have made your decisions and the new interface is created, run the ```ShoppingBasketShould``` tests again to check that this is a genuine refactor (all tests still pass).

Now move ```TestDoublePrinter``` or whatever you called your test double printer adapter implementation to the test package.  

```Main``` should now be failing to compile.  

Create a new adapter dependency to inject into ```Basket``` that implements the ```Printer``` interface that will be used to print the receipt to the output window.  Give it an appropriate name such as ```ConsolePrinter```.

You should now have two implementations (adapters) for your Printer interface (port). One injected into ```Basket``` for the test (```ShoppingBasketShould.printReceipt``` living in test package) and one injected into ```Basket``` for Production (```Main``` living in main package).

Make any further changes you need to in ```Basket.printReceipt``` to get the output to show in the console window as defined in the spec above.  Note, the logic for the correct formatting can be found in ```ReceiptFormatter```. 

Hint...you can find the complete solution in branch step_4.

