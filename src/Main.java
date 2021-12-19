import documents.Card;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        int a = 1;

        Card clientCard1 = new Card("5300 3232 4562 0585", "15.05.2021", 1515); //создание экземпляра объекта класса Credit

        // с заполненными атрибутами. //

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
            System.out.println("Клиентская выписка");
            System.out.println("Номер выписки " + 1);
            System.out.println("15.12.2021");
            System.out.println(53721.50);
            System.out.println("ВнешТоргБанк");
        } else {
            System.out.println("Пин код неверный.");
        }


    }


}
