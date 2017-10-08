public class PetSold extends ItemSold {
    private boolean vaccinated;
    private boolean neutered;
    private boolean housebroken;


    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public void setHousebroken(boolean housebroken) {
        this.housebroken = housebroken;
    }

    public void setNeutered(boolean neutered) {
        this.neutered = neutered;
    }

    public boolean isHousebroken() {
        return housebroken;
    }

    public boolean isNeutered() {
        return neutered;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }
}
