public class FiguraFactory {
    public Figuras calculo(TipoFigura figura, double... args){

        if (figura==TipoFigura.Triangulo){
            return new Triangulo(args[0],args[1],args[2]);
        }else if (figura==TipoFigura.Rectangulo){
            return new Rectangulo(args[0],args[1]);
        }else {
            return new Circulo(args[0]);
        }
    }
}
