package homework_1_8;
import java.util.Scanner;
public class exe_3 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b[] = new int[a];
            double k = 0;
            double su = 0;

            for(int i = 0; i<a; i++){
                b[i] = in.nextInt();
            }
            for(int i = 0; i<a; i++){
                if (b[i] % 2 != 0){
                    su += b[i];
                    k++;
                }
            }
            if(k==0){
                System.out.print("NO");
            } else {
                double rez = su / k;
                System.out.printf("%.2f", rez);
            }
        }
    }

