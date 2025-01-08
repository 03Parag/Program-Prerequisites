import java.util.Scanner;
public  class Conversion{
public static void main(String[]args){
double Celsius,Fahrenheit;
Scanner sc=new Scanner (System.in);
Celsius=sc.nextDouble();
Fahrenheit = (Celsius * 9.0/5) + 32;
System.out.println("Fahrenheit is :"+Fahrenheit);
}
} 