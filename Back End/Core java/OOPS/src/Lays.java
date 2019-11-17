import com.capg.corejava.inheritance.Chips;

public class Lays implements Chips {

	@Override
	public void open() {
		System.out.println("open method");
	}

	@Override
	public void eat() {
	System.out.println("eat method");	
	}

}
