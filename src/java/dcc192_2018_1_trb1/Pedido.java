package dcc192_2018_1_trb1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    int numPedido;
    boolean situação;
    Date horaAberto;
    Date horaFechado;
    private List<ItemPedido> itens;

    Pedido(int numero) {
        this.numPedido = numero;
        this.itens = new ArrayList<ItemPedido>();
        horaAberto = new Date();
        situação = true;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public boolean isSituação() {
        return situação;
    }

    public void setSituação(boolean situação) {
        this.situação = situação;
    }

    public Date getHoraAberto() {
        return horaAberto;
    }

    public void setHoraAberto(Date horaAberto) {
        this.horaAberto = horaAberto;
    }

    public Date getHoraFechado() {
        return horaFechado;
    }

    public void setHoraFechado(Date horaFechado) {
        this.horaFechado = horaFechado;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
    
}
