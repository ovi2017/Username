//Author: Ovidio Castillo
// @License @GNU
//Date: 09/03/2017
//Purpose: To display "Hello username and password"

import sun.security.util.Password;

import java.util.Scanner;
public class Username {
    public static void main(String [] args) {
        String name;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Your Username");
        name = keyboard.nextLine();
        System.out.println("Enter Your Password");
        String Password;
        Password = keyboard.nextLine();


        System.out.print("Hello, " + name);
        System.out.print(" Welcome to CSC 200 Class! Your Password is " + Password);
    }
}
