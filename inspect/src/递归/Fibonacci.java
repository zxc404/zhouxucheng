package 递归;

import java.util.Scanner;

/**
 * @author Zxc
 * @version 1.0
 */
public class Fibonacci {
    public static void main(String[] args) {

        Test t1 = new Test();
        // t1.printFibonacci();

        System.out.print("请输入斐波那契数列的个数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] fi = new int[n];
        int a = t1.fibonacci(n,fi);

        for(int i = 0;i < fi.length;i++){
            System.out.print(fi[i] + " ");
        }

    }
}
class Test{

    public int fibonacci(int n,int[] fi){
        int i = n-1;
        if(n==1 || n==2){
            fi[i] = 1;
            return fi[i];
        }else{
            fi[i] = fibonacci(n-1,fi) + fibonacci(n-2,fi);
            return fi[i];
        }
    }


    // public void printFibonacci(){
    // 	System.out.print("请输入斐波那契数列的个数：");
    // 	Scanner sc = new Scanner(System.in);
    // 	int n = sc.nextInt();
    // 	int[] fi = new int[n];
    // 	int a = fibonacci(n,fi);
    // 	for(int i = 0;i < fi.length;i++){
    // 		System.out.print(fi[i] + " ");
    // 	}
    // }


}
