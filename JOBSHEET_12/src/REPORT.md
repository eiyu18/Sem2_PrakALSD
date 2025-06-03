|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020181 |
| Nama |  Eiyu Azizuly Efendi |
| Kelas | TI - 1I |
| Repository | [link] () |

# Labs #12 LINKED LIST 

## Experiment 1: Implementing Single Linked List  

The solution is implemented in SLLMain.java, and below is screenshot of the result.

![Screenshot 2025-05-14 143012](https://github.com/user-attachments/assets/357baf21-b224-4088-82b4-82b14aa6073e)

**Brief explanaton:** There are 4 main step: 
1. Create Nodes: Each student is stored in a node that links to the next node.
2. Add Nodes: Use methods to add nodes at the start, end, or after a specific node.
3. Show Data: The program reads all nodes from the first to the last and prints their data.
4. Update Links: When adding or rearranging nodes, links between nodes are updated to keep the list connected.

## Question
1. The message appears because the linked list is initially empty (head is null), and the print() method checks if the list is empty before attempting to display data.
2. The temp variable is used to traverse the linked list, starting from the head. It allows the program to visit and manipulate each node in sequence.
3. 
4. Without the tail attribute, adding a node at the end of the list (addLast) would require traversing the entire list to find the last node.

## Experiment 2: Accessing Element in Single Linked List

## Question
1. The break keyword is used to exit the loop immediately after the targeted node (the one to be removed) is found and removed.
2. temp.next = temp.next.next;: This updates the next reference of the current node (temp) to skip over the node being removed.

## Assignment










