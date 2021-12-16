import Documents.AccStatement;

import javax.swing.text.Document;

public class Main {


    public static void main(String[] args) {


        // Создание выписки

        AccStatement accStatement = new AccStatement(001, "15.12.2021", 53721.50, "ВнешТоргБанк");




            System.out.println(AccStatement.numberOfAccStatement());
            System.out.println(AccStatement.dateOfAccStatement());
            System.out.println(AccStatement.quantityMoney());
            System.out.println(AccStatement.nameOfBankOffice());



    }


}
