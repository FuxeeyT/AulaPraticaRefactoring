package AulaPraticaRefactoring.src;

public class TextStatement extends Statement {
    @Override
    String headerString(String customerName) {
        return "Rental Record for " + customerName + "\n";
    }

    @Override
    String rentalString(Rental rental) {
        return "\t" + rental.getMovie().getTitle() + "\t" + 
               String.valueOf(rental.getCharge()) + "\n";
    }

    @Override
    String footerString(double totalCharge, int frequentRenterPoints) {
        return "Amount owed is " + String.valueOf(totalCharge) + "\n" +
               "You earned " + String.valueOf(frequentRenterPoints) +
               " frequent renter points";
    }
}