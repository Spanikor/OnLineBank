public class Card {

    private static String numOfCard;
    private static String dateOfIssue;
    private static int pinCode;

    public Card(String numOfCard, String dateOfIssue, int pinCode) {
        this.numOfCard = numOfCard;
        this.dateOfIssue = dateOfIssue;
        this.pinCode = pinCode;

    }

    public static String getNumOfCard() {
        return numOfCard;
    }

    public static String getDateOfIssue() {
        return dateOfIssue;
    }

    public static int getPinCode() {
        return pinCode;
    }

    //создание карты клиента

    Card clientCard1 = new Card("5300 3232 4562 0585", "15.05.2021", 1515);


}
