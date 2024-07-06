import java.util.Scanner;

public class missingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long sum = n * (n + 1) / 2;
        for(int i=1; i<n; i++){
            sum -= input.nextLong();
        }
        System.out.print(sum);
        input.close();
    }
    
}