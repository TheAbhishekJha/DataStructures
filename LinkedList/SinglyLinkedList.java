package ds;

import java.util.Scanner;

class Node{
	private int data;
	private Node next;
	
	Node(){
		this.data = 0;
		this.next = null;
	}
	
	Node(int data,Node next){
		this.data = data;
		this.next = next;
	}
	
	public void setData(int d) {
		data = d;
	}
	
	public void setNext(Node n) {
		next = n;
	}
	
	public int getData() {
		return data;
	}
	
	public Node getNext() {
		return next;
	}	
}

class LinkedList {
	private Node start;
	private Node end;
	private int size;
	
	public LinkedList() {
		start = null;
		end = null;
		size = 0;
	}
	
	public void insertAtStart(int data) {
		Node nn = new Node(data,null);
		size++;
		if(start == null) {
			start = nn;
			end = start;
		}
		else {
			nn.setNext(start);
			start = nn;
		}
	}
	
	public void insertAtEnd(int data) {
		Node nn = new Node(data,null);
		size++;
		if(start == null) {
			start = nn;
			end = start;
		}
		else {
			end.setNext(nn);
			end = nn;
		}
	}
	
	public void insertAtMiddle(int data,int pos) {
		Node nn = new Node(data,null);
		Node ptr = start;
		for(int i=1;i<size;i++) {
			
			if(i==pos-1) {
				Node tmp = ptr.getNext();
				ptr.setNext(nn);
				nn.setNext(tmp);
				break;
			}
			
			ptr = ptr.getNext();
		}
		size++;
	}
	
	public void deleteAtPos(int pos) {
		Node ptr = start;
		Node preptr = start;
		if(size == 1) {
			start = end = null;
			size = 0;
		}
		else if(pos == size) {
			ptr = ptr.getNext();
			
			while(ptr.getNext()!=null) {
				preptr = preptr.getNext();
				ptr= ptr.getNext();
			}
			preptr.setNext(null);
			end = preptr;
			size--;
		}
		else {
		for(int i =1 ; i<size;i++) {
			if(i==pos-1) {
				Node tmp = ptr.getNext();
				tmp = tmp.getNext();
				ptr.setNext(tmp);
				size--;
				break;
			}
		}
	}
	}
	
	public void display() {
		if(size==0||start==null) {
			System.out.println("Empty linkedlist");
		}
		else {
			Node ptr = start;
			while(ptr.getNext()!=null) {
				System.out.print(ptr.getData()+"-->");
				ptr = ptr.getNext();
			}
			System.out.print(ptr.getData());
		}
	}
}


public class SinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int data = 0  ;
		
		LinkedList ll = new LinkedList();
		
		System.out.println("Choose : \n1. Insert at Start \n2. Insert At End \n3. Use already linklist");
		
		switch (sc.nextInt()) {
		case 1:
			
			do {
				System.out.print("Enter the data : ");
				data = sc.nextInt();
				
				ll.insertAtStart(data);
				
				System.out.print("Do you want to add more (y/n) : ");
				
			}while(sc.next().equals("y"));
			
			ll.display();
			
			break;
			
		case 2:
			
			do {
				System.out.print("Enter the data : ");
				data = sc.nextInt();
				
				ll.insertAtEnd(data);
				
				System.out.print("Do you want to add more (y/n) : ");
				
			}while(sc.next().equals("y"));
			
			ll.display();
			
			break;
			
		case 3 : 
			
			ll.insertAtEnd(5);
			ll.insertAtEnd(10);
			ll.insertAtEnd(15);
			ll.insertAtEnd(20);
			ll.insertAtEnd(25);
			ll.display();
			
			break ;

		default:
			break;
		}

	}

}
