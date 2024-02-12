import java.util.Scanner;

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

    //converts user string answer to integer
    Integer roundsint = Integer.valueOf(roundstr); 
    
    //Determines how many rounds have occurred
    Integer roundscounter = 0; 

    //First Chatbot response
    System.out.println("Hi There! What's on your mind?"); //
    
    //this loop breaks after user's indicated number of rounds is completed
    while(roundsint > roundscounter) {
      String answer;
      answer = myObj.nextLine();
      roundscounter++;
      if (answer.contains("I"))
        

      System.out.println("Cool");
    }

    System.out.println("See ya!");
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
