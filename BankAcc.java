public class BankAcc{
    int accountId;
    String Name;
    Double amount;

public void insert(int Id , String NameOfuser, double AmountofInsert)
{

 accountId = Id;
 Name =NameOfuser;
 amount=AmountofInsert;

}

public void Deposit(double DepositAmount){
    amount=amount+DepositAmount;
}

public void Withdraw(double withdrawn){

  amount = amount-withdrawn;

}

public void accountDetails()
{
  System.out.println(accountId +" "+ Name +" "+ amount);

}

public void chaeckBalnce(){
     System.out.println(amount);

 }

public static void main(String args[]){
     BankAcc Asiri = new BankAcc();
     Asiri.insert(1 , "Lakdula" , 1200.00);
     Asiri.accountDetails();
     Asiri.Deposit(20000.00);
     Asiri.Withdraw(3000);
     Asiri.chaeckBalnce();
     
      BankAcc janitha = new BankAcc();
      janitha.insert(2 , "Janitha" ,50000.00);
      janitha.accountDetails();


     



}




}