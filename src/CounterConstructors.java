public class CounterConstructors {

    private int startValue;

    public Counter() {
        startValue = 0;
    }
    
    public Counter(int strtValue) {
        startValue = strtValue;
    }

    public int value() {
        return startValue;
    }

    public void decrease(int dec) {
            startValue -= dec;
    }

    public void decrease() {
        startValue -= 1;
    }

    public void increase(int inc) {
            startValue += inc;
    }
    
    public void increase() {
        startValue += 1;
    }
}