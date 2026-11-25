import java.util.Scanner;

public class q106 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());//1行目　n種類の試験
        String lineA = sc.nextLine();
        String[] tmpA = lineA.split(" ");//A(i)の羅列

        String lineB = sc.nextLine();
        String[] tmpB = lineB.split(" ");//B(i)の羅列

        String result = "";

        for (int i = 0; i < n; i++){//1種類目から最後の種類目まで繰り返す
            int a = Integer.parseInt(tmpA[i]);   
            int b = Integer.parseInt(tmpB[i]);
            int c = a - b;
            result = result + c + " ";
        }  
        System.out.println(result.trim());
}
}
