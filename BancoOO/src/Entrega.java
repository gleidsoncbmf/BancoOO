
public class Entrega {
    
    private String Hora;
    private String Data;
    private int NumVen;
    private Venda Venda;
    private Veiculo Veiculo;
    private Motorista Motorista;
    
    public Entrega(){
        super();
    }

    public Entrega(String Hora, String Data, int NumVen, Venda Venda, Veiculo Veiculo, Motorista Motorista) {
        this.Hora = Hora;
        this.Data = Data;
        this.NumVen = NumVen;
        this.Venda = Venda;
        this.Veiculo = Veiculo;
        this.Motorista = Motorista;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public int getNumVen() {
        return NumVen;
    }

    public void setNumVen(int NumVen) {
        this.NumVen = NumVen;
    }

    public Venda getVenda() {
        return Venda;
    }

    public void setVenda(Venda Venda) {
        this.Venda = Venda;
    }

    public Veiculo getVeiculo() {
        return Veiculo;
    }

    public void setVeiculo(Veiculo Veiculo) {
        this.Veiculo = Veiculo;
    }

    public Motorista getMotorista() {
        return Motorista;
    }

    public void setMotorista(Motorista Motorista) {
        this.Motorista = Motorista;
    }

    @Override
    public String toString() {
        return "Entrega{" + "Hora=" + Hora + ", Data=" + Data + ", NumVen=" + NumVen + ", Venda=" + Venda + ", Veiculo=" + Veiculo + ", Motorista=" + Motorista + '}';
    }
    
    
    
   
}
