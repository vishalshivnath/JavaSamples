package behavioral.iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NameRepository namesContainer=new NameRepository();
		for (Iterator itr1=namesContainer.getIterator();itr1.hasNext();) {
			String name=(String)itr1.next();
			System.out.println("name :"+name);
		}
	}

}
