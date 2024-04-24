public class Planetas {
    String nombre;
    int cantSatelites;
    double masa;
    double volumen;
    double diametro;
    double distanciaSol;
    boolean Observable;

  
   public Planetas(String nombre, int cantSatelites, double masa, double volumen,
                  double diametro, double distanciaSol, boolean Observable) {
       this.nombre = nombre;
       this.cantSatelites = cantSatelites;
       this.masa = masa;
       this.volumen = volumen;
       this.diametro = diametro;
       this.distanciaSol = distanciaSol;
       this.Observable = Observable;
   }

   public double calcularDensidad() {
       return masa / volumen;
   }

   public void imprimirDatos() {
       System.out.println("Nombre: " + nombre);
       System.out.println("Cantidad de satélites: " + cantSatelites);
       System.out.println("Masa: " + masa);
       System.out.println("Volumen: " + volumen);
       System.out.println("Diámetro: " + diametro);
       System.out.println("Distancia al sol: " + distanciaSol);
       System.out.println("Es observable: " + Observable);
   }

   public static void main(String[] args) {
      
       Planetas p1 = new Planetas("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
       Planetas p2 = new Planetas("Jupiter", 1, 1.899E27, 1.4313E15, 139820,  750000000, true);
       

       p1.imprimirDatos();
       System.out.println("Densidad de " + p1.nombre + ": " + p1.calcularDensidad());

       p2.imprimirDatos();
       System.out.println("Densidad de " + p2.nombre + ": " + p2.calcularDensidad());
   }
}