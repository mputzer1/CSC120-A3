import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

/**
 * The conversation class where the chatbot is stored
 */
class Conversation {

  /**
   * The main that undergoes each of the chatbot's actions step by step
   * @param args
   */
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String roundsStr; 
    System.out.println("How many rounds?"); 
    roundsStr = myObj.nextLine(); 
    System.out.println("\n");
    Integer nRounds = Integer.valueOf(roundsStr); 
    Integer roundsCounter = 0; 
    ArrayList<String> transcript = new ArrayList<String>();
    transcript.add("TRANSCRIPT:");
    System.out.println("Hi There! What's on your mind?"); //
    transcript.add("Hi There! What's on your mind?");
    while(nRounds > roundsCounter) {
      String answerStr;
      answerStr = myObj.nextLine();
      transcript.add(answerStr);
      String[] answerArray = answerStr.split("\\s+");
      roundsCounter++;
      if (!Arrays.asList(answerArray).contains("I") 
      && !Arrays.asList(answerArray).contains("me") 
      && !Arrays.asList(answerArray).contains("am") 
      && !Arrays.asList(answerArray).contains("you") 
      && !Arrays.asList(answerArray).contains("my") 
      && !Arrays.asList(answerArray).contains("your") ) {
        String[] responseStr = {
          "Ok.", 
          "I understand.", 
          "That makes sense.", 
          "Sounds hard.",
          "I recommend journaling."}; 
          Random random = new Random();
          String randomElement;
          randomElement = responseStr[random.nextInt(responseStr.length)];
          System.out.println(randomElement);
          transcript.add(randomElement);
          continue;
        }
      if (Arrays.asList(answerArray).contains("I"));
        answerStr = answerStr.replaceAll("\\bI\\b","tempyou");
      if (Arrays.asList(answerArray).contains("me")) ;
        answerStr = answerStr.replaceAll("\\bme\\b", "tempyou");
      if (Arrays.asList(answerArray).contains("am"));
        answerStr = answerStr.replaceAll("\\bam\\b", "are");
      if (Arrays.asList(answerArray).contains("you"));
        answerStr = answerStr.replaceAll("\\byou\\b","I");
      if (Arrays.asList(answerArray).contains("my"));
        answerStr = answerStr.replaceAll("\\bmy\\b", "tempyour");
      if (Arrays.asList(answerArray).contains("your"));
        answerStr = answerStr.replaceAll("\\byour\\b", "my");
      if (Arrays.asList(answerArray).contains("tempyou"));
        answerStr = answerStr.replaceAll("tempyou", "you");
      if (Arrays.asList(answerArray).contains("tempyour"));
        answerStr = answerStr.replaceAll("tempyour", "your");
      System.out.print(answerStr+"?"+"\n");
      transcript.add(answerStr+"?");
    }
    System.out.println("See ya!"+"\n");
    transcript.add("See ya!");
    for (int i=0; i < transcript.size(); i++) {
      System.out.println(transcript.get(i));
    }
    myObj.close();
  }
}
