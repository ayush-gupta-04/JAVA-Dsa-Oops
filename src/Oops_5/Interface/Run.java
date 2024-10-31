package Oops_5.Interface;

public class Run {
    public static void main(String[] args) {
//        Car c = new Car();
//        c.start();
//        c.acc();
//        c.stop();
//        c.brake();

        Media e = new Car();
        e.start();


        NewCar audi = new NewCar();

        audi.startCar();
        audi.startMusic();
        audi.brake();



        audi.changeEngine(new ElectricEngine());
        audi.changeMedia(new MXplayer());
        audi.changeBrake(new DiscBrake());

        audi.startCar();
        audi.startMusic();
        audi.brake();

    }
}
