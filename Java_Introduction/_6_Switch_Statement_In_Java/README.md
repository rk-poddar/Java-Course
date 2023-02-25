# Switch Statement 
A switch statement in Java is used to execute different blocks of code based on the value of an expression. It is a control statement that allows the program to evaluate an expression and perform different actions based on the value of that expression.

## Syntax
Here is the syntax of a switch statement in Java:

>   switch(expression) {\
>       case value1 :\
>           // code block\
>           break;\
>       case value2 :\
>           // code block\
>           break;\
>       ...\
>       default :\
>           // code block\
>   }

The `expression` is evaluated once and the resulting value is compared to the values of each `case` in the `switch` statement. If there is a match, the code block associated with that case is executed. The `break` statement is used to terminate the `switch` block.

If none of the `case` values match the value of the `expression`, the code block associated with the `default` statement is executed.
