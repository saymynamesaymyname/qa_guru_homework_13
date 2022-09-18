import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cat catRyzhik = new Cat("Ryzhik", 3, List.of("Red"));
        catRyzhik.addColor("White");
        catRyzhik.printCatColors();

        Cat catFrosya = new Cat("Frosya", 5, List.of("Grey"));
        catFrosya.addColor("Grey");
        catFrosya.hasColor("Black");
        catFrosya.printCatColors();

        CatCafe catCafe = new CatCafe("Kitties", "Lenina,1");
        catCafe.addCat(catRyzhik);
        catCafe.findCatInCafe(catFrosya);

        CatsMedication medication = new CatsMedication(catRyzhik, LocalDate.parse("2022-09-09"));
        medication.giveMedication("medication1");
        medication.giveMedication("medication2");
        medication.printInfoAboutMedication();

        CatPatrons patron = new CatPatrons("Alex");
        patron.getBelovedCat();
        patron.addCat(catFrosya);
        patron.addBelovedCat(catRyzhik);
        patron.getBelovedCat();

    }
}
