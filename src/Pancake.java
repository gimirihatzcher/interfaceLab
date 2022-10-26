//Dorin Tihon
public class Pancake implements Turner{
    private boolean isFlipped;

    public Pancake() {
        isFlipped = false;
    }

    public Pancake(boolean isFlipped) {
        this.isFlipped = isFlipped;
    }

    public boolean getIsFlipped() {
        return isFlipped;
    }

    public void setFlipped(boolean flipped) {
        isFlipped = flipped;
    }

    @Override
    public boolean turn() {
        if (isFlipped == false ){
            isFlipped = true;
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        return "Pancake is flipped: " + isFlipped + '\n';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (this.getClass() == obj.getClass()) {
            Pancake other = (Pancake) obj;
            return isFlipped == other.getIsFlipped();
        }
        return false;
    }
}
