import Documents.AccStatement;

import javax.swing.text.Document;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a=1;

        System.out.println("Здравствуйте!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Чтобы войти в банк, нажмите Enter!");
        scanner.nextLine();         // эта строка позволяет после нажатия Энтера продолжить работу кода

        System.out.println("Введите номер карты:");
        String numOfCard = scanner.next();
        scanner.nextLine();         // эта строка позволяет после нажатия Энтера продолжить работу кода

        System.out.println("Введите дату выпуска карты (месяц/год в формате **/**:)");
        String dateOfIssue = scanner.next();
        scanner.nextLine();         // эта строка позволяет после нажатия Энтера продолжить работу кода

        System.out.println("Введите четырехзначный pin карты:");
        int pinCode = scanner.nextInt();
        scanner.nextLine();         // эта строка позволяет после нажатия Энтера продолжить работу кода


        // Создание выписки

        AccStatement accStatement = new AccStatement("Клиентская выписка", 0, "15.12.2021", 53721.50, "ВнешТоргБанк");

            System.out.println(AccStatement.getTitleOfAccStatement());
            System.out.println("Номер выписки " + (AccStatement.getNumberOfAccStatement()+a));
            System.out.println(AccStatement.getDateOfAccStatement());
            System.out.println(AccStatement.getQuantityMoney());
            System.out.println(AccStatement.getNameOfBankOffice());

    }


}
