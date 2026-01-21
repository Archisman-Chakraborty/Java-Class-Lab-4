import java.util.Scanner;

interface Salary {
    void earnings();
    void deductions();
    void bonus();
}

abstract class Manager implements Salary {
    double basic;

    Manager(double basic) {
        this.basic = basic;
    }

    public void earnings() {
        double da = 0.8 * basic;
        double hra = 0.15 * basic;
        double total = basic + da + hra;
        System.out.println("Earnings - " + (int) total);
    }

    public void deductions() {
        double pf = 0.12 * basic;
        System.out.println("Deduction - " + (int) pf);
    }
}

class Substaff extends Manager {

    Substaff(double basic) {
        super(basic);
    }

    public void bonus() {
        double b = 0.5 * basic;
        System.out.println("Bonus - " + (int) b);
    }
}

public class earning {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double basic = sc.nextDouble();

        Substaff s = new Substaff(basic);
        s.earnings();
        s.deductions();
        s.bonus();
    }
}
