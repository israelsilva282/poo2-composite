
/**
 * Write a description of class PiraoDeQueijo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Churrasco extends MenuComponent
{
    public Churrasco(){        
    }
    
    public String getName(){
        return "Churrasco";
    }
    
    public String getDescription(){
        return "De cria";
    }
    
    public double getPrice(){
        return 35;
    }
    
    public boolean isVegetarian(){
        return false;
    }
    
    public String toString(){
        return "#  "+getName()+(isVegetarian()?"(v)":"")+", "+getPrice()+"     --  "+getDescription();
    }
    
    public void print(){
        System.out.print("#  "+getName());
        if(isVegetarian()){
            System.out.print("(v)");
        }
        
        System.out.print(", "+getPrice());
        System.out.print("     --  "+getDescription());
    }

}
