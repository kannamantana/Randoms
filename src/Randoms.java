import java.util.Iterator;
import java.util.Random;
public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;
    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        Random random = new Random();
        this.random = random;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                if (random.equals(null)) {
                    return false;
                } else
                    return true;
            }
            @Override
            public Integer next() {
                int diff = max - min;
                return random.nextInt(diff + 1) + min;
            }
        };
    }
}