public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate, double commRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = commRate;
        totalSales = 0.0;
    }

    // Menambahkan nilai transaksi penjualan
    public void addSales(double sales) {
        totalSales += sales;
    }

    // Menghitung upah: gaji per jam (super.pay()) + komisi penjualan
    @Override
    public double pay() {
        double payment = super.pay() + (totalSales * commissionRate);
        totalSales = 0.0; // Reset total sales setelah dibayarkan
        return payment;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }
}
