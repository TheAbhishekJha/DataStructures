package ds;

public class Stack {
	static int max = 10;
	static int top = -1;
	static int stack[] = new int[max];
	
	static void push(int data) {
		if(top==max-1) {
			System.out.println("Stack full");
		}
		else {
			top++;
			stack[top] = data;
		}
	}

	static void pop() {
		if(top==-1) {
			System.out.println("Stack empty");
		}
		else {
			stack[top] = 0;
			top--;
		}
	}
	
	static void peek() {
		if(top==-1) {
			System.out.println("Stack empty");
		}
		else {
			System.out.println(stack[top]);
			
		}
	}
	
	static void print() {
		for(int i=0;i<=top;i++) {
			System.out.println(stack[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		push(60);
		System.out.println("Display : ");
		print();
		System.out.println("peeking : ");
		peek();
		System.out.println("popping : ");
		pop();
		pop();
		pop();
		pop();
		System.out.println("Display : ");
		print();

	}

}
