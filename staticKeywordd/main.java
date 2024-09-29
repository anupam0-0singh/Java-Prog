package staticKeywordd;

public class main {
    public static void main(String args[]){
        Human Anupam = new Human(22, "Anupam", 150000, false);
        Human Rahul = new Human(29, "Rahul", 150000, true);
        Human Rakesh = new Human(29, "Rahul", 150000, true);
        
        System.out.println(Anupam.name);
        System.out.println(Human.population);
    }
}
