import java.util.*;

public abstract class MenuComponent
{
    ArrayList<MenuComponent> components = new ArrayList<MenuComponent>();

    public void add (MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    
    /* 
    public void remove (MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    */
    
    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }
    
    public String getName(){
        throw new UnsupportedOperationException();
    }
    
    public String getDescription(){
        throw new UnsupportedOperationException();
    }
    
    public double getPrice(){
        throw new UnsupportedOperationException();
    }
            
    public void print(){
    }
    
    public boolean isVegetarian(){
        return false;
    }
    
    public double getTotalPrice() {
        double totalPrice = 0;
        for (MenuComponent component:components) {
            totalPrice += component.getPrice();
        }
        return totalPrice;
    }

    
}
