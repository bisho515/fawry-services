import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends Person {

    private ArrayList<RefundTransactions> ref;

    public Admin() {
        super();
        ref = new ArrayList<RefundTransactions>();
    }

    // response with accept or reject on refund requests
    public void response() {
        System.out.println("This is the list of the Refund requests: ");
        System.out.println("Number of refunded requests: " + ref.size());
        for (int i = 0; i < ref.size(); i++) {
            System.out.println("The mobile number of the refunded transaction is : " + ref.get(i).getMobileNumber());
            System.out.println("The amount of money want to be refunded is : " + ref.get(i).getAmount());
            System.out.println("Press (1) to accept the refund transaction or (2) to reject it.");
            Scanner myObj = new Scanner(System.in);
            int choose = myObj.nextInt();
            if (choose == 1) {
                ref.get(i).setState(true);
                ref.get(i).getUser().getObj().put(ref.get(i));
            } else {
                ref.get(i).setState(false);
            }
        }
        ref.clear();
    }

    // add new refund to transaction refund list
    public void startRefund(RefundTransactions obj) {
        ref.add(obj);
        System.out.println("Refund request sent successfully to the admin");
    }


    public void adminMenu() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("1.View Refund Transactions");
        System.out.println("2.Sign out from the program");
        int ref = myObj.nextInt();
        if (ref == 1) {
            this.response();
        }
        else {
            this.signout();
        }
    }


}
