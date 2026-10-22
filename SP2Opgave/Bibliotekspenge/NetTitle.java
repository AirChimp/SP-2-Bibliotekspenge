
public abstract class NetTitle extends Title {

    protected int availability;
    protected int reach;
    protected int use;

    public NetTitle(String title, String literatureType, int availability, int reach, int use) {

        super(title, literatureType);
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }

    public double getPseudoCopies() {
        return reach * 5.0 + availability * 0.5;
    }

    public int getUseFactor() {
        return use;
    }
}
