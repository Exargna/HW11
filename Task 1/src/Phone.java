import java.util.Scanner;

public class Phone {
    String number;
    String model;
    int weight;
    static String country;

    public static void receiveCall(String nameCaller) {
        receiveCall(nameCaller, 0);
    }

    public static void receiveCall(String nameCaller, int numberCaller) {
        System.out.println("Вам звонит абонент по имени " + nameCaller + " его номер " + (numberCaller > 0 ? numberCaller : "неизвестен"));
    }

    public Phone() {
    }
    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public void print() {
        System.out.println("\nНомер: " + number + "\nМодель: " +
                model + "\nВес: " + weight + " грамм" + "\nСтрана Изготовитель: " + Phone.country);
    }
}
