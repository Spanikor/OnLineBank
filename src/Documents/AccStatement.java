package Documents;

public class AccStatement {


    private static int numberOfAccStatement;
    private static String dateOfAccStatement;
    private static double quantityMoney;
    private static String nameOfBankOffice;


    public AccStatement(int numberOfAccStatement, String dateOfAccStatement, double quantityMoney, String nameOfBankOffice) {
        this.numberOfAccStatement = numberOfAccStatement;
        this.dateOfAccStatement = dateOfAccStatement;
        this.quantityMoney = quantityMoney;
        this.nameOfBankOffice = nameOfBankOffice;
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


    public String getAccStatement (){
        String accStatement = new String();
        return accStatement;

            }


}
