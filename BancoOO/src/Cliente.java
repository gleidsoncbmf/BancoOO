public class Cliente {
    
    private int CodCli;
    private String Nome;
    private String Tel;
    private String Endereco;
    private String CPF;
    private String Email;
    
    public Cliente(){
        super();
    }

    public Cliente(int CodCli, String Nome, String Tel, String Endereco, String CPF, String Email) {
        this.CodCli = CodCli;
        this.Nome = Nome;
        this.Tel = Tel;
        this.Endereco = Endereco;
        this.CPF = CPF;
        this.Email = Email;
    }

    public int getCodCli() {
        return CodCli;
    }

    public void setCodCli(int CodCli) {
        this.CodCli = CodCli;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "CodCli=" + CodCli + ", Nome=" + Nome + ", Tel=" + Tel + ", Endereco=" + Endereco + ", CPF=" + CPF + ", Email=" + Email + '}';
    }

    
    
}
