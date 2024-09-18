package _2024_09_13.world;

public class World {
    public World(String name) {
        System.out.println("«Сотворение мира X»." + name);
    }

    public void civilization(){
        System.out.println("«Восход цивилизаций».");
    }
    public void init(){
        System.out.println("«Заселение мира разными существами»,");
    }
    public void destroy(){
        System.out.println("«Конец Света»");
    }
}
