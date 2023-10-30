import java.util.ArrayList;
import java.util.Random;

public class GamblingMachine {
    private ArrayList<GamblingToyBatch> batches;
    public void Load(GamblingToyBatch batch){

        batches.add(batch);
    }

    public GamblingToyBatch Play(){
        GamblingToyBatch winToy = null;

        for (GamblingToyBatch batch: batches){
            Random rn = new Random();
            int random = rn.nextInt(100 - 1 + 1) + 1;
            if (random <= batch.prob){
                winToy = batch;
                batch.count -=1;
                if (batch.count == 0){
                    batches.remove(batch);
                }
                System.out.printf("В партии id: %d, name: %s, осталось %d игрушек.%n",batch.id, batch.count);
                break;
            }
        }
        return winToy;
    }

    public GamblingMachine(){
        batches = new ArrayList<GamblingToyBatch>();
    }

    public int countBatches(){
        return batches.size();
    }
}