import java.util.Scanner;

public class reptitions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int ans = 1, counter = 1;
        for(int i=1; i<word.length(); i++){
            if(word.charAt(i) == word.charAt(i-1)){
                counter++;
                continue;
            }
            ans = Math.max(counter, ans);
            counter = 1;
        }
        ans = Math.max(counter, ans);
        System.out.println(ans);
        in.close();
    }
}
