import java.util.Scanner;

public class Print_1_To_A {
    public static String rec(int A, int sum) {
        if (sum > A) {
            System.out.println();
        } else{
            System.out.println(sum + " ");
        rec(A, sum+1);}


        return" is the numbers";

}



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        int A = sc.nextInt();
        System.out.println(Print_1_To_A.rec(A,1));

    }}