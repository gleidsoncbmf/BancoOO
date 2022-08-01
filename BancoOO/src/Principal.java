import java.util.List;

public class Principal {
     public static void main(String[] args) {
         
        //Adicionando Clientes
        
        Cliente cliente2 = new Cliente(2, "Isadora", "1111-1111", "Avenida 1", "111.111.111-11", "isadora@gmail.com");

        Cliente cliente3 = new Cliente(3, "Carla", "2222-2222", "Avenida 2", "222.222.222-22", "maria1@gmail.com");
        
        //Criando Data Base e Inserindo Clientes 2 e 3.
        
        DataBase database = new DataBase();
        database.criarDatabase();
        database.InsertCliente(cliente2);
        database.InsertCliente(cliente3);
        
        //Listando Clientes da DataBase utilizando Select
        
        System.out.println("|--------------------Lista de Clientes utilizando Select--------------------");
        System.out.println();
        
        List<Cliente> clienteList = database.SelectClientes();
        for (Cliente c : clienteList){
           System.out.println(c);
        }
         System.out.println();
        
        //Adicionando Motoristas 2 e 3 e Inserindo na DataBase
        
        Motorista motorista2 = new Motorista(2, "333.333.333-33", "333333", "José", "Avenida 3");
        database.InsertMotorista(motorista2);
       
        Motorista motorista3 = new Motorista(3,"444.444.444-44","444444","Carlos","Avenida 4");
        database.InsertMotorista(motorista3);
        
        //Listando Motoristas da DataBase utilizando Select
        
        System.out.println("--------------------Lista de Motoristas utilizando Select--------------------");
        System.out.println();
        
        List<Motorista> motoristaListah = database.SelectMotoristas();
        for (Motorista ma : motoristaListah){
            System.out.println(ma);
        }
        System.out.println();
          
        //Adicionando vendedores 2 e 3 e Inserindo na DataBase
        
        Vendedor vendedor2 = new Vendedor(2, "555.555.555-55", 55, "Vitor", "Avenida 5");
        database.InsertVendedor(vendedor2);
        
        Vendedor vendedor3 = new Vendedor(3,"666.666.666-66", 66, "Paulo", "Avenida 6");
        database.InsertVendedor(vendedor3);
        
        
        
        //Listando Vendedores Vendedores da DataBase utilizando Select
        
        System.out.println("--------------------Lista de Vendedores utilizando Select--------------------");
        System.out.println();
         
        List<Vendedor> vendedorList = database.SelectVendedores();
        for (Vendedor v : vendedorList){
            System.out.println(v);     
        }
        System.out.println();
        
        //Alterações dos dados do Vendedor através do Update  
        
        int codVdd = 3;
        String ccpf = ("777.777.777-77");
        int ccomissao = (77);
        String nnome = "Paulo Ricardo";
        String eendereco = "Rua 8";
        database.UpdateVendedor(codVdd, ccpf, ccomissao, nnome, eendereco);
        
        
        //Lista de Vendedores Atualizada após Update
        
        System.out.println("--------------------Lista de Vendedores Atualizada após Update--------------------");
        System.out.println();
         
        vendedorList = database.SelectVendedores();
        for (Vendedor vdd : vendedorList){
            System.out.println(vdd);
        }
        System.out.println();
        
        
        //Cadastrando venda 2 e 3 e Inserindo na DataBase
        
        Venda venda2 = new Venda();
        
        venda2.setNumVen(2);
        venda2.setValorTotal(22.22);
        venda2.setVendedor(vendedor2);
        venda2.setCliente(cliente2);
        database.InsertVenda(venda2);
        
       
        Venda venda3 = new Venda();
        
        venda3.setNumVen(3);
        venda3.setValorTotal(33.33);
        venda3.setVendedor(vendedor3);
        venda3.setCliente(cliente3);
        database.InsertVenda(venda3);
        
        //Listando Vendas da DataBase
        System.out.println("--------------------Lista de Vendas--------------------");
        System.out.println();
        
        List<Venda> vendaList = database.SelectVendas();
        for (Venda ven : vendaList){
           System.out.println(ven);
        }
        System.out.println();
       
       
        //Deletando Motorista através do Delete
        
        int CodMot = 1;
        database.deleteMotorista(CodMot);
        motoristaListah = database.SelectMotoristas();
        
        //Listando Motoristas da DataBase após Delete
        
        System.out.println("--------------------Lista de Motoristas após delete--------------------");
        System.out.println();
        for (Motorista mm : motoristaListah){
            System.out.println(mm);    
        }
        System.out.println();       
    }
}
