public class Main {
    public static void main(String[] args) {

        fish d = new fish();
        cat c = new cat("Fluffy");
        Animal a = new fish();
        Animal e = new spider();
        pet p = new cat();

        d.setName("MyFish");
        d.eat();
        System.out.println("This fish name is: " + d.getName());
        d.walk();

        c.eat();
        System.out.println("This cat's name is: " + c.getName());
        c.walk();

        ((fish) a).setName("MyFish");
        ((fish) a).eat();
        System.out.println("The fish's name is: " + ((fish) a).getName());
        ((fish) a).walk();

        ((spider) e).eat();
        ((spider) e).walk();

        ((cat) p).setName("MyCat");
        ((cat) p).eat();
        System.out.println("This cat's name is: " + ((cat) p).getName());
        ((cat) p).walk();
    }
}
