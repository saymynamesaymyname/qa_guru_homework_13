import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CatCafe {
    private String name;
    private Map<UUID, Cat> cats = new HashMap<>();
    private String address;

    public CatCafe(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void findCatInCafe(Cat findCat) {
        for (UUID key : cats.keySet()) {
            Cat value = cats.get(key);
            if (value.equals(findCat)) {
                System.out.println(value.getName());
                System.out.println("Cat " + findCat.getName() + " found!");
                return;
            }
        }
        System.out.println("Cat " + findCat.getName() + "  not found!");
    }

    public void takeCatFromCafe(Cat findCat) {
        for (UUID key : cats.keySet()) {
            Cat value = cats.get(key);
            if (value.equals(findCat)) ;
            cats.remove(key);
        }

    }

    public void addCat(Cat catToAdd) {
        cats.put(UUID.randomUUID(), catToAdd);
    }


}
