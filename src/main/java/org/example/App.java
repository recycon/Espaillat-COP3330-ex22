package org.example;

import java.util.Scanner;

/**
 * Enter the first number: 1
 * Enter the second number: 51
 * Enter the third number: 2
 * The largest number is 51.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int x1,x2,x3;
        Scanner in=new Scanner(System.in);

        System.out.print( "Enter the first number: " );
        x1= in.nextInt();
        System.out.print( "Enter the second number:" );
        x2= in.nextInt();
        System.out.print( "Enter the third number: " );
        x3= in.nextInt();
        int y=0;
        if(x3==x1 || x2==x3 || x1==x2) {
        System.exit(0);
    }
        if(x1>x2 && x1>x3){
            y=x1;
        }
        else if(x2>x1 && x2>x3){
            y=x2;
        }
        else if(x3>x1 && x3>x2){
            y=x3;
        }


        System.out.println( "The largest number is "+y+"." );
    }
}
