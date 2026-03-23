package midterm.i3_typing_master_2026.Collaborator;

import java.util.Scanner;

public class Login {
    public static void display() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------ Authentication ------------------");
        
        System.out.print("Username (left blank to cancel): ");
        String username = scanner.nextLine();

        if (username.trim().isEmpty()) {
            System.out.println("\n[Action] Authentication cancelled. Returning to main menu...\n");
            return;
        }

        System.out.print("Password: ");
        String password = scanner.nextLine();

        
        System.out.println("\n[Success] Logged in as: " + username + "\n");
        scanner.close();
    }
}
