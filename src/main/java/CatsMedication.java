import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CatsMedication {
    private LocalDate date;
    private Cat cat;
    private List<String> medicationList = new ArrayList();

    public CatsMedication(Cat cat, LocalDate date) {
        this.cat = cat;
        this.date = date;
    }

    public void giveMedication(String medication) {
        medicationList.add(medication);
    }

    public void printInfoAboutMedication() {
        System.out.println("On " + date.toString());
        System.out.println("Cat " + cat.getName() + " got medications");
        if (medicationList.isEmpty())
            System.out.println("No medication");
        else {
            for (int i = 0; i < medicationList.size(); i++) {
                System.out.println(medicationList.get(0));
            }
        }
    }
}
