import java.util.*;
import java.util.Arrays;
class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n");
        int n=scanner.nextInt();
        System.out.println("Enter values");
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();

        }
        Arrays.sort(A);
        Integer[] reversedNumbers = new Integer[n];
        for (int i = 0; i < n; i++) {
            reversedNumbers[i] = A[n - 1 - i];
        }
        int cost=0;
        for(int i=0;i<n;i++)
        {
            cost+=reversedNumbers[i]*(i+1);
        }
        System.out.println(cost);
    }
}