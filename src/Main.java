import java.io.*;
import java.util.Scanner;

/*
 * The goal is to create an application
 * that allows you to change words
 * that were accidentally written in another language.
 * For instance: ghbdsn -> привіт or руддщ -> hello
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

			//changing string: lowerCase and delete space
			languageToBeTranslatedInto = StringModifier.stringModifier(languageToBeTranslatedInto);

			userRightAnswer = Validation.validateLanguageTag(languageToBeTranslatedInto);
		}while(!userRightAnswer);

		VocabularyEnglishUkrainian vocabularyEnUk = new VocabularyEnglishUkrainian();
		switch(languageToBeTranslatedInto){
			case "en":
				System.out.println(vocabularyEnUk.changingUkrainianToEnglish(userString));
				break;
			case "uk":
				System.out.println(vocabularyEnUk.changingEnglishToUkrainian(userString));
				break;
			default:
				System.out.println("Error");
		}

		scanner.close();
	}
}


