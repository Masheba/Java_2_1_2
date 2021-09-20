class Main {
    public static void main(String[] args) {
        int accountbalance = 100;
        int refillamount = 1100;
        int bonus = 1;

        if (refillamount<1000)
        {
            System.out.println(refillamount + accountbalance);
        }
        else {
            System.out.println(refillamount / 100 + accountbalance + refillamount);
            System.out.println(refillamount / 100);
        }
         }
}