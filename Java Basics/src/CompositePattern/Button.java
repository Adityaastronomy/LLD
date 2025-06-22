package CompositePattern;

public class Button implements UIComponent {
    @Override
    public void draw() {
        System.out.println("Drawing Button");
        
    }
    @Override
    public void add(UIComponent component) {
        System.out.println("Adding Button");
    }
    @Override
    public void remove(UIComponent component) {
        System.out.println("Removing Button ");
    }

}
