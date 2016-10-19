package com.digitalmirko;

/* Challenge
Create a new switch statement using char instead of int
create a new char variable
create a new switch statement testing for A, B, C, D, or E
display a message if any of these are found and then break
Add a default which displays a message saying not found
 */

public class Main {

    public static void main(String[] args) {

        char letter = 'G'; //Letters Tested: A,B,C,D,E,G

        switch(letter){
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println("Letter " + letter + " found");
                break;
            default:
                System.out.println("Letter A, B, C, D, or E not found");
                break;
        }
    }
}

/*
Output using letter 'A': Letter A found
Output using letter 'B': Letter B found
Output using letter 'C': Letter C found
Output using letter 'D': Letter D found
Output using letter 'E': Letter E found
Output using letter 'G': Letter A, B, C, D, or E not found
*/