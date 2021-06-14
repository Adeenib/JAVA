import java.util.*;
public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        // your code here
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    
    public void setHead(){
       head = null;
    }
    public void remove() {
        if (head == null){
            System.out.println("No linked list available");
        }
        else if(head.next == null){
            head = null;
            System.out.println("1 element \"head\" removed");
        }
        else{
            
        Node runner = head;
        while(runner.next.next != null) {
            // System.out.println("test2");
                runner = runner.next;
            }
            runner.next = null; 
        }       
    }
    public  void printValues() {
        if (head == null){
            System.out.println("no linked list");
        }else{
            Node runner = head;
            System.out.println(runner.value);
            while(runner.next != null) {
                runner = runner.next;
                System.out.println(runner.value);
                
                 
            } 
        }

        
    }
}