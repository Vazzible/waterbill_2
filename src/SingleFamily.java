import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SingleFamily extends Customer{
    private final double SINGLE_BASE = 13.21;
    private final int SINGLE_TIER1 = 7000;
    private final double SINGLE_TIER1_COST = 2.04;
    private final int SINGLE_TIER2 = 6000;
    private final double SINGLE_TIER2_COST = 2.35;
    private final double SINGLE_TIER3_COST = 2.70;

    private boolean isLowIncome;

    protected void setLowIncome(boolean lowIncome) {
        isLowIncome = lowIncome;
    }

    @Override
    public double calculateBill() {
        double bill;
        if (getGallonsUsed() <= SINGLE_TIER1) {
            bill = SINGLE_BASE + getGallonsUsed() * (SINGLE_TIER1_COST / getGALLONS());
        }
        else if (getGallonsUsed() <= getTIER2_CUTOFF()) {
            bill = SINGLE_BASE + SINGLE_TIER1 * (SINGLE_TIER1_COST / getGALLONS())
                    + (getGallonsUsed() - SINGLE_TIER1) * (SINGLE_TIER2_COST /
                    getGALLONS());
        }
        else {
            bill = SINGLE_BASE + SINGLE_TIER1 * (SINGLE_TIER1_COST / getGALLONS())
                    + SINGLE_TIER2 * (SINGLE_TIER2_COST / getGALLONS())
                    + (getGallonsUsed() - getTIER2_CUTOFF()) * (SINGLE_TIER3_COST /
                    getGALLONS());
        }
        return bill;
    }

    @Override
    public double applyDiscount(double bill){
        if(isLowIncome) {
            bill = bill * 0.9;
        }
        return bill;
    }

    @Override
    public void customerInput(){
        super.customerInput();
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            System.out.print("Is the customer low-income? True/false");
            isLowIncome = Boolean.parseBoolean(bufferedReader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
