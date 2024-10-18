package comPadrao;

public class MediatorDemo {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague alice = new ConcreteColleague(mediator, "Alice");
        ConcreteColleague bob = new ConcreteColleague(mediator, "Bob");
        ConcreteColleague charlie = new ConcreteColleague(mediator, "Charlie");

        mediator.addColleague(alice);
        mediator.addColleague(bob);
        mediator.addColleague(charlie);

        alice.sendMessage("Hi everyone!");
        bob.sendMessage("Hello Alice!");
        charlie.sendMessage("Hey folks!");
    }
}