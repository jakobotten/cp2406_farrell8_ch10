public class Horse {
    protected String name;
    protected String colour;
    protected int year;

    Horse(){}

    Horse(String name, String colour, int year) {
        this.name = name;
        this.colour = colour;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
