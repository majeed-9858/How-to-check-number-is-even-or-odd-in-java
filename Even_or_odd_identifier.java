import java.util.Scanner;
public class Even_or_odd_identifier{
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int integer = sc.nextInt();
    if(integer % 2 == 0){
    System.out.println("The number is even");
    }
    else{
        System.out.print("The number is odd");
        sc.close();
    }
 }
}