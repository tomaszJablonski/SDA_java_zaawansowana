package wzorceProjektowe.wzroceStrukturalne.adapter;

//Adapter
//jest to interfejs który modyfikuje inny interfejs bo chcemymieć inny wynik
//API - jest to zespół reguł umożliwiający przesyłanie danych między aplikacjami

public class Main {
    public static void main(String[] args) {

        //Adapter

        OldAPI api = new OldAPI();
        Adapter adapter =new Adapter(api);

        System.out.println("adapter.getTemperature() = " + adapter.getTemperature());


    }
}
