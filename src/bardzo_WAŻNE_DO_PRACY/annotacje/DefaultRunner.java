package bardzo_WAŻNE_DO_PRACY.annotacje;


//jak wykorzystywać bardzo_WAŻNE_DO_PRACY.adnotacje?
//1. tylko dla ludzi (komputer je pomija)
//2. dla kompilatora(@FunctionalInterface,@Overwrite,@Deprecated )<-
// nie wpływają na działanie programy
//3. Przez JVM <- wpływajaą na działanie programu(@Entity,@Autowired)
@NotUsed(message = "this class wil be removed")
public class DefaultRunner implements Runner{
    //@NotUsed(message = "this field will be moved",forRemoval = false)
    private String field;
    //gdzie mogą być bardzo_WAŻNE_DO_PRACY.adnotacje?
    //Nad klasą/interfejsem
    //nad metodą
    //nad polem klasy
    //nad argumentem
    //nad inną adnotacją

    @Override // <-nadpisuje metodę z rodzica
    public void run() {

    }
}