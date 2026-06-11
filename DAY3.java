import java.util.*;
class DAY3{ 
    public static void main(String [] args){
        // Scanner sc = new Scanner(System.in);
        // // to take the next word as an input
        // // String name = sc.next();
        // // to take the next line as an input
        // String name = sc.nextLine();
        // //nextInt to take int as a input
        // //nextFloat to take float as a input
        // System.out.println("Enter the value of a");
        // int a = sc.nextInt();
        // System.out.println("Enter the value of a");
        // int b = sc.nextInt();
        // int sum = a+b;
        // System.out.println("The sum is:"+sum);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Adult");
        }else{
            System.out.println("Not Adult");
        }

    }
}