import java.util.Scanner;
public  class Volume{
public static void main(String[]args){
double volume,radius,height;
Scanner sc=new Scanner (System.in);
radius=sc.nextDouble();
height=sc.nextDouble();
volume= Math.PI * Math.pow(radius, 2) * height;
System.out.println("Volume is: " +volume);
}
} 