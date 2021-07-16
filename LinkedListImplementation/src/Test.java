//file to test linked list class

public class Test {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insert(5);
		list.insert(18);
		list.insert(18);
		list.insert(24);
		list.insert(249);
		list.insert(20);
		list.insert(22);
		list.insert(20);
		
		System.out.println("Complete list:");
		list.show(); //print the list
		
		System.out.println("\nList without duplicates:");
		list.deleteDup(); //delete all duplicate values
		list.show(); //print the list
		
		System.out.println("\nAfter deletion of value at index 4:");
		list.deleteAt(4); //delete value at index 4
		list.show();//print list
		
		System.out.println("\nKth to last method:");
		list.printKToLast(3);
	}

}
