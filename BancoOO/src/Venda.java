public class Venda {
    
    private int NumVen;
    private double ValorTotal;
    private Vendedor Vendedor;
    private Cliente Cliente;
    
    public Venda(){
        super();
    }

    public Venda(int NumVen, double ValorTotal, Vendedor Vendedor, Cliente Cliente) {
        this.NumVen = NumVen;
        this.ValorTotal = ValorTotal;
        this.Vendedor = Vendedor;
        this.Cliente = Cliente;
    }

    public int getNumVen() {
        return NumVen;
    }

    public void setNumVen(int NumVen) {
        this.NumVen = NumVen;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public Vendedor getVendedor() {
        return Vendedor;
    }

    public void setVendedor(Vendedor Vendedor) {
        this.Vendedor = Vendedor;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    @Override
    public String toString() {
        return "Venda{" + "NumVen=" + NumVen + ", ValorTotal=" + ValorTotal + ", Vendedor=" + Vendedor + ", Cliente=" + Cliente + '}';
    }
    
}
