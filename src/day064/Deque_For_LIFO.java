package day064;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_For_LIFO {
    public static void main(String[] args) {
        // How do we implement a LifoQueue if not using old class called Stack
        // we can use any of Deque interface implementation
        // Deque is a double ended Queue so we can add item as always
        // and when we remove we can use removeLast last method to achieve Last in first out

        //Deque means Double Ended Queue
        Deque<String> lifoQue = new LinkedList<>();

        lifoQue.add("review the class");
        lifoQue.add("do your homework");
        lifoQue.add("attend the class");
        lifoQue.add("Say bye to Java");

        System.out.println("lifoQue.remove() = " + lifoQue.removeLast());
        System.out.println("lifoQue.remove() = " + lifoQue.removeLast());
        System.out.println("lifoQue.remove() = " + lifoQue.removeLast());
        System.out.println("lifoQue.remove() = " + lifoQue.removeLast());

    }
}
