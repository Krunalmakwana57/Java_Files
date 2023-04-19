import java.util.Scanner;

class Bank {
	protected 
	int ATM_Pin = 1557;
	double Bank_Bal = 1000;
}
class User extends Bank {
	public
	int Acc_Num = 12345678;
	String IFSC_Code = "SBIN0001";
	double TotalBalance;
	float AddMoney,RemoveMoney;
	
	public void UserData() {
		System.out.println("1.Select This To Deposite Money");
		System.out.println("2.Select This To Withdraw Money");
		System.out.println("3.Select This To Check Bank Balance");
		
		System.out.print("Enter Your Choice : ");
		try (Scanner sc = new Scanner(System.in)) {
		int choice = sc.nextInt();
		switch(choice) {
		case 1:System.out.print("Enter Your Pin Number : ");
		int AtmPin = sc.nextInt();
		if(AtmPin == ATM_Pin) {
			System.out.println("Welcome User");
			System.out.print("How Much Money You Want To Deposite : ");
			AddMoney = sc.nextFloat();
			System.out.println("You Have Deposited "+AddMoney);}
			else {
				System.out.println("Sorry You Have Entered Wrong Pin, Please Try Again");
			}
			break;
			case 2:System.out.print("Enter Your Pin Number : ");
			AtmPin = sc.nextInt();
			if(AtmPin == ATM_Pin) {
				System.out.println("Welcome User");
				System.out.print("How Much Money You Want To Withdraw : ");
				RemoveMoney = sc.nextFloat();
				if(RemoveMoney>Bank_Bal) {
					System.out.println("You Have Insufficient Balance You Can't Withdraw");
				}else {
					System.out.println("You Have Withraw "+RemoveMoney);
				}
			}
			else {
				System.out.println("Sorry You Have Entered Wrong Pin, Please Try Again");
			}
			break;
			case 3:System.out.print("Enter Your Pin Number : ");
			AtmPin = sc.nextInt();
			if(AtmPin == ATM_Pin) {
				System.out.println("Welcome User");
				System.out.println("You Have Total Balance Of "+Bank_Bal);
			}else {
				System.out.println("Sorry You Have Entered Wrong Pin, Please Try Again");
			}
			break;
			default:System.out.println("Invalid Choice, Please Try Again");
		
		}
		TotalBalance = TotalBalance + AddMoney - RemoveMoney;
		
		System.out.print("Do You Want To Continue : ");
		String Cont = sc.next();
		if(Cont == "Yes" || Cont == "yes" || Cont == "YES") {
//			 return UserData();
		}else {
			System.out.println("Thank You, Have a Good Day.");
		}
}
}
}
public class ATM{
	public static void main(String[] args) {
		
		User user = new User();
		user.UserData();
	}
}
