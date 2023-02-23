package PRACTICEs.Interface.Nested;

public class NestedInterfaceExample implements Showable.Message {

	@Override
	public void printMessage() {
		System.out.println("Hello nested interface!!!");
	}

	public static void main(String args[]) {
		Showable.Message message = new NestedInterfaceExample();
		message.printMessage();
	}

}
