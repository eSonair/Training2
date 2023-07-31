package Training2;

import java.util.ArrayList;

//11 Minutes...

public class MyStack {

    public static ArrayList <Integer> alist = new ArrayList<>();

    public static void main(String[] args) {




        MyStack obj = new MyStack();
        obj.push(0);
        obj.push(1);
        obj.push(2);

        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();


        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);


    }//Ende Methode Main


    public MyStack() {

    }//Ende CTOR

    public void push(int x) {
        alist.add(x);
    }//Ende Methode push

    public int pop() {

        if(empty()==false){
            return 0;
        }

        int result;

        result= top();
        alist.remove(alist.size()-1);
        return result;
    }//Ende Methode pop


    public int top() {
        if(empty()==false){
            return 0;
        }
        return  alist.get(alist.size()-1);
    }//Ende Methode top



    public boolean empty() {
        if(alist.size()>0){
            return true;
        }
        return false;
    }//Ende Methode empty

}//Ende Klasse MyStack












/*
Implement Stack using Queues
Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

Implement the MyStack class:

void push(int x) Pushes element x to the top of the stack.
int pop() Removes the element on the top of the stack and returns it.
int top() Returns the element on the top of the stack.
boolean empty() Returns true if the stack is empty, false otherwise.
Notes:

You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.


Example 1:

Input
["MyStack", "push", "push", "top", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 2, 2, false]

Explanation
MyStack myStack = new MyStack();
myStack.push(1);
myStack.push(2);
myStack.top(); // return 2
myStack.pop(); // return 2
myStack.empty(); // return False

Constraints:

1 <= x <= 9
At most 100 calls will be made to push, pop, top, and empty.
All the calls to pop and top are valid.

 */
