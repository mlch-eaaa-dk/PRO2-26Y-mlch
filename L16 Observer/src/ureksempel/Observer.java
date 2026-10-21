package ureksempel;

public interface Observer {
         void update(UrEngine ur); // pull
//     void update(int tid); // push
//    void update(); // pull generalized (displays have a link to UrEngine)
}
