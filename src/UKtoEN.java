import java.util.HashMap;

public class UKtoEN {
	//create static HashMap because we don't change it
	//Create vocablurary for symbols "eng-ukr"
	//key is english symbols
	
	private static HashMap<String, String> engAndUkrChars;
	
	public UKtoEN(){
		engAndUkrChars = new HashMap<>();
	}
	
	 // Correct: The method call is placed inside a method
	public static void staticEnUkHashMap() {
		//the first line of keyboard
		engAndUkrChars.put("q", "й");
		engAndUkrChars.put("w", "ц");
		engAndUkrChars.put("e", "у");
		
		engAndUkrChars.put("w", "к");
		engAndUkrChars.put("t", "е");
		engAndUkrChars.put("y", "н");
		
		engAndUkrChars.put("u","г");
		engAndUkrChars.put("i","ш");
		engAndUkrChars.put("o","щ");
		
		engAndUkrChars.put("p","з");
		engAndUkrChars.put("[","х");
		engAndUkrChars.put("]","ї");
		
		//the second line of keyboard
		engAndUkrChars.put("a","ф");
		engAndUkrChars.put("s","і");
		engAndUkrChars.put("d","в");
		
		engAndUkrChars.put("f","а");
		engAndUkrChars.put("g","п");
		engAndUkrChars.put("h","р");
		
		engAndUkrChars.put("j","о");
		engAndUkrChars.put("k","л");
		engAndUkrChars.put("l","д");
		
		engAndUkrChars.put(";","ж");
		engAndUkrChars.put("'","є");
		
		//the third line of keyboard
		engAndUkrChars.put("z","я");
		engAndUkrChars.put("x","ч");
		engAndUkrChars.put("c","с");
		
		engAndUkrChars.put("v","м");
		engAndUkrChars.put("b","и");
		engAndUkrChars.put("n","т");
		
		engAndUkrChars.put("m","ь");
		engAndUkrChars.put(",","б");
		engAndUkrChars.put(".","ю");
		
		engAndUkrChars.put("/",".");
		engAndUkrChars.put("\\","ґ");
		
	}
	
}

/*
 * Create function for personality vocablurary every user
 *   // Method to add elements to the HashMap
    public void addToHashMap(String key, int value) {
        myHashMap.put(key, value);
    }
 * */

