/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.Dao;

import ec.edu.ups.edu.practica05_interface.test.IDao.ICompositorDao;
import ec.edu.ups.edu.practica05_interface.test.modelo.Cancion;
import ec.edu.ups.edu.practica05_interface.test.modelo.Compositor;
import java.util.ArrayList;
import java.util.List;



public class CompositorDAO implements ICompositorDao {
     private List<Compositor> listaCompositores;

    public CompositorDAO() {
         listaCompositores = new ArrayList<>();
    }
     
     

    @Override
    public void create(Compositor compositor) {
          listaCompositores.add(compositor);
    }

    @Override
    public Compositor read(int codigo) {
       for (Compositor compositor : listaCompositores) {
           if (compositor.getCodigo() == codigo) {
            return compositor;
           }
       }
    return null;
}

    @Override
    public void update(Compositor compositor) {
                for (int i = 0; i < listaCompositores.size(); i++) {
            Compositor compositorGuardada = listaCompositores.get(i);
            if(compositorGuardada.getCodigo()== (compositor.getCodigo())){
                listaCompositores.set(i, compositor);
                break;
            }                        
        }
    }

    @Override
    public void delete(int codigo) {
              for (int i = 0; i < listaCompositores.size(); i++) {
            Compositor compositorGuardado = listaCompositores.get(i);
            if(compositorGuardado.getCodigo()==(codigo)){
                listaCompositores.remove(i);
                break;
            }                        
        }
    }   

    @Override
    public List<Compositor> list() {
         return listaCompositores;
    }
    
    
    
    public Compositor buscarPorCancion(String valor) {
        for (Compositor compositor : listaCompositores) {
                for (Cancion cancion : compositor.listarCanciones()) {
                    if (cancion.getTitulo().equals(valor)) {
                        System.out.println(compositor.getNombre() + " " + compositor.getApellido());
                        return compositor;
                    }
                
            }
        }
        return null;
    }

    @Override
    public void createCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
        compositor.agregarCancion(codigo, titulo, letra, tiempoEnMinutos);
    }

    @Override
    public Cancion readCancion(Compositor compositor, int codigo) {
        return compositor.buscarCancion(codigo);
    }

    @Override
    public void updateCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
        compositor.actualizarCancion(codigo, titulo, letra, tiempoEnMinutos);
    }

    @Override
    public void deleteCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
       compositor.eliminarCancion(codigo, titulo, letra, tiempoEnMinutos);
    }

    @Override
    public List<Cancion> findAllCanciones(Compositor compositor) {
        return compositor.listarCanciones();
    } 
    
    
}


   

