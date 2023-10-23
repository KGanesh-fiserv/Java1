package com.xpanxion.assignments.student;
import java.util.Scanner;
import java.util.Random;
public class JavaOne {
    Scanner input = new Scanner(System.in);

    //
    // Constructors
    //

    public JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
       System.out.print("Enter your name: ");
       String name = input.nextLine();
       System.out.println("Your name in upper case is: " + name.toUpperCase());
    }

    public void ex2() {
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        int count = 0;
        for(int i=0; i<string.length(); i++){
            if(Character.isUpperCase(string.charAt(i))){
                count++;
            }
        }
        System.out.println("Number of uppercase letters: " + count);
    }

    public void ex3() { 
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        String[] split = string.split(" ");
        for(int i=0; i<split.length; i++){
            if(i%2 == 0){
                System.out.print(split[i].toUpperCase() + " ");
            }
            else{
                System.out.print(split[i] + " ");
            }
        }
        System.out.println();

    }

    public void ex4() {
        System.out.print("Enter string: ");
        String string = input.next();
        int pointer = string.length() - 1;
        boolean palindrome = true;
        for(int i=0; i<string.length(); i++){
            if(string.charAt(i) != string.charAt(pointer)){
                palindrome = false;
                continue;
            }
            pointer --;
        }
        if(palindrome)
        System.out.println("YES");
        else
        System.out.println("NO");
    }

    public void ex5() {
        boolean cont = true;
        do{
            System.out.print("Enter a string: ");
            String string = input.nextLine();
            if(string.equalsIgnoreCase("quit")){
                cont = false;
                continue;
            }
            int vowels = 0;
            int consonants = 0;
            for(int i=0; i<string.length(); i++){
                switch(Character.toLowerCase(string.charAt(i))){
                    case 'a':
                        vowels++;continue;
                    case 'b':
                        consonants++;continue;
                    case 'c':
                        consonants++;continue;
                    case 'd':
                        consonants++;continue;
                    case 'e':
                        vowels++;continue;
                    case 'f':
                        consonants++;continue;
                    case 'g':
                        consonants++;continue;
                    case 'h':
                        consonants++;continue;
                    case 'i':
                        vowels++;continue;
                    case 'j':
                        consonants++;continue;
                    case 'k':
                        consonants++;continue;
                    case 'l':
                        consonants++;continue;
                    case 'm':
                        consonants++;continue;
                    case 'n':
                        consonants++;continue;
                    case 'o':
                        vowels++;continue;
                    case 'p':
                        consonants++;continue;
                    case 'q':
                        consonants++;continue;
                    case 'r':
                        consonants++;continue;
                    case 's':
                        consonants++;continue;
                    case 't':
                        consonants++;continue;
                    case 'u':
                        vowels++;continue;
                    case 'v':
                        consonants++;continue;
                    case 'w':
                        consonants++;continue;
                    case 'x':
                        consonants++;continue;
                    case 'y':
                        consonants++;continue;
                    case 'z':
                        consonants++;continue;
                    default:
                        continue;
                }
            }
            System.out.println("Number of vowels: " + vowels+"\nNumber of consonants: "+ consonants);
        }while(cont);
    }

    public void ex6() {
        System.out.print("Enter first number: ");
        int x = input.nextInt();
        System.out.print("Enter second number: ");
        int y = input.nextInt();
        System.out.println("Result: "+ (x+y));
    }

    public void ex7() {
        System.out.print("Enter first number: ");
        int x = input.nextInt();
        System.out.print("Enter second number: ");
        int y = input.nextInt();
        System.out.print("Enter operation (add, sub, mul, div): ");
        String z = input.next();
        if(z.equalsIgnoreCase("add")){
            System.out.println("Result: "+ (x+y));
        }
        else if(z.equalsIgnoreCase("sub")){
            System.out.println("Result: "+ (x-y));
        }
        else if(z.equalsIgnoreCase("mul")){
            System.out.println("Result: "+ (x*y));
        }
        else if(z.equalsIgnoreCase("div")){
            System.out.println("Result: "+ (x/y));
        }
        else{
            System.out.println("You've entered an incorrect command. Goodbye. ");
        }

        
    }

    public void ex8() {
        System.out.print("Enter price per square feet: ");
        double price = input.nextDouble();
        String cont = "no";
        double sumSqfeet = 0;
        input.nextLine();
        while(! cont.equals("done")){
            System.out.print("Enter room dimensions(width x height): ");
            cont = input.nextLine();

            if(cont.equals("done"))
                continue;
            String [] split = cont.split("\\s+");
            sumSqfeet += Double.parseDouble(split[0])*Double.parseDouble(split[2]);
        }
        System.out.println("Total cost: "+ (price*sumSqfeet));

    }

    public void ex9() {
        Random random = new Random();
        int guess = 0;
        int num = random.nextInt((5-1)+1) + 1;
        do{
            System.out.print("Enter a number: ");
            guess = input.nextInt();
            if(guess == num)
                System.out.println("You guessed it!!!");
            else
                System.out.println("Try again...");      

        }while(guess != num);

    }

    public void ex10() {
        System.out.print("Enter a string: ");
        String temp = input.nextLine();
        String [] split = temp.split("\\s+");
        for(String x : split){
            String spaces = "";
            for(int i = 0; i<x.length(); i++){
                System.out.println(spaces + x.charAt(i));
                spaces += " ";
            }

        }
        
    }

    //
    // Private helper methods
    //

}
