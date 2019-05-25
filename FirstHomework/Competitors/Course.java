package FirstHomework.Competitors;


import FirstHomework.Competitors.Competitors.*;
import FirstHomework.Competitors.Obstacles.*;

public class Course {

    Obstacle obstacle[]= new Obstacle[4];

    public Course(Obstacle... obstacle) {
        this.obstacle = obstacle;
    }

    public void doIt(Team1 team){
        Competitor[] teamMembers = team.getMembers();
        if(teamMembers.length > 0){
            for (Competitor c: teamMembers){
                for (Obstacle o: obstacle){
                    o.doIt(c);
                    if (!c.isOnDistance()) break;
                }
            }
        } else {
            System.out.println("There are no members in the team!");
        }
    }
    }

