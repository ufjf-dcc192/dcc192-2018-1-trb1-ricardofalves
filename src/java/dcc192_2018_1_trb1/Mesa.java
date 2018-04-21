package dcc192_2018_1_trb1;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    
    int numMesa;
    private List<Pedido> pedidos;
    
    public Mesa() {
        this.pedidos= new ArrayList<>();
    }

    public Mesa(int mesa) {
        this.pedidos = new ArrayList<>();
        this.numMesa = mesa;
    } 

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
