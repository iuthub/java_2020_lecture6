package invoice;

import shared.Payable;

public class Invoice implements Payable {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // constructor
    public Invoice(String part, String description, int count, double price){
        setPartNumber(part);
        setPartDescription(description);
        setQuantity(count);
        setPricePerItem(price);
    }
    // SETTERS
    public final void setPartNumber(String part){
        this.partNumber = part;
    }
    public final void setPartDescription(String description){
        this.partDescription = description;
    }
    public final void setQuantity(int count){
        if(count >= 0)
            this.quantity = count;
        else
            throw new IllegalArgumentException(
                    "Quantity must be >= 0");
    }
    public final void setPricePerItem(double price){
        if(price >= 0)
            this.pricePerItem = price;
        else
            throw new IllegalArgumentException(
                    "Price per iten must be >= 0.0f");
    }
    // GETTERS
    public final String getPartNumber(){
        return this.partNumber;
    }
    public final String getPartDescription(){
        return this.partDescription;
    }
    public final int getQuantity(){
        return this.quantity;
    }
    public final double getPricePerItem(){
        return this.pricePerItem;
    }
    // return String representation of invoice object
    @Override
    public String toString(){
        return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f",
                "invoice", "part number", getPartNumber(), getPartDescription(),
                "quantity", getQuantity(), "price per item", getPricePerItem());
    }


    @Override
    public double getPayableAmount() {
        return getQuantity()*getPricePerItem();
    }

}
