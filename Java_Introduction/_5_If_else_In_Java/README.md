# If-Else Statements
If-else statements are fundamental constructs in programming that allow a program to make decisions based on certain conditions. The if-else statement executes a block of code if a specified condition is true, and another block of code if the condition is false.

> if (condition) {\
>   // code to be executed if condition is true\
> } else {\
>   // code to be executed if condition is false\
> }

The `if` keyword is used to start an `if-else` statement, followed by the condition to be evaluated in parentheses. If the condition is `true`, the code inside the curly braces will be executed. If the condition is `false`, the code inside the `else` block will be executed.

## Nested If-Else Statements
Nested if-else statements are used when multiple conditions need to be evaluated. In this case, an if statement is placed inside another if or else block.

> if (condition1) {\
>   // code to be executed if condition1 is true\
> } else if (condition2) {\
>   // code to be executed if condition2 is true\
> } else {\
>   // code to be executed if both condition1 and condition2 are false\
> }

In this example, if `condition1` is true, the code inside the first `if` block will be executed. If `condition1` is false, `condition2` will be evaluated. If `condition2` is true, the code inside the `else if` block will be executed. If both `condition1` and `condition2` are false, the code inside the `else` block will be executed.
