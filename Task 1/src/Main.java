public class Main {
    public static void main(String[] args) {
        Phone.receiveCall("Люцифер");
        Phone.receiveCall("Адам", 1);
        Phone.receiveCall("Ева", 2);
        Phone.country = "Китай";
        Phone xiaomi = new Phone("13", "Xiaomi 13", 190);
        System.out.println("\nНомер: " + xiaomi.number + "\nМодель: " +
                xiaomi.model + "\nВес: " + xiaomi.weight + " грамм" + "\nСтрана Изготовитель: " + Phone.country);
        Phone apple = new Phone("14", "Iphone 14 pro max", 230);
        System.out.println("\nНомер: " + apple.number + "\nМодель: " +
                apple.model + "\nВес: " + apple.weight + " грамм" + "\nСтрана Изготовитель: " + Phone.country);
        Phone samsung = new Phone("23", "Galaxy S23", 185);
        System.out.println("\nНомер: " + samsung.number + "\nМодель: " +
                samsung.model + "\nВес: " + samsung.weight + " грамм" + "\nСтрана Изготовитель: " + Phone.country);

    }
}
