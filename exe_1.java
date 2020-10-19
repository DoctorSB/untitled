package homework_1_8;

import java.util.Scanner;
public class exe_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b[] = new int[a];
        int c = 0;

        for(int i = 0; i<a; i++){
            b[i] = in.nextInt();
        }
        int v = in.nextInt();
        for(int i = 0; i<a; i++){
            if (b[i] == v){
                c = i + 1;
                break;
            }
        }
        if (c == 0){
            System.out.println("NO");
        } else{
            System.out.println(c);
        }
    }
}