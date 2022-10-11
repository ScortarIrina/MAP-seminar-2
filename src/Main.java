/*
    In a box there are apples, cakes and books.
    Please display all entities which have their weight greater than 200 grams.
    In order to represent the box please use an array.
    Use Model-Repository-Controller-View to design the application architecture.
 */

import controller.Controller;
import repository.IRepository;
import repository.Repository;
import view.View;

public class Main {
    public static void main(String[] args) {
        IRepository repository = new Repository();
        Controller controller = new Controller(repository);
        View view = new View(controller);
        view.execute();
    }
}