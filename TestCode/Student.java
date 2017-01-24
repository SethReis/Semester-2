/**
 * Kate McDowall
 * 13 October 2015
 * Proj 2 Student Class
 */
public class Student{
    public int stuNumber;
    public static String firstName;
    public static String middleName;
    public static String lastName;
    public static String fulName;
    public double gpa;

    public Student()
    {
        this.stuNumber = 0;
        this.firstName = "";
        this.middleName = "";
        this.lastName = "";
        this.gpa = 0.0;
    }

    public String getfullName()
    {
        return firstName + " " + middleName + " " + lastName;  
    }

    public String getfirstName()
    {
        return firstName;  
    }
    
    public int getstuNumber()
    {
        return stuNumber;
    }

    public double getGpa() {
        return gpa;
    }
    
    public void setfirstName(String fname)
    {
        firstName = fname;
    }

    public void setmiddleName(String mname)
    {
        middleName = mname;
    }
    
    public void setlastName(String lname) {
        lastName = lname;
    }
    
    public void setfullName(String fullname) {
        fulName = firstName + middleName + lastName;
    }
    
    public void setNum(int n) {
        stuNumber = n;
    }
    
    public void setGpa(double n) {
        gpa = n;
    }
    
    public int compareTo(Student s) {
        if (this.gpa > s.getGpa()) return 1;
        else if (this.gpa == s.getGpa()) return 0;
        return -1;
    }
}

