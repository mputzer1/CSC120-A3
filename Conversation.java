import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

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
      String answer;
      answer = myObj.nextLine();
      transcript.add(answer);
      roundscounter++;
      
      //String response = answer;
      //Do I create a dict to replace all at once?
      //Also I only want the full word replaced, not word in word

      if (!answer.contains("\\bI\\b") 
      && !answer.contains("\\bme\\b") 
      && !answer.contains("\\bam\\b") 
      && !answer.contains("\\byou\\b")
      && !answer.contains("\\bmy\\b")
      && !answer.contains("\\byour\\b")) {
        
        //Creates a canned list of responses
        String[] responseStrings = new String[] {
          "Ok.", 
          "I understand.", 
          "That makes sense.", 
          "Sounds hard."}; 
          Random random = new Random();
          String RandomElement;
          RandomElement = responseStrings[random.nextInt(responseStrings.length)];
          System.out.println(RandomElement);
          transcript.add(RandomElement);
          continue;
        }

      if (answer.contains("\\bI\\b"));
        answer = answer.replaceAll("\\bI\\b","tempyou");
      if (answer.contains("\\bme\\b"));
        answer = answer.replaceAll("\\bme\\b", "tempyou");
      if (answer.contains("\\bam\\b"));
        answer = answer.replaceAll("\\bam\\b", "are");
      if (answer.contains("\\byou\\b"));
        answer = answer.replaceAll("\\byou\\b","I");
      if (answer.contains("\\bmy\\b"));
        answer = answer.replaceAll("\\bmy\\b", "tempyour");
      if (answer.contains("\\byour\\b"));
        answer = answer.replaceAll("\\byour\\b", "my");
      if (answer.contains("\\btempyou\\b"));
        answer = answer.replaceAll("tempyou", "you");
      if (answer.contains("\\btempyour\\b"));
        answer = answer.replaceAll("tempyour", "your");
      
      System.out.print(answer+"?"+"\n");
      transcript.add(answer+"?");
        
    }

    System.out.println("See ya!"+"\n");
    transcript.add("See ya!");

    //Prints a transcript of the conversation via the transcript ArrayList
    for (int i=0; i < transcript.size(); i++) {
      System.out.println(transcript.get(i));
    }
    myObj.close();
  }
}

//Asks user to choose number of rounds of convo
//print hi there what's on your mind
//User inputs thoughts
//Computer responds
//User inputs thought...until rounds complete.
//Everytime user inputs thought, counter increases.
//Once counter is equal to # of rounds, comp prints goodbye + conversation transcript.


//Sources:
//https://www.w3schools.com/java/showjava.asp?filename=demo_api_scanner
//https://sentry.io/answers/how-do-i-convert-a-string-to-an-int-in-java/#:~:text=The%20two%20easiest%20ways%20to,()%20or%20Integer.valueOf()%20.
//https://www.w3schools.com/java/java_while_loop.asp
//https://stackoverflow.com/questions/12519335/resource-leak-in-is-never-closed
//https://www.w3schools.com/java/java_conditions.asp
//https://stackoverflow.com/questions/30183807/java-string-replace-exact-word
//https://www.w3schools.com/java/java_arraylist.asp
//https://ioflood.com/blog/java-string-array/#:~:text=In%20Java%2C%20you%20can%20create,the%20array%20using%20their%20index.
//https://rollbar.com/blog/handling-the-unreachable-statement-error-in-java/
//https://stackoverflow.com/questions/15730134/opposite-of-contains-does-not-contain
//https://www.javatpoint.com/how-to-pick-random-elements-from-an-array
//https://www.codementor.io/@dev_amitpandey/replace-the-whole-word-with-word-boundaries-in-java-w5l360t5z

