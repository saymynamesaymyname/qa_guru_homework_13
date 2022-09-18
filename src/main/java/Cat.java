import java.util.*;

public class Cat {
    private String name;
    private int age;
    private Set<String> colors = new HashSet<>();

    public Cat(String name, int age, List<String> colors) {
        this.name = name;
        this.age = age;
        this.colors.addAll(colors);
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printCatColors() {
        System.out.println(name + " has colors");
        Iterator<String> itr = colors.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public void addColor(String color) {
        colors.add(color);
    }

    public void hasColor(String searchColor) {
     String message = colors.contains(searchColor)? "%s has color %s" : "%s has no color %s";
          System.out.println(String.format(message, name, searchColor));

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && name.equals(cat.name) && colors.size()==cat.colors.size()
                && colors.containsAll(cat.colors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, colors);
    }
}
