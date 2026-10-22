public class EAudioBook extends NetTitle implements IAudioBook {

    private int durationInMinutes;

    public EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationInMinutes) {

        super(title, literatureType, availability, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public double calculatePoints() {
        double calculatedPages = durationInMinutes / 2.0;

        return calculatedPages * convertLiteratureType() * (getPseudoCopies() + getUseFactor());
    }
}
