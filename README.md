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


## Step 2


Now write version that will (eventually) print the receipts but is decoupled from accidental complexity of the external world (I/O).

The class ```ShoppingBasketShould``` contains a test that is failing to compile. 

Generate (**⌥ Option + ⏎ Enter**) from the test your own test double spy called ```Printer``` which should contain a method with the signature ```void print(String output)```  

Create a count variable to record how many times the print method is invoked and return it via ```int count()``` 

**_Note there should be no calls to System.out in ```Printer```_**

```ShoppingBasketShould.print_receipts``` should now be compiling but failing

Call ```printReceipt``` in ```Basket``` the correct number of times until the ```ShoppingBasketShould``` test passes.

Now run ```Main```

What do you notice about the output now when you run Main?  How has this changed from the previous output in step_1?

Now move onto branch basket_step_3

