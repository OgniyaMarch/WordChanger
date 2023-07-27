import java.io.*;

/*
 * Головна мета створення програми 
 * яка надає змогу змінювати слова, які випадково 
 * було написано іншою мовою.
 * Наприклад ghbdsn -> привіт 
 */

public class Main {

	public static void main(String[] args) throws IOException {
			System.setOut(new PrintStream(System.out, true, "UTF-8"));
		
			UKtoEN.addToHashMap();
	}

}
