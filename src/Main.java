public class Main {
    public static void main(String[] args) {
        // Singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton2.toString());
        System.out.println(singleton1.toString());
        System.out.println(singleton1 == singleton2); // Один и тот же объект

        // Builder
        Components components = new Components.Builder()
                // поэтапно создаем сложный объект
                .item1("one")
                .item2("two")
                .item3("three")
                .item4("four")
                .build();

        System.out.println(components.toString());
    }
}
