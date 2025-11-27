public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newS = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // take a letter in index i
            if (ch >= 'A' && ch <= 'Z') { // if letter is big
                newS += (char) (ch + 32); // make lettr smaller +32 and change back to char then add to the new string
            } else {
                newS = newS + ch; // if letter is already small just add her to the new string
            }
        }
        return newS;

    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {

    for (int i = 0; i <= str1.length() - str2.length(); i++) {
        int count = 0; 
        for (int j = 0; j < str2.length(); j++) {
            if (str1.charAt(i + j) == str2.charAt(j)) 
                count++;
            else 
                break;                  
        }

        if (count == str2.length()) {
            return true; 
        }
    }

    return false;
}

    /*public static boolean contains(String str1, String str2) {
        if (str2.length() == 0)
            return true;

        for (int i = 0; i <= str1.length() - str2.length(); i++) { // run on str2
            boolean match = true;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {// run on str1
                    match = false;
                    break;
                }
            }
            if (match)
                return true;
        }
        return false;
    }*/




}
