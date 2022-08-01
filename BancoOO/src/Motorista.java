public class Motorista {
    
    private int CodMot;
    private String CPF;
    private String CNH;
    private String Nome;
    private String endereco;
    
    public Motorista(){
        super();
    }

    public Motorista(int CodMot, String CPF, String CNH, String Nome, String endereco) {
        this.CodMot = CodMot;
        this.CPF = CPF;
        this.CNH = CNH;
        this.Nome = Nome;
        this.endereco = endereco;
    }
    

    public int getCodMot() {
        return CodMot;
    }

    public void setCodMot(int CodMot) {
        this.CodMot = CodMot;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Motorista{" + "CodMot=" + CodMot + ", CPF=" + CPF + ", CNH=" + CNH + ", Nome=" + Nome + ", endereco=" + endereco + '}';
    }

    
    
}
