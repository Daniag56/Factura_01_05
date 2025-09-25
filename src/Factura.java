public class  Factura{
    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println(Utils.BLUE+"████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████"+Utils.RESET);
        System.out.println();
        System.out.println(Utils.TEXTNEGRITA+"Rojo Polo Paella Inc."+Utils.RESETASCII);
        System.out.println("Carretera muelle 38");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.printf(Utils.TEXTNEGRITA+"%-30s%-30s%-30s    %30s \n", "FACTURAR A", "ENVIAR A","Nº DE FACTURA","ES-001"+Utils.RESETASCII);
        System.out.printf("%-30s%-30s%-30s        %30s \n", "Leda VillaReal", "Leda VillaReal",Utils.TEXTNEGRITA+"FECHA"+Utils.RESETASCII,"29.01.2019");
        System.out.printf("%-30s%-30s%-30s%30s \n", "Virgen Blanca 63", "Cercas Bajas 68",Utils.TEXTNEGRITA+"Nº DE PEDIDO"+Utils.RESETASCII,"1730/2019");
        System.out.printf("%-30s%-30s%-30s%30s \n", "Virgen Blanca 63", "Cercas Bajas 68",Utils.TEXTNEGRITA+"FECHA"+Utils.RESETASCII,"1730/2019");
        System.out.printf("%-30s%-30s%-30s%30s\n","08759 Burgos,Burgos","47300 Cadiz,Cadiz", "VENCIMIENTO ", "29-01-2019");

        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.printf("%-30s                                                                                   %.2f\n","Total", 199.95);
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        
        System.out.printf("%-30s%-30s%30s%30s \n", "CANT.", "DESCRIPCIÓN","PRECIO","IMPORTE");
        System.out.println("                                                                                   UNITARIO");
        System.out.printf("%-1d                             %-30s %.2f                       %.2f \n", 1, "Talla pequeña traje luces en rojo                     ",100.00,100.00);
        System.out.printf("%-1d                             %-30s               %.2f                        %.2f \n", 2, "Mui grande churralita                    ",25.00,50.00);
        System.out.printf("%-1d                             %-30s                   %.2f                        %.2f \n", 3, "Equipaje de futbol                    ",5.00,15.00);
        System.out.println();
        System.out.printf("                                                             %30s                       %.2f \n", "Subtotal",165.00);
        System.out.printf("                                                             %30s                       %.2f \n", "IVA 21.0%",34.00);

    }
}
