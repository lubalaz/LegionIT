package BankEmployeesProgram;

public class ClerkBEP extends BEP {

    String call;
    String answerCall;

    public ClerkBEP(String name, String DOB, int id, String address, double salary, String title, String call, String answerCall) {
        super(name, DOB, id, address, salary, title);
        this.call = call;
        this.answerCall = answerCall;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getAnswerCall() {
        return answerCall;
    }

    public void setAnswerCall(String answerCall) {
        this.answerCall = answerCall;
    }

    @Override
    public void printBEPDetails() {
        super.printBEPDetails();
        System.out.println("Call:" + call);
        System.out.println("AnswerCall:" + answerCall);
    }
}
