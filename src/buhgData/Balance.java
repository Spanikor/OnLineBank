package buhgData;

import documents.AccStatement;

public class Balance extends AccStatement {

    private double cardBalance;

    public Balance(String titleOfAccStatement, int numberOfAccStatement, String dateOfAccStatement, String nameOfBankOffice, double cardBalance) {
        super(titleOfAccStatement, numberOfAccStatement, dateOfAccStatement, nameOfBankOffice);
        this.cardBalance = cardBalance;
    }

    public double getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(double cardBalance) {
        this.cardBalance = cardBalance;
    }
}
