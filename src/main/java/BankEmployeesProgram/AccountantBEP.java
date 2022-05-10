package BankEmployeesProgram;

public class AccountantBEP extends BEP{

    String close;
    String create;
    String open;


    public AccountantBEP(String name, String DOB, int id, String address, double salary, String title,String close, String create, String open) {
        super(name, DOB, id, address, salary, title);
        this.close = close;
        this.create = create;
        this.open = open;
    }


    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getCreate() {
        return create;
    }

    public void setCreate(String create) {
        this.create = create;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }






    @Override
    public void printBEPDetails() {
        super.printBEPDetails();

        System.out.println("Close:" + close);

        System.out.println("Create:" + create);

        System.out.println("Open:" + open);
    }
}
