package DIP;

/**
 * Убираем зависемость от нисших классов
 */
public class Car {
    public Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
}