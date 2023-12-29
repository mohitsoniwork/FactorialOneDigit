import java.io.*;
class FactorialOneDigit {
    public static void main (String args[]) {
        Console con= System.console();
        int factorial =1;
        int number= Integer.parseInt(con.readLine(" Enter the 1 digit number you want Factorial for  "));
        for(int i=number;i>0;i--) {
            
            factorial*=i;
        } System.out.println("Factorial of " + number +" is "+ factorial );

    }
}