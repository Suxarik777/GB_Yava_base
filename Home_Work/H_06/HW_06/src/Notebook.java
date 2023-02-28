public class Notebook {
    String name;
    String ram;
    String hD;
    String oS;
    String colour;
    int price;

    Notebook(String name, String ram, String hD, String oS, String colour, int price){
        this.name = name;
        this.ram = ram;
        this.hD = hD;
        this.oS = oS;
        this.colour = colour;
        this.price = price;
    }

    public String getName() {return name;}
    public String getRam() {return ram;}
    public String getHD() {return hD;}
    public String getOS() {return oS;}
    public String getColour() {return colour;}


    @Override
    public String toString() {
        return String.format("| %s | %s | %s | %s | %s | %d |\n", name, ram, hD, oS, colour, price);
    }
}

