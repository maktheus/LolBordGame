package Elemento;

public class Elemento {
    private tipoElementoEnum tipoElemento;
    private float multiplicador;

    public Elemento(tipoElementoEnum tipoElemento, float multiplicador) {
        this.tipoElemento = tipoElemento;
        this.multiplicador = multiplicador;
    }

    public tipoElementoEnum getTipoElemento() {
        return tipoElemento;
    }

    public float getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(float multiplicador) {
        this.multiplicador = multiplicador;
    }
}
