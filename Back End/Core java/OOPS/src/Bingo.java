import com.capg.corejava.inheritance.Chips;

public class Bingo implements Chips {

	@Override
	public void open() {
		System.out.println("It is open");
	}

	@Override
	public void eat() {
		System.out.println("It is eat");

	}

}
