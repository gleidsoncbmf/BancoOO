
public class ItemVenda {
    
    private Produto Produto;
    private Venda Venda;
    private double vUnitario;
    private int Qtd;
    
    public ItemVenda(){
        super();
    }

    public ItemVenda(Produto Produto, Venda Venda, double vUnitario, int Qtd) {
        this.Produto = Produto;
        this.Venda = Venda;
        this.vUnitario = vUnitario;
        this.Qtd = Qtd;
    }

    public Produto getProduto() {
        return Produto;
    }

    public void setProduto(Produto Produto) {
        this.Produto = Produto;
    }

    public Venda getVenda() {
        return Venda;
    }

    public void setVenda(Venda Venda) {
        this.Venda = Venda;
    }

    public double getvUnitario() {
        return vUnitario;
    }

    public void setvUnitario(double vUnitario) {
        this.vUnitario = vUnitario;
    }

    public int getQtd() {
        return Qtd;
    }

    public void setQtd(int Qtd) {
        this.Qtd = Qtd;
    }

    @Override
    public String toString() {
        return "ItemVenda{" + "Produto=" + Produto + ", Venda=" + Venda + ", vUnitario=" + vUnitario + ", Qtd=" + Qtd + '}';
    }

    
    
    
    
    
}



