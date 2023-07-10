package org.career.day13;

class Account{


     private Long accnum;
     private String accname;
     private int balace;

    public Account(Long accnum,String accname,int balace)
    {
        this.accnum=accnum;
        this.accname=accname;
        this.balace=balace;

    }


  public void withDraw(double amount)
  {
      if(balace>=amount)
      {
          balace -=amount;
          System.out.println(String.format("your account with %s is debited with %s and the balance is %s",accnum,amount,balace));
      }
      else {
          System.out.println("sorry insufficent balance");
      }
  }
  public void deposit(double amount)
  {
      balace+=amount;
      System.out.println(String.format("your account %s credited with %s and the balance is %s",accnum,amount,balace));
  }
    public void Showdetials()
    {
        System.out.println("acc number is "+maskAccount(accnum));
        System.out.println("acc name is "+accname);
        System.out.println("acc balance is "+balace);
    }
    private String maskAccount(Long accnum)
    {
        String stracc=accnum.toString();
        return "xxxxxxx"+stracc.substring(stracc.length()-3);
    }

    public Long getAccnum() {
        return accnum;
    }

    public String getAccname() {
        return accname;
    }

    public int getBalace() {
        return balace;
    }
}


public class AccountManager {
    public static void main(String[] args) {
        Account account=new Account(20124561L,"sai",4500);
        Account account1=new Account(10345612L,"meghana",5500);
        Account account2=new Account(20124562L,"sairam",4000);
        Account account3=new Account(10345613L,"meghanath",6000);
        Account account4=new Account(201245614L,"kishore",8500);

        Account[] arr= new Account[]{account,account1,account2,account3,account4};

        for(Account acc:arr)
        {
            acc.Showdetials();
            System.out.println("-".repeat(100));
        }

        Account maxacc=getMaxBalanceAmount(arr);
        maxacc.Showdetials();

        double total=totalAmount(arr);
        System.out.println(total);

    }

    private static Account getMaxBalanceAmount(Account[] arr)
    {
        double max=maxBalance(arr);
        for(Account acc:arr)
        {
            if(acc.getBalace()==max)
            {
                return acc;
            }
        }
        return null;


   }
    private static  double maxBalance(Account[] arr)
    {
        double maxAmouunt=arr[0].getBalace();
        for(int i=0;i< arr.length;i++)
        {
            Account acc=arr[i];
            if(acc.getBalace()>maxAmouunt)
            {
                maxAmouunt= acc.getBalace();
            }
        }
        return maxAmouunt;
    }

    private static double totalAmount(Account[] arr)
    {
        int sum=0;
        for(Account acc:arr)
        {
            sum += acc.getBalace();
        }
        return  sum;

    }


}
