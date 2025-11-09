public class Transaction {
    //Fields
    private String date;
    private String type;
    private int amount;
    private String description;

    //Constructor
    public Transaction(String date, String type, int amount, String description) {
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.description = description;
    }
    
    //getters
    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public int getAmount() {
        return amount;
    }

    //toString method
    @Override
    public String toString() {
        return date + "|" + type + "|" + amount + "|" + description;
    }

}
