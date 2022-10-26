import java.util.ArrayList;
import java.util.Random;

//Dorin Tihon
public class Leaf implements Turner{
    private String color;
    private ArrayList<String> colors;


    public Leaf() {
        color = "Yellow";
        colors = new ArrayList<>();
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Red");
        colors.add("Orange");
    }

    public Leaf(String color, ArrayList<String> colors) {
        this.color = color;
        this.colors = colors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    @Override
    public boolean turn() {
        Random rand = new Random();

        int random = rand.nextInt(3);

            if (color.equals(colors.get(random))){
                return false;
            }
        color = colors.get(random);
            return true;
    }

    @Override
    public String toString() {
        return "Current leaf color: " + color + '\n' +
                ", possible colors: " + colors;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (this.getClass() == obj.getClass()) {
            Leaf other = (Leaf) obj;
            return color.equals(other.getColor()) &&
                    colors.equals(other.getColors());
        }
        return false;
    }

}
