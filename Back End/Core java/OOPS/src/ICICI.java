import com.capg.corejava.abstraction.ATM;

public class ICICI implements ATM {

	@Override
	public void validatecard() {
System.out.println("using ICICI DB..");
System.out.println("validating card..");
	}

	@Override
	public void getinfo() {
System.out.println("using ICICI DB..");
System.out.println("getting info..");
	}

}
