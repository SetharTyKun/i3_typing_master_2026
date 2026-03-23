package midterm.i3_typing_master_2026.Collaborator;
import java.util.Scanner;

public class TypingTestApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String target = "ffff jjjj dddd kkkk ssss llll aaaa ;;;; fdsa jkl; fdsa jkl; asdf jkl; asdf jkl; " +
                        "sad dad had lad ask all fall hall flask shall gash hash flash glass glad " +
                        "flag sag hash lash. Ask a glad lad all a salad.";

        System.out.println("---------- Typing Test Level 1 ----------");
        System.out.println("Type the following paragraph(s) to test your typing speed and quality " +
                           "(press ENTER to end the test and display the result):\n");
        System.out.println(target);
        System.out.println("\n------------------------------------------------------------");


        long startTime = System.currentTimeMillis();
        String userInput = sc.nextLine();
        long endTime = System.currentTimeMillis();

        double totalSeconds = (endTime - startTime) / 1000.0;
        double minutes = totalSeconds / 60.0;
        
        int inputLength = userInput.length();
        int mistakes = 0;
        
        int minLen = Math.min(target.length(), inputLength);
        for (int i = 0; i < minLen; i++) {
            if (target.charAt(i) != userInput.charAt(i)) {
                mistakes++;
            }
        }

        mistakes += Math.abs(target.length() - inputLength);

        
        int cpm = (int) (inputLength / minutes);
        int wpm = (int) ((inputLength / 5.0) / minutes);

        System.out.println("\n---------- Typing Test Level 1 Result ----------");
        System.out.println("Speed (characters/min): " + (minutes > 0 ? cpm : 0));
        System.out.println("      (words/min):      " + (minutes > 0 ? wpm : 0));
        System.out.println("Total input characters: " + inputLength);
        System.out.println("Total mistakes:         " + mistakes);
        System.out.println("------------------------------------------------");
        sc.close();
    }
}
