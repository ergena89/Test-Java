public class GamblingToyBatch {
    int id;
    String name;
    int count;
    int prob;

    public GamblingToyBatch(int id, String name, int count, int prob)throws Exception {
        this.id  = id;
        this.name  = name;
        if (count <= 0)
        {
            throw new Exception("Количество должно быть больше 0");
        }
        this.count  = count;
        if (!(prob > 0 && prob <= 100)) {
            throw new Exception("Вероятность выиграть игрушку должна быть от 1 от 100%");
        }
        this.prob  = prob;
    }
}
