package com.xpanxion.assignments.student;

public class Calculator {
    private int x;
    private int y;
    private int result;
    private String operation;

    public Calculator(int x, int y, String operation) {
        this.x = x;
        this.y = y;
        this.operation = operation;
        result = chooseOperation(operation);
    }



    private int chooseOperation(String operation) {
        if(operation.equalsIgnoreCase("add"))
            return x + y;
        else if(operation.equalsIgnoreCase("sub"))
            return x - y;
        else if(operation.equalsIgnoreCase("mul"))
            return x * y;        
        else if(operation.equalsIgnoreCase("div"))
            return x / y;
        else
            return 0;
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String toString(){
        if(operation.equals("add"))
        return x + " + "+ y + " = " + result;
        else if(operation.equals("sub"))
        return x + " - "+ y + " = " + result; 
        else if(operation.equals("mul"))
        return x + " * "+ y + " = " + result;
        else if(operation.equals("div"))
        return x + " / "+ y + " = " + result;
        else
        return "No valid operation was entered";
    }
    
}
