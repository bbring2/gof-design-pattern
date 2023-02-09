package builder;

public class LgGramBluePrint extends Blueprint {

    private Computer computer;

    public LgGramBluePrint() {
        computer = new Computer("default", "default", "default");
    }

    @Override
    public void setCpu() {
        computer.setCpu("i9");
    }

    @Override
    public void setRam() {
        computer.setRam("64G");
    }

    @Override
    public void setStorage() {
        computer.setStorage("1TB");
    }

}
