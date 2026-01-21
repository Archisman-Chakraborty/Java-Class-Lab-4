import java.util.Scanner;

interface Employee {
    void getDetails();
}

interface Managers extends Employee {
    void getDeptDetails();
}

class Head implements Managers {

    int empid;
    String ename;
    int deptid;
    String deptname;

    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        empid = sc.nextInt();
        sc.nextLine();
        ename = sc.nextLine();
    }

    public void getDeptDetails() {
        Scanner sc = new Scanner(System.in);
        deptid = sc.nextInt();
        sc.nextLine();
        deptname = sc.nextLine();
    }

    void display() {
        System.out.println("Employee id - " + empid);
        System.out.println("Employee name - " + ename);
        System.out.println("Department id - " + deptid);
        System.out.println("Department name - " + deptname);
    }
}

public class department{
    public static void main(String[] args) {

        Head h = new Head();
        h.getDetails();
        h.getDeptDetails();
        h.display();
    }
}
