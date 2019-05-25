package FirstHomework.Competitors.Competitors;

public class Animal implements Competitor {
    String name;
    String type;

    int maxSwimDistance;
    int maxRunDistance;
    int maxJumpDistance;
    boolean isOnDistance;

    public Animal(String name, String type, int maxSwimDistance, int maxRunDistance, int maxJumpDistance) {
        this.name = name;
        this.type = type;
        this.maxSwimDistance = maxSwimDistance;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;
        this.isOnDistance = true;
    }

    @Override
    public void swim(int distance) {
        if (distance == 0) {
            System.out.println("Type: " + type + " name: " + name + " is not able to swim");
            isOnDistance = false;
            return;
        }
        if (maxSwimDistance >= distance)
            System.out.println("Type: " + type + " name: " + name + " has swam successfully");
        else {
            System.out.println("Type: " + type + " name: " + name + " has not swam");
            isOnDistance = false;
        }
    }

    @Override
    public void run(int distance) {
        if (maxRunDistance >= distance)
            System.out.println("Type: " + type + " name: " + name + " has ran successfully");
        else {
            System.out.println("Type: " + type + " name: " + name + " has not ran");
            isOnDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (maxJumpDistance >= height)
            System.out.println("Type: " + type + " name: " + name + " has jumped successfully");
        else {
            System.out.println("Type: " + type + " name: " + name + " has not jumped");
            isOnDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return isOnDistance;
    }

    @Override
    public void showResult() {
        System.out.println("Type: " + type + " name: " + name + " is "+isOnDistance);
    }
}
