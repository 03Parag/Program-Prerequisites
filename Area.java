import java.util.Scanner;
public  class Area{
public static void main(String[]args){
double area,radius;
Scanner sc=new Scanner (System.in);
radius=sc.nextDouble();
area = Math.PI * Math.pow(radius, 2);
System.out.println("Area is: "+ area);
}
}
