import java.sql.SQLOutput;

public class ObjetosDeAutomovil {
    public static void main(String[] Args){
        //Herencia (capacidad clases u objetos que provienen de otras clases)

        Automovil carrito1 = new Automovil("Mercedes Benz","AMG", "Blanco");
        carrito1.setCilindraje((short) 4600);

        System.out.println("Caracteristicas de carrito 1");
        System.out.println("Marca: "+carrito1.getMarca());
        System.out.println("Modelo: "+carrito1.getModelo());
        System.out.println("Color: "+carrito1.getColor());
        System.out.println("Cilidraje: "+carrito1.getCilindraje());


        Automovil carrito2 = new Automovil("PuroSangue", "Rojo");
        Automovil carrito2Cilidraje = new Automovil((short)3400);

        System.out.println("Caracteristicas de carrito 2");
        System.out.println("Marca: "+carrito2.getMarca());
        System.out.println("Modelo: "+carrito2.getModelo());
        System.out.println("Color: "+carrito2.getColor());
        System.out.println("Cilidraje: "+carrito2Cilidraje.getCilindraje());

        Automovil carrito3 = new Automovil((short)3900);
        carrito3.setMarca("Ford");
        carrito3.setModelo("Mustang");
        carrito3.setColor("Verde");

        System.out.println("Caracteristicas de carrito 3");
        System.out.println("Marca: "+carrito3.getMarca());
        System.out.println("Modelo: "+carrito3.getModelo());
        System.out.println("Color: "+carrito3.getColor());
        System.out.println("Cilidraje: "+carrito3.getCilindraje());
    }
}
