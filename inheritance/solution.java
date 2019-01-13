import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student (String firstname, String lastname, int identification, int[] scores){
        super(firstname, lastname, identification);
        testScores=scores;
    }


    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    public char calculate(){
        int sum=0;
        int num= testScores.length;
        for (int i=0; i<num; i++)
            sum+=testScores[i];
        

        int aver= sum/num;
        if(aver>=90 && aver<=100)
            return 'O';
        else if (aver>=80 && aver<90)
            return 'E';
        else if (aver >=70 && aver<80)
            return 'A';
        else if (aver >=55 && aver<70)
            return 'P';
        else if(aver>=40 && aver <55)
            return 'D';
        else
            return 'T';
    }
}

class Solution {