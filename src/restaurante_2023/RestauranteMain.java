
package restaurante_2023;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import restaurante.Data.Conexion;
import restaurante.Data.MesaData;
import restaurante.Data.PedidoData;
import restaurante.Data.PedidoProductoData;
import restaurante.Data.ProductoData;
import restaurante.Entidades.Mesa;
import restaurante.Entidades.Pedido;
import restaurante.Entidades.PedidoProducto;
import restaurante.Entidades.Producto;

public class RestauranteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MesaData mesaData = new MesaData();
        PedidoData pedidoData = new PedidoData();
        ProductoData productoData = new ProductoData();
        PedidoProductoData ppData = new PedidoProductoData();
//        Agregar mesas**********************************
//        Mesa mesa1 = new Mesa(1, true, 4);
//        Mesa mesa2 = new Mesa(2, false, 2);
//        mesaData.agregarMesa(mesa2);
        
        //++++++++++++++buscarMesaPorId-----------
//        
//        Mesa mesaEncontrada = mesaData.buscarMesaPorId(1);
//        System.out.println(mesaEncontrada);
//        
//        //PEDIDOS*********************************
//        Pedido pedido1 = new Pedido(mesaEncontrada, "Fulano", LocalDate.of(2023,10,10), 3000, false);
          
//        pedidoData.agregarPedido(pedido1);
//        
//        pedidoData.buscarPedidoPorID(1);
//        System.out.println("Pedido encontrado:" + pedidoData.buscarPedidoPorID(1));

////**************************************CREO PEDIDO Y DESPUÉS LO MODIFICO
//Mesa mesaY = new Mesa(7, false, 2);
//mesaData.agregarMesa(mesaY);
Mesa mesaEncontrada = mesaData.buscarMesaPorId(1);
        System.out.println("Mesa 1: " + mesaEncontrada +"\n*********************");
Mesa mesaEncontrada2 = mesaData.buscarMesaPorId(2);
        System.out.println("Mesa 2: " + mesaEncontrada2 +"\n*********************");


//Producto producto1 = productoData.obtenerProducto(2);
//Pedido pedido3= new Pedido(mesaEncontrada, "Chilindrina", LocalDate.of(2023,11,11), 0.0, false, LocalTime.of(19, 55));
//pedidoData.agregarPedido(pedido3);
//int cantidad = 2;
//double precio = producto1.getPrecio();
//
//pedido3.setNombre_mesero("Pedro");
//pedidoData.modificarPedido(pedido3);
//PedidoProducto pedidoP = new PedidoProducto(pedido3, producto1, cantidad, (precio*cantidad));
//ppData.agregarPedidoProducto(pedidoP);

//pedido3.setImporte(7000);

//Pedido pedido = pedidoData.buscarPedidoPorID(10);
//Producto producto 
//pedido.setImporte(10000);
//pedidoData.modificarPedido(pedido);
//
//Pedido pedidoEncontrado = pedidoData.buscarPedidoPorID(3);
//        System.out.println("PEDIDO ENCONTRADO: " + pedidoEncontrado);
//
//    pedidoData.reactivarPedido(pedidoData.buscarPedidoPorID(6));
    //pedidoData.cobrarPedido(pedido);
    
//*******************************************COBRO PRODUCTO Y DESPUÉS LO "REACTIVO"
    //pedidoData.cobrarPedido(pedidoData.buscarPedidoPorID(2));
    //pedidoData.reactivarPedido(pedidoData.buscarPedidoPorID(2));
    
    
//***************************************************************ACÁ PRUEBO AÑADIR DETALLE
//PedidoProducto pedidoprod = new PedidoProducto()
    
    
//***************************************************************ACÁ QUERÍA PROBAR LAS LISTAS    
    /*
    ArrayList<Pedido>pedidosxmesa = pedidoData.buscarPedidoPorMesa(1);
        System.out.println("Pedidos mesa 1");
    for(Pedido pedido : pedidosxmesa){
        System.out.println("Pedido: " + pedido.toString());
    }
    
        System.out.println("**************************\nPedidos 27/10/23: ");
    for (Pedido pedido : pedidoData.buscarPedidoPorFecha(LocalDate.of(2023, 10, 27))){
        
        System.out.println("Pedido: " + pedido.toString());
    }
    
        System.out.println("***********************\nPedidos cobrados: ");
    for(Pedido pedido : pedidoData.pedidosCobrados()){
        System.out.println( "Pedido: " + pedido.toString());
    }
    
        System.out.println("********************\nPedido sin cobrar: ");
    for(Pedido pedido : pedidoData.pedidosSinCobrar()){
        System.out.println("Pedido: " + pedido.toString());        
    }
            
    */
    }
}
