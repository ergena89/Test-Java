import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        System.out.printf("Привет!%n");
        GamblingMachine gm = new GamblingMachine();
        GamblingToyBatch batch = null;

        try {
            batch = new GamblingToyBatch(2, "кукла", 1, 80);

        }
        catch (Exception ex){
            System.out.printf("Исключение при создании партии игрушек: %s.%n", ex);
            return;
        }

        gm.Load(batch);

        System.out.printf("В автомат загружено партий игрушек: %d.%n", gm.countBatches());

        System.out.printf("Внимание, начинается розыгрыш!%n");

        GamblingToyBatch winToy = gm.Play();
        if (winToy == null) {
            System.out.printf("Вы не выиграли!");
        }
        else {
            String text = String.format("Вы выиграли игрушку '%s' из партии %d", winToy.name, winToy.id);
            System.out.printf(text);
            try(FileWriter writer = new FileWriter("Выигранные игрушки.txt", true))
            {
                // запись всей строки
                writer.write(text);
                // запись по символам
                writer.append('\n');
                writer.flush();
            }
        catch(IOException ex){
            System.out.printf(ex.getMessage());
            return;
        }
        }
    }

}
