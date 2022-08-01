
public class Vendedor {
    
    private int CodVdd;
    private String CPF;
    private double Comissao;
    private String Nome;
    private String Endereco;
    
    public Vendedor(){
        super();
    }

    public Vendedor(int CodVdd, String CPF, double Comissao, String Nome, String Endereco) {
        this.CodVdd = CodVdd;
        this.CPF = CPF;
        this.Comissao = Comissao;
        this.Nome = Nome;
        this.Endereco = Endereco;
    }

    public int getCodVdd() {
        return CodVdd;
    }

    public void setCodVdd(int CodVdd) {
        this.CodVdd = CodVdd;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getComissao() {
        return Comissao;
    }

    public void setComissao(double Comissao) {
        this.Comissao = Comissao;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "CodVdd=" + CodVdd + ", CPF=" + CPF + ", Comissao=" + Comissao + ", Nome=" + Nome + ", Endereco=" + Endereco + '}';
    }
   
    
    
}
