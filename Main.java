public class Main {
    public static void main(String[] args) {

    Coupe coupeFer = new Coupe( true, true, false,true,false, 270000);
    Coupe coupeAndy = new Coupe(false,false,true,true,false, 270000);
    Coupe coupeMati = new Coupe(true,false,false,false,false, 270000);
    Familiar familiarIvo = new Familiar(true, false,true,false,true, 245000);
    Familiar familiarAgus = new Familiar(false, false,true,false,false, 245000);
    Familiar familiarMaca = new Familiar(true, true,true,true,true, 245000);
    Sedan sedanYainy =new Sedan(false,false,true,true,false,230000);
    Sedan sedanAle =new Sedan(false,false,false,false,false,230000);
    Sedan sedanNiko =new Sedan(true,true,false,true,true,230000);


        System.out.println("Costo del Coupe de Fer: " + coupeFer.calcularCostoTotal());
        System.out.println("Costo del Coupe de Andy: " + coupeAndy.calcularCostoTotal());
        System.out.println("Costo del Coupe de Mati: " + coupeMati.calcularCostoTotal());
        System.out.println("Costo del Familiar de Ivo: " + familiarIvo.calcularCostoTotal());
        System.out.println("Costo del Familiar de Agus: " + familiarAgus.calcularCostoTotal());
        System.out.println("Costo del Familiar de Maca: " + familiarMaca.calcularCostoTotal());
        System.out.println("Costo del Sedan de Yainy: " + sedanYainy.calcularCostoTotal());
        System.out.println("Costo del Sedan de Ale: " + sedanAle.calcularCostoTotal());
        System.out.println("Costo del Sedan de Niko: " + sedanNiko.calcularCostoTotal());
    }
}
