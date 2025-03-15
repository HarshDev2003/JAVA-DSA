// 1. Hello World Print
// public class Demo{
//     public static void main(String [] args){
//         System.out.println("Hello workd");
//     }
// }



// 2. Basic I/O 
// import java.util.Scanner;
// public class Demo{
//     public static void main(String [] args){
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter Your Name :");
//         String name = sc.nextLine();
//         System.out.println("Enter Your Age :");
//         int age = sc.nextInt();
//         System.out.println("Welcome : " + name + " Your age is : " + age);
//     }
// }



// 3. Conditions
// import java.util.Scanner;
// public class Demo{
//     public static void main(String [] args){
//         System.out.println("Enter your age to vote");
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if(age<18){
//             System.out.println("Your age is below 18 You cannot vote");


        
//         } else{
//             System.out.println("You are eligible");
//         }
      
//     }
// }


// 4 Switch
// import java.util.Scanner;
// public class Demo{
//     public static void main (String [] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         switch(num){
//             case 1 : System.out.println("Case 1");
//             break ;
//             case 2 : System.out.println("Case 2");
//             break ;
//             case 3 : System.out.println("Case 3");
//             break ;
//             case 4 : System.out.println("Case 4");
//             break ;
//             case 5 : System.out.println("Case 5");
//             break ;
//             case 6 : System.out.println("Case 6");
//             break ;
//             default : System.out.println("Invalid");
//         }
//     }
// }



// 5 Array
// 5.1 One Dimensional Array
// import java.util.Scanner;
// import java.util.Arrays;
// public class Demo{
//     public static void main (String [] args){
//         Scanner sc = new Scanner(System.in);
//         int arr[] = new int[5];
//         arr[0]= sc.nextInt();
        
//         System.out.println("Array is :" + arr[0]);
//         sc.close();

//     }
// }

// 5.2 Two Dimensional Array
// import java.util.Scanner;
// import java.util.Arrays;
// public class Demo{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int array[][] = new int[5][5];
//          array[0][0] = sc.nextInt();
//          array[0][1] = sc.nextInt();
//          System.out.println("The value of array is "+ array[0][0] + " " + array[0][1]);
//     }
// }




// 6 Strings
// import java.util.Scanner;
// public class Demo{
//     public static void main (String [] args ){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         System.out.println("Name " + name);
        
//     }
// }




// 7 Loops
// 7.1 For loops
public class Demo{
    public static void main (String [] args){
        for(int num = 0; num<10; num++)
        {
            System.out.println("Hello");
        }
    }
}
