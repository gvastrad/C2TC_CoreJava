package com.tnsif.interfaces;

import java.util.Scanner;

interface Atm
{  
     void checkBalance(int balance);
     void withDraw();
}
class Sbi implements Atm
{
    Scanner sc=new Scanner(System.in);
    private int balance;
    int accountNo;
    int amount;
    public void checkBalance(int balance)
    {
        this.balance=balance;
        accountNo=sc.nextInt();
        if (accountNo==123456789)
        {
          System.out.println("Balance is:"+balance);  
        }
        System.out.println("Please enter the correct account number");
    }
    public void withDraw()
    {
         accountNo=sc.nextInt();
        if (accountNo==123456789)
        {
          System.out.println("Balance is:"+balance);
          System.out.println("Enter the amount");
          amount=sc.nextInt();
          if (amount<balance)
          {
              System.out.println("Take your money");
              System.out.println("Remaining balance is:"+(balance-amount));
          }
          System.out.println("insufficient balance");
        }
        System.out.println("Enter the correct account number");
        
    }
}
public class Man extends Sbi
{
    public static void main(String []a)
    {
    Scanner sc=new Scanner(System.in);
    Sbi s=new Sbi();
    int x;
    System.out.print("enter 1 for checking your balance ");
    System.out.print("enter 2 for money withdraw");
    x=sc.nextInt();
    switch (x)
    {
        case 1:
            s.checkBalance(10000);
            break;
        case 2:
            s.withDraw();
            break;
        default:
            System.out.println("enter the correct number");
    }
    
    }
}
