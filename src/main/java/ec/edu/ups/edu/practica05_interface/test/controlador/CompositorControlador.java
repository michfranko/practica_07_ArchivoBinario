/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.controlador;

import ec.edu.ups.edu.practica05_interface.test.IDao.ICantanteDao;
import ec.edu.ups.edu.practica05_interface.test.IDao.ICompositorDao;
import ec.edu.ups.edu.practica05_interface.test.modelo.Cancion;
import ec.edu.ups.edu.practica05_interface.test.modelo.Cantante;
import ec.edu.ups.edu.practica05_interface.test.modelo.Compositor;
import java.util.List;


public class CompositorControlador {
    private Compositor compositor;
    private Cantante cantante;
    
    private ICompositorDao compositorDAO;
    private ICantanteDao cantanteDAO;

    public CompositorControlador(ICompositorDao compositorDAO) {        
        this.compositorDAO = compositorDAO;
        this.cantanteDAO = cantanteDAO;
    }
    
    public void crear(Compositor compositor){
        this.compositor = compositor;
        compositorDAO.create(compositor);
    }
    
    public Compositor buscar(int codigo){
        this.compositor = compositorDAO.read(codigo);
        return this.compositor;
    }
    
    public Compositor Eliminar(int codigo){
        this.compositor = compositor;
        compositorDAO.delete(codigo);
        return compositor;
        
    }
        public boolean actualizar (Compositor compositor){
     Compositor compositorEncontrado = this.buscar(compositor.getCodigo());
        if(compositorEncontrado != null){
        compositorDAO.update(compositor);
        return true;
        }
        return false;
    }
    
    public List<Compositor> Listar (){
        return compositorDAO.list();
    }
    
    //metodo para cantante
    public void agregarCliente(Compositor compositor, Cantante cantante) {
        this.compositor = compositor;
        this.cantante = cantante;

        this.compositor.agregarCliente(this.cantante);
        compositorDAO.update(this.compositor);
    }

    public void eliminarCliente(Compositor compositor, Cantante cantante) {
        this.compositor = compositor;
        this.cantante = cantante;
        this.compositor.eliminarCliente(this.cantante);
        compositorDAO.update(this.compositor);
    }

    public List<Cantante> listarCantantes(Compositor compositor) {

        this.compositor = compositor;
        return this.compositor.listarCantantes();
    }

    public void actualizarCliente(Compositor compositor, Cantante cantanteAnterior, Cantante cantanteNuevo) {
        this.compositor = compositor;
        this.eliminarCliente(this.compositor, cantanteAnterior);
        this.agregarCliente(this.compositor, cantanteNuevo);
    }

    public Cantante buscarCantante(Compositor compositor, int codigo) {
        this.compositor = compositor;
        return this.compositor.buscarCantante(codigo);
    }

    //metodos para canciones
    public void agregarCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
        this.compositor = compositor;
        compositorDAO.createCancion(this.compositor, codigo, titulo, letra, tiempoEnMinutos);
        compositorDAO.update(this.compositor);
    }

    public Cancion buscarCancion(Compositor compositor, int codigo) {
        this.compositor = compositor;
        return compositorDAO.readCancion(this.compositor, codigo);
    }

    public boolean eliminarCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
        this.compositor = compositor;
        Cancion cancion = this.buscarCancion(this.compositor, codigo);
        if (cancion != null) {
            compositorDAO.deleteCancion(this.compositor, codigo, titulo, letra, tiempoEnMinutos);
            compositorDAO.update(this.compositor);
            return true;
        } else {
            return false;
        }

    }

    public boolean actualizarCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
        this.compositor = compositor;
        Cancion cancion = this.buscarCancion(compositor, codigo);
        if (cancion != null) {
            compositorDAO.updateCancion(this.compositor, codigo, titulo, letra, tiempoEnMinutos);
            compositorDAO.update(this.compositor);
            return true;
        } else {
            return false;
        }
    }

    public List<Cancion> listarCanciones(Compositor compositor) {
        this.compositor = compositor;
        return compositorDAO.findAllCanciones(this.compositor);
    }
    


}


