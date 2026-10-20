public class Salesperson implements Comparable {
    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    @Override
    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName()) &&
                firstName.equals(((Salesperson) other).getFirstName()));
    }

    // Melengkapi method compareTo sesuai instruksi modul
    @Override
    public int compareTo(Object other) {
        Salesperson otherPerson = (Salesperson) other;
        int result;

        if (this.totalSales < otherPerson.getSales()) {
            result = -1;
        } else if (this.totalSales > otherPerson.getSales()) {
            result = 1;
        } else {
            // Jika totalSales sama, bandingkan nama belakang lalu nama depan
            result = this.lastName.compareTo(otherPerson.getLastName());
            if (result == 0) {
                result = this.firstName.compareTo(otherPerson.getFirstName());
            }
        }

        return result;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSales() {
        return totalSales;
    }
}
