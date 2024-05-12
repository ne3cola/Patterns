public class Singleton {

    // Singleton Синглтон - это патерн (шаблон) проектирования, который позволяет:
    //          - Дать гарантию что будет создан только один объект данного класса
    //         - Представляет глобальный доступ к экземпляру данного класса
    //     ** - с помощью ключевого слова synchronized может работать в многопоточной среде

    private static Singleton instance;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
