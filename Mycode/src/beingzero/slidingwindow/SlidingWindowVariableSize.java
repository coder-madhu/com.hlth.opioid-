package beingzero.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class SlidingWindowVariableSize {
	public static void main(String[] args) {
		String S = "applessd"; // ples
		String O= "kottruupatkssfid";
		longestSubStringWithUniqueCharactersLength(S);
		longestSubStringWithUniqueCharactersLength(O);
	}

	private static void longestSubStringWithUniqueCharactersLength(String s) {
		int start = 0;
		int end = 0;
		int mxLen = Integer.MIN_VALUE;
		int ansStart = -1;
		int ansEnd = -1;
		char[] str = s.toCharArray();
		Map<Character, Integer> m = new HashMap<>();
		for (end = 0; end < str.length; end++) {
			char c = str[end]; // Expand
			if(m.containsKey(c)) {
			int ft = m.get(c);
			m.put(c, ++ft);
			}else {
				m.put(c, 1);
			}
			while (m.get(c) > 1) { // Shrinking Condition
				int kt = m.get(str[start]);
				kt--;
				m.put(str[start], kt);
				start++;
				if (end - start + 1 >= mxLen) {
					ansStart = start;
					ansEnd = end;
					mxLen = Math.max(mxLen, end - start + 1); // Get the size
				}

			}
		}
		System.out.println(s.substring(ansStart-1,ansEnd));
	}

}
