package shared;

public interface Payable {
    String SECRET = "12344";

    //abstract method
    default double getPayableAmount(){
        return 0;
    };

    static double getAmount() {
        return 0;
    }
}
