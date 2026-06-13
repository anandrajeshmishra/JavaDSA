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
        // System.out.println("Enter the value of a: ");
        // int a = sc.nextInt();
        // System.out.println("Enter the value of b: ");
        // int b = sc.nextInt();
        // if(a==b){
        //     System.out.println("equal");
        // }else{
        //     if(a>b){
        //     System.out.println("a is greater");
        // }else{
        //     System.out.println("a is lesser");
        // }
        // }
        // int button = sc.nextInt();
        // switch(button){
        //     case 1: System.out.println("Hello");
        //     break;
        //     case 2: System.out.println("Namaste");
        //     break;
        //     case 3: System.out.println("Bonjoure");
        //     break;
        //     default: System.out.println("INVALID BUTTON");
        // }
        // to print 0-10 using for loop
        // for(int i =0; i<11;i++){
        //     System.out.println(i);
        // }
        // doing the same using while loop
        // int i = 0;
        // while(i<11){
        //     System.out.println(i);
        //     i++;
        // }
        // do {
        //     System.out.println(i);
        //     i++;
        // }while(i<11);
        // the following code shows the difference between the while and do while
        // int i = 11;
        // while(i>11){
        //     System.out.println("Anand Mishra");
        // }
        // do{
        //     System.out.println("Anand Mishra");
        // }while(i>12);
        // print the sum of the first n natural numbers
        System.out.println("Enter the number");
        int n = sc.nextInt();
        // int sum = 0;
        // for(int i = 1; i<=n;i++){
        //     sum+=i;
        // }
        // System.out.println(sum);
        // code to find the table of any number 
        for(int i = 1; i<=10;i++){
            System.out.println(n*i);
        }
    }
}