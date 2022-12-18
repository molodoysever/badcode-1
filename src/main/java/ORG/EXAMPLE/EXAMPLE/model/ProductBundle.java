package main.java.ORG.EXAMPLE.model;

import lombok.Setter;

@Setter
public class ProductBundle extends NotifiableProduct implements BundleInterface {
    protected int amount;

    @Override
    public int getAmountInBundle () {
        return amount;
    }

    @Override
    public String getBasicInfo () {
        return "ProductBundle{" +
                "channel='" + channel + '\'' +
                ", id=" + id +
                ", available=" + available +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", amountInBundle=" + amount +
                '}';
    }
}