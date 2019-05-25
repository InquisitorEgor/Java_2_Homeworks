package FirstHomework.Competitors;

import FirstHomework.Competitors.Competitors.*;
import FirstHomework.Competitors.Obstacles.*;

public class Main {
    public static void main(String[] args) {
        Competitor competitor []={new Cat("Honey"),new Dog("Jack"),new Human("Bonart"),new Duck("Ducky")};
        Obstacle obstacle [] ={new Cross(200),new Wall(1),new Water(1000)};

        System.out.println("-----Creating new Team-----");

        Team1 team1 =new Team1(competitor,"Chosen") ;

        System.out.println("-----Greet them------");

        team1.showResults();

        Course course = new Course(obstacle);
        System.out.println("============team goes to course============");
        course.doIt(team1);

        System.out.println("============show team Results============");
        team1.showResults();

        System.out.println("============team members finished course============");
        team1.showMembersWhoHaveFinished();

    }
}
