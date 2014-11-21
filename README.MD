Domiyahtzee!
============

The ACM-ICPC is an annual international programming competition. This is one of the problems from it, read it [here](https://raw.githubusercontent.com/nastajus/Domiyahtzee!/master/problem_C.pdf), I found it pretty interesting actually. After this point are spoilers so stop here if you find the problem fascinating.

####Implementation
One solution I want to implement uses a LinkedList of classes of Dominos and treating the 2D array as a long linear array from 0-24.

####Performance
Performance is not an issue being evaluated at this iteration, however the largest bottleneck is evaluating the rules on each row, column, and diagonal.

####Comprehension
One possible misinterpretation is a "standard set of dominoes is 21 pieces" may seem erroneous to some people, since it could be considered there are 36 possibilities. However the difference is there are 21 unique combinations, but 36 unique permutations. The specified 21 pieces is correct as the most common double-six set.

####Status
Project only created with idea how I want to implement. See commit #1 for pseudo code.