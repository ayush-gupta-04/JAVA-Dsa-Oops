package Oops_5.Interface;

public class NewCar{

    private Engine engine;
    private Brake brake;
    private Media media;


    public NewCar(){
        this.engine = new PowerEngine();
        this.media = new Radio();
        this.brake = new PowerBrake();

    }
    public NewCar(Engine engine,Media music,Brake brake){
        this.engine = engine;
        this.media = music;
        this.brake = brake;

    }



    //for engine
    public void startCar(){
        engine.start();
    }

    public void stopCar(){
        engine.stop();
    }

    public void accCar(){
        engine.acc();
    }




    //for media player
    public void startMusic(){
        media.start();
    }

    public void stopMusic(){
        media.stop();
    }





    //for brake
    public void brake(){
        brake.brake();
    }




    //to change engine, media ,player.
    public void changeEngine(Engine engine){
        this.engine = engine;
    }

    public void changeMedia(Media media){
        this.media = media;
    }

    public void changeBrake(Brake brake){
        this.brake = brake;
    }


}
