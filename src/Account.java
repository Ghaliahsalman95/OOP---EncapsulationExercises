public class Account {
    private String id;
    private String name;
    private int balance=0;

    public Account(String name,String id) {
        this.name=name;
        this.id=id;
    }
    public Account(String name,String id,int balance){
        this.name=name;
        this.id=id;
        this.balance=balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int debit (int amount){
                setBalance((getBalance()+amount));
                return getBalance();
    }

    public int credit(int amount){
        int credit=0;
        if(this.getBalance()>=amount) {
            credit=this.getBalance()-amount;
            this.setBalance(credit);
        }return credit;//also getBalance;
            // return (setBalance(getBalance()-amount));}
    }

public int transferTo(Account object,int amount){
        if(this.getBalance()>=amount){
        object.setBalance((object.getBalance())+amount);
        int netB=this.getBalance()-amount;
        this.setBalance(netB);
            return 1;}

return -1;}

    public Account() {
    }

    @Override
    public String toString() {
        return "Account [" +
                "ID= " + id + '\t' +
                "Name= " + name + '\t' +
                "Balance= " + balance +
                ']';
    }
}
