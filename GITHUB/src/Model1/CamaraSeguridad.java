package model1;

public class CamaraSeguridad {

    private int resolucion;
    private boolean activada;
    
    /**
     * 
     * @param resolucion indica la resolucion de la camara
     */
    public CamaraSeguridad(int resolucion) {
        this.resolucion = resolucion;
        this.activada = false;
    }
    /**
     * metodo que activa la camara
     */
    public void activar() {
        this.activada = true;
        System.out.println("Cámara de seguridad activada");
    }
    /**
     * metodo que desactiva la camara
     */
    public void desactivar() {
        this.activada = false;
        System.out.println("Cámara de seguridad desactivada");
    }
    /**
     * metodo que graba con la camara
     */
    public void grabar() {
        if (activada) {
            System.out.println("Grabando video...");
            // Lógica de grabación
        } else {
            System.out.println("La cámara de seguridad no está activada");
        }
    }
}
