package midterm.i3_typing_master_2026;

import java.util.Scanner;

public class Landing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("---------- Welcome to I3 Typing Master v2026 ----------");
            System.out.println("To begin, please select one of the following options:");
            System.out.println("   1. Login");
            System.out.println("   2. Register");
            System.out.println("   3. Exit");
            System.out.print("Choose an option: ");

            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("\n[Action] Redirecting to Login page...\n");
                    break;
                case "2":
                    System.out.println("\n[Action] Opening Registration form...\n");
                    break;
                case "3":
                    System.out.println("\nExiting I3 Typing Master. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("\n[Error] Invalid choice. Please enter 1, 2, or 3.\n");
                    break;
            }
        }
        
        input.close();
    }
}
