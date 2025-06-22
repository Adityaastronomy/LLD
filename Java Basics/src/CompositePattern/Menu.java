package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Menu implements UIComponent {
    // Menu ke andar bahut sare part ho sakte hain
    // iske andar k saare parts ko children keh sakte hain
    List< UIComponent > children = new ArrayList<>();
    @Override
    public void draw() {
        for( UIComponent cmp : children )
        {
            cmp.draw();
        }
    }
    @Override
    public void add(UIComponent component) {
        children.add( component );
    }
    @Override
    public void remove(UIComponent component) {
        children.remove(component);
    }
}
