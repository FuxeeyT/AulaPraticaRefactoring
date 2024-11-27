package AulaPraticaRefactoring.src;

public class HtmlStatement extends Statement {
    @Override
    String headerString(String customerName) {
        return "<H1>Rentals for <EM>" + customerName + "</EM></H1><P>\n";
    }

    @Override
    String rentalString(Rental rental) {
        return rental.getMovie().getTitle() + ": " + 
               String.valueOf(rental.getCharge()) + "<BR>\n";
    }

    @Override
    String footerString(double totalCharge, int frequentRenterPoints) {
        return "<P>You owe <EM>" + String.valueOf(totalCharge) + "</EM><P>\n" +
               "On this rental you earned <EM>" + 
               String.valueOf(frequentRenterPoints) + 
               "</EM> frequent renter points<P>";
    }
}