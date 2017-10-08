public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold cup = new ItemSold();
        PetSold cat = new PetSold();

        cup.setDescription("it's a cup");
        cup.setInvoice_number(1);
        cup.setPrice(12);

        cat.setDescription("it's a cat");
        cat.setInvoice_number(2);
        cat.setPrice(13);
        cat.setHousebroken(false);
        cat.setNeutered(false);
        cat.setVaccinated(false);


        System.out.println(cat.isHousebroken()+" "+cat.isNeutered()+" "+cat.isVaccinated());
        System.out.println(cup.getPrice()+" "+cup.getInvoice_number()+" "+cup.getDescription());
        System.out.println(cat.getPrice()+" "+cat.getInvoice_number()+" "+cat.getDescription());
    }
}
