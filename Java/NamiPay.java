public class NamiPay {
    boolean portalActive = true;
    double amount = 25.90;
    public static void main(String[] args) {
        NamiPay obj = new NamiPay();
        System.out.println("Terminal ID: 8184000000000077");
        System.out.println("Version: 3.794");
        System.out.println("NamiPay");
        String[] hostStatus = {"HOST_UP", "HOST_DOWN", "HOST_UP"};

        for (int attempt = 0; attempt < hostStatus.length; attempt++)
        {
            System.out.println("\nTransaction Attempt: " + (attempt + 1));
            if (hostStatus[attempt].equals("HOST_UP")) {
                obj.processTransaction();
            }
            else {
                System.out.println("Transaction Declined");
                System.out.println("Host is Down");
            }
        }
    }
    public void processTransaction() {

        if (portalActive == false) {
            System.out.println("Attestation and Monitoring Unsuccessful");
        } else {
            System.out.println("Transaction Successful");
            System.out.println("Approved: $" + amount);
        }
    }
}
