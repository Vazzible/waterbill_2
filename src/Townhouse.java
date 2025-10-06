public class Townhouse extends Customer{
    private final double TOWNHOUSE_BASE = 13.21;
    private final int TOWNHOUSE_TIER1 = 7000;
    private final double TOWNHOUSE_TIER1_COST = 2.04;
    private final int TOWNHOUSE_TIER2 = 6000;
    private final double TOWNHOUSE_TIER2_COST = 2.35;
    private final double TOWNHOUSE_TIER3_COST = 2.70;
    @Override
    public double calculateBill() {
        double bill;
        if (getGallonsUsed() <= TOWNHOUSE_TIER1) {
            bill = TOWNHOUSE_BASE + getGallonsUsed() * (TOWNHOUSE_TIER1_COST / getGALLONS());
        }
        else if (getGallonsUsed() <= getTIER2_CUTOFF()) {
            bill = TOWNHOUSE_BASE + TOWNHOUSE_TIER1 * (TOWNHOUSE_TIER1_COST / getGALLONS())
                    + (getGallonsUsed() - TOWNHOUSE_TIER1) * (TOWNHOUSE_TIER2_COST /
                    getGALLONS());
        }
        else {
            bill = TOWNHOUSE_BASE + TOWNHOUSE_TIER1 * (TOWNHOUSE_TIER1_COST / getGALLONS())
                    + TOWNHOUSE_TIER2 * (TOWNHOUSE_TIER2_COST / getGALLONS())
                    + (getGallonsUsed() - getTIER2_CUTOFF()) * (TOWNHOUSE_TIER3_COST /
                    getGALLONS());
        }
        return bill;
    }
}
