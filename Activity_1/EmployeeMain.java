/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

class Employee{
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
public class EmployeeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner in =new Scanner(System.in);   
    System.out.println("Enter the name: ");
    String name=in.nextLine();
    System.out.println("Enter Address: ");
    String add=in.nextLine();
    System.out.println("Enter Mobile: ");
    String mob=in.nextLine();
    Employee e = new Employee();
    System.out.println("Employee Details: ");
    e.setVar(name, add, mob);
    System.out.println("Name:"+e.getName()+"\n"+"Address:"+e.getadd()+"\n"+"Mobile:"+e.getmobile());
    
    }
    
    
}
