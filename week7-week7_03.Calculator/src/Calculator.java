/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mishabobo
 */
public class Calculator {
    
    private Reader reader; 
    private int stats;
    
    public Calculator(){
        this.reader = new Reader();
        this.stats = 0;
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
        
    private void sum(){
        System.out.print("value1: ");
        int value1 = this.reader.readInteger();
        System.out.print("value2: ");
        int value2 = this.reader.readInteger();
        
        int sum = value1 + value2; 
        System.out.print("sum of the values " + sum);
        this.stats++;
    }
    
    private void difference(){
        System.out.print("value1: ");
        int value1 = this.reader.readInteger();
        System.out.print("value2: ");
        int value2 = this.reader.readInteger();
        
        int dif = value1 - value2; 
        System.out.print("difference of the values " + dif);
        this.stats++;
    }
    
    private void product(){
        System.out.print("value1: ");
        int value1 = this.reader.readInteger();
        System.out.print("value2: ");
        int value2 = this.reader.readInteger();
        
        int prod = value1 * value2; 
        System.out.print("product of the values " + prod);
        this.stats++;
    }
    
    private void statistics(){
        System.out.print("Calculations done: " + this.stats);
    }
}
