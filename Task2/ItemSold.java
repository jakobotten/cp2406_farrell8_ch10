public class ItemSold {
    protected int invoice_number;
    protected String description;
    protected double price;

    ItemSold(){}

    public double getPrice() {
        return price;
    }

    public int getInvoice_number() {
        return invoice_number;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setInvoice_number(int invoice_number) {
        this.invoice_number = invoice_number;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
