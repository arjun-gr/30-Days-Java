import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }

}

class Student extends Person {
    private int[] testScores;
    private String firstName;
    private String lastname;
    private int idNumber;

    // Write your constructor here
    public Student(String firstName, String lastName, int idNumber, int[] scores) {
        super(firstName, lastName, idNumber); // calling parent constructor with parameters
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.testScores = scores;
    }

    /*
     * Method Name: calculate
     * 
     * @return A character denoting the grade.
     */
    // Write your method here
    public char calculate() {
        int totalScore = 0;
        for (int x : testScores) {
            totalScore += x;
        }
        int avg = totalScore / testScores.length;

        if (avg >= 90 && avg <= 100) {
            return 'O';
        } else if (avg >= 80 && avg <= 90) {
            return 'E';
        } else if (avg >= 70 && avg <= 80) {
            return 'A';
        } else if (avg >= 55 && avg <= 70) {
            return 'P';
        } else if (avg >= 40 && avg <= 55) {
            return 'D';
        } else {
            return 'T';
        }
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}