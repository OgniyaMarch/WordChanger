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
			
			VocabularyEnglishUkrainian voc1 = new VocabularyEnglishUkrainian();
			voc1.changingEnglishToUkrainian(userString);
		
			
			scanner.close();
	}

}


/*
 * Create function for personality vocablurary every user
 *   // Method to add elements to the HashMap
    public void addToHashMap(String key, int value) {
        myHashMap.put(key, value);
    }
 * */