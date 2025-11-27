public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
                "Our product will transform the market",
                "Programming is both painful and engaging",
                "This has nothing to do with machine learning",
                "We need to leverage our core competencies",
                "Let's talk about data and algorithms",
                "Chatbots are great but must be used carefully",
                "This blockchain-based solution will disrupt the industry",
                "The team showed great Synergy in the last project",
                "Use simple words without hype and fluff",
                "Our new technology presents a significant paradigm shift",
                "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business
        // presentations
        String[] keywords = { "synergy", "disrupt", "leverage", "Paradigm", "transform" };
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0; i < sentences.length; i++) {// run on array of strings
            String sentenceLower = sentences[i].toLowerCase();// casting the sentence to lower
            boolean found = false; 

            for (int j = 0; j < keywords.length; j++) { // run on the array of all keywords
                String keyLower = keywords[j].toLowerCase();// casting the word to lower

                if (sentenceLower.indexOf(keyLower) != -1) {
                    found = true;
                    break; // we found a keyword and can print the sentence
                }
            }//end loop 2

            if (found) { // prints a sentace that have a keyword
                System.out.println(sentences[i]);
            } 

        }//end loop 1 after check every sentence
    }
}
