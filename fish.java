public class fish extends Animal implements pet {

    public fish() {
        super(0);
    }

    private String fishName;

    @Override
    public void eat() {
        System.out.println("Fish eat plants");
    }

    public void walk() {
        System.out.println("Fish has no legs");
    }

    @Override
    public String getName() {
        return fishName;
    }

    @Override
    public void setName(String name) {
        fishName = name;
    }

    @Override
    public void play() {
        System.out.println("Fish play with water");
    }
}
