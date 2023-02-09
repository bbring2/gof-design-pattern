package builder;

public abstract class Blueprint {

    private Blueprint blueprint;

    public abstract void setCpu();
    public abstract void setRam();

    public abstract void setStorage();

    public Computer getComputer() {
        return null;
    }

    public void setBlueprint(Blueprint blueprint) {
    }

    public void makeAndGet() {
    }
}
