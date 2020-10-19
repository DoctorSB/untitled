package homework_1_8;
import java.util.Scanner;
public class exe_7 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b[] = new int[a];

            for (int i=0; i<a; i++){
                b[i] = in.nextInt();
            }
            for(int i=0; i<a; i++){
                if(b[i] < 0){
                    System.out.print(b[i] + " ");
                }
            }

            for(int i=0; i<a; i++){
                if(b[i] > 0){
                    System.out.print(b[i] + " ");
                }
            }
        }
    }

