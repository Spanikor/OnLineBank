package documents;

public class Card {

    private String numOfCard;
    private String dateOfIssue;
    private int pinCode;

    public Card(String numOfCard, String dateOfIssue, int pinCode) {
        this.numOfCard = numOfCard;
        this.dateOfIssue = dateOfIssue;
        this.pinCode = pinCode;
    }

    public String getNumOfCard() {
        return numOfCard;
    }

    public void setNumOfCard(String numOfCard) {
        this.numOfCard = numOfCard;
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

}
