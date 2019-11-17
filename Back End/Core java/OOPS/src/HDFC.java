import com.capg.corejava.abstraction.ATM;

public class HDFC implements ATM {

	@Override
	public void validatecard() {
System.out.println("using HDFC DB..");
System.out.println("validating info..");
	}

	@Override
	public void getinfo() {
		System.out.println("using HDFC DB..");
		System.out.println("getting info..");
	}

}
