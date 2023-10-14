package DIP;
/*
Создаем наследование от класс Engine для  двигателя на ДТ
 */
public class DieselPetrol implements Engine{
    @Override
    public void start() {
        System.out.println("Запустили дизельный двигатель");
    }
}
