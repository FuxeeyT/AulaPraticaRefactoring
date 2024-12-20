package AulaPraticaRefactoring.src;
// não alterei nada pq fiz no commit 14
public class NewReleasePrice extends Price {
   public int getPriceCode() {
       return Movie.NEW_RELEASE;
   }

   public double getCharge(int daysRented) {
      return daysRented * 3;
   } 

   @Override
   public int getFrequentRenterPoints(int daysRented) {
      return (daysRented > 1) ? 2 : 1;
   }
}