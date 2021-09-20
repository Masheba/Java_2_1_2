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


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}