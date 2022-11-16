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
        ArrayList<String> keywords = findKeyword(line);
            if(keywords.contains("dog")||keywords.contains("cat")){
                System.out.println("Tell me more about your pets");
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
