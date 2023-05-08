import java.util.*;

public class Menusobremesas extends Menu
{
 private List<MenuComponent> itensSobremesa;
    private String descricao;

    public Menusobremesas() {
    }

    public void add(MenuComponent menuComponent) {
        itensSobremesa.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        itensSobremesa.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return itensSobremesa.get(i);
    }

    public String getDescricao() {
        return descricao;
    }

    public void print() {
        System.out.println(" * " + getDescricao());
        for (MenuComponent item : itensSobremesa) {
            item.print();
        }
    }
}