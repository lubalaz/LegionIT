package BankEmployeesProgram;

public abstract class BEP {

    String name;
    String DOB;
    int id;
    String address;
    double USDSalary;
    String title;

    public BEP(String name, String DOB, int id, String address, double salary, String title) {

        this.name = name;
        this.DOB = DOB;
        this.id = id;
        this.address = address;
        this.USDSalary = salary;
        this.title = title;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return DOB;
    }

    public void setDateOfBirth(String dateOfBirth) {
       DOB = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getUSDSalary() {
        return USDSalary;
    }

    public void setUSDSalary(double USDSalary) {
        this.USDSalary = USDSalary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }




    public void printBEPDetails() {
        System.out.println("***********");
        System.out.println("BEP name is: " + name);
        System.out.println("BEP DateOfBirth: " + DOB);
        System.out.println("BEP id is: " + id);
        System.out.println("BEP address: " + address);
        System.out.println("BEP salary: " + USDSalary);
        System.out.println("BEP title: " + title);


    }
}




