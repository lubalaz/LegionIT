package BankEmployeesProgram;

public class BankEmployeesProgramMain {
    public static void main(String[] args) {
       ManagerBEP BEP1 = new ManagerBEP("John Shor", "15/09/1981", 1, "Winnipeg",10000, "Manager", "employees", "employees" );
        ClerkBEP BEP2 = new ClerkBEP("Dav Dac", "22/03/1975", 2,"Toronto", 3000, "Clerk", "to customers","incoming");
        ClerkBEP BEP3 = new ClerkBEP("Bac Buc", "20/05/1977", 3,"NY", 3000, "Clerk","to customers","incoming");
        ClerkBEP BEP4 = new ClerkBEP("Luc Lac", "21/04/1975", 4,"Jerusalem", 3000, "Clerk","to customers", "incoming");
        AccountantBEP BEP5 = new AccountantBEP("Mac Mik", "02/03/1980", 5,"Washington", 5000, "Accountant","account","newAccount","reports");
       AccountantBEP BEP6 = new AccountantBEP("Bon Mon", "05/03/1965", 6,"Moscow", 5000, "Accountant","account","newAccount", "reports");
       AccountantBEP BEP7 = new AccountantBEP("Mec Muk", "07/03/1981", 7,"Paris", 5000, "Accountant", "account","newAccount","reports");
       AccountantBEP BEP8 = new AccountantBEP("Ton Jack", "05/08/1966", 8,"Ottawa", 5000, "Accountant","account","newAccount","reports");
       AccountantBEP BEP9 = new AccountantBEP("Lav Live", "09/09/1955", 9,"Kiev", 5000, "Accountant","account","newAccount","reports");

        BEP1.printBEPDetails();
        BEP2.printBEPDetails();
        BEP3.printBEPDetails();
        BEP4.printBEPDetails();
        BEP5.printBEPDetails();
        BEP6.printBEPDetails();
        BEP7.printBEPDetails();
        BEP8.printBEPDetails();
        BEP9.printBEPDetails();

    }
}
