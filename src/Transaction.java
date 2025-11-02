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
    public String getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    //toString method
    @Override
    public String toString() {
        return "Date: " + date + ", Type: " + type + ", Amount: " + amount + 
        ", Description: " + description;
    }

}
