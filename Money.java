public class Money {
    private double amount;

    // Constructor
    public Money(double amount) {
        this.amount = amount;
    }

    // Copy constructor
    public Money(Money other) {
        this.amount = other.amount;
    }

    // Getter for amount
    public double getAmount() {
        return amount;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Money money = (Money) obj;
        return Double.compare(money.amount, amount) == 0;
    }

    // Override toString method
    @Override
    public String toString() {
        return "$" + amount;
    }
}
