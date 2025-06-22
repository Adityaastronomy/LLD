package AdapterPattern;

public class Main {
    public static void main(String[] args) {
        HotAirBallon hotAirBallon = new HotAirBallon();
        Adapter adapter = new Adapter( hotAirBallon );
        adapter.start();
    } 
}
