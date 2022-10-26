//Dorin Tihon
import java.util.ArrayList;

public class Streetlight implements Turner{

    private String lightColor;

    private boolean allow;

    private ArrayList<String> colors;

    int i = 0;

    public Streetlight() {
        colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Green");
        lightColor = "No color";
        allow = false;
    }

    public Streetlight(ArrayList<String> color, String lightColor, boolean allow) {
        this.colors = color;
        this.lightColor = lightColor;
        this.allow = allow;
    }

    public String getLightColor() {
        return lightColor;
    }

    public void setLightColor(String lightColor) {
        this.lightColor = lightColor;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    public boolean isAllowed() {
        return allow;
    }

    public void setAllow(boolean allow) {
        this.allow = allow;
    }

    @Override
    public boolean turn() {

        if (colors.get(i).equals(colors.get(2))){
                lightColor = colors.get(0);
                allow = true;
                return true;
            }
            else {allow = false;}
        if(i<=2) {
            i = i + 1;
        }
            return false;
    }


    @Override
    public String toString() {
        return "Current streetlight color: " + lightColor + '\n' +
                "Is allowed to pass? " + allow + '\n' +
                ", possible colors: " + colors;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (this.getClass() == obj.getClass()) {
            Streetlight other = (Streetlight) obj;
            return lightColor.equals(other.getLightColor()) &&
                    allow == other.isAllowed() &&
                    colors == other.getColors();
        }
        return false;
    }
}
