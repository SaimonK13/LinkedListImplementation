//Linked list class to add and print nodes

public class LinkedList {
	
	Node head;//create head object
	
	//method to insert node
	public void insert(int value) {
		
		Node node = new Node();//create new node object
		node.data = value;//assign value to the data of the new node
		
		//if head doesn't exist, make the new node the head
		if(head == null) {
			head = node;
		}
		
		else {
			
			//traverse through every node and add new node after the final node
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	
	//method to insert node at a specific index
	public void insertAt(int index, int value) {
		
		Node node = new Node();
		node.data = value;
		
		Node n = head;
		
		
		for(int i = 0; i < index - 1; i++) {
			n = n.next;
		}
		
		if(index == 0) {
			node.next = head;
			head = node;
		}
		
		else {
			/* messy solution
			Node n1;
			n1 = n.next;
			n.next = node;
			Node n2 = n.next;
			n2.next = n1;
			*/
			node.next = n.next;
			n.next = node;
		}
		
	}
	
	//method to delete a node at a certain index
	public void deleteAt(int index) {
		
		//if index is 0, set move head to the next node
		if(index == 0) {
			head = head.next;
		}
		
		else {
			
			Node n = head;
			Node n1 = null;
			
			for(int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			
			//use temporary node n1 to delete the index value
			n1 = n.next;
			n.next = n1.next;
			n1 = null;//code works without this line
			
		}

		}
	
	//method to print linked list
	public void show() {
		
		//traverse through every node and print
		Node n = head;
		while(n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		
		System.out.println(n.data);
	}
	
	//method to delete duplicate values
	public void deleteDup() {

		Node n = head;
		
		//traverse through the list
		while(n.next != null) {
			
			Node n1 = n;
			
			//traverse through the list after every node to delete duplicates
			while(n1.next != null) {
				
				if(n1.next.data == n.data) {
					n1.next = n1.next.next;
				}
				
				else {
					n1 = n1.next;
				}
			}
			
			n = n.next;
		}
		
	}
	
	//method to print Kth node from last
	public void printKToLast(int k) {
		
		Node n = head;
		Node n1 = head;
		
		/* brute force solution *
		//find the length of the list
		while(n != null) {
			n = n.next;
			count++;
		}
		
		//find Kth element
		while(count > k) {
			n1 = n1.next;
			count--;
		}
		*/
		
		// * optimized solution *
		for(int i = 0; i < k; i++) {
			n = n.next;
		}
	
		while(n != null) {
			n = n.next;
			n1 = n1.next;
		}
		System.out.println(n1.data);
	}
}


