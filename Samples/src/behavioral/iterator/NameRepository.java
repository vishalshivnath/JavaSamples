package behavioral.iterator;

public class NameRepository implements Container {

	public String names[]= {"virat","rohit","jadega"};
	
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}

	private class NameIterator implements Iterator {
		
		int index;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(index<names.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if(this.hasNext()) {
				return names[index++];
			}
			return null;
		}
		
		
	}
}
