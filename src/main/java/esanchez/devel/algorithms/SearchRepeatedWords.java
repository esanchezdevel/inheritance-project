package esanchez.devel.algorithms;

public class SearchRepeatedWords {

	public static void main(String[] args) {
		
		System.out.println("1- " + hasRepeatedWords("This is a test"));
		System.out.println("2- " + hasRepeatedWords("This is a test repetead test"));
		System.out.println("3- " + hasRepeatedWords("This is is the best test"));
		System.out.println("4- " + hasRepeatedWords("This is a     test"));
	}
	
	public static boolean hasRepeatedWords(String text) {
		
		String[] textArray = text.split(" ");
				
		int position = 0;
		for(String word : textArray) {
			
			System.out.println("word: " + word);
			
			if (word.equals("")) {
				position++;
				continue;
			}
						
			int positionCompare = 0;
			for(String comparedWord : textArray) {
				
				if (position != positionCompare && word.equals(comparedWord)) {
					System.out.println("found repeated word: \"" + word + "\"");
					return true;
				}
				System.out.println(word + " is not equal to " + comparedWord);
				positionCompare++;
			}
			position++;
		}
		
		return false;
	}
}
