package homework_1_8;
import java.util.Scanner;
public class exe_5 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b[] = new int[a];
            int s;

            for(int i = 0; i <a; i++){
                b[i] = in.nextInt();
            }
            for (int i = 0, n = a-1; i<n;  i++, n--){
                s = b[n];
                b[n] = b[i];
                b[i] = s;
            }
            for(int i = 0; i<a; i++){
                System.out.print(b[i] + " ");
            }

        }
    }

