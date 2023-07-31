public class Validation {

    public static boolean validateLanguageTag(String userInput){
        //checking for an empty string
        if (userInput.length() == 0){
            System.out.println("You don't write anything. Try enter uk or en");
            return false;
        }

        else {
            //checking for mistakes in string
            switch (userInput){
                case "en", "uk":
                    return true;
                default:
                    System.out.println("You write wrong language. Try enter uk or en");
                    return false;
            }
        }

    }

}

