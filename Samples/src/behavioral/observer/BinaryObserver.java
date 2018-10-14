package behavioral.observer;

public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
		this.subject=subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println( "Binary String: abc" );
	}

}
