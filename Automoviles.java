/*Una fábrica de automóviles produce uno de sus modelos en tres variantes,
 llamadas sedán, coupé y familiar.
 Cada una tiene un precio de venta básico sin opcionales.
 A su vez, a cada variante se le pueden agregar opciones como techo corredizo, aire acondicionado,
  sistema de frenos ABS, airbag y llantas de aleación.
  Cada uno de estos opcionales tiene un precio que suma al básico.
  En este caso, cada auto vendrá caracterizado por su variante y podrá tener ninguno, uno o más opcionales.*/

public abstract class Automoviles {
    public boolean techoCorredizo;
    public boolean aireAcondicionado;
    public boolean frenosABS;
    public boolean airbag;
    public boolean llantasAleacion;

    public Automoviles(boolean techoCorredizo, boolean aireAcondicionado, boolean frenosABS, boolean airbag, boolean llantasAleacion){
            this.techoCorredizo=techoCorredizo;
            this.aireAcondicionado=aireAcondicionado;
            this.frenosABS=frenosABS;
            this.airbag=airbag;
            this.llantasAleacion=llantasAleacion;
    }
    public int costoTecho=0;
    public int costoAC=0;
    public int costoFrenos=0;
    public int costoAirbag=0;
    public int costoLlantas=0;

    public int calcularCostoTecho() {
        if (techoCorredizo == true) {
            return costoTecho=12000;
        }
        return costoTecho=0;
    }

    public int calcularCostoAC() {
        if (aireAcondicionado == true) {
            return costoAC=20000;
        }
        return costoAC=0;
    }

    public int calcularCostoFrenos() {
        if (frenosABS == true) {
            return costoFrenos=14000;
        }
        return costoFrenos=0;
    }

    public int calcularCostoAirbag() {
        if (airbag == true) {
            return costoAirbag=7000;
        }
        return costoAirbag=0;
    }

    public int calcularCostoLlantas() {
        if (llantasAleacion == true) {
            return costoLlantas=12000;
        }
        return costoLlantas=0;
    }

    public int calcularCostoTotal() { return calcularCostoTecho() + calcularCostoAC() + calcularCostoFrenos() +
            calcularCostoAirbag() + calcularCostoLlantas();
    }
}
