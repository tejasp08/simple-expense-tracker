public class Transaction {
    //Fields
    String date;
    String type;
    int amount;
    String description;

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

    public int getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    //toString method
    @Override
    public String toString() {
        return "Transaction [date=" + date + ", type=" + type + ", amount=" + amount + ", description=" + description
                + "]";
    }

}
