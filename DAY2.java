import java.util.*;
class DAY2{
    public static void main(String [] args){
        System.out.println("Enter your age here");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Adult");
        }else{
            System.out.println("not an Adult");
        }
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a+b;
        // System.out.println(sum);
    }
}