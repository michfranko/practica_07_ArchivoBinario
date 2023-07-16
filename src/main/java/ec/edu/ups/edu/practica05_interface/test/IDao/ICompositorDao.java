/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.IDao;

import ec.edu.ups.edu.practica05_interface.test.modelo.Cancion;
import ec.edu.ups.edu.practica05_interface.test.modelo.Compositor;
import java.util.List;

/**
 *
 * @author jf001
 */
public interface ICompositorDao {
    
    public void create(Compositor compositor);
    public Compositor read(int codigo);
    public void update(Compositor operadora);
    public void delete(int codigo);
    public List<Compositor> list();
    
    
    public void createCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos);
    public Cancion readCancion(Compositor compositor, int codigo);
    public void updateCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos);
    public void deleteCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos);
    public List<Cancion> findAllCanciones(Compositor compositor);
}
