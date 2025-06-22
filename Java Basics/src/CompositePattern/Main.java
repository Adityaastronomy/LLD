package CompositePattern;

public class Main {
    public static void main(String[] args) {
        UIComponent uiComponent = new Menu();
        Button btn = new Button();
        uiComponent.add( btn );
        uiComponent.add( new Button() );
        uiComponent.add( new Button() );
        uiComponent.draw();
        uiComponent.remove(btn);
    }

    
}
