package Documents;

public class AccStatement {

    private static String titleOfAccStatement;
    private static int numberOfAccStatement;
    private static String dateOfAccStatement;
    private static double quantityMoney;
    private static String nameOfBankOffice;

    public AccStatement(String titleOfAccStatement, int numberOfAccStatement, String dateOfAccStatement, double quantityMoney, String nameOfBankOffice) {
        this.titleOfAccStatement = titleOfAccStatement;
        this.numberOfAccStatement = numberOfAccStatement;
        this.dateOfAccStatement = dateOfAccStatement;
        this.quantityMoney = quantityMoney;
        this.nameOfBankOffice = nameOfBankOffice;
    }

    public static String getTitleOfAccStatement() {
        return titleOfAccStatement;
    }

    public static void setTitleOfAccStatement(String titleOfAccStatement) {
        AccStatement.titleOfAccStatement = titleOfAccStatement;
    }

    public static int getNumberOfAccStatement() {
        return numberOfAccStatement;
    }

    public static void setNumberOfAccStatement(int numberOfAccStatement) {
        AccStatement.numberOfAccStatement = numberOfAccStatement;
    }

    public static String getDateOfAccStatement() {
        return dateOfAccStatement;
    }

    public static void setDateOfAccStatement(String dateOfAccStatement) {
        AccStatement.dateOfAccStatement = dateOfAccStatement;
    }

    public static double getQuantityMoney() {
        return quantityMoney;
    }

    public static void setQuantityMoney(double quantityMoney) {
        AccStatement.quantityMoney = quantityMoney;
    }

    public static String getNameOfBankOffice() {
        return nameOfBankOffice;
    }

    public static void setNameOfBankOffice(String nameOfBankOffice) {
        AccStatement.nameOfBankOffice = nameOfBankOffice;
    }



}
