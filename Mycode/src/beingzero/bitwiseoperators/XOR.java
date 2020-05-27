package beingzero.bitwiseoperators;

public class XOR {

	static void bitwiseXOR(int b, int c) { // ^
		//.	int y = 4 | 7;     // y will have value 3, XOR
		int y = b ^ c;
		System.out.println("XOR="+y);
	}
}
