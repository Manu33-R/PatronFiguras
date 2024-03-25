import java.util.Scanner;

public class MainFiguras {
    public static void main(String[] args) {
        FiguraFactory figFactory = new FiguraFactory();
        Scanner opcfig = new Scanner(System.in);
        Figuras f = new Circulo(0);
        int tipo = 4;
        while (tipo != 0) {
            boolean mostrar = true;
            tipo=4;
            try {
                System.out.println("Seleccione el Tipo de Figura:\n0: Salir\n1: Triángulo.\n2: Rectangulo.\n3: Circulo.");
                tipo = opcfig.nextInt();
            }catch (Exception e){
                System.out.println("Opción incorrecta.");
                opcfig.next();
            }
            switch (tipo) {
                case 1:
                    try {
                        System.out.println("Introduce los tres lados: ");
                        System.out.println("Introduce el primer lado: ");
                        double lado1 = opcfig.nextDouble();
                        System.out.println("Introduce el segundo lado: ");
                        double lado2 = opcfig.nextDouble();
                        System.out.println("Introduce el tercer lado: ");
                        double lado3 = opcfig.nextDouble();
                        if (lado1 > 0 && lado2 > 0 && lado3 > 0)
                        f = figFactory.calculo(TipoFigura.Triangulo, lado1, lado2, lado3);
                        else{
                            System.out.println("Los valores tienen que ser mayor que cero");
                            mostrar=false;
                        }
                    }catch (Exception ex){
                        System.out.println("Valores de los lados incorrectos.");
                        mostrar=false;
                    }

                    break;
                case 2:
                    try {
                        System.out.println("Introduce los dos lados: ");
                        System.out.println("Introduce el primer lado: ");
                        double lado1 = opcfig.nextDouble();
                        System.out.println("Introduce el segundo lado: ");
                        double lado2 = opcfig.nextDouble();
                        if (lado1 > 0 && lado2 > 0)
                            f = figFactory.calculo(TipoFigura.Rectangulo, lado1, lado2);
                        else{
                            System.out.println("Los valores tienen que ser mayor que cero");
                            mostrar=false;
                        }
                    }catch (Exception ex){
                        System.out.println("Valores de los lados incorrectos.");
                        mostrar=false;
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Introduce el radio:");
                        double lado1 = opcfig.nextDouble();
                        if (lado1 > 0)
                            f = figFactory.calculo(TipoFigura.Circulo, lado1);
                        else{
                            System.out.println("El valor tiene que ser mayor que cero");
                            mostrar=false;
                        }
                    }catch (Exception ex){
                        System.out.println("Valor del radio incorrecto.");
                        mostrar=false;
                    }
                    break;
                default:
                    mostrar = false;
            }
            if (mostrar) {
                System.out.println("Área: " + f.Area());
                System.out.println("Perimetro: " + f.Perimetro());
            }
        }
    }
}
