
public class LibraryRoyaltyCalculator {

    public static void main(String[] args) {

        Author olgaRavn = new Author("Olga Ravn");

        // Trykt bog: 166 sider, 140 eksemplarer
        Title printedBook = new PrintedBook("Celestine", "SKØN", 140, 166);

        // Fysisk lydbog: 192 minutter, 140 eksemplarer
        Title audioBook = new AudioBook("Celestine", "SKØN", 140, 192);

        // E-bog: 360.000 tegn, ikke illustreret
        Title eBook = new EBook("E-bog", "FAG", 97, 50, 205, 360000, false);

        // Tilføj titlerne til forfatteren
        olgaRavn.addTitle(printedBook);
        olgaRavn.addTitle(audioBook);
        olgaRavn.addTitle(eBook);

        // Beregn og udskriv bibliotekspengene
        double royalties = olgaRavn.calculateRoyalties();

        System.out.printf("%s: %.2fkr%n", olgaRavn.getName(), royalties);
    }
}
