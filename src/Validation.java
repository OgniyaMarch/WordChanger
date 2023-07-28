public class Validation {

    public static boolean ValidationLanguageTag(String userAnswer){
        //checking for an empty string
        if (userAnswer.length() == 0){
            System.out.println("You don't write anything. Try enter uk or en");
            return false;
        }

        else {
            //checking for mistakes in string
            switch (userAnswer){
                case "en", "uk":
                    return true;
                default:
                    System.out.println("You write wrong language. Try enter uk or en");
                    return false;
            }
        }

    }

}

