//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Account account=new Account("Riyam","1234567890",15000);
Account accountTransfer=new Account("Sema","167890",10000);
        //------------------------------------------
        System.out.println("---------toString--------------");
        System.out.println(account.toString());
        System.out.println("-----------------------");
       // System.out.println("--------Getter---------------");
        System.out.println("Name is: "+account.getName());
        System.out.println("ID is: "+account.getId());
        System.out.println("Balance is: "+account.getBalance());
        System.out.println("Credit 15000:"+account.credit(15000));
        System.out.println("Debit 2000 :"+account.debit(2000));
        System.out.println("-----------Test Transfer Method------------");
        if(account.transferTo(accountTransfer,2000)==1) {
            System.out.println("Transfer to Sema " +accountTransfer.getBalance());
        }else {System.out.println("You dont have much money to transfer");}
        System.out.println("---------------------------------");

        //------------------------------------------
Employee employee=new Employee("1234567890","Noha",100);
        System.out.println(employee.toString());
        System.out.println("Annual Salary is "+employee.getAnnualSalary());
        System.out.println("Raised Salary Percent 50 is "+employee.raisedSalary(50));
    }
}