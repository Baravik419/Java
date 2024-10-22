package coursework;

import coursework.utils.MenuOperation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String cmd = "";

        while(!cmd.equals("q")){
            System.out.println("""
                    u - work with users
                    p - work with publications
                    q - quit
                    """);
            cmd = scanner.nextLine();

            switch(cmd){
                //TO DO - check whether input is correct
                case "u":
                    MenuOperation.generateUserMenu(scanner);
                    break;
                case "p":
                    break;
                case "q":
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid command");

            }
        }
    }
}