import java.util.LinkedList;
import java.util.List;

public class CatPatrons {

    private LinkedList<Cat> listOfPatronageCats = new LinkedList<>();
    private String name;
    private patronStatus status;

    public CatPatrons(String name) {
        this.name = name;
        this.status = patronStatus.Silver;
    }

    public void  addCat (Cat catToAdd) {
        listOfPatronageCats.add(catToAdd);
        status = getStatus();
        }

    public void addBelovedCat (Cat catToAdd){
        listOfPatronageCats.addFirst(catToAdd);
        status = getStatus();
    }

    public void  getBelovedCat(){
        if(!listOfPatronageCats.isEmpty())
            System.out.println(String.format("Beloved cat for %s is %s", name, listOfPatronageCats.get(0).getName()));
        else
            System.out.println("Can't find beloved cat for " + name);
    }

    private  patronStatus getStatus(){
        int size = listOfPatronageCats.size();
        if (size<2)
            return patronStatus.Silver;
        else
            return  (size<5) ? patronStatus.Gold : patronStatus.Platinum;
    }


    enum patronStatus {
        Silver,
        Gold,
        Platinum
    }

}
