import java.util.ArrayList;
import java.util.List;

public class SimpleColleagueWithoutMediator {
    private String name;
    private List<SimpleColleagueWithoutMediator> colleagues;

    public SimpleColleagueWithoutMediator(String name) {
        this.name = name;
        this.colleagues = new ArrayList<>();
    }

    public void addColleague(SimpleColleagueWithoutMediator colleague) {
        colleagues.add(colleague);
    }

    public void sendMessage(String message) {
        System.out.println(this.name + " is sending message: " + message);
        for (SimpleColleagueWithoutMediator colleague : colleagues) {
            colleague.receiveMessage(message);
        }
    }

    public void receiveMessage(String message) {
        System.out.println(this.name + " received message: " + message);
    }

    public static void main(String[] args) {
        SimpleColleagueWithoutMediator alice = new SimpleColleagueWithoutMediator("Alice");
        SimpleColleagueWithoutMediator bob = new SimpleColleagueWithoutMediator("Bob");
        SimpleColleagueWithoutMediator charlie = new SimpleColleagueWithoutMediator("Charlie");

        alice.addColleague(bob);
        alice.addColleague(charlie);

        bob.addColleague(alice);
        bob.addColleague(charlie);

        charlie.addColleague(alice);
        charlie.addColleague(bob);

        alice.sendMessage("Hi everyone!");
        bob.sendMessage("Hello Alice!");
        charlie.sendMessage("Hey folks!");
    }
}
