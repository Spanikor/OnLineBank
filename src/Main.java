import Documents.AccStatement;

import javax.swing.text.Document;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


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

        AccStatement accStatement = new AccStatement("Клиентская выписка", 1, "15.12.2021", 53721.50, "ВнешТоргБанк");



            System.out.println(AccStatement.titleOfAccStatement());
            System.out.println("Номер выписки " + AccStatement.numberOfAccStatement());
            System.out.println(AccStatement.dateOfAccStatement());
            System.out.println(AccStatement.quantityMoney());
            System.out.println(AccStatement.nameOfBankOffice());




    }


}
