public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("ФИО сотрудника — " + fullName);

        System.out.println("\nЗадание 2:");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println("\nЗадание 3:");
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullName.replace('ё', 'e'));
    }
}