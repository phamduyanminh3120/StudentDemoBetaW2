/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamental;

/**
 *
 * @author mehta
 */
public class Student1 {

    private String name;
    private int studentID; //added to make a change in github
    
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }
    
    public int getStudentID(){
        return this.studentID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param givenName the name to set
     */
    public void setName(String givenName) {
            name = givenName;
    }
    
}
