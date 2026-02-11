import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void setActor(Actor actor) {
        for (Actor ac : listOfActors) {
            if(ac.equals(actor)) {
                System.out.println("Актер уже существует");
                return;
            }
        }
        listOfActors.add(actor);

    }

    public void changeActor(Actor newActor, Actor actor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).equals(actor)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Замена несуществующего актера");
    }





}
