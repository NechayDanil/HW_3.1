public class BonusMilesService {
    public int calculate(int price) {
        double milesPre = 1.0 / 20.0;
        double miles = price * milesPre;
        return (int) miles;
    }


}
