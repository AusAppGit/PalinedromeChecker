import java.util.Scanner;

public class PalindromeChecker
  {
        public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          // initialise array, end condition and populate with each line of string
          String [] words = new String[3];
          boolean end = false;
          for(String word: words){
              word = sc.nextLine();
              if(wordCheck(word){
                System.out.println("Open");
                end = true;
                break;
                }
              }

          // Check end condition and output that there's no palindrome
          if(end == false){
              System.out.println("Trash");
              }
          sc.close();
      }

    // Checks the word by comparing the corresponding letter from the beginning of the word to the end
    public static boolean wordCheck(String w){
      boolean palindrome = false;
      // takes the string from the array and converts to chars for comparison
      char [] wordChar1 = w.toCharArray();
      char [] wordChar2 = w.toCharArray();
      for(int i = 0; i < wordChar1.length; i++){
        // generate the counter for the end character
        int endNum = wordChar1.length - 1 - i;
        if(wordChar1[i] == wordChar2[endNum]){
          continue;
        }
        else{
          return palindrome;
        }
      }
      return palindrome = true;
      }
    }
