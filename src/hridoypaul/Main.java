/*
Name:Hridoy Paul (Gupi)
ID :2012020136
Section: C
Email :cse_2012020136@lus.ac.bd
Date:16-07-2-2021
*/

package hridoypaul;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String section;
        System.out.print("Enter your section name: ");
        section = input.nextLine();
        System.out.println("Section: "+section);

        Info info = new Info();
        System.out.println("Name: "+info.name);
        System.out.println("ID: "+info.id);

        Hobby hobby = new Hobby();
        System.out.println("Hobby: "+hobby.hobbyName);
    }
}

