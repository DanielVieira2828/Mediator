package comPadrao;

public class ConcreteColleague extends Colleague {
    private String name;

    public ConcreteColleague(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    public void sendMessage(String message) {
        System.out.println(this.name + " is sending message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + " received message: " + message);
    }
}