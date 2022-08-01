import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    
    private ObjectContainer db = null;
    
    private void abrirBanco(){
          db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "banco");
    }
    
    private void fecharBanco(){
        db.close();
    }
    
    public void InsertCliente(Cliente Cliente){
        abrirBanco();
        db.store(Cliente);
        fecharBanco();
    }
  
    public void InsertEntrega (Entrega Entrega){
        abrirBanco();
        db.store(Entrega);
        fecharBanco();
    }
    public void InsertItemVenda (ItemVenda ItemVenda){
        abrirBanco();
        db.store(ItemVenda);
        fecharBanco();
    }
    public void InsertMotorista (Motorista Motorista){
        abrirBanco();
        db.store(Motorista);
        fecharBanco();
    }
    public void InsertProduto (Produto Produto){
        abrirBanco();
        db.store(Produto);
        fecharBanco();
    }
    public void InsertVeiculo (Veiculo Veiculo){
        abrirBanco();
        db.store(Veiculo);
        fecharBanco();
    }
    public void InsertVenda (Venda Venda){
        abrirBanco();
        db.store(Venda);
        fecharBanco();
    }
    public void InsertVendedor (Vendedor Vendedor){
        abrirBanco();
        db.store(Vendedor);
        fecharBanco();
    }
    
    public List<Cliente> SelectClientes (){
        abrirBanco();
        ObjectSet listCliente = db.queryByExample(Cliente.class);
        List<Cliente> Cliente = new ArrayList<>();
        for (Object c: listCliente) {
            Cliente.add((Cliente) c);
        }
        fecharBanco();
        return Cliente;
    }
    public List<Motorista> SelectMotoristas (){
        abrirBanco();
        ObjectSet listMotorista = db.queryByExample(Motorista.class);
        List<Motorista> Motorista = new ArrayList<>();
        for (Object m: listMotorista) {
            Motorista.add((Motorista) m);
        }
        fecharBanco();
        return Motorista;
    }
     
   
    public void UpdateVendedor(int CodVdd, String ccpf, int ccomissao, String nnome, String eendereco){
        abrirBanco();
        Vendedor vendedor = new Vendedor();
        vendedor.setCodVdd(CodVdd);
        ObjectSet result = db.queryByExample(vendedor);
        Vendedor vendedorresult = (Vendedor) result.next();
        vendedorresult.setCPF(ccpf);
        vendedorresult.setComissao(ccomissao);
        vendedorresult.setNome(nnome);
        vendedorresult.setEndereco(eendereco);
        db.store(vendedorresult);
        fecharBanco();
    }
    
    public void DeleteVenda(int numVen){
        abrirBanco();
        Venda venda = new Venda();
        venda.setNumVen(numVen);
        ObjectSet result = db.queryByExample(Venda.class);
        Venda vendaresult = (Venda) result.next();
        db.delete(vendaresult);
        fecharBanco();
    }
    
     public void deleteEntrega(int NumVen){
        abrirBanco();
        Entrega e = new Entrega();
        e.setNumVen(NumVen);
        ObjectSet result = db.queryByExample(e);
        Entrega eresult = (Entrega) result.next();
        db.delete(eresult);
        fecharBanco();
        
    }
     
      public void deleteMotorista(int CodMot){
        abrirBanco();
        Motorista mot = new Motorista();
        mot.setCodMot(CodMot);
        ObjectSet result = db.queryByExample(mot);
        Motorista mresult = (Motorista) result.next();
        db.delete(mresult);
        fecharBanco();
        
    }
        
    public List<Vendedor> SelectVendedores (){
        abrirBanco();
        ObjectSet listVendedor = db.queryByExample(Vendedor.class);
        List<Vendedor> vendedor = new ArrayList<>();
        for (Object v: listVendedor) {
            vendedor.add((Vendedor) v);
        }
        fecharBanco();
        return vendedor;
    }
    
    public List<Venda> SelectVendas (){
        abrirBanco();
        ObjectSet listVenda = db.queryByExample(Venda.class);
        List<Venda> venda = new ArrayList<>();
        for (Object ven: listVenda) {
            venda.add((Venda) ven);
        }
        fecharBanco();
        return venda;
    }
    
    public void criarDatabase () {
        abrirBanco();

        Cliente cliente = new Cliente(1, "Luís", "1111-1111", "Avenida 1", "111.111.111-11", "gleidson@gmail.com");
        Vendedor vendedor = new Vendedor(1, "888.888.888-88", 88, "João", "Avenida 8");
        Produto produto = new Produto(9, 30.00, "Alcatra", 40.00, "Carne");
        Venda venda = new Venda(9, 12, vendedor, cliente);
        ItemVenda itemVenda = new ItemVenda(produto, venda, 10, 1);
        Veiculo veiculo = new Veiculo("PCE-1214", 5);
        Motorista motorista = new Motorista(1, "999.999.999-99", "999999", "Marcos", "Avenida 9");
        Entrega entrega = new Entrega("15:00h", "15/08/2022", 1, venda, veiculo, motorista);

        db.store(cliente);
        db.store(vendedor);
        db.store(produto);
        db.store(venda);
        db.store(itemVenda);
        db.store(veiculo);
        db.store(motorista);
        db.store(entrega);
        System.out.println("---> Database Criada");
        fecharBanco();
    }
    
}
