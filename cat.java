public class cat extends Animal implements pet {
    private String catName;

    public cat() {
        this("");
    }

    public cat(String catName) {
        super(4);
        this.catName = catName;
    }


    @Override
    public void eat() {
        System.out.println("Cat eat meats");
    }

    @Override
    public String getName() {
        return catName;
    }

    @Override
    public void setName(String name) {
        catName = name;
    }

    @Override
    public void play() {
        System.out.println("Cat play with ball");
    }
}
