/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi23;

import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author HUONG XINH GAI
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            Students st = new Students();
            questions qt = new questions();
            student_questions stq = new student_questions();
            st.login();
            if(st.status(st.getEmail(), st.getPass())){
                System.out.println("LOGIN SUCCESS! PRESS ANY KEY TO START QUIZ");
                System.out.println();
                ResultSet rs = qt.ContentQuestions();
                int i=0, count=0;
                while(rs.next()){
                    /*System.out.println(rs.getString("id") +rs.getString("content") + rs.getString("answer_a") +rs.getString("answer_b") 
                            +rs.getString("answer_c") +rs.getString("answer_d") +rs.getString("correct"));*/
                    i++;
                    System.out.printf("Question %d/5\n", i);
                    System.out.println(rs.getString("id") +".   "+rs.getString("content") +"\n"+rs.getString("answer_a") +"\n"
                            +rs.getString("answer_b") +"\n"
                            +rs.getString("answer_c") +"\n"+rs.getString("answer_d"));
                    System.out.print("Your Answer > ");
                    String ans = sc.nextLine();
                    if(qt.status(ans)){
                        System.out.println("Correct!");
                        count++;
                    }
                    else
                        System.out.println("Wrong!");
                }
                System.out.println();
                System.out.println("Congratulation!");
                System.out.printf("Your result: %d/5!\n", count);
                System.out.print("See details (Y/N): ");
                String see = sc.nextLine();
                ResultSet rs1 = stq.st_questions();
                if(see.equals("Y")){
                    while(rs1.next()){
                        i++;
                        System.out.printf("Question %d/5\n", i);
                        
                    }
                }
                else{
                    System.out.println("Do you want to TRY IT AGAIN or LOG OUT? (T/O): ");
                }
            }
            else{
                System.out.println("LOGIN FAILED!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
