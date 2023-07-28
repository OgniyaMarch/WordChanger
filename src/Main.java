import java.io.*;
import java.util.Scanner;

/*
 * Головна мета створення програми 
 * яка надає змогу змінювати слова, які випадково 
 * було написано іншою мовою.
 * Наприклад ghbdsn -> привіт 
 */

public class Main {

	public static void main(String[] args) throws IOException {
		System.setOut(new PrintStream(System.out, true, "UTF-8"));
	
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string: ");
		StringBuilder userString = new StringBuilder(scanner.nextLine());



		//keeping and checking user answer
		String languageToBeTranslatedInto;
		boolean userRightAnswer = false;
		do {
			System.out.println("Enter the language to be translated into (uk/en): ");
			languageToBeTranslatedInto = scanner.nextLine();

			//changing string: delete space and lowerCase
			languageToBeTranslatedInto = languageToBeTranslatedInto.trim();
			languageToBeTranslatedInto = languageToBeTranslatedInto.toLowerCase();
			userRightAnswer = Validation.ValidationLanguageTag(languageToBeTranslatedInto);

		}while(!userRightAnswer);
//!userAnswerExist ||
		VocabularyEnglishUkrainian voc1 = new VocabularyEnglishUkrainian();
		voc1.changingEnglishToUkrainian(userString);

		scanner.close();
	}

}


/*
 * Create function for personality vocabulary every user
 *   // Method to add elements to the HashMap
    public void addToHashMap(String key, int value) {
        myHashMap.put(key, value);
    }
 * */