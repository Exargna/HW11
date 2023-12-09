public class Main {
    public static void main(String[] args) {
        Phone.receiveCall("Люцифер");
        Phone.receiveCall("Адам", 1);
        Phone.receiveCall("Ева", 2);

        Phone.country = "Китай";

        Phone xiaomi = new Phone("13", "Xiaomi 13", 190);
        Phone apple = new Phone("14", "Iphone 14 pro max", 230);
        Phone samsung = new Phone("23", "Galaxy S23", 185);

        xiaomi.print();
        apple.print();
        samsung.print();

    }
}
