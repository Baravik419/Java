package coursework.utils;

import java.util.Scanner;

public class MenuOperation {

    public static void generateUserMenu(Scanner scanner){

        String consoleInput = "";
        int userCmd = 0;
        while(userCmd != 4) {
            System.out.println("""
                    Choose an option\s
                    1 - create user
                    2 - view user info
                    3 - view all users
                    4 - return to main menu
                    """);
            userCmd = scanner.nextInt();
            scanner.nextLine();

            switch (userCmd) {
                case 1:
                    System.out.println("Which type? C/A");

                    //TO DO - check input

                    consoleInput = scanner.nextLine();

                    if(consoleInput.equals("C")){
                        System.out.println("Enter data: login; password; name; surname;address; birth date YYYY-MM-DD");
                        consoleInput = scanner.nextLine();
                        String[] info = consoleInput.split(";");

                        //making the client

                        Client client = new Client
                    }else{
                        if(consoleInput.equals("A")){

                        }
                    }

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
