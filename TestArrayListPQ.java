package rmuti.PriorityQueue;

public class TestArrayListPQ {

	public static void main(String[] args) {
		Employee emp1 = new Employee("001","name1",20_000);
		Employee emp2 = new Employee("002","name2",30_000);
		Employee emp3 = new Employee("003","name3",15_000);
		
		ArrayListPQ arrayListPQ = new ArrayListPQ();
		arrayListPQ.enque(emp1);
		arrayListPQ.enque(emp2);
		arrayListPQ.enque(emp3);
		
		System.out.println(arrayListPQ);
		
		arrayListPQ.dequeue();
		System.out.println(arrayListPQ);
		
		arrayListPQ.dequeue();
		System.out.println(arrayListPQ);
		
		arrayListPQ.enque(new Employee("004","name4",40_000));
		System.out.println(arrayListPQ);
	}

}