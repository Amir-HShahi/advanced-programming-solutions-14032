public class Color {
    final String hexCode;
    public Color(String hexCode) {
        this.hexCode = hexCode;
    }


    public String getHexCode() {
        return this.hexCode;
    }

    @Override
    public String toString() {
        return "{" +
            " hexCode='" + getHexCode() + "'" +
            "}";
    }

}
