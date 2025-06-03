import java.util.*;
class DAY2{
    public static void main(String [] args){
        System.out.println("Enter numbers between 1 2 3");
        // System.out.println("Enter two numbers to campare");
        // System.out.print("Enter a number to check odd or even");
        // System.out.println("Enter your age here");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1: System.out.println("hello");
            break;
            case 2: System.out.println("namaste");
            break;
            case 3: System.out.println("bonjour");
            break;
            default: System.out.println("Bhai kya bol raha hai");
        }
        // if(button == 1){
        //     System.out.println("Hello");
        // }else if(button == 2){
        //     System.out.println("Namaste");
        // }else if (button == 3){
        //     System.out.println("Bonjour");
        // }else{
        //     System.out.println("Bhai kya bol raha hai");
        // }
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int num = sc.nextInt();
        // if(a==b){
        //     System.out.println("equal");
        // }else if(a>b){
        //     System.out.println("a is greater");
        // }else{
        //     System.out.println("a is lesser");
        // }
        // if(num%2==0){
            // System.out.println("Adult");
            // System.out.println("even");
        // }else{
            // System.out.println("not Adult");
            // System.out.println("odd");
        // }
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a+b;
        // System.out.println(sum);
        
    }
}