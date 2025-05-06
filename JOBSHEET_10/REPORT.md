|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020181|
| Nama |  Eiyu Azizuly Efendi |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/jti-polinema/-01-contoh-laporan-react) |

# Labs #10 Stack

## 2.1 Experiment 1: Assignment Submission 

![image](https://github.com/user-attachments/assets/a6473886-1207-44b0-9677-ed1b732afb46)
![image](https://github.com/user-attachments/assets/20d3c7f9-c8fa-436b-9dd7-80cdf5e258c8)

**Question:** 
1. A stack is used because the last assignment submitted (top of the stack) needs to be the first one graded.
2. push() adds assignments to the top of the stack.
   pop() removes the top assignment for grading.
3. To prevent stack overflow. If the stack is full, push() will try to append data to an invalid array index, causing the error. what happen if the check deleted?
   The program will crash
4. The stack can store 5 student assignments in the current implementation.
5. i add new method in StudentAssignmentstack10.java
   ![image](https://github.com/user-attachments/assets/848b9ea2-dedb-463d-8f16-9120ce88269c)
   modify the main code
   ![image](https://github.com/user-attachments/assets/0821f1f2-aebf-4237-9cd1-7b406302a517)
   result
   ![image](https://github.com/user-attachments/assets/795fb86d-28e5-4072-ba12-8300d62fa058)
6.
7. Browser History: The "Back" button uses a stack to revisit the most recent page.
   

## 2.2 Experiment 2: Convert Assignment Grade to Binary  

![image](https://github.com/user-attachments/assets/7e55cd9d-04e4-453f-bc36-e3bef4ccb56b)

**Question:**
1. a. Check for Zero: If the input grade is 0, it directly returns "0" (since 0 in binary is 0).
   b. Use a Stack to Reverse Digits:
       Repeatedly divide the grade by 2 and store the remainder (either 0 or 1) in a stack.
         Example for grade 6:
          6 ÷ 2 = 3 → remainder 0 → stack: [0]
          3 ÷ 2 = 1 → remainder 1 → stack: [0, 1]
          1 ÷ 2 = 0 → remainder 1 → stack: [0, 1, 1]
   c. Build the Binary String:
        Pop digits from the stack (which reverses the order) and combine them into a string.
        For grade 6:
        Stack after popping: 1 → 1 → 0 → Binary: 110
   d. Return the Result:
        The final string is the binary representation of the grade.
2. Jika loop condition diubah dari while (grade > 0) menjadi while (grade != 0), hasilnya tetap sama untuk nilai grade yang valid (0-100).

## Assignment

![image](https://github.com/user-attachments/assets/fe9128fc-5165-4097-81fd-ecf62cf2191e)
![image](https://github.com/user-attachments/assets/0eca1760-e771-42f2-83c3-ca55c6f827da)
![image](https://github.com/user-attachments/assets/48283d89-9405-47d7-893e-5891a84635b2)
![image](https://github.com/user-attachments/assets/c1efabba-2413-4b64-844c-b148ea3a927f)







