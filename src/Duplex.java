public class Duplex extends Customer{
    private final double DUPLEX_BASE = 15.51;
    private final int DUPLEX_TIER1 = 9000;
    private final double DUPLEX_TIER1_COST = 1.97;
    private final int DUPLEX_TIER2 = 4000;
    private final double DUPLEX_TIER2_COST = 2.26;
    private final double DUPLEX_TIER3_COST = 2.60;

    public void calculateBill() {{
            if (getGallonsUsed() <= DUPLEX_TIER1) {
                bill = DUPLEX_BASE + getGallonsUsed() * (DUPLEX_TIER1_COST / getGALLONS());
            } else if (getGallonsUsed() <= getTIER2_CUTOFF()) {
                bill = DUPLEX_BASE + DUPLEX_TIER1 * (DUPLEX_TIER1_COST / getGALLONS())
                        + (getGallonsUsed() - DUPLEX_TIER1) * (DUPLEX_TIER2_COST /
                        getGALLONS());
            } else {
                bill = DUPLEX_BASE + DUPLEX_TIER1 * (DUPLEX_TIER1_COST / getGALLONS())
                        + DUPLEX_TIER2 * (DUPLEX_TIER2_COST / getGALLONS())
                        + (getGallonsUsed() - getTIER2_CUTOFF()) * (DUPLEX_TIER3_COST /
                        getGALLONS());
            }
        }
    }
}
