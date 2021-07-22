package ATM;
import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		System.out.println("INSERT THE CARD");
		int pin=1453;
		int balance = 5000, withdraw, deposit,prev,np;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Pin number");
        int p= s.nextInt();
        if(p==pin)
        {
             while(true)
            {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Chaning pin");
            System.out.println("Choose 5 for EXIT");
            System.out.println("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter money to be withdrawn:");
                withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter money to be deposited:");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully depsited");
                System.out.println("");
                break;
                
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
                
              case 4:
              	System.out.println("Enter previous Pin");
             	prev=s.nextInt();
                	if(pin==prev)
                     	{
                		System.out.println("Enter New Pin");
                        np=s.nextInt();
                     	pin=np;
                     	System.out.println("Pin Changed Successfully");
                	}
                	else
                	{
                		System.out.println("Invalid Previous Pin");
                	}
                	break;
 
                case 5:
                System.out.println("THANK YOU");
                System.exit(0);
            }
            }
      }
        else
        {
        	System.out.println("Invalid Pin");
        }
        
    }

}	    
