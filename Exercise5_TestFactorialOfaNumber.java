import java.util.*;

public class Exercise5_TestFactorialOfaNumber{

public static void main(String [] args){

int n;

Scanner get = new Scanner(System.in);

System.out.print("Enter value of n:");
n = get.nextInt();

Exercise5_FactorialOfaNumber p = new Exercise5_FactorialOfaNumber(n);
p.display();



}


}