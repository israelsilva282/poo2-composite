

public class TesteComposite {
    
    public MenuComponent montar(){
        MenuComponent menu1 = new MenuBarRestaurante();
        MenuComponent menu2 = new BarTorrao();
        MenuComponent menu3 = new RestauranteLuzia();
        
        MenuComponent menusobremesas1 = new RestauranteLuzia();
        MenuComponent menusobremesas2 = new MenuBarRestaurante();   
        
        MenuComponent item1 = new Cachaca();
        MenuComponent item2 = new PiraoDeQueijo();
        MenuComponent item3 = new Galinha();
        MenuComponent item4 = new Linguica();
        
        MenuComponent item5 = new Churrasco();
        
        MenuComponent item6 = new Sorvete();
        MenuComponent item7 = new Pudim();
        
        menu1.add(menu2);
        menu1.add(menu3);
        menu2.add(item1);
        menu2.add(item2);
        menu3.add(item3);
        menu3.add(item4);
        
        menu3.add(item5);
        
        menu1.add(item6);
        menu3.add(item7);
        
        return menu1;
        
        
    }
}
