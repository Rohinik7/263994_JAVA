/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

class Customer{
    private String name;
    private String address;
    private String mobile;
    // getter
    public String getName(){
        return name;
    }
    public String getadd(){
        return address;
    }
    public String getmobile()
    {
        return mobile;
    }
    // setter
    public void setVar(String name,String add,String mob){
        this.name=name;
        this.address=add;
        this.mobile=mob;
    }
}


/**
 *
 * @author ROHINI NAIR
 */
public class CustomerMain {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Customer c=new Customer();
        System.out.println("Enter Details: ");
        String inp=sc.nextLine();
        String[] inparr=inp.split(",");
        c.setVar(inparr[0], inparr[1], inparr[2]);
        System.out.println("Name:"+ c.getName()+"\nAddress:"+c.getadd()+"\nMobile:"+c.getmobile());
        
                
        
    }
    
}
