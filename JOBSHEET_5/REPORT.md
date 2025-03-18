|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020181 |
| Nama |  Eiyu Azizuly Efendi |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/jti-polinema/-01-contoh-laporan-react) |

# Labs #5 Brute Force & Divide and Conquer

## 5.2.1 Calculating Factorial Using Brute Force and Divide and Conquer Algorithms

The solution is implemented in factorial.java, and below is screenshot of the result.

![Screenshot 2025-03-18 190652](https://github.com/user-attachments/assets/c76165a7-a85c-4a37-8072-36084eec898f)

**Brief explanaton:** There are 4 main step: 
1. Input number
2. Do the factorial with bruteforce 
3. Do the factorial with Divide and Qonquer 
4. Print

## Question
1. The if handles the base case by stopping recursion with a direct result, while the else continues recursion by dividing the problem.
2. Change the condition into for(int i = n; i >= 1; i--)
3. facto = facto * i;: Updates result step by step in a loop.
   n * factorialDC(n-1);: Recursively calculates and combines results.
4. factorialBF() uses loops to calculate step-by-step, while factorialDC() uses recursion to divide and combine results.

## 5.3.1. Calculating Exponentiation Using Brute Force and Divide and Conquer Algorithms

The solution is implemented in MainPower.java, and below is screenshot of the result.

![Screenshot 2025-03-18 201445](https://github.com/user-attachments/assets/554aa446-eda8-468f-a0ad-9d68329d45f4)

**Brief explanaton:** There are 3 main step: 
1. Input number
2. Calculate the power using brute force and print
3. Calculate the power using Divide and Conquer and then print

## Question
1. - powerBF(): Uses loops to multiply the base repeatedly.
   - powerDC(): Uses recursion to split the problem into smaller parts and combines results.
2. Yes, it exists in powerDC() when the results of smaller parts are multiplied together.
3. No, because recursive methods needs parameteres to pass on.
4. - powerBF(): Repeatedly multiplies the base using a loop.
   - powerDC(): Recursively divides the problem and multiplies results to get the final answer.

## 5.4.1. Calculating Array Sum Using Brute Force and Divide and Conquer Algorithms

The solution is implemented in MainSum.java, and below is screenshot of the result.

![Screenshot 2025-03-18 210031](https://github.com/user-attachments/assets/406ca525-6075-46ec-bafe-95ef7bfb04d0)

**Brief explanaton:** There are 5 main step: 
1. Input number
2. Use the loop to calc the profit
3. Calculate the profit's sum using Brute Force 
4. Calculate the profit's sum using Divide and Conquer
5. Print the resut

### Question
1. The mid divides the array into two parts for recursive processing
2. This calculates the total of the left half of the array recursively
3. To combine the totals of the left and right parts into a final result
4. The base case occurs when there is only one element in the array (e.g., low == high)
5. totalDC() splits the array into halves, calculates their sums recursively, and combines the results.

## 5.5. Assignments

![Screenshot 2025-03-18 220720](https://github.com/user-attachments/assets/2d4a3c2a-5157-4698-9116-4bd9b4ce40e4)
![Screenshot 2025-03-18 220710](https://github.com/user-attachments/assets/7aad2b0d-3aef-4844-b5a0-7327fc0f6839)
![Screenshot 2025-03-18 220805](https://github.com/user-attachments/assets/f86f1f23-b284-4fa5-973a-53fe00677c1b)





