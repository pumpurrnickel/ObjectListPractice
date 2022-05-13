public class Counter {
    public static void main(String[] args) throws Exception {
        
        Counter miku = new Counter();
        Counter gumi = new Counter(50);
        miku.increase();
        gumi.increase(30);
        System.out.println(miku.value());
        System.out.println(miku.value());
        miku.decrease();
        gumi.decrease(25);
        System.out.println(miku.value());
        System.out.println(miku.value());
    }
}