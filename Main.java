package midterm.i3_typing_master_2026;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;
        String username = "tykun";
        String password = "12345678";

        while (running) {
            System.out.println();
            System.out.println("---------- Welcome to I3 Typing Master v2026 ----------");
            System.out.println("To begin, please select one of the following options:");
            System.out.println("   1. Login");
            System.out.println("   2. Register");
            System.out.println("   3. Exit");
            System.out.print("Choose an option: ");

            String choice = input.nextLine();

            switch (choice) {
                case "1":

                    if(username.isEmpty() || password.isEmpty()){
                        System.out.println("Sorry, you are required to register first!");
                        break;
                    }

                    System.out.println("------------------ Authentication ------------------");
                    System.out.print("Username (left blank to cancel): ");
                    String tempUsername = input.nextLine();

                    if (tempUsername.trim().isEmpty()) {
                        System.out.println("\n[Action] Authentication cancelled. Returning to main menu...\n");
                        break;
                    }

                    System.out.print("Password: ");
                    String tempPassword = input.nextLine();
                    
                    if(!tempUsername.equals(username) || !tempPassword.equals(password)){
                        System.out.println("Invalid credentials!");
                        break;
                    }

                    System.out.println("\n[Success] Logged in as: " + username);

                    int option;
                    double minutes = 0.0;
                    int cpm = 0;
                    int wpm = 0;
                    int inputLength = 0;
                    int mistakes = 0;

                    do{
                        System.out.println();
                        System.out.println("---------- Welcome, " + username + "----------");
                        System.out.println("   1. Typing Test");
                        System.out.println("   2. Reset password");
                        System.out.println("   3. List of Result");
                        System.out.println("   4. About Us");
                        System.out.println("   0. Back");
                        System.out.print("Choose an option: ");
                        option = input.nextInt();
                        input.nextLine();

                        switch(option){
                            case 1 : {
                                String target = "ffff jjjj dddd kkkk ssss llll aaaa ;;;; fdsa jkl; fdsa jkl; asdf jkl; asdf jkl; " +
                                                "sad dad had lad ask all fall hall flask shall gash hash flash glass glad " +
                                                "flag sag hash lash. Ask a glad lad all a salad.";

                                System.out.println("---------- Typing Test Level 1 ----------");
                                System.out.println("Type the following paragraph(s) to test your typing speed and quality " +
                                                "(press ENTER to end the test and display the result):\n");
                                System.out.println(target);     
                                System.out.println("\n------------------------------------------------------------");


                                long startTime = System.currentTimeMillis();
                                String userInput = input.nextLine();
                                long endTime = System.currentTimeMillis();

                                double totalSeconds = (endTime - startTime) / 1000.0;
                                minutes = totalSeconds / 60.0;
                                
                                inputLength = userInput.length();

                                int minLen = Math.min(target.length(), inputLength);
                                for (int i = 0; i < minLen; i++) {
                                    if (target.charAt(i) != userInput.charAt(i)) {
                                        mistakes++;
                                    }
                                }

                                mistakes += Math.abs(target.length() - inputLength);

                                
                                cpm = (int) (inputLength / minutes);
                                wpm = (int) ((inputLength / 5.0) / minutes);

                                System.out.println("\n---------- Typing Test Level 1 Result ----------");
                                System.out.println("Speed (characters/min): " + (minutes > 0 ? cpm : 0));
                                System.out.println("      (words/min):      " + (minutes > 0 ? wpm : 0));
                                System.out.println("Total input characters: " + inputLength);
                       
                                break;
                            }
                            case 2 : {
                                System.out.println("---------- Reset Password ----------");

                                System.out.println("Old Password: ");
                                String oldPassword = input.nextLine();

                                if(!oldPassword.equals(password)){
                                    System.out.println("Invalid Password!");
                                    break;
                                }

                                System.out.println("New Password: ");
                                String newPassword = input.nextLine();

                                System.out.println("Confirm Password: ");
                                String comfirmNewPassword = input.nextLine();

                                if(!newPassword.equals(comfirmNewPassword)){
                                    System.out.println("Passwords do not match!");
                                    break;
                                }

                                password = comfirmNewPassword;
                                System.out.println("Password reset!");
                                break;
                            }
                            case 3 : {
                                System.out.println("---------- List of Results ----------");
                                System.out.println("Speed (characters/min): " + (minutes > 0 ? cpm : 0));
                                System.out.println("      (words/min):      " + (minutes > 0 ? wpm : 0));
                                System.out.println("Total input characters: " + inputLength);
                                System.out.println("Total mistakes:         " + mistakes);
                                break;
                            }
                            case 4 : {
                                System.out.println("---------- About Us ----------");
                                System.out.println("Repo owner: VUON SETHAR TYKUN");
                                System.out.println("ID: e20230389");
                                System.out.println("Username: " + username);
                                System.out.println("Password: " + password);
                                break;
                            }
                            case 0 : {
                                break;
                            }
                            default : {
                                System.out.println("\n[Error] Invalid choice. Please enter 1, 2, 3, 4 or 0.\n");
                            }
                        }
                    }while(option != 0);


                    break;
                case "2":
                    System.out.println("---------- New User Registration ----------");
        
                    System.out.print("Input a unique username (left blank to cancel): ");
                    String registeredUsername = input.nextLine();

                    if (registeredUsername.trim().isEmpty()) {
                        System.out.println("\n[Action] Registration cancelled.\n");
                        return;
                    }

                    System.out.print("Input password: ");
                    String registeredPassword = input.nextLine();

                    System.out.print("Input confirm password: ");
                    String confirmRegisteredPassword = input.nextLine();

                    if (registeredPassword.equals(confirmRegisteredPassword) && !registeredPassword.isEmpty()) {
                        username = registeredUsername;
                        password = confirmRegisteredPassword;
                        System.out.println("\n[Success] Account created for " + username + "!");
                    } else if (registeredPassword.isEmpty()) {
                        System.out.println("\n[Error] Password cannot be empty.");
                    } else {
                        System.out.println("\n[Error] Passwords do not match. Please try again.");
                    }
                    break;
                case "3":
                    System.out.println("\nExiting programs...");
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
