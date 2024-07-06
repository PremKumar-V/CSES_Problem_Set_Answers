import java.util.Scanner;

public class weirdAlgorithm{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        System.out.print(n + " ");
        while(n != 1){
            
            if(n % 2 == 1){
                n *= 3;
                n++;
            }
            else{
                n /= 2;
            }
            System.out.print(n + " ");
            if(n == 0) break;
        }
        input.close();
    }
}