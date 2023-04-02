import java.util.*;

public class Atm_project {
  public static void main(final String[] args) {
    // initialising variables!
    final int PIN = 44555;
    float balance = 1000;

    float Deposit_Amt = 0;
    float Withdraw_Amt = 0;

    String name;

    final Scanner sc = new Scanner(System.in);
    // verifying from user to give input to enter pin number.
    System.out.println("Enter your pin number:");
    final int password = sc.nextInt();

    if (password == PIN) {
      System.out.println("Enter your name:");
      name = sc.next();
      System.out.println("Welcome " + name);

      while (true) {
        System.out.println("------------------------------------");  // following operations are done if the input i.e, pin given by user is correct.
        System.out.println("Press 1 to check A/C balance");
        System.out.println("Press 2 to Deposit amount");
        System.out.println("Press 3 to Withdraw amount");
        System.out.println("Press 4 to print respit ");
        System.out.println("Press 5 to  EXIT");

        int opt = sc.nextInt();
        switch (opt) {
          case 1:
            System.out.println("------------------------------------");  
            System.out.println("your current balance is:" + balance); // prints balance amount.
            break;
          case 2:
            System.out.println("------------------------------------");
            System.out.println("Enter amount to Deposit");
            Deposit_Amt = sc.nextFloat();
            System.out.println("Successfully credited");
            /// If amt of 100 is deposited, then the amt deposited is added to the current
            /// balance, and the total is saved into the balance for further operations.
            // eg :1000 = 100 +1000
            // balance = 1100

            balance = Deposit_Amt + balance;
            break;

          case 3:
            // this operation is to withdraw the amount from the balance.
            // if the withdrawl amt is grater then balance the amount cannot be deducted
            // from balnce. then a mesage pops noting about insufficuent balance.
            System.out.println("------------------------------------");
            System.out.println("Enter amount to withdraw:");
            Withdraw_Amt = sc.nextFloat();
            if (Withdraw_Amt > balance) {
              System.out.println("Insufficient Balance");
              System.out.println("try less than available balance");
            } else {
              System.out.println("Withdrawal Succesful");
              balance = balance - Withdraw_Amt;
              // eg:
              // balance = 1100
              // balance after withdrawl:
              // 1100 = 1100 -500 ; balance = 600.
            }
            break;
          case 4:
              // this is to print resipt, the history of final operations.Which are done in above steps.
            System.out.println("------------------------------------"); 
            System.out.println("Welcome!!");
            System.out.println("Available balance: " + balance);
            System.out.println("Deposited Amount : " + Deposit_Amt);
            System.out.println("Withdrawl Amount: " + Withdraw_Amt);
            System.out.println("Thank You!!");

          break;
          
        }
        if (opt == 5) {
          System.out.println("------------------------------------");
          System.out.println("Thankyou! Have a good day");
          break;
        }
      }
    } else {
      System.out.println("------------------------------------");
      System.out.println("Wrong pin number");
      System.out.println("Enter valid pin");
    }
  }
}

/*output:
ex:1 : when user pin is correct!
Enter your pin number:
44555
Enter your name:
marali
Welcome marali
------------------------------------
Press 1 to check A/C balance
Press 2 to Deposit amount
Press 3 to Withdraw amount
Press 4 to print respit 
Press 5 to  EXIT
1
------------------------------------
your current balance is:1000.0
------------------------------------
Press 1 to check A/C balance
Press 2 to Deposit amount
Press 3 to Withdraw amount
Press 4 to print respit 
Press 5 to  EXIT
2
------------------------------------
Enter amount to Deposit
234.98
Successfully credited
------------------------------------
Press 1 to check A/C balance
Press 2 to Deposit amount
Press 3 to Withdraw amount
Press 4 to print respit 
Press 5 to  EXIT
3
------------------------------------
Enter amount to withdraw:
456.66
Withdrawal Succesful
------------------------------------
Press 1 to check A/C balance
Press 2 to Deposit amount
Press 3 to Withdraw amount
Press 4 to print respit 
Press 5 to  EXIT
4
------------------------------------
Welcome!!
Available balance: 778.31995
Deposited Amount : 234.98
Withdrawl Amount: 456.66
Thank You!!
------------------------------------
Press 1 to check A/C balance
Press 2 to Deposit amount
Press 3 to Withdraw amount
Press 4 to print respit 
Press 5 to  EXIT
5
------------------------------------
Thankyou! Have a good day

ex:2: when user pin is incorrect!
Enter your pin number:
5674
------------------------------------
Wrong pin number
Enter valid pin
*/
