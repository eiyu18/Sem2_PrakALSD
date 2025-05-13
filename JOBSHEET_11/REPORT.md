|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020181 |
| Nama |  Eiyu Azizuly Efendi |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/eiyu18/Sem2_PrakALSD/blob/main/JOBSHEET_11/REPORT.md) |

# Labs #11 QUEUE 

## 2.1 Experiment 1 : Queue Basic Operations 

The solution is implemented in Queue.java, QueueMain.java, and below is screenshot of the result.

![Screenshot 2025-05-13 192853](https://github.com/user-attachments/assets/c4d813f9-4774-4391-bfa2-075d4c3a3fd5)


![Screenshot 2025-05-13 192928](https://github.com/user-attachments/assets/027689da-06d8-4d6a-a312-e19b31f5893c)


![Screenshot 2025-05-13 192937](https://github.com/user-attachments/assets/b6d68971-1e2e-43df-a8f3-d8af13121d63)


**Question:**
1. The initial values of front and rear are set to -1 to indicate that the queue is empty and no elements have been inserted yet. The value -1 serves as an initial indicator. Meanwhile, size is set to 0 because no element has been added to the queue yet.
2. If rear reaches the last index (max - 1), then rear will be rotated back to the initial index (0).
3. If the front has reached the last index (max - 1), then the front is rotated back to the beginning of the array (0) to continue retrieving elements from the front of the queue that was refilled earlier.
4. Since the active element in the queue starts from the front position, printing must start from that index.
5. By using the modulus operation (%), index i will return to 0 when it reaches the end of the array (max - 1), allowing queue printing that wraps from back to front
6. void enqueue(int  dt){
        if(!isFull()) {
            if(isEmpty()) {
                front=rear=0;
            }else {
                if(rear==max-1) {
                    rear=0;
                }else {
                    rear++;
                }
            }
            data[rear]=dt;
            size++;
            System.out.printf("%d is successfully added at index %d\n", dt, rear);
        }else {
            System.out.println("Queue is full!!!");
        }
    }

## 2.2. Experiment 2 : Academic Service Queue 

The solution is implemented in Student.java, StudentQueue.java, StudentQueueMain.java, and below is screenshot of the result.

![Screenshot 2025-05-13 210726](https://github.com/user-attachments/assets/29136329-832f-4007-8dbc-978538770c7c)


![Screenshot 2025-05-13 210737](https://github.com/user-attachments/assets/f812de27-2d9d-4548-a06d-2a242b2866cb)


![Screenshot 2025-05-13 210749](https://github.com/user-attachments/assets/5ce104ba-a197-4311-9322-099f7e0995fd)


![Screenshot 2025-05-13 210809](https://github.com/user-attachments/assets/b45fd41e-cb5f-470b-af31-9d22e4843e0f)


![Screenshot 2025-05-13 210836](https://github.com/user-attachments/assets/09fd570a-9807-4fc8-b42e-0c332af4eef3)


**Question:**
1. The main difference lies in the data type they manage:
    -Queue manages primitive int data.
    -StudentQueue manages custom Student objects, which include multiple attributes (nim, name, studyProgram, className).
3. In StudentQueue, front is initialized to 0 because:
    -The queue starts ready to dequeue from index 0, and modulo arithmetic handles circular movement.
   In Queue, front is initialized to -1 to signal an empty state, and is only changed to 0 during the first enqueue().
    -This method uses conditional checks to manually manage front and rear for the first insertion.
   
4. ![Screenshot 2025-05-13 224101](https://github.com/user-attachments/assets/6e0b5e77-1b23-4f08-b830-3f7bc06fe795)


## 2.3 Assignment 

![Screenshot 2025-05-13 225855](https://github.com/user-attachments/assets/6a939e8d-a28f-4cf9-8485-997151de42a0)


![Screenshot 2025-05-13 230053](https://github.com/user-attachments/assets/36d4c013-e041-4c8a-9715-9f9fb8f5382f)


![Screenshot 2025-05-13 230130](https://github.com/user-attachments/assets/62351583-017c-4234-be32-d49549353502)


![Screenshot 2025-05-13 230205](https://github.com/user-attachments/assets/8d77dae5-7af3-4e5d-8dc8-7c88ddf57cf6)
















