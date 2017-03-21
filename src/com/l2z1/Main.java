package com.l2z1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//
        System.out.println("Вычислить корни для квадратного уравнения");
        System.out.println("ax^2+bx+c=0");

        System.out.println("Ввведите a,b,c:");

        Scanner scanner=new Scanner(System.in);
        double a= scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        double D;
        
        D=b*b-4*a*c;
        if (D>0){
            double x1,x2;
            x1=(-b - Math.sqrt(D))/(2*a);
            x2=(-b + Math.sqrt(D))/(2*a);
            System.out.println("Корни уравнения: x1="+x1+",x2="+x2);
            
        }
        else if (D==0){
            double x;
            x=-b/(2*a);
            System.out.println("Уравнение имеет единственный корень: x="+x);
        }
        else {
            System.out.println("Уравнение не имеет действительных корней");   
        }

        
        



    }
}
