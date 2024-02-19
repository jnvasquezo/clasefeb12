//abstraccion: capacidad de crear  una clase o tipo de dato nuevo
public class Automovil {
    //propiedades
    private static String marca, modelo, color; //se hace uso del encapsulamiento
    private static short cilindraje;
    private static int caballosMotor;

    //metodos
    //crear constructor de la clase
    //polimorfirmo, (hacer de un metodo ejecute tareas diferentes)
    public  Automovil (String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    //polimorfismo: el mismo metodo realiza acciones difentes
    public  Automovil (String modelo, String color){
        this.marca = "Ferrari";
        this.modelo = modelo;
        this.color = color;
    }
    public  Automovil(short cilindraje){
        this.cilindraje = cilindraje;
    }

    //me crea el getter an setter de las variables
    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        Automovil.marca = marca;
    }

    public static String getModelo() {
        return modelo;
    }

    public static void setModelo(String modelo) {
        Automovil.modelo = modelo;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Automovil.color = color;
    }

    public static double getCilindraje() {
        return cilindraje;
    }

    public static void setCilindraje(short cilindraje) {
        Automovil.cilindraje = cilindraje;
    }

    public static int getCaballosMotor() {
        return caballosMotor;
    }

    public static void setCaballosMotor(int caballosMotor) {
        Automovil.caballosMotor = caballosMotor;
    }
}
