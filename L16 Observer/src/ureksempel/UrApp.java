package ureksempel;

public class UrApp {
    void main() {
        UrEngine ur = new UrEngine();
        AnalogtUrDisplay analog = new AnalogtUrDisplay();
        DigitaltUrDisplay digital = new DigitaltUrDisplay();
        ur.addUrObserver(analog);
        ur.addUrObserver(digital);

//        // pull generalized
//        analog.setUrEngine(ur);
//        digital.setUrEngine(ur);

        for (int i = 0; i < 10; i++) {
            ur.tiktak();
            IO.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // do nothing
            }
        }
    }
}
