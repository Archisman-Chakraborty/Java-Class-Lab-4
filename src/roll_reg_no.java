import java.util.Scanner;

abstract class student {
    int rollno;
    long regno;

    void getinput(int r, long reg) {
        rollno = r;
        regno = reg;
    }

    abstract void course();
}

class kiitian extends student {

    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    void display() {
        System.out.println("Rollno - " + rollno);
        System.out.println("Registration no - " + regno);
        course();
    }
}

public class roll_reg_no {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll no: ");
        int r = sc.nextInt();
        System.out.print("Enter Reg no: ");
        long reg = sc.nextLong();

        kiitian k = new kiitian();
        k.getinput(r, reg);
        k.display();
    }
}
