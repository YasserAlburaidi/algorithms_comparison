# algorithms_comparison

# Introduction 
In this project, we will create algorithms to search and compare between them, the goal of this comparison is to display the worst and best times for each algorithm by graphing each algorithm and determining the best algorithm to search for the elements. And we're going to compare these algorithms (linear search, binary search, TSA search)

# Theoretical part
* The design of the TSA algorithm 

<img width="648" alt="Screen Shot 2021-12-22 at 9 45 54 PM" src="https://user-images.githubusercontent.com/86910279/147140563-0616b3bc-4359-4690-81bc-84c0cbe2b27a.png">

* The recurrence relation of the TSA algorithm

The recurrence relation of the TSA algorithm is “Iterative method”

* 	The analysis of the TSA algorithm

the associated recurrence equation 
T(n) = T(n/3) + O(1)

# The analysis 

* Table A : For each strategy (TSA, BS, or LS) and each size (100, 200, …, 1000) of the array, provide the average number of comparisons performed by the strategy 

<img width="776" alt="Screen Shot 2021-12-22 at 10 16 22 PM" src="https://user-images.githubusercontent.com/86910279/147143976-1f42c455-1dc5-4512-aa10-d9c6fe4d4ade.png">


* Table B: For each strategy and each size of the array, provide the best case of the strategy (case where the minimum number of comparisons performed by the strategy is reached).

<img width="776" alt="Screen Shot 2021-12-22 at 10 17 06 PM" src="https://user-images.githubusercontent.com/86910279/147144063-0bc15106-60b4-4a3d-9479-b41082827939.png">


* Table C: For each strategy and each size of the array, provide the worst case (case where the maximum number of comparisons performed by the strategy is reached).


<img width="776" alt="Screen Shot 2021-12-22 at 10 17 52 PM" src="https://user-images.githubusercontent.com/86910279/147144147-af7fd124-658e-48c5-8d55-7c138022b99b.png">


# 	The figures A,B,C. 

* A 

![Picture1](https://user-images.githubusercontent.com/86910279/147144265-cbc7ed0f-ac68-4196-8f7e-cb0567e59150.png)

* B 

![Picture2](https://user-images.githubusercontent.com/86910279/147144306-27fbdfdc-cc5c-49f1-ae69-1ea9e42d98f4.png)


* C 

![Picture3](https://user-images.githubusercontent.com/86910279/147144342-6093eeee-5ac0-4412-a199-745301c1af92.png)


* Interpret and analyze your results; compare and explain the behavior of the strategies.


If we talk about linear search it takes a lot more time as compared to binary search and TSA because it is a sort of brute force algorithm which is too much expensive in respect of computation. On the other hand binary search and TSA both use almost same approach for searching and hence they’re more efficient then linear search but binary search is still more efficient as compared to ternary search as there are fewer number of comparisons required in case of bigger array. In our case TSA is working more efficiently then binary search but in case of bigger arrays binary search is more efficient.


* Check whether the theoretical and practical analysis are correlated .

for this purpose, we can draw the asymptotic function of the TSA strategy (part I, 1.b) and compare it with our results. 
			Complexity = O(log3 n))











