package DIP;
/*
Создаем наследование от класс Engine для  двигателя на Аи
 */
public class PetrolEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Бензиновый двигатель запущен");
    }
}
