import java.util.Scanner;

public class Converter{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("this is the conversion machine!");
        System.out.println("1 for days to minutes");
        System.out.println("2 for days to seconds ");
        System.out.println("3 for Years to days ( Not including leap year");
        System.out.println("4 for Years to weeks (Not including leap year) ");
        System.out.println("5 for weeks to minutes");
        System.out.println("6 for weeks to seconds");
        
        int choice = Integer.valueOf(scanner.nextLine());
        if(choice == 1)
        {
            System.out.println("this is days to minutes");
            System.out.println("enter value");
            int Op1 =Integer.valueOf(scanner.nextLine());
            System.out.println(Op1*1440);
            scanner.close();
        }
        else if(choice == 2)
        {
            System.out.println(" this is days to seconds");
            System.out.println("enter value");
            int Op1 =Integer.valueOf(scanner.nextLine());
            System.out.println(Op1*86400);
            scanner.close();

        }
        else if(choice == 3)
        {
            System.out.println("this is years to days");
            System.out.println("enter value");
            int Op1 =Integer.valueOf(scanner.nextLine());
            System.out.println(Op1*365);
            scanner.close();
        }
        else if(choice == 4)
        {
            System.out.println("this is years to weeks");
            System.out.println("enter value");
            int Op1 =Integer.valueOf(scanner.nextLine());
            System.out.println(Op1*52);
            scanner.close();
        }

        else if(choice == 5)
        {
            System.out.println("this is weeks to minutes");
            System.out.println("enter value");
            int Op1 =Integer.valueOf(scanner.nextLine());
            System.out.println(Op1*10080);
            scanner.close();
        }
        else if(choice == 6)
        {
            System.out.println("this is weeks to seconds");
            System.out.println("enter value");
            int Op1 =Integer.valueOf(scanner.nextLine());
            System.out.println(Op1*604800);
            scanner.close();
        }
        else{
            System.out.println("pick a number from 1-6 Bozo");
                System.exit(0);
                scanner.close();
        }
       
            
        
    }
}