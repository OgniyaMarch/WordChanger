import java.util.*;

public class VocabularyEnglishUkrainian{
	//create static HashMap because we don't change it
	//Create vocabulary for symbols "eng-ukr"
	//key is english symbols
	
	private Map<Character, Character> vocabularyEngUa = new HashMap<>();

	public VocabularyEnglishUkrainian(){
		//the first line of keyboard
		vocabularyEngUa.put('q', 'й');
		vocabularyEngUa.put('w', 'ц');
		vocabularyEngUa.put('e', 'у');

		vocabularyEngUa.put('w', 'к');
		vocabularyEngUa.put('t', 'е');
		vocabularyEngUa.put('y', 'н');
				
		vocabularyEngUa.put('u', 'г');
		vocabularyEngUa.put('i', 'ш');
		vocabularyEngUa.put('o', 'щ');
				
		vocabularyEngUa.put('p', 'з');
		vocabularyEngUa.put('[', 'х');
		vocabularyEngUa.put(']', 'ї');
				
		//the second line of keyboard
		vocabularyEngUa.put('a', 'ф');
		vocabularyEngUa.put('s', 'і');
		vocabularyEngUa.put('d', 'в');
				
		vocabularyEngUa.put('f', 'а');
		vocabularyEngUa.put('g', 'п');
		vocabularyEngUa.put('h', 'р');
				
		vocabularyEngUa.put('j', 'о');
		vocabularyEngUa.put('k', 'л');
		vocabularyEngUa.put('l', 'д');
				
		vocabularyEngUa.put(';','ж');
		vocabularyEngUa.put('\'','є');
				
		//the third line of keyboard
		vocabularyEngUa.put('z','я');
		vocabularyEngUa.put('x','ч');
		vocabularyEngUa.put('c','с');
				
		vocabularyEngUa.put('v','м');
		vocabularyEngUa.put('b','и');
		vocabularyEngUa.put('n','т');
				
		vocabularyEngUa.put('m','ь');
		vocabularyEngUa.put(',','б');
		vocabularyEngUa.put('.','ю');
				
		vocabularyEngUa.put('/','.');
		vocabularyEngUa.put('\\','ґ');

	}
	
	public void changingEnglishToUkrainian(StringBuilder userWrongString) {
		StringBuilder userRightString = new StringBuilder();
			for (int i = 0; i < userWrongString.length(); i++) {
				char key = userWrongString.charAt(i);
				if (vocabularyEngUa.containsKey(key)) {
					userRightString.append(vocabularyEngUa.get(key));
				}
				else {
					userRightString.append(key);
				}
			}
		System.out.println(userRightString);
	}
	
	//public void changingUkrainianToEnglish
	
}



