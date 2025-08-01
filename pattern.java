import java.util.Scanner;

public class pattern {

public static void pattern1(int num){
    for(int i=0;i<num;i++){
        for(int j=0;i<num-j; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
public static void pattern2(int num){
    for(int i=1;i<=num;i++){
        for(int j=1;j<(num*2);j++){
            if(i>num-j && j<num+i)
            System.out.print("*");
            else 
            System.out.print(" ");
        }
        System.out.println();
    }
}
public static void pattern3(int num){
    for(int i=1;i<=num;i++){
        for(int j=1;j<=num;j++){
            if(i>=num+1-j)
            System.out.print("* ");
            else 
            System.out.print(" ");
        } 
        System.out.println();
    }
}
public static void pattern4(int num){
    for(int i=1;i<=9;i++){
        for(int j=1;j<=5;j++){
            if(i>=j && i<=10-j)
            System.out.print("* ");
            else 
            System.out.print(" ");
        } 
        System.out.println();
    }
}
public static void pattern5(int num){
    for(int i=1;i<=9;i++){
        for(int j=1;j<=5 ;j++){
            if(i>=6-j && i<5+j)
            System.out.print(" *");
            else 
            System.out.print(" ");
        } 
        System.out.println();
    }
}
public static void pattern6( ){
  for(int i=1;i<=4;i++){
    for(int j=1;j<=9;j++){
        
        if(i>=6-j && j<5+i) System.out.print("*");

        else System.out.print(" ");
    }
    System.out.println();
  }
  for(int i=1;i<=5;i++){
    for(int j=1;j<=9;j++){
        
        if(i<=j && i<=10-j) System.out.print("*");

        else System.out.print(" ");
    }
    System.out.println();
  }

}
public static void pattern7(int num){
    for(int i=1;i<=num-1;i++){
        for(int j=1;j<=num;j++){
            if(j>=i  )
            System.out.print("* ");
            else
            System.out.print(" ");
        }
        System.out.println();
    }
    for(int i=1;i<=num;i++){
        for(int j=1;j<=num;j++){
            if(i>=num+1-j)
            System.out.print("* ");
            else
            System.out.print(" ");
        }
        System.out.println();
    }
}
public static void pattern_A(){
    for(int i=1;i<=7;i++){
        for(int j=1;j<=5;j++){
            if(j==1 || j==5 || i==4 || i==1 || i==7){
                System.out.print("*");
            }
             else System.out.print(" ");
        }
        System.out.println();
    }
}


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        // int num=sc.nextInt();
        // pattern1(num);
        // pattern2(num);
        // pattern3(num);
        // pattern4(num);
        //   pattern5(num);
        //    pattern6();
        // pattern7(num);
        pattern_A();


    }
}
