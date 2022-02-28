package bardzo_WAŻNE_DO_PRACY.exepction.ex1;


//wyjątki (unchecked/checked) rzucamy
//rzucamy poprzez throws

//rzucony i niebosłużony wyjątek - zabje program(dokładniej zabija wątek)
class ThrowUncheckedMain {
    public static void main(String[] args) {


        MyCustomUncheckedException myCustomUncheckedException = new MyCustomUncheckedException("można tu napisać komentarz");

        //rzucamy wyjątek
        throw myCustomUncheckedException;
    }

}

