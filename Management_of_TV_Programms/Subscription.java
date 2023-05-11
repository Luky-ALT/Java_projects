import java.io.Serializable;

public class Subscription implements Serializable {

    private int installFee;     // fixed fee:   10$/ TV
    private int nbTV;
    private Subscriber subscriber;      // class Subscriber + object Subscriber
    private SubscriptionCycle cycle;    //class SubscriptionCycle + object Cycle
    private String datee;

    // Total fee
    private int totalFee;

    public Subscription(int nbTV, Subscriber subscriber, SubscriptionCycle cycle, String datee) {   //constructor
        this.nbTV = nbTV;
        this.subscriber = subscriber;
        this.cycle = cycle;
        this.datee = datee;

        this.installFee = nbTV * 10;
    }

    public int getNbTV() {
        return nbTV;
    }

    public void setNbTV(int nbTV) {
        this.nbTV = nbTV;
    }

    public Subscriber getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    public SubscriptionCycle getCycle() {
        return cycle;
    }

    public void setCycle(SubscriptionCycle cycle) {
        this.cycle = cycle;
    }

    public String getDatee() {
        return datee;
    }

    public void setDatee(String datee) {
        this.datee = datee;
    }

    public int getTotalFee() {
        totalFee = installFee + 5;
        return totalFee;
    }


    @Override                                   // to string
    public String toString() {
        return "Subscription{" +
                "installFee=" + installFee +
                ", nbTV=" + nbTV +
                ", subscriber=" + subscriber +
                ", today=" + datee+
                ", cycle=" + cycle +
                '}';
    }




}
