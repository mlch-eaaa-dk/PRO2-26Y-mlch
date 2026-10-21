package ureksempel;

// Observer
public class DigitaltUrDisplay implements Observer {

    @Override
    public void update(UrEngine ur) { // pull
        int tid = ur.getTid();
        IO.println("Digitalt " + tid);
    }

//    @Override
//    public void update(int tid) { // push
//        IO.println("Digitalt " + tid);
//    }

//    private UrEngine ur; // generalized pull
//
//    public void setUrEngine(UrEngine ur) {
//        this.ur = ur;
//    }
//
//    @Override
//    public void update() { // pull generalized
//        int tid = ur.getTid();
//        IO.println("Digitalt " + tid);
//    }
}
