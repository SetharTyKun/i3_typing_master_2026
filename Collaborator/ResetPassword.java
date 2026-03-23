package midterm.i3_typing_master_2026.Collaborator;

import java.util.Scanner;

public class ResetPassword {
    public static void main(String[] agrs) {
        String password = "";
        Scanner input = new Scanner(System.in);

        System.out.println("---------- Reset Password ----------");

        System.out.println("Old Password: ");
        String oldPassword = input.nextLine();

        if(!oldPassword.equals(password)){
            System.out.println("Invalid Password!");
            return;
        }

        System.out.println("New Password: ");
        String newPassword = input.nextLine();

        System.out.println("Confirm Password: ");
        String comfirmNewPassword = input.nextLine();

        if(!newPassword.equals(comfirmNewPassword)){
            System.out.println("Passwords do not match!");
            return;
        }

        password = comfirmNewPassword;
        System.out.println("Password reset!");
        return;
    }
}