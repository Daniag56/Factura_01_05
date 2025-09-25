public class  Factura{
    public static void main(String[] args) throws Exception {
        

        System.out.println("Rojo Polo Paella Inc.");
        System.out.println("Carretera muelle 38");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.printf("%-30s%-30s%-30s%30s \n", "FACTURAR A", "ENVIAR A","Nº DE FACTURA","ES-001");
        System.out.printf("%-30s%-30s%-30s%30s \n", "Leda VillaReal", "Leda VillaReal","FECHA","29.01.2019");
        System.out.printf("%-30s%-30s%-30s%30s \n", "Virgen Blanca 63", "Cercas Bajas 68","Nº DE PEDIDO","1730/2019");
        System.out.printf("%-30s%-30s%-30s%30s \n", "Virgen Blanca 63", "Cercas Bajas 68","FECHA","1730/2019");
        System.out.printf("%-30s%-30s%-30s%30s\n","08759 Burgos,Burgos","47300 Cadiz,Cadiz", "VENCIMIENTO ", "29-01-2019");

        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.printf("%-30s                                                                                   %.2f\n","Total", 199.95);
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        
        System.out.printf("%-30s%-30s%30s%30s \n", "CANT.", "DESCRIPCIÓN","PRECIO","IMPORTE");
        System.out.println("                                                                                   UNITARIO");
        System.out.printf("%-1d                             %-30s %.2f                       %.2f \n", 1, "Talla pequeña traje luces en rojo                     ",100.00,100.00);
        System.out.printf("%-1d                             %-30s               %.2f                        %.2f \n", 2, "Mui grande churralita                    ",25.00,50.00);
        System.out.printf("%-1d                             %-30s                   %.2f                        %.2f \n", 3, "Equipaje de futbol                    ",5.00,15.00);


    }
}
