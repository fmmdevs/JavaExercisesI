package devs.fmm.writingyourownclasses.associations;

public class TreasureChest {
    private final int goldDoubloonWeight;
    private final int gemstoneWeight;

    // We need to initialize both
    private TreasureChest(int goldDoubloonWeight, int gemstoneWeight) {
        if(goldDoubloonWeight<0||gemstoneWeight<0) throw new IllegalArgumentException("Weight Can't Be Negative");
        this.goldDoubloonWeight = goldDoubloonWeight;
        this.gemstoneWeight = gemstoneWeight;
    }

    // When we only have one parameter the other is 0 (because is weight, nothing = 0)
    static TreasureChest newInstanceWithGoldDoubloonWeight(int goldDoubloonWeight) {
        return new TreasureChest(goldDoubloonWeight, 0);
    }

    static TreasureChest newInstanceWithGemstoneWeight(int gemstoneWeight) {
        return new TreasureChest(0, gemstoneWeight);
    }

    static TreasureChest newInstanceWithGoldDoubloonAndGemstoneWeight(int goldDoubloonWeight, int gemstoneWeight) {
        return new TreasureChest(goldDoubloonWeight, gemstoneWeight);
    }
}
