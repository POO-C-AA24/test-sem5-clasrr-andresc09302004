public class Terreno{
    public double alto; 
    public double ancho;
    public double vmc;
    public double area;
    public double costoFinal;

    public Terreno(double alto, double ancho, double vmc) {
        this.alto = alto;
        this.ancho = ancho;
        this.vmc = vmc;
    }
    public void calcualarArea(){
        this.area = this.alto*this.ancho;
    }
    public void calcularCostof(){
        costoFinal = area*vmc;
        if (area > 300)
            costoFinal *=0.8; // costoFinal=(area*vmc) - (area*vmc)*0.2;
        else if(area>=200)
            costoFinal *= 0.9;// costoFinal=(area*vmc) - (area*vmc)*0.1;
            
    }
    @Override
    public String toString() {
        return "Terreno{" + "alto=" + alto + ", ancho=" + ancho + ", vmc=" + vmc + ", area=" + area + ", costoFinal=" + costoFinal + '}';
    }
    
}