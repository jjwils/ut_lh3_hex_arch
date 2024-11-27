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


Now write version that print the receipts but is decoupled from the external world (I/O).

The class ```ShoppingBasketShould``` contains a test that is failing to compile. Create your own test double spy Printer which should have a method void print(String output) Create a count variable to record how many times the print method is invoked and return it via the int count() **_Note there should be no calls to System.out in ```Printer```_**

Call ```printReceipt``` in ```Basket``` the correct number of times until the ```ShoppingBasketShould``` test passes.

Now run ```Main```

What do you notice about the output when you run Main?

Now move onto branch basket_step_3

