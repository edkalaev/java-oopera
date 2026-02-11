import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Renata", "Litvinova", Gender.FEMALE, 165);
        Actor actor2 = new Actor("Yuri", "Borisov", Gender.MALE, 180);
        Actor actor3 = new Actor("Andrei", "Burkovskiy", Gender.MALE, 185);





        Director director1 = new Director("Timur", "Bekmambetov", Gender.MALE, 200);
        Director director2 = new Director("Fedor", "Bondarchuk", Gender.MALE, 250);

        Person musicAuthor = new Person("Maksim", "Fadeev", Gender.MALE);
        Person choreographer = new Person("Vladimir", "Varnava", Gender.MALE);

        Show show = new Show("Kapitanskaya dochka", 120, director1, new ArrayList<>());

        Opera opera = new Opera("Sadko", 100, director2, new ArrayList<>(), musicAuthor,
                "«Садко» — опера-былина Н.А. Римского-Корсакова" +
                        " (либретто написано композитором " + "в соавторстве с В. Бельским на основе былин) " +
                "повествует о новгородском гусляре, который благодаря любви морской царевны Волховы " +
                "становится богатым купцом, но вынужден пройти через испытания подводным царством. " +
                "Опера состоит из 7 картин, раскрывающих путь от бедного гусляра до именитого гостя.", 8);

        Ballet ballet = new Ballet("Lebedinoe ozero", 150, director2, new ArrayList<>(), musicAuthor,
                "«Лебединое озеро» — классический балет П.И. Чайковского (либретто В. Бегичева и В. Гельцера)," +
                        " повествующий о принце Зигфриде, влюбившемся в королеву лебедей Одетту," +
                        " заколдованную злым гением Ротбартом. Лишь верная любовь может разрушить чары. " +
                        "Классический финал (Большой театр) — гибель влюбленных, побеждающая злые чары, или " +
                        "(в ранних редакциях) смерть Зигфрида, спасающего Одетту. ", choreographer);


        show.setActor(actor1);
        show.setActor(actor2);

        opera.setActor(actor1);
        opera.setActor(actor2);
        opera.setActor(actor3);

        ballet.setActor(actor2);
        ballet.setActor(actor3);

        System.out.println(show.listOfActors);
        System.out.println(opera.listOfActors);
        System.out.println(ballet.listOfActors);

        show.changeActor((new Actor("Dasha", "Bortich", Gender.FEMALE, 160)), actor2);
        System.out.println(show.listOfActors);

        Actor notExistActor = new Actor("Brad", "Pitt", Gender.MALE, 185);
        ballet.changeActor((new Actor("Dasha", "Bortich", Gender.FEMALE, 160)), notExistActor);

        opera.getLibrettoText();
        ballet.getLibrettoText();




    }
}
