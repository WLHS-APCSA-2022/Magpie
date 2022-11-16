import java.util.ArrayList;

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */

//test
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 *  a greeting
	 */

	public static final String[] KEYWORDS = new String[] {
        "dog",
        "cat",
        "mr. smith",
        "fun",
        "cartoons",
            "!",
            "?"

    };


	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 *            the user statement
	 * a response based on the rules given
	 */

    public void getResponse(String line) {
        ArrayList<String> foundKeywords = findKeyword(line);
            if(foundKeywords.contains(KEYWORDS[0])||foundKeywords.contains(KEYWORDS[1])){
                System.out.println("Tell me more about your pets.");
        }
            else if(foundKeywords.contains(KEYWORDS[2])){
                System.out.println("He teaches a good class.");
            }
            else if(foundKeywords.contains(KEYWORDS[3])){
                System.out.println("I’m having fun to.");
            }
            else if(foundKeywords.contains(KEYWORDS[4])){
                System.out.println("I like watching cartoons.");
            }
            else if(foundKeywords.contains(KEYWORDS[5])){
                System.out.println("Why are you yelling?");
            }
            else if(foundKeywords.contains(KEYWORDS[6])){
                System.out.println("That's a good question.");
            }
    }

    public ArrayList<String> findKeyword(String line) {
        ArrayList<String> output = new ArrayList<>();
        for(String x : line.split(" ")) {
            for(String y : KEYWORDS) {
                if(x.toLowerCase().equals(y)) {
                    output.add(y);
                }
            }
        }

        return output;
    }

}
