public class Cat {
    private String name;
    private CatRace race;
    private int size;
    private Color color;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CatRace getRace() {
        return this.race;
    }

    public void setRace(CatRace race) {
        this.race = race;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", race='" + getRace() + "'" +
                ", size='" + getSize() + "'" +
                ", color='" + getColor() + "'" +
                "}";
    }

}