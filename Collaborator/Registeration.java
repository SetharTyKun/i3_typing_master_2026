package midterm.i3_typing_master_2026.Collaborator;

import java.util.Scanner;

public class Registeration {
    public static void display() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------- New User Registration ----------");
        
        System.out.print("Input a unique username (left blank to cancel): ");
        String username = scanner.nextLine();

        if (username.trim().isEmpty()) {
            System.out.println("\n[Action] Registration cancelled.\n");
            return;
        }

        System.out.print("Input password: ");
        String password = scanner.nextLine();

        System.out.print("Input confirm password: ");
        String confirmPassword = scanner.nextLine();

        if (password.equals(confirmPassword) && !password.isEmpty()) {
            System.out.println("\n[Success] Account created for " + username + "!");
        } else if (password.isEmpty()) {
            System.out.println("\n[Error] Password cannot be empty.");
        } else {
            System.out.println("\n[Error] Passwords do not match. Please try again.");
        }

        scanner.close();
    }

}
