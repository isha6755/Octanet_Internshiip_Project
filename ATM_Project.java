import java.util.*;

public class ATM_Project {
    public static void main(String[] args) {
        int pin = 1234;
        int balance = 10000;

        int Addamount = 0;
        int Takeamount = 0;

        String name;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pin number");

        int password = scanner.nextInt();

        if(password==pin){
            System.out.println("Enter your name");
            name=scanner.next();
            System.out.println("Welcome "+ name);

            while(true){

                
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to add amount");
                System.out.println("Press 3 to take amount");
                System.out.println("Press 4 to take receipt");
                System.out.println("Press 5 to EXIT");

                int opt=scanner.nextInt();
                switch(opt){
                    case 1:
                    System.out.println("Your current balance is "+ balance);
                    break;

                    case 2:
                    System.out.println("How much amount you want to ADD in you account");
                    Addamount=scanner.nextInt();
                    System.out.println("Successfully credited");
                    balance=Addamount+balance;
                    break;

                    case 3:
                    System.out.println("How much amount you want to take");
                    Takeamount=scanner.nextInt();
                    if(Takeamount>balance){
                        System.out.println("Insufficient balance");
                        System.out.println("Try less than your available balance");
                    }
                    else{
                        System.out.println("Successfully taken");
                        balance=balance-Takeamount;
                    }
                    break;

                    case 4:
                 
                    System.out.println("Welcome to All In One Mini  ATM ");
                    System.out.println("Available Balance is"+ balance);
                    System.out.println("Amount Deposite"+Addamount);
                    System.out.println("Amount Taken "+ Takeamount);
                    System.out.println("Thanks for Coming");
                    break;

                    default:
                    System.out.println("Press the number below 5");
                    break;
                }
                if(opt ==5){
                    System.out.println("Thank you ");
                    break;
                }
            }
        }

        else{
            System.out.println("Wrong Pin Number");
        }
    }
}