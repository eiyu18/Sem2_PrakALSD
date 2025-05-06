public class StudentAssignmentStack10 {
    Student10[] stack;
    int top, size;

    public StudentAssignmentStack10(int size) {
        this.size = size;
        top = -1;
        stack = new Student10[size];
    }

    boolean isFull(){
        if(top==size-1){
            return true;
        }else{
            return false;
        }
    }

    boolean isEmpty(){
        if(top==-1){
            return true;

        }else{
            return false;
        }
    }

    void push(Student10 std){
        if(!isFull()){
          top++;
          stack[top] = std;  
        }else{
            System.out.println("Stack is already full!!");
        }
    }

    Student10 pop(){
        if(isEmpty()){
            Student10 std = stack[top];
            top--;
            return std;
        }else{
            System.out.println("There is no data in stack!!");
            return null;
        }
    }
    
    Student10 peek(){
        if (!isEmpty()){
            return stack[top];
        }else{
            System.out.println("There is no data in stack!!");
            return null;
        }
    }

    void  print(){
        for(int i=0;i<=top;i++){
            System.out.println(stack[i].nim+"\t"+stack[i].name+"t"+stack[i].className);
        }
        System.out.println("");
    }
}
