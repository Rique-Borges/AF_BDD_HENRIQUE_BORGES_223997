package conta;

public class Conta {
    private boolean isLuxury;
    private boolean earlyBooking;
    private double price;

    public Conta(boolean isLuxury, boolean earlyBooking, double price) {
        this.isLuxury = isLuxury;
        this.earlyBooking = earlyBooking;
        this.price = price;
    }

    public boolean isLuxury() {
        return isLuxury;
    }

    public boolean isEarlyBooking() {
        return earlyBooking;
    }

    public double getPrice() {
        return price;
    }

    public void applyDiscount() {
        if (isLuxury && earlyBooking) {
            price *= 0.9; // 10% discount
        }
    }

    public void processUrgentRental() {
        if (!earlyBooking) {
            price *= 1.2; // 20% surcharge for urgent rental
        }
    }
}
