package testPackageSoftServe;

class Rental {
    private int kind;
    private int days;

    // Other fields, constructors, get, set, etc.
    //
    public Rental(int kind, int days) {
        this.kind = kind;
        this.days = days;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getBasePrice() {
        // Calculation of Price.
        // . . .
        return 10;
    }
    // Other methods.

    public double amountFor(Rental rental) {
        double result;
        // Another code.
        result = getDays() * getBasePrice();
        if (getKind() == 1) {
            result = result * 1.5;
        } else if (getKind() == 2) {
            result = result * 2;
        } else if (getKind() == 3) {
            result = result * 2.5;
        } else if (getDays() > 7) {
            result = result * 3;
        }
        // Other calculation.
        return result;
    }
}
