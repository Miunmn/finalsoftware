package mainprogram.application;

public class Centro {
    private String nombrecentro;
    private int cantidadvacunados;
    private boolean status;

    public Centro(String nombrecentro, int cantidadvacunados, boolean status) {
        this.nombrecentro = nombrecentro;
        this.cantidadvacunados = cantidadvacunados;
        this.status = status;
    }

    public String getNombrecentro() {
        return nombrecentro;
    }

    public void setNombrecentro(String nombrecentro) {
        this.nombrecentro = nombrecentro;
    }

    public int getCantidadvacunados() {
        return cantidadvacunados;
    }

    public void setCantidadvacunados(int cantidadvacunados) {
        this.cantidadvacunados = cantidadvacunados;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
