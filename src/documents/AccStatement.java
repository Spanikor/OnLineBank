package documents;

public class AccStatement {

    private String titleOfAccStatement;
    private int numberOfAccStatement;
    private String dateOfAccStatement;
    private String nameOfBankOffice;

    public AccStatement(String titleOfAccStatement, int numberOfAccStatement, String dateOfAccStatement, String nameOfBankOffice) {
        this.titleOfAccStatement = titleOfAccStatement;
        this.numberOfAccStatement = numberOfAccStatement;
        this.dateOfAccStatement = dateOfAccStatement;
        this.nameOfBankOffice = nameOfBankOffice;
    }

    public String getTitleOfAccStatement() {
        return titleOfAccStatement;
    }

    public int getNumberOfAccStatement() {
        return numberOfAccStatement;
    }


    public String getDateOfAccStatement() {
        return dateOfAccStatement;
    }


}
