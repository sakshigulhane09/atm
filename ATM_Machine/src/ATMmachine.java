import java.util.*;

public class ATMmachine{
public static void main(String[] args){
    ATM obj = new ATM();
    obj.checkpin();
  }
}

class ATM{
	
	//your pin is
  int PIN=1234;
  float balance=95000;

  public void checkpin(){
	System.out.println("WELCOME.. TO ATM MACHINE !!!!");
    System.out.println("Enter your PIN");
    Scanner sc = new Scanner(System.in);
    int enteredpin = sc.nextInt();
    if(enteredpin == PIN) {
	        menu();
            }
    else {
	System.out.println("Entered a wrong pin, Please try again");
	checkpin();
    }

  }

  private void menu() {
      Scanner scanner = new Scanner(System.in);
      while (true) {
          System.out.println("\n1. Check balance");
          System.out.println("2. Withdraw money");
          System.out.println("3. Deposit money");
          System.out.println("4. Exit");
          System.out.println("Enter your choice:");

          int choice = scanner.nextInt();

          switch (choice) {
              case 1:
                  checkbalance();
                  break;
              case 2:
                  withdrawmoney();
                  break;
              case 3:
                  depositmoney();
                  break;
              case 4:
                  System.out.println("COLLECT YOUR ATM CARD");
                  System.out.println("THANK U FOR USING ATM MACHINE");
                  return;
              default:
                  System.out.println("Invalid choice. Please try again.");
          }
      }
  }

  public void checkbalance()
  {
    System.out.println("Balance : " + balance);
    menu();
  }

  public void withdrawmoney()
  {
    System.out.println("Enter the amount to Withdraw");
    Scanner sc = new Scanner (System.in);
    float amount = sc.nextFloat ();
    if (amount > balance)
      {
	System.out.println("Insufficient Balance");
      }
    else
      {
	balance = balance - amount;
	System.out.println("Money Withdraw Successful");
	System.out.println("Your Final Account Balance is : " +balance);
      }
    menu ();
  }
  public void depositmoney ()
  {
    System.out.println("Enter the amount : ");
    Scanner sc = new Scanner (System.in);
    float amount = sc.nextFloat ();
    balance = amount + balance;
    System.out.println("Money Deposited Successful.");
    System.out.println("Your Final Account Balance is : " +balance);
    }
}