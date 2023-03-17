import java.util.*;

public class Exercise4_TestSumOfnNumbers{

public static void main(String [] args){

int n;

Scanner get = new Scanner(System.in);

System.out.print("Enter value of n: ");
n = get.nextInt();

Exercise4_SumOfnNumbers p = new Exercise4_SumOfnNumbers(n);
p.display();


}



}