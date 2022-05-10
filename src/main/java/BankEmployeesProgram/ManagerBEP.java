package BankEmployeesProgram;

public class ManagerBEP extends BEP{

    String hire;
    String fire;

    public ManagerBEP(String name, String DOB, int id, String address, double salary, String title, String hire, String fire) {
        super(name, DOB, id, address, salary, title);
        this.hire = hire;
        this.fire = fire;
    }

    public String getHire() {
        return hire;
    }

    public void setHire(String hire) {
        this.hire = hire;
    }

    public String getFire() {
        return fire;
    }

    public void setFire(String fire) {
        this.fire = fire;
    }

    @Override
    public void printBEPDetails() {
        super.printBEPDetails();
        System.out.println("Hire:" + hire);
        System.out.println("Fire:" + fire);
    }
}
