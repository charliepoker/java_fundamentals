package chapter9;

import java.time.temporal.WeekFields;

public class WeddingCake extends Cake{

    public WeddingCake(){
        super("vanilla");
    }

    public String getTiers() {
        return tiers;
    }

    public void setTiers(String tiers) {
        this.tiers = tiers;
    }

    private String tiers;
}
