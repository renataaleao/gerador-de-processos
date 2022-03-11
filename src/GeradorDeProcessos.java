import java.util.Random;

public class GeradorDeProcessos {
    
    private static final Random RANDOM = new Random();
    
    public static Process build() {
    	Integer escalonar = RANDOM.nextInt((50 - 10) + 1) + 10;
    	return new Process(System.currentTimeMillis(), escalonar);
    }
}
