import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    System.out.println("inserire primo numero:");
       int a= sc.nextInt();

       System.out.println("inserire secondo numero:");
        int b=sc.nextInt();

        System.out.println("inserire terzo numero:");
        int c= sc.nextInt();

        int media= (a+b+c);
        System.out.println("la media è: " + media);

        sc.close();
    }
    
}
