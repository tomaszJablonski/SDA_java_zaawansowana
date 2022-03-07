package AllExercise.ZadaniaInterfejsyAllDone.ZadanieInterfejsy_Zadanie5;

public class Computer {

    private boolean powerOn;
    //po to tworzymy interfejsy zeby z nich korzystać!!!!
    private Processor processor;
    private MainBoard mainBoard;

    public Computer(Processor processor, MainBoard mainBoard) {
        this.processor = processor;
        this.mainBoard = mainBoard;
    }



     private boolean ifPartsWorks(){
        return processor.ifIntel() == mainBoard.ifIntelworks();
        }



        public boolean turnOn () {
            if (ifPartsWorks() == true)
                return powerOn=true;
            return powerOn=false;
        }

    public boolean isPowerOn() {
        return turnOn();
    }
}

