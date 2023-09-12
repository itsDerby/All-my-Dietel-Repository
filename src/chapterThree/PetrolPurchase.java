package chapterThree;

public class PetrolPurchase {
    private String stationLocation;
    private int quantityPurchase;
    private double pricePerLiter;
    private double percentageDiscount;

    public PetrolPurchase (String stationLocation, int quantityPurchase , double pricePerLiter, double percentageDiscount){
        this.stationLocation = stationLocation;
        this.quantityPurchase = quantityPurchase;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = percentageDiscount;

    }
    public void setStationLocation(String stationLocation){
        this.stationLocation = stationLocation;
    }
    public String getStationLocation(){
        return stationLocation;
    }
    public void setQuantityPurchase(int quantityPurchase){
        this.quantityPurchase = quantityPurchase;
    }
    public int getQuantityPurchase(){
        return quantityPurchase;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public double getPricePerLiter(){
        return pricePerLiter;
    }
    public double getPurchaseAmount(){
        double amount  = pricePerLiter * quantityPurchase - percentageDiscount;
        return amount;
    }
}
