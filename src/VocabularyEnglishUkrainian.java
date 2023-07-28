import java.util.*;

public class VocabularyEnglishUkrainian{
	private Map<Character, Character> vocabularyEngUa = new HashMap<>();

	public VocabularyEnglishUkrainian(){
		//the first line of keyboard
		vocabularyEngUa.put('q', 'й'); vocabularyEngUa.put('Q', 'Й');
		vocabularyEngUa.put('w', 'ц'); vocabularyEngUa.put('W', 'Ц');
		vocabularyEngUa.put('e', 'у'); vocabularyEngUa.put('E', 'У');

		vocabularyEngUa.put('r', 'к'); vocabularyEngUa.put('R', 'К');
		vocabularyEngUa.put('t', 'е'); vocabularyEngUa.put('T', 'Е');
		vocabularyEngUa.put('y', 'н'); vocabularyEngUa.put('Y', 'Н');

		vocabularyEngUa.put('u', 'г'); vocabularyEngUa.put('U', 'Г');
		vocabularyEngUa.put('i', 'ш'); vocabularyEngUa.put('I', 'Ш');
		vocabularyEngUa.put('o', 'щ'); vocabularyEngUa.put('O', 'Щ');
				
		vocabularyEngUa.put('p', 'з'); vocabularyEngUa.put('P', 'З');
		vocabularyEngUa.put('[', 'х'); vocabularyEngUa.put('{', 'Х');
		vocabularyEngUa.put(']', 'ї'); vocabularyEngUa.put('}', 'Ї');
				
		//the second line of keyboard
		vocabularyEngUa.put('a', 'ф'); vocabularyEngUa.put('A', 'Ф');
		vocabularyEngUa.put('s', 'і'); vocabularyEngUa.put('S','І');
		vocabularyEngUa.put('d', 'в'); vocabularyEngUa.put('D', 'В');
				
		vocabularyEngUa.put('f', 'а'); vocabularyEngUa.put('F', 'А');
		vocabularyEngUa.put('g', 'п'); vocabularyEngUa.put('G', 'П');
		vocabularyEngUa.put('h', 'р'); vocabularyEngUa.put('H', 'Р');
				
		vocabularyEngUa.put('j', 'о'); vocabularyEngUa.put('J', 'О');
		vocabularyEngUa.put('k', 'л'); vocabularyEngUa.put('K', 'Л');
		vocabularyEngUa.put('l', 'д'); vocabularyEngUa.put('L', 'Д');
				
		vocabularyEngUa.put(';','ж'); vocabularyEngUa.put(':', 'Ж');
		vocabularyEngUa.put('\'','є'); vocabularyEngUa.put('"', 'Є');
				
		//the third line of keyboard
		vocabularyEngUa.put('z','я'); vocabularyEngUa.put('Z', 'Я');
		vocabularyEngUa.put('x','ч'); vocabularyEngUa.put('X', 'Ч');
		vocabularyEngUa.put('c','с'); vocabularyEngUa.put('C', 'С');
				
		vocabularyEngUa.put('v','м'); vocabularyEngUa.put('V', 'М');
		vocabularyEngUa.put('b','и'); vocabularyEngUa.put('B', 'И');
		vocabularyEngUa.put('n','т'); vocabularyEngUa.put('N', 'T');
				
		vocabularyEngUa.put('m','ь');
		vocabularyEngUa.put(',','б'); vocabularyEngUa.put('<', 'Б');
		vocabularyEngUa.put('.','ю'); vocabularyEngUa.put('>', 'Ю');
				
		vocabularyEngUa.put('/','.'); vocabularyEngUa.put('?', '.');
		vocabularyEngUa.put('\\','ґ'); vocabularyEngUa.put('|', 'Ґ');


	}
	
	public void changingEnglishToUkrainian(StringBuilder userWrongString) {
		StringBuilder userRightUkString = new StringBuilder();

			for (int i = 0; i < userWrongString.length(); i++) {
				char key = userWrongString.charAt(i);

				if (vocabularyEngUa.containsKey(key)) {
					userRightUkString.append(vocabularyEngUa.get(key));
				}
				else {
					//adding characters that are not included in the list (example: space)
					userRightUkString.append(key);
				}
			}
		System.out.println(userRightUkString);
	}
	
	public void changingUkrainianToEnglish (StringBuilder userWrongString){
		StringBuilder userRightEnString = new StringBuilder();

		for (int i = 0; i < userWrongString.length(); i++) {
			char desiredValue = userWrongString.charAt(i);
			boolean keyFound = false;

			// Iterate through the entries to find the corresponding key
			for (Map.Entry<Character, Character> entry : vocabularyEngUa.entrySet()){
				if(entry.getValue() == desiredValue){
					keyFound = true;
					userRightEnString.append(entry.getKey());
					break;
				}
			}

			//adding characters that are not included in the list (example: space)
			if(!keyFound){
					userRightEnString.append(desiredValue);
				}

		}
		System.out.println(userRightEnString);
	}
	
}



