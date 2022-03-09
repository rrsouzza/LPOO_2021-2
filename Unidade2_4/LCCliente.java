package Unidade2_4;
public class LCCliente {
    public static Cliente listaClientes[];

    public LCCliente(){}
    
    public static void IniciarLista(int tamanho){
        LCCliente.listaClientes = new Cliente[tamanho];
    }

    public void EntrarNaFila(Cliente clienteNovo){
        LCCliente.listaClientes[clienteNovo.getSenha()] = clienteNovo;
    }

    public void SairDaFila(int senha){
        LCCliente.listaClientes[senha] = LCCliente.listaClientes[senha + 1];
        Cliente.contador--;
    }

    public int ProximoAtendimento(int senha){
        for (int i=0; i<listaClientes.length; i++){
            if (listaClientes[i].getSenha() == senha){
                return 1;
            }            
        }
        return 0;
    }
}