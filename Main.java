import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        System.out.printf("Привет!");
        GamblingMachine gm = new GamblingMachine();

        GamblingToyBatch batch = new GamblingToyBatch();
        batch.id = 0;
        batch.name = "кукла";
        batch.count = 10;
        batch.prob = 10;

        gm.Load(batch);

        System.out.printf("В автомат загружено партий игрушек: %d.%n", gm.countBatches());

        System.out.printf("Внимание, начинается розыгрыш!");
        GamblingToyBatch winToy = gm.Play();
        if (winToy = null) {
            System.out.printf("Вы не выиграли!");
        }
        else {
            System.out.printf("Вы выиграли игрушку '%s' из партии '%d', winToy.name, winToy.id");
        }
    }

}
