//abstraccion: capacidad de crear  una clase o tipo de dato nuevo
public class Automovil {
    //propiedades
    private static String marca, modelo, color; //se hace uso del encapsulamiento
    private static int caballosMotor;

    //metodos
    //crear constructor de la clase
    public  Automovil (String marcaDeOtroLado, String modeloDeOtrolado, String colorDeOtroLado){
        this.marca = marcaDeOtroLado;
        this.modelo = modeloDeOtrolado;
        this.color = colorDeOtroLado;
    }

    //polimorfismo: el mismo metodo realiza acciones difentes
    public  Automovil (String modeloDeOtrolado, String colorDeOtroLado){
        this.marca = "Ferrari";
        this.modelo = modeloDeOtrolado;
        this.color = colorDeOtroLado;
    }

}
