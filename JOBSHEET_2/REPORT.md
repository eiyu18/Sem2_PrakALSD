|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020181|
| Nama |  Eiyu Azizuly Efendi |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/jti-polinema/-01-contoh-laporan-react) |

# Labs #1 Objects

## 2.1 Declare Classes, Attributes and Methods

The solution is implemented in student10.java , and below is screenshot of the result.

![Screenshot 2025-02-25 211507](https://github.com/user-attachments/assets/17bb0c92-20e6-43c3-9ac9-5d1499800acb)

**Brief explanaton:** There are 4 main step: 
1. Declare variables for the student's data
2. Make a method to print Student's data
3. Make a method to change Student's class
4. Make a method to update Student's GPA
5. Make a method to evaluate Student's GPA

**Questions :** 
1. Class  : General
   Object : Specific
3. The Student class has four methods :
   -studentID (String)
   -name (String)
   -className (String)
   -gpa (double)
4. The Student class has four methods :
   -print(): Displays the student's details.
   -changeClass(String newClass): Changes the className attribute.
   -updateGPA(double newGPA): Updates the gpa attribute.
   -evaluate(): Evaluates the student's performance and returns a string based on the gpa.
5. ![Screenshot 2025-02-25 212924](https://github.com/user-attachments/assets/05708ff5-ae5c-4cad-be5a-422cd2925129)
   
## 2.2 Object Instatiation and Acessing Attributes and Methods

The solution is implemented in StudentMain.java , and below is screenshot of the result.
![Screenshot 2025-02-25 214018](https://github.com/user-attachments/assets/c7a0ab1c-7984-48e5-8cfb-9d88c20861ba)

**Brief explanaton:** There are 9 main step: 
1. Insstantiate student1 object from the Student class
2. Input the Student's Student ID
3. Input student's name
4. Input student's class name
5. Input student's GPA
6. Call the print method
7. Call the changeClass method
8. Call the updateGPA method
9. Call the print method again after changing some of the student's data

**Questions :** 
1. Student10 student1 = new Student10(); . The name is student1
2. do an instantiation like number 1
3. The output differs because between the first and second calls to print(), the object's attributes are modified using methods:
    -The changeClass() method is called to update the className.
    -The updateGPA() method is called to modify the gpa.

## 2.3 Creating a Constructor

The solution is implemented in StudentMain.java, and below is screenshot of the result.
![Screenshot 2025-02-25 213755](https://github.com/user-attachments/assets/75a44d78-8df6-45e9-bb47-a8825d6c8957)

**Brief explanaton:** 4 main steps :
1. Declare two constructors. The one's default and the one's parameterized
2. Match the parameters with the objects on the class
3. Create another object named student2 using the parameterized constructor
4. Update the gpa and then call the print method

**Questions :** 
1. ![Screenshot 2025-02-25 220129](https://github.com/user-attachments/assets/4e585a3c-7b02-4b30-82a3-f5656852d482)
2. This line creates a new Student object named student2 using the parameterized constructor. It assigns the following values to its attributes:
   -studentID = "244107020040"
   -name = "Rizky"
   -className = "TI-1I"
   -gpa = 3.5
3.  The default conductor is missing
5. ![Screenshot 2025-02-25 220956](https://github.com/user-attachments/assets/5a2e9ffb-b0f4-4e80-9057-5e73345a8851)
   ![Screenshot 2025-02-25 213755](https://github.com/user-attachments/assets/4a8b3a94-43d9-44ab-baa0-f18736b50679)

## 2.4 Assignment 1
  The solution is implemented in Course10.java and CourseMain16, and below is screenshot of the result.

Class code
![Screenshot 2025-02-25 221622](https://github.com/user-attachments/assets/1e7c1a06-3bcb-45ea-8095-f8921bba6609)

Main code
![Screenshot 2025-02-25 221632](https://github.com/user-attachments/assets/d666a397-a48b-4793-92fa-da117a43212e)

Output
![Screenshot 2025-02-25 221648](https://github.com/user-attachments/assets/2095a9f7-e866-40b4-86cd-10bbb7b2b1f2)

## 2.5 Assignment 2
  The solution is implemented in Lecture10.java and CourseMain16, and below is screenshot of the result.

Class code
![Screenshot 2025-02-25 201644](https://github.com/user-attachments/assets/4b94d452-da82-4286-9912-b9b9322851e8)

Main code
![Screenshot 2025-02-25 201700](https://github.com/user-attachments/assets/25f1fd3c-bf7b-40c6-ac4b-112b6148bde0)

Output
![Screenshot 2025-02-25 221153](https://github.com/user-attachments/assets/1966698e-fd6c-43a1-aa68-a256f4c25074)









