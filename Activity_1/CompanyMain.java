/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author ROHINI NAIR
 */
class Company{
    private String name;
    private String employees;
    private String teamlead;
    //getter
     public String getName(){
        return name;
    }
    public String getemployee(){
        return employees;
    }
    public String getlead()
    {
        return teamlead;
    }
    //setter
    public void setvar(String name,String employees,String teamlead){
        this.employees=employees;
        this.name=name;
        this.teamlead=teamlead;
    }
}
public class CompanyMain {
    public static void main(String args[]){
        Company c=new Company();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the company name:");
        String name=in.nextLine();
        System.out.println("Enter the employees:");
        String employees=in.nextLine();
        System.out.println("Enter TeamLead:");
        String teamlead=in.nextLine();
        c.setvar(name, employees, teamlead);
        String[] emparr=employees.split(",");
        boolean contains = Arrays.stream(emparr).anyMatch(teamlead::equals);
        if(contains){
            System.out.println("Name:"+c.getName()+"\nEmployees:"+c.getemployee()+"\nLead:"+c.getlead());
        }
        else{
            System.out.println("Invalid Input.");
        }
    }
}
