package mx.qbits.sample;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Dato {
    private String edad;
    private int valor;
    public Dato() {
    }
    public Dato(String edad, int valor) {
        this.edad=edad;
        this.valor=valor;
    }
    public String getEdad() {
        return edad;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
}
