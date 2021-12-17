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

    public AccStatement() {

    }


    public static int numberOfAccStatement() {
                return numberOfAccStatement;
    }

    public static String dateOfAccStatement() {
        return dateOfAccStatement;

    }

    public static double quantityMoney() {
        return quantityMoney;

    }

    public static String nameOfBankOffice() {
        return nameOfBankOffice;

    }

    public static String titleOfAccStatement() {
        return titleOfAccStatement;
    }


    public AccStatement getAccStatement (){
        AccStatement accStatement = new AccStatement();
        return accStatement;

            }


}
