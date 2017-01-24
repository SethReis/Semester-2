/**
 * Kate McDowall
 * 13 October 2015
 * Proj 2 StudList
 */

import java.util.*;

public class StudList
{
    ArrayList<Student> studList = new ArrayList<Student>();
    public  int currentSize;
    Scanner scr = new Scanner(System.in);


    public void addStudentToList() {
        System.out.println("Add Student");
        Student stu = new Student();
        

        System.out.println("*********************************");
        System.out.print("Enter student name: ");
        parseUserInput(stu,scr.nextLine());
        System.out.print("Enter student number: ");
        stu.setNum(scr.nextInt());
        String clearBufferrr = scr.nextLine();;
        System.out.print("Enter student GPA: ");
        stu.setGpa(scr.nextDouble());
        if (studList.size() > currentSize) {
            studList.set(currentSize, stu);
            currentSize++;
        } else {
            ArrayList<Student> aAL = new ArrayList<Student>();
            for (int n = 0; n < currentSize; n++) {
                aAL.set(n, studList.get(n));
            }
            studList = aAL;
        }
    }

    public void deleteStudentFromList() {
        System.out.println("Delete Student");
        Scanner scr = new Scanner(System.in);
        //  Delete by name::
        
        //  Delete by stuNumber::
        
        //  Delete by GPA::
    }

    public void editStudentList() {
        System.out.println("Edit List");
        Scanner scr = new Scanner(System.in);
        //  Edit name::
        
        //  Edit stuNumber::
        
        //  Edit GPA::        
    }

    public void clearList() {        
        System.out.println("Clear List");
        for (int index = 0; index < currentSize; index++) {
            studList.set(index, null);
        }
        System.out.println("\nPress any key to continue");
        String pause = scr.nextLine();
    }

    public void searchList() {
        System.out.println("Search List");
        System.out.println("If you would like to enter a name press 1. To enter a student number press 2");
        int answer = scr.nextInt();
        String clearBuffer = scr.nextLine();
        if (answer == 1) {
            System.out.println("Please enter student name: ");
            String nameSearch = scr.nextLine();
            for(int i = 0; i < currentSize; i++) {
                if (nameSearch.equals(studList.get(i).getfullName())) {
                    System.out.println("Name: " + studList.get(i).getfullName());
                    System.out.println("Number: " + studList.get(i).getstuNumber());
                    System.out.println("GPA: " + studList.get(i).getGpa());
                } else {
                    System.out.println("No match found");

                }
            }
        }

        if (answer == 2) {
            System.out.println("Please enter student number: ");
            int numSearch = scr.nextInt();
            for(int i = 0; i < currentSize; i++) {
                if (numSearch == studList.get(i).getstuNumber()) {
                    System.out.println("Name: " + studList.get(i).getfullName());
                    System.out.println("Number: " + studList.get(i).getstuNumber());
                    System.out.println("GPA: " + studList.get(i).getGpa());
                } else {
                    System.out.println("No match found");

                }
            } 
        }
    }

    public void printList() {

        System.out.println("Print Students");
        for (int i = 0; i < currentSize; i++) {
            if(studList.get(i) != null) {
                System.out.print("Student: ");
                System.out.print("\t" + studList.get(i).getstuNumber());
                System.out.print("\t" + studList.get(i).getfullName());
                System.out.print("\t" + studList.get(i).getGpa());
            }
        }
        System.out.println();
    }
    
    public int removeStudentsByGpa(double gpa){
        int total = 0;
        for(int i = 0; i < studList.size(); i++){
            if(studList.get(i).getGpa() < gpa){
                studList.remove(i);
                i--;
                total++;
            }
        }
        return total;
    }

    public static void parseUserInput(Student stu, String name) {


    }
}

