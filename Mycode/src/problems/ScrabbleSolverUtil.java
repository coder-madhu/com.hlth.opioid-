package problems;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ScrabbleSolverUtil {


	public Map<String, Integer> getWeightsForWords(final List<String> words) {
		Map<String, Integer> wordWeightMap = new LinkedHashMap<>();
	//	if (!CollectionUtils.isEmpty(words)) {
			words.forEach(word -> wordWeightMap.put(word, calculateWeight(word)));
		//}
		return wordWeightMap;
	}


	private Integer calculateWeight(final String word) {
		Integer weight = 0;
	//if (!StringUtils.isEmpty(word)) {
		//	char[] wordChars = StringUtils.trimAllWhitespace(word).toCharArray();
	//		for (int i = 0; i < wordChars.length; i++) {
		//		weight = weight + weightMap.get(Character.toUpperCase(wordChars[i]));
		//	}
	//	}
		return weight;
	}


	public List<String> sortByWeight(final Map<String, Integer> weightedWords) {
		List<String> words = new ArrayList<String>(weightedWords.keySet());
		Collections.sort(words, (w1, w2) -> weightedWords.get(w1).equals(weightedWords.get(w2)) ? w1.compareTo(w2)
				: weightedWords.get(w2) - weightedWords.get(w1));
		return words;
	}

	
	public List<String> loadAllWordsFromFile(final String fileName)   {
		List<String> toLowerCaseWords = null;
		//	try {
		//		final List<String> allWords = Files.readAllLines(new File(fileName).toPath(), Charset.defaultCharset());
			//		if(!StringUtils.isEmpty(allWords)) {
		//		toLowerCaseWords = allWords.stream().map(word -> word.toLowerCase())
					//					.filter(s -> s.chars().allMatch(Character::isLetter)).collect(Collectors.toList());
			//			return toLowerCaseWords;
		//	}
	//} catch (IOException e) {
		//		throw new ScrabbleException("Failed to load the file"+fileName+", exceptionMessage"+e.getMessage());
		//	}
		
		
		return toLowerCaseWords;
	}

	public List<String> findPossibleValidWords(final String string, final List<String> wordsDictionary) {
		List<String> possibleWords = new ArrayList<>();
		int[] freq = toFreq(string);
		for (String word : wordsDictionary) {
			int[] freqIn = toFreq(word);
			if (matches(freq, freqIn)) {
				possibleWords.add(word);
			}
		}
		return possibleWords;
	}

	
	private boolean matches(final int[] freq, final int[] freqIn) {
		for (int i = 0; i < 26; i++) {
			if (freq[i] == 0 && freqIn[i] > 0) {
				return false;
			} else if (freq[i] < freqIn[i]) {
				return false;
			}

		}
		return true;
	}


	private int[] toFreq(final String string) {
		int[] freq = new int[26];
		for (char c : string.toCharArray()) {
			if ((c - 'a') >= 0 && (c - 'a') < 26) {
				freq[c - 'a']++;
			}
		}
		return freq;
	}


	private static Map<Character, Integer> weightMap = Stream
			.of(new AbstractMap.SimpleEntry<>('A', 1), new AbstractMap.SimpleEntry<>('E', 1),
					new AbstractMap.SimpleEntry<>('I', 1), new AbstractMap.SimpleEntry<>('L', 1),
					new AbstractMap.SimpleEntry<>('N', 1), new AbstractMap.SimpleEntry<>('O', 1),
					new AbstractMap.SimpleEntry<>('R', 1), new AbstractMap.SimpleEntry<>('S', 1),
					new AbstractMap.SimpleEntry<>('T', 1), new AbstractMap.SimpleEntry<>('U', 1),
					new AbstractMap.SimpleEntry<>('D', 2), new AbstractMap.SimpleEntry<>('G', 2),
					new AbstractMap.SimpleEntry<>('B', 3), new AbstractMap.SimpleEntry<>('C', 3),
					new AbstractMap.SimpleEntry<>('M', 3), new AbstractMap.SimpleEntry<>('P', 3),
					new AbstractMap.SimpleEntry<>('F', 4), new AbstractMap.SimpleEntry<>('H', 4),
					new AbstractMap.SimpleEntry<>('V', 4), new AbstractMap.SimpleEntry<>('W', 4),
					new AbstractMap.SimpleEntry<>('Y', 4), new AbstractMap.SimpleEntry<>('K', 5),
					new AbstractMap.SimpleEntry<>('J', 8), new AbstractMap.SimpleEntry<>('X', 8),
					new AbstractMap.SimpleEntry<>('Q', 10), new AbstractMap.SimpleEntry<>('Z', 10))
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

}
