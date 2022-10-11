package view;

import controller.Controller;
import model.Apple;
import model.Book;
import model.Cake;
import model.Entity;
import java.util.List;


public class View {

    Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void execute() {
        Entity cake1 = new Cake("salted caramel");
        cake1.setWeight(1000);
        controller.add(cake1);

        Entity book1 = new Book(300, "Jane Eyre");
        book1.setWeight(200);
        controller.add(book1);

        Entity cake = new Cake("vanilla");
        cake.setWeight(2000);
        controller.add(cake);

        Entity book2 = new Book(100, "The Wizard of Oz");
        book2.setWeight(700);
        controller.add(book2);

        Entity apple = new Apple("green");
        apple.setWeight(100);
        controller.add(apple);

        List<Entity> entities = controller.getEntitiesHeavierThan200g();

        System.out.println("");
        for (Entity entity: entities) {
            System.out.println(entity);
        }
        System.out.println("");
    }
}
