package homework_1_8;
import java.util.Scanner;
public class exe_4 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b[] = new int[a];
            int s = 4;

            for (int i = 0; i<a; i++){
                b[i] = s;
                s += 3;
                System.out.print(b[i] + " ");
            }

        }

}
