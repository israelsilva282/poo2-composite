public class Sorvete extends Menusobremesas {

    public Sorvete(){
    }

    public String getName(){
        return "Sorvete";
    }
    
    public String getDescription(){
        return "Sorvete de chocolate";
    }
    
    public double getPrice(){
        return 5;
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
