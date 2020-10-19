package homework_1_8;
import java.util.Scanner;
public class exe_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b[] = new int[a];
        int c = 0;
        int k = 0;

        for(int i = 0; i<a; i++){
            b[i] = in.nextInt();
        }
        for(int i = 0; i<a; i++){
            if (b[i] % 2 == 0){
                c += b[i];
                k++;
            }
        }
        if (k == 0){
            System.out.println("NO");
        } else{
            System.out.println(c);
        }
    }
}