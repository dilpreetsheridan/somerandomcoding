/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentdetails;

/**
 *
 * @author dilpreetchattha
 */
public class PrintStudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Student s1 = new Student();
    s1.setName(name:"Peter");
    s1.setAge(age:"21");
    Student s2 = new Student();
    s2.setName(name:"kumar");
    s2.setAge(age:21);
    
    Student s3 = new Student();
    s3.setName(name:"simran");
    s3.setAge(age:21);
    
    list[0] = s1;
    list[2] = s2;
    list[3] = s3;
    
    for(int i=0; i<list.length;i++)
    {
        System.out.println(list[i].getName()+" "+list[i].getAge());
        
       
    }
    
    }
    
}
