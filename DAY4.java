import java.util.*;
class DAY4{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // code to find the Adult 
        // System.out.print("Enter your age: ");
        // int age = sc.nextInt();
        // if(age>=18){
        //     System.out.println("Adult");
        // }else{
        //     System.out.println("Not Adult");
        // }
        // code to find out the number is even or odd
        // System.out.print("Enter the number to check odd or even: ");
        // int num = sc.nextInt();
        // if(num%2==0){
        //     System.out.println("Even number");
        // }else{
        //     System.out.println("Odd number");
        // }
        // code to find the number is greater or equal
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        if(a==b){
            System.out.println("equal");
        }else{
            if(a>b){
            System.out.println("a is greater");
        }else{
            System.out.println("a is lesser");
        }
        }
    }
}