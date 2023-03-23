public class BonusMilesService {
    public int calculate(int price){

        int milePrice = 20;
        int mile = price / milePrice;

        return mile;
    }
}
