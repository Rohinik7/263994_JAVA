/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author ROHINI NAIR
 */
class Innings{
    private String teamname;
    private String inningsname;
    private int run;
    //getter
    public String getname(){
        return teamname;
    }
    public String getinnings(){
        return inningsname;
    }
    public int getrun(){
        return run;
    }
    //setter
    public void setVar(String tname,String inname,int run){
        this.teamname=tname;
        this.inningsname=inname;
        this.run=run;
    }
    public void displayInningsDetails(){
        switch(inningsname){
            case "First":
                System.out.printf("\nName:"+getname()+"\n"+"Scored:"+getrun()+"\n"+"Need %d to win\n",(getrun()+1));
                break;
            case "Second":
                System.out.println("Name:"+getname()+"\nScored:"+getrun()+"\nMatch Ended.");
                break;
    }
    }
}
public class InningsMain {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the team name:");
        String tname=in.nextLine();
        System.out.println("Enter session:");
        String inname=in.next();
        System.out.println("Enter run:");
        int run=in.nextInt();
        Innings e=new Innings();
        e.setVar(tname, inname, run);
        e.displayInningsDetails();
        
    }
}
