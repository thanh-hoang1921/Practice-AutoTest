package slide4.Generics.multiTypeParam;

public class MultipleTypeParameters {

	public static void main(String[] args) {
		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
		Pair<String, String> p2 = new OrderedPair<String, String>("hello", "world");

		OrderedPair<String, Integer> op1 = new OrderedPair<>("Even", 8);
		OrderedPair<String, String> op2 = new OrderedPair<>("hello", "world");
	}
}
