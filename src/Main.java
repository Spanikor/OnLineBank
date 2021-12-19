import documents.AccStatement;
import documents.Card;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        int a = 1;

        BankOffice bankOffice = new BankOffice("ВнешТоргБанк", "г. Москва"); //создание экземпляра объекта класса
        // BankOffice с заполненными атрибутами. //

        Card clientCard1 = new Card("1111 1111 1111 1111", "01.01.2020", 1515); //создание экземпляра объекта класса
        // Сard с заполненными атрибутами. //

        AccStatement clientStatement1 = new AccStatement("Клиентская выписка", 0, "19/12/2021", 75633.15, bankOffice.getBankName());
        //создание экземпляра объекта класса //
        // AccStatement с заполненными атрибутами. Причем, тут атрибут имя банка взято из экземпляра объекта класса Card через геттер //

        System.out.println("Здравствуйте!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Чтобы войти в банк, нажмите Enter!");
        String ent = scanner.nextLine();         // Справка для себя: Метод nextLine() обращается к источнику данных (нашему тексту), находит там следующую строку,
        // которую он еще не считывал (в нашем случае — первую) и возвращает ее.

        System.out.println("Введите номер карты:");
        String numOfCard = scanner.nextLine();

        System.out.println("Введите дату выпуска карты (месяц/год в формате **/**:)");
        String dateOfIssue = scanner.nextLine();

        System.out.println("Введите четырехзначный pin карты:");

        int pinCode = scanner.nextInt(); // при выполнении данной строки сканнер считывает вводимые с клавиатуры цифры,затем
        // данный набор цифр (пин код) сохраняется в переменную примитивного типа int с названием scanner.

        if (pinCode == clientCard1.getPinCode()) {
            System.out.println(clientStatement1.getTitleOfAccStatement());
            System.out.println("номер выписки №" + ' ' + clientStatement1.getNumberOfAccStatement() + 1);
            System.out.println("дата выписки" + ' ' + clientStatement1.getDateOfAccStatement());
            System.out.println(clientStatement1.getQuantityMoney());
            System.out.println(bankOffice.getBankName());
            System.out.println(bankOffice.getBankAddress());
        } else {
            System.out.println("Пин код неверный.");
        }


    }


}
