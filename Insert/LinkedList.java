import java.util.*;
/*
 * Given a linked list which is sorted, how will you insert in sorted way?
 */

// A program to insert in a sorted LinkedList
public class LinkedList {

	// Head of list
	Node head;

	// LinkedList Node
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next=null;
		}
	}
		
		// Function to insert a new node in list 
		
		void sortedInsert(Node new_node){
			Node current;
			
			//Condition for head node
			if(head==null || head.data>=new_node.data){
				new_node.next=head;
				head=new_node;
			}
			else {
				// Locate the node before point of insertion.
				current=head;
				while(current.next!=null && current.next.data<new_node.data)
					current=current.next;
				
				new_node.next=current.next;
				current.next=new_node;
			}
		}
		
		// Function to create a node 
		Node newNode(int data){
			Node x=new Node(data);
			return x;
		}
		// Function to print linked list
		
		void printLinkedList(){
			Node temp=head;
			while(temp!=null){
				System.out.print(temp.data+ " ");
				temp=temp.next;
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList llist = new LinkedList(); 
        Node new_node; 
        new_node = llist.newNode(5); 
        llist.sortedInsert(new_node); 
        new_node = llist.newNode(10); 
        llist.sortedInsert(new_node); 
        new_node = llist.newNode(7); 
        llist.sortedInsert(new_node); 
        new_node = llist.newNode(3); 
        llist.sortedInsert(new_node); 
        new_node = llist.newNode(1); 
        llist.sortedInsert(new_node); 
        new_node = llist.newNode(9); 
        llist.sortedInsert(new_node); 
        System.out.println("Created Linked List"); 
        llist.printLinkedList();
	}

}

/*
Created Linked List
1 3 5 7 9 10 
*/

