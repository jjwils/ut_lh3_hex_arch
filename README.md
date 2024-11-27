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


## Step 1 

You'll find some code in the class ```Basket``` that prints the receipt to the screen (the specified number of times).

Run ```Main``` and check the output.

Does the output match the sample output in the spec above?

Run ```ShoppingBasketShould``` with coverage.  What do you notice about the line coverage in ```Basket```?

Use Cody to generate a unit test for the ```printReceipt``` method.

What kind of tests does it create?

What could be the problems with the test code and the production code?  

What if I wanted to print the receipt to a real printer?

What if I wanted to print the receipt to a real printer and email it to someone at the same time?


Now move onto branch basket_step_2
