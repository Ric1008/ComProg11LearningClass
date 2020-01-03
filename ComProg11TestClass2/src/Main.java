import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
Car toyota= new Car("toyota", "red", 200);

        Car honda= new Car();

        System.out.println(toyota.getCurrentSpeed());
        toyota.speedUp();
        System.out.println(toyota.getCurrentSpeed());
        toyota.slowdown();
        toyota.slowdown();
        System.out.println(toyota.getCurrentSpeed());
        ArrayList<Car>cars=new ArrayList<>();
        cars.add(toyota);
                cars.add(new Car());
                for(int i=0; i<100;i++){
cars.add(new Car());
                }
                for(int i=0; i<cars.size();i++){
                    System.out.println(cars.get(i).getIdNum());
                }
        for(int i=0; i<cars.size();i++){
            cars.get(i).setCurrentSpeed((int)(Math.random()*100));
            System.out.println(cars.get(i).getCurrentSpeed());
        }
        System.out.println(toyota);
        toyota.setCurrentSpeed(25);
        honda.setCurrentSpeed(20);
        System.out.println(honda.equals(toyota));
    }
}
