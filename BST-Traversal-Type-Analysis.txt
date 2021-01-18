Question - Tree traversal can be done in two ways: recursive and iterative. Which one do you favor?
What are the pros and cons of both ways?

Two Ways of Traversal

1) Iterative Approach - This approach always comes to my mind when comes to tree traversal :-) . Basically this approach
uses an external Stack

Pros.
i) Less Stack Usage required to store all nodes 
ii) Can be Stopped in the middle of the traversal(help ful in pre/in/post order traversal) 

Cons.
i) Comparitively Larger Lines of Code :-)

2) Recursive Approach - This uses call stack

Pros.
i) Less Lines of Code :-)
ii) Simpler as the concentration is only on the node. 

Cons.
i) As this uses call stack, this is a heavy operation which allocats space for the function state


Words of Favour :) - It depends on the requirement, if the data is high, then iterative is the best approach, if less data then Recursion.