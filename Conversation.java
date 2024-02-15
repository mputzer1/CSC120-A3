import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

//The conversation class where the chatbot is stored
class Conversation {

  public static void main(String[] arguments) {
    
    //creates scanner for user input
    Scanner myObj = new Scanner(System.in);
    
    //determines that user input is a string
    String roundstr; 

    //Ask user how many rounds
    System.out.println("How many rounds?"); 
    
    //User inputs number of rounds
    roundstr = myObj.nextLine(); 
    System.out.println("\n");

    //converts user string answer to integer
    Integer roundsint = Integer.valueOf(roundstr); 
    
    //Determines how many rounds have occurred
    Integer roundscounter = 0; 

    //Creates arraylist to store transcript of converstaion
    ArrayList<String> transcript = new ArrayList<String>();
    transcript.add("TRANSCRIPT:");

    //First Chatbot response
    System.out.println("Hi There! What's on your mind?"); //
    transcript.add("Hi There! What's on your mind?");

    //this loop breaks after user's indicated number of rounds is completed
    while(roundsint > roundscounter) {
      
      //Gets user answer
      String answerstring;
      answerstring = myObj.nextLine();
      
      //Adds user answer to the transcript ArrayList
      transcript.add(answerstring);
      
      //Splits the user's answer and stores it in an array
      String[] answerarray = answerstring.split("\\s+");
      
      //Adds to the round counter each time the user inputs a response
      roundscounter++;
      
      //If the user's response contains no key words, then a random response string is chosen
      if (!Arrays.asList(answerarray).contains("I") 
      && !Arrays.asList(answerarray).contains("me") 
      && !Arrays.asList(answerarray).contains("am") 
      && !Arrays.asList(answerarray).contains("you") 
      && !Arrays.asList(answerarray).contains("my") 
      && !Arrays.asList(answerarray).contains("your") ) {
        
        //Creates a canned list of responses
        String[] responseStrings = new String[] {
          "Ok.", 
          "I understand.", 
          "That makes sense.", 
          "Sounds hard.",
          "I recommend journaling."}; 
          
          //Chooses a random response to print
          Random random = new Random();
          String RandomElement;
          RandomElement = responseStrings[random.nextInt(responseStrings.length)];
          System.out.println(RandomElement);
          
          //Adds the random response to the transcript
          transcript.add(RandomElement);
          continue;
        }
      //
      
      //If the array with the user's answer contains these key words, then certain replacement words are used
      if (Arrays.asList(answerarray).contains("I"));
        answerstring = answerstring.replaceAll("\\bI\\b","tempyou");
      if (Arrays.asList(answerarray).contains("me")) ;
        answerstring = answerstring.replaceAll("\\bme\\b", "tempyou");
      if (Arrays.asList(answerarray).contains("am"));
        answerstring = answerstring.replaceAll("\\bam\\b", "are");
      if (Arrays.asList(answerarray).contains("you"));
        answerstring = answerstring.replaceAll("\\byou\\b","I");
      if (Arrays.asList(answerarray).contains("my"));
        answerstring = answerstring.replaceAll("\\bmy\\b", "tempyour");
      if (Arrays.asList(answerarray).contains("your"));
        answerstring = answerstring.replaceAll("\\byour\\b", "my");
      if (Arrays.asList(answerarray).contains("tempyou"));
        answerstring = answerstring.replaceAll("tempyou", "you");
      if (Arrays.asList(answerarray).contains("tempyour"));
        answerstring = answerstring.replaceAll("tempyour", "your");
      
      //The chatbot's response is printed with a question mark and new line added.
      System.out.print(answerstring+"?"+"\n");
      
      //The chatbot's answer is saved to the transcript
      transcript.add(answerstring+"?");
        
    }

    //Final chatbot goodbye
    System.out.println("See ya!"+"\n");
    
    //Chatbot goodbye added to transcript
    transcript.add("See ya!");

    //Prints a transcript of the conversation via the transcript ArrayList
    for (int i=0; i < transcript.size(); i++) {
      System.out.println(transcript.get(i));
    }
    //Closes the scanner
    myObj.close();
  }
}
