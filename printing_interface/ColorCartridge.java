package printing_interface;


public class ColorCartridge implements ICartridge{

    @Override
    public String toString(){
        return "Color!";
    }

    public String getFillPercentage(){
        return "80%";
    }
}
