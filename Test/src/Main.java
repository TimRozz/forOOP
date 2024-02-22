import java.util.Arrays;
import java.util.List;
public class Main{
    public static void main(String[] args) {
        Dancer breakDanceDancer = new BreakDancer("Adam",15);
        Dancer boogieDanceDancer = new BoogieDancer("Chen",24);
        Dancer dancer = new Dancer("Tim",18);
        List<Dancer> discoteque = Arrays.asList(dancer,boogieDanceDancer,breakDanceDancer);
        for(Dancer d : discoteque){
            d.dance();
        }
    }
}

