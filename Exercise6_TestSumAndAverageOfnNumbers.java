import java.util.*;

public class Exercise6_TestSumAndAverageOfnNumbers{

public static void main(String[] args) {

 int n;

 Scanner get = new Scanner(System.in);

 System.out.print("Enter the value of n: ");

 n = get.nextInt();

 Exercise6_SumAndAverageOfnNumbers p = new Exercise6_SumAndAverageOfnNumbers(n);
 p.display();



}
}