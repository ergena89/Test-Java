import java.util.ArrayList;

public class GamblingMachine {
    private ArrayList<GamblingToyBatch> batches;
    public void Load(GamblingToyBatch batch){
        batches.add(batch);
    }

    public GamblingToyBatch play(){
        return winToy;

    }

    public GamblingMachine(){
        batches = new ArrayList<GamblingToyBatch>();
    }

    public int countBatches(){
        return batches.size();
    }
}