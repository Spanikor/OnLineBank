package Documents;

public class AccStatement {


    private int numberOfAccStatement;
    private String dateOfAccStatement;
    private double quantityMoney;
    private String nameOfBankOffice;


    public AccStatement(int numberOfAccStatement, String dateOfAccStatement, double quantityMoney, String nameOfBankOffice) {
        this.numberOfAccStatement = numberOfAccStatement;
        this.dateOfAccStatement = dateOfAccStatement;
        this.quantityMoney = quantityMoney;
        this.nameOfBankOffice = nameOfBankOffice;
    }


    public AccStatement() {

    }

    public String getAccStatement (){
        String accStatement = new String();
        return accStatement;

            }


}
