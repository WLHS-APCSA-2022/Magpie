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
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		int keyword = 0;
		statement += " ";
		statement = statement.toUpperCase();
		String response = "";

		if (statement.indexOf("no ") >= 0)
		{
			keyword++;
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother ") >= 0
				|| statement.indexOf("father ") >= 0
				|| statement.indexOf("sister ") >= 0
				|| statement.indexOf("brother ") >= 0)
		{
			keyword++;
			response = "Tell me more about your family.";
		}
		else if ((statement.indexOf("dog ") >= 0) || (statement.indexOf("cat ") >= 0)){ //Takes users input and sees if it contains phrases "cat" or "dog" then responds
			keyword++;
			response = "Tell me more about your pets";
		}
		else if (statement.indexOf("hi ") >= 0){ //Takes users input and sees if it contains phrase "hi" and responds 
			keyword++;
			response = "Didn't we greet already";
		}
		else
		{
			response = getRandomResponse();
		}
		if (keyword > 1){ // checks inputs and sees if it hase multiple keywords and asks to dumb down responce
			response = "May you please try to make your sentence a little less complex? im not understanding.";
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4){
			response = "What did you say?";
		}
		else if (whichResponse == 5){
			response = "Cool!";
		}

		return response;
	}
}
