/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.modelo;
import ec.edu.ups.edu.practica05_interface.test.Dao.CompositorDAO;
import java.util.Objects;

import java.util.ArrayList;
import java.util.List;

public class Compositor extends Persona {
    private Double salarioFinal;
    private int cancionesTop;
     private List<Cancion> cancionesCompositor;
    private List<Cantante> clientes;
     

    public Compositor(Double salarioFinal, int cancionesTop, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.salarioFinal = salarioFinal;
        this.cancionesTop = cancionesTop;
        cancionesCompositor= new ArrayList<>();
        this.clientes = new ArrayList<>();
       
    }

    public Compositor() {
      this.cancionesCompositor = new ArrayList<>();
       this.clientes = new ArrayList<>();
     
   }



    public int getCancionesTop() {
        return cancionesTop;
    }

    public void setCancionesTop(int cancionesTop) {
        this.cancionesTop = cancionesTop;
    }

    public List<Cancion> getCancionesCompositor() {
        return cancionesCompositor;
    }

    public void setCancionesCompositor(List<Cancion> cancionesCompositor) {
        this.cancionesCompositor = cancionesCompositor;
    }

    
    
    public Double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(Double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }
        

    public List<Cantante> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cantante> clientes) {
        this.clientes = clientes;
    }
//getters y setters de persona para Compositor
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
        int hash = 3;
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
        final Compositor other = (Compositor) obj;
        if (this.cancionesTop != other.cancionesTop) {
            return false;
        }
        if (!Objects.equals(this.salarioFinal, other.salarioFinal)) {
            return false;
        }
        if (!Objects.equals(this.cancionesCompositor, other.cancionesCompositor)) {
            return false;
        }
        return Objects.equals(this.clientes, other.clientes);
    }

   
   

    // Metodo para agergar canciones a compositor
    public void agregarCancion(int codigo, String titulo, String letra, double tiempoEnMinutos) {
        Cancion cancion = new Cancion(codigo, titulo, letra, tiempoEnMinutos);
        cancionesCompositor.add(cancion);
    }

    public void actualizarCancion(int codigo, String titulo, String letra, double tiempoEnMinutos) {
        Cancion cancion = new Cancion(codigo, titulo, letra, tiempoEnMinutos);
        if (cancionesCompositor.contains(cancion)) {
            int index = cancionesCompositor.indexOf(cancion);
            cancionesCompositor.set(index, cancion);
        }
    }

    public void eliminarCancion(int codigo, String titulo, String letra, double tiempoEnMinutos) {
        Cancion cancion = new Cancion(codigo, titulo, letra, tiempoEnMinutos);
        if (cancionesCompositor.contains(cancion)) {
            int index = cancionesCompositor.indexOf(cancion);
            cancionesCompositor.remove(index);
        }
    }

    public List<Cancion> listarCanciones() {
        return cancionesCompositor;
    }

    public Cancion buscarCancion(int codigo) {
        for (Cancion cancion : cancionesCompositor) {
            if (cancion.getCodigo() == codigo) {
                return cancion;
            }
        }
        return null;
    }

    // Metodo para agregar cliente (cantante) a compositor
    public void agregarCliente(Cantante cliente) {
        clientes.add(cliente);
    }

    public void actualizarCliente(Cantante cantante) {
        if (clientes.contains(cantante)) {
            int index = clientes.indexOf(cantante);
            clientes.set(index, cantante);
        }
    }

    public void eliminarCliente(Cantante cantante) {
        if (clientes.contains(cantante)) {
            int index = clientes.indexOf(cantante);
            clientes.remove(index);
        }
    }

    public List<Cantante> listarCantantes() {
        return clientes;
    }

    public Cantante buscarCantante(int codigo) {

        for (Cantante cantante : clientes) {
            if (cantante.getCodigo() == codigo) {
                return cantante;
            }

        }
        return null;
    }
    
    
    
    @Override
    public String toString() {
        return "Compositor{" + ", salarioFinal=" + salarioFinal + ", cancionesTop=" + cancionesTop + ", clientes=" + clientes + '}';
    }
    
}
