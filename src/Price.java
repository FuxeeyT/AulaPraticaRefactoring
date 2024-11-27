package AulaPraticaRefactoring.src;
// não alterei nada pq fiz no commit 14
public abstract class Price {
   public abstract int getPriceCode();
   public abstract double getCharge(int daysRented);

   public int getFrequentRenterPoints(int daysRented) {
      return 1;
   }
}