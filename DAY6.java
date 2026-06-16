import java.util.*;
class DAY6{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // int n = 5;
        // upper half
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=i;j++){
//                 System.out.print("*");
//             }
//             // spaces
//             int spaces = 2*(n-i);
//             for(int j = 1; j<=spaces; j++){
//                 System.out.print(" ");
//             }
//             //second part
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         // lower half
//         for(int i = n; i>=0; i--){
//             for(int j = 1; j<=i;j++){
//                 System.out.print("*");
//             }
//             // spaces
//             int spaces = 2*(n-i);
//             for(int j = 1; j<=spaces; j++){
//                 System.out.print(" ");
//             }
//             //second part
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *
        // spaces
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=n-i; j++){
//                 System.out.print(" ");
//             // stars
//             }for(int j = 1; j<=n; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     *****
//    *****
//   *****
//  *****
// *****
//     for(int i = 0;i<=n; i++){
//         // spaces
//         for(int j = 1; j<=n-i; j++){
//             System.out.print(" ");
//         }
//         // numbers
//         for(int j = 1; j<=i; j++){
//             System.out.print(i+" ");
//         }
//         System.out.println();
//     }
//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5 
//     for(int i = 1; i<=n; i++){
//         // spaces
//         for(int j = 1; j<=n-i; j++){
//             System.out.print(" ");
//         }
//         // first half
//         for(int j = i; j>=1; j--){
//             System.out.print(j);
//         }
//         // second half
//         for(int j = 2; j<=i; j++){
//             System.out.print(j);
//         }
//         System.out.println();
//     }
//     1
//    212
//   32123
//  4321234
// 543212345
// int n = 4;
// for(int i = 1; i<=n; i++){
//     // first half
//     for(int j = 1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     for(int j = 1; j<=2*i-1; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// for(int i = n; i>=1; i--){
//     // second half
//     for(int j = 1; j<=n-i; j++){
//         System.out.print(" ");
//     }for(int j = 1; j<=2*i-1; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *
    }
}