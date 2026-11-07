package State;
public class EstadoCancelado {
public class EstadoCancelado implements EstadoPedido {
    @Override
    public void procesar(Pedido pedido) {
        System.out.println("ERROR: El pedido está cancelado");
    }
    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("ERROR: El pedido ya está cancelado");
    }
    @Override
    public void enviar(Pedido pedido) {
        System.out.println("ERROR: El pedido está cancelado");
    }
    @Override
    public void entregar(Pedido pedido) {
        System.out.println("ERROR: El pedido está cancelado");
    }
}
}
