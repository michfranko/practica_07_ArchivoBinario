/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.modelo;
import java.io.Serializable;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cantante extends Persona{
    private String nombreArtistico;
    private String generoMusical;
    private int numeroDeSencillos;
    private int numeroDeGiras;
    private List<Disco> discografia;
    private Double salarioFinal;



public Cantante(int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario, double salarioFinal) {
    super(codigo, nombre, apellido, edad, nacionalidad, salario);
    this.nombreArtistico = nombreArtistico;
    this.generoMusical = generoMusical;
    this.numeroDeSencillos = 0;
    this.numeroDeGiras = 0;
    this.salarioFinal = salarioFinal; 
    this.discografia = new ArrayList<>();
}

    public Cantante(String nombreArtistico, String generoMusical, int numeroDeSencillos, int numeroDeGiras, List<Disco> discografia, Double salarioFinal, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.nombreArtistico = nombreArtistico;
        this.generoMusical = generoMusical;
        this.numeroDeSencillos = numeroDeSencillos;
        this.numeroDeGiras = numeroDeGiras;
        this.discografia = discografia;
         this.discografia = new ArrayList<>(); 
        this.salarioFinal = salarioFinal;
    }

    public Cantante(String nombreArtistico, String generoMusical, int numeroDeSencillos, int numeroDeGiras, Double salarioFinal, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.nombreArtistico = nombreArtistico;
        this.generoMusical = generoMusical;
        this.numeroDeSencillos = numeroDeSencillos;
        this.numeroDeGiras = numeroDeGiras;
         this.discografia = new ArrayList<>(); 
        this.salarioFinal = salarioFinal;
    }

    
    
    public Cantante() {
        discografia = new ArrayList<>();
    }

    

    public Double getSalarioFinal() {
        return salarioFinal;
    }

   
public void setSalarioFinal(double salarioFinal1) {
    this.salarioFinal = salarioFinal1;
}


    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public int getNumeroDeSencillos() {
        return numeroDeSencillos;
    }

    public void setNumeroDeSencillos(int numeroDeSencillos) {
        this.numeroDeSencillos = numeroDeSencillos;
    }


    public int getNumeroDeGiras() {
        return numeroDeGiras;
    }

    public void setNumeroDeGiras(int numeroDeGiras) {
        this.numeroDeGiras = numeroDeGiras;
    }

    public List<Disco> getDiscografia() {
        return discografia;
    }

    public void setDiscografia(List<Disco> discografia) {
        this.discografia = discografia;
    }
//getters y setters de persona para cantante
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cantante other = (Cantante) obj;
        if (this.numeroDeSencillos != other.numeroDeSencillos) {
            return false;
        }
        if (this.numeroDeGiras != other.numeroDeGiras) {
            return false;
        }
        if (!Objects.equals(this.nombreArtistico, other.nombreArtistico)) {
            return false;
        }
        if (!Objects.equals(this.generoMusical, other.generoMusical)) {
            return false;
        }
        if (!Objects.equals(this.discografia, other.discografia)) {
            return false;
        }
        return Objects.equals(this.salarioFinal, other.salarioFinal);
    }
//Metodos para la agregacion de disco a cantante
public void agregarDisco(Disco disco) {
    discografia.add(disco);
}

public void actualizarDisco(int codigo, String nombre, int anioDeLanzamiento) {
    for (Disco disco : discografia) {
        if (disco.getCodigo() == codigo) {
            disco.setNombre(nombre);
            disco.setAnioDeLanzamiento(anioDeLanzamiento);
            break;
        }
    }
}

public void eliminarDisco(int codigo) {
    Disco discoAEliminar = null;
    for (Disco disco : discografia) {
        if (disco.getCodigo() == codigo) {
            discoAEliminar = disco;
            break;
        }
    }
    if (discoAEliminar != null) {
        discografia.remove(discoAEliminar);
    }
}

public List<Disco> listarDiscos() {
    return discografia;
}

public Disco buscarDisco(int codigo) {
    for (Disco disco : discografia) {
        if (disco.getCodigo() == codigo) {
            return disco;
        }
    }
    return null;
}
    @Override
    public String toString() {
        return "Cantante{" + "nombreArtistico=" + nombreArtistico + ", generoMusical=" + generoMusical + ", numeroDeSencillos=" + numeroDeSencillos + ", numeroDeGiras=" + numeroDeGiras + ", discografia=" + discografia + ", salarioFinal=" + salarioFinal + '}';
    }
    
    


}

    

