/**
 * @author(TestCode)
 * Version One
 */

import java.util.*;

public class StudListRuner
{
    public static void main(String args[]) {
        StudList studList = new StudList();
        Scanner scr = new Scanner(System.in);
        int control = 0; // Control inside of loop--Chooses method
        String contrl = "Y";  //  Contrl for while loop

        while (contrl.equals("Y") ||contrl.equals("y")) {
            menuNumber();
            System.out.println("What would you like to do?");
            control = scr.nextInt();
            if (control == 1) {
                studList.addStudentToList();
            }
            else if (control == 2) {
                studList.deleteStudentFromList();
            }
            else if (control == 3) {
                studList.editStudentList();
            }
            else if (control == 4) {
                studList.searchList();
            }
            else if (control == 5) {
                studList.printList();
            }
            else if (control == 6) {
                studList.clearList();
            }  
            else if (control == 7) {
                System.out.println("By what GPA?");
                double gpa = scr.nextDouble();
                studList.removeStudentsByGpa(gpa);
            }
            else {
                Scanner sc = new Scanner(System.in);
                System.out.println("Not a valid number, press 1, 2, 3, 4, 5, or 6");
                System.out.println("Press return to continue");
                String key = sc.nextLine();
            }

            String clearBuffer = scr.nextLine();
            System.out.println("Would you like to complete another action?");
            contrl = scr.nextLine();
            contrl.toUpperCase();
        } 

    }

    public static void menuNumber() {
        System.out.print('\u000C');
        System.out.println("1. Add a student");
        System.out.println("2. Delete a student");
        System.out.println("3. Edit a student record");
        System.out.println("4. Search students");
        System.out.println("5. Print student list");
        System.out.println("6. Clear students");
        System.out.println("7. Remove students by GPA");
    }
}
