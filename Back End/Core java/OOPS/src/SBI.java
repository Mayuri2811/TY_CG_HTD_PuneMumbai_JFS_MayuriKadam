import com.capg.corejava.abstraction.ATM;

public class SBI implements ATM {

	@Override
	public void validatecard() {
		System.out.println("using SBI DB..");
		System.out.println("validating info..");
	}

	@Override
	public void getinfo() {
		System.out.println("using SBI DB..");
		System.out.println("getting info..");
	}

}
