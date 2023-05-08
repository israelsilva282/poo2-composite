
public class Pudim extends Menusobremesas
{
    public Pudim(){        
    }
    
    public String getName(){
        return "Pudim";
    }
    
    public String getDescription(){
        return "Pudim cremoso";
    }
    
    public double getPrice(){
        return 10;
    }
        
    public String toString(){
        return "#  "+getName()+", "+getPrice()+"     --  "+getDescription();
    }
    
    public void print(){
        System.out.print("#  "+getName());
        System.out.print(", "+getPrice());
        System.out.print("     --  "+getDescription());
    }

}
