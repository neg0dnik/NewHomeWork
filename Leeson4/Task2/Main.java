package Leeson4.Task2;

public class Main {
    public static void main(String[] args){
        System.out.println("Создаем справочник");
        Phonebook phonebook = new Phonebook();
        System.out.println("-----------------");

        System.out.println("Наполняем справочник");
        phonebook.add("Петров", "1231334");
        phonebook.add("Сидоров", "1231355");
        phonebook.add("Иванов", "1335671");
        phonebook.add("Иванов", "2553415");
        phonebook.add("Сидоров", "22334422");
        System.out.println("-----------------");

        System.out.println("Получаем номера");
        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
        System.out.println("Сидоров");
        System.out.println(phonebook.get("Сидоров"));
        System.out.println("-----------------");

        System.out.println("Отсутствие записи");
        System.out.println("Кузнецов");
        System.out.println(phonebook.get("Кузнецов"));
        System.out.println("-----------------");

        System.out.println("Пробуем записать существующий номер");
        phonebook.add("Петров", "1231334");
        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));
    }
}
