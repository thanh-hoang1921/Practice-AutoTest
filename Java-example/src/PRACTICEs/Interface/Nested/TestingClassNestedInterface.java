package PRACTICEs.Interface.Nested;

import PRACTICEs.Interface.Nested.ClassNestedInterface.TestIn;

public class TestingClassNestedInterface implements ClassNestedInterface.TestIn {

	@Override
	public void show() {
		System.out.println("Show method of interface into TestingClass");
	}

	
	public static void main(String[] args) {
		ClassNestedInterface.TestIn testing = (TestIn) new ClassNestedInterface();
		testing.show();

		TestingClassNestedInterface test = new TestingClassNestedInterface();
		test.show();
	}
}
