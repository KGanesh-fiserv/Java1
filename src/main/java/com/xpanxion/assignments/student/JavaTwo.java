package com.xpanxion.assignments.student;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class JavaTwo {
    Scanner input = new Scanner(System.in);

    public JavaTwo(){}

    public void ex1(){
        ArrayList<Person> temp = new ArrayList<Person>();
        String ans = "";
        while(!ans.equals("done")){
            System.out.print("Enter Person: ");
            String [] x = input.nextLine().split("[, ]+");
            if(x[0].equals("done")){
                ans = "done";
                continue;
            }
            temp.add(new Person(Integer.parseInt(x[0]), x[1], x[2]));
    }
        for(Person x : temp){
            System.out.println(x);
        }
    }

    public void ex2(){
        HashMap<Integer, Person> mapping =new HashMap<Integer, Person>();
        mapping.put(1, new Person(1, "Peter", "Jones"));
        mapping.put(2, new Person(2, "John", "Smith"));
        mapping.put(3, new Person(3, "Mary", "Jane"));
        System.out.print("Enter ID: ");
        int x = input.nextInt();
        if(mapping.containsKey(x))
            System.out.println(mapping.get(x).toString());
        else
        System.out.println("You've entered an incorrect key");
    }

    public void ex3(){
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex4(){
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }
    public void ex5(){
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }
    public void ex6(){
        boolean cont = true;
        ArrayList <Calculator> calcHistory = new ArrayList<Calculator>();
        int counter = 0;
        int first;
        int second;
        String third;
        do{
            System.out.print("Enter first number: ");
            String f = input.next();
            if(f.equalsIgnoreCase("done")){
                cont = false;
                continue;
            }
            else{
                first = Integer.parseInt(f); 
            }
    
            System.out.print("Enter second number: ");
            second = input.nextInt();
            System.out.print("Enter operation (add, sub, mul, div): ");
            third = input.next();
            calcHistory.add(counter, new Calculator(first, second, third));
            if(!third.equals("add") && !third.equals("sub") && !third.equals("mul")&& !third.equals("div")){
                System.out.println(calcHistory.get(counter).toString());
            }
            else{
                System.out.println("Result: "+ calcHistory.get(counter).getResult());
            }
            counter++;
        }while(cont);

        for(Calculator x : calcHistory){
            System.out.println(x.toString());
        }
    }

    public void ex7(){
        var newPersonList = Arrays.asList(
            new Person(1, "Peter", "Jones"),
            new Person(2, "John", "Smith"),
            new Person(3, "Sue", "Anderson"));
        var personList = newPersonList.stream().map(n -> new Person(n.getID(), n.getFirstName(), "xxx")).collect(Collectors.toList());
        for (Person p : personList) {
            System.out.println(p);
        }    
    }

    public void ex8(){
        var personList = Arrays.asList(
        new Person(1, "Charlie", "Jones"),
        new Person(2, "Zoey", "Smith"),
        new Person(3, "Adam", "Anderson"));
        personList.sort((Comparator.comparing(Person :: getFirstName)));
        for (Person p : personList) {
            System.out.println(p);
        }
    }

    public void ex9(){
        var personList = Arrays.asList(
        new Person(1, "Charlie", "Jones"),
        new Person(2, "Zoey", "Smith"),
        new Person(3, "Adam", "Anderson"));
        
        ArrayList <Person> filteredList = new ArrayList<Person>();
        for(int i = 0; i<personList.size();i++){
            if(personList.get(i).getLastName().equals("Smith"))
                filteredList.add( personList.get(i));
        }
        for (Person p : filteredList) {
            System.out.println(p);
        }

    }

    public void ex10(){
        LinkedList <Cat> catList = new LinkedList<Cat>();
        catList.add(new Cat("Alice"));
        catList.add(new Cat("Bob"));
        catList.add(new Cat("Charlie"));
        catList.add(new Cat("Dan"));
        while(!catList.isEmpty()){
            for(Cat a : catList){
                System.out.print(a + ", ");
            }
            catList.pop();
            try {
                TimeUnit.SECONDS.sleep(3);
                System.out.println();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }

}
