package AulaPraticaRefactoring.src;

import java.util.Enumeration;

public abstract class Statement {
    public String value(Customer customer) {
        Enumeration rentals = customer.getRentals();
        String result = headerString(customer.getName());
        
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += rentalString(each);
        }
        
        result += footerString(customer.getTotalCharge(), customer.getTotalFrequentRenterPoints());
        return result;
    }

    abstract String headerString(String customerName);
    abstract String rentalString(Rental rental);
    abstract String footerString(double totalCharge, int frequentRenterPoints);
}