import java.util.*;
class DAY7{
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static int calculateSum(int a, int b){
        int sum = a+b;
        // System.out.print(a+b);
        return sum;
    }
    public static int calculateProd(int a, int b){
        return a*b;
    }
    public static void printFactorial(int n){
        if(n<0){
            System.out.println("Invalid Number");
            return; 
        }
        int factorial = 1;
        for(int i = n; i>=1; i--){
            factorial=factorial*i;
        }
        
        System.out.println(factorial);
        return;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        int n = sc.nextInt();
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // printMyName(name);//call to function 
        // System.out.print(calculateSum(a,b));
        // System.out.print("Product of 2 numbers is: "+calculateProd(a,b));
        printFactorial(n);

    }
}