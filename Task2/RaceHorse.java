public class RaceHorse extends Horse{

    private int races;
    RaceHorse(String name, String colour, int year, int races){
        super.name = name;
        super.colour = colour;
        super.year = year;
        this.races =  races;
    }

    public int getRaces() {
        return races;
    }

    public void setRaces(int races) {
        this.races = races;
    }
}
