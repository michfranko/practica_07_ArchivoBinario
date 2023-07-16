/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.Dao;

import ec.edu.ups.edu.practica05_interface.test.IDao.ICantanteDao;
import ec.edu.ups.edu.practica05_interface.test.modelo.Cantante;
import ec.edu.ups.edu.practica05_interface.test.modelo.Disco;
import java.util.ArrayList;
import java.util.List;



public class CantanteDAO implements ICantanteDao {
     private List<Cantante> listaCantantes;

    public CantanteDAO() {
         listaCantantes = new ArrayList<>();
    }
     

    @Override
    public void create(Cantante cantante) {
        listaCantantes.add(cantante);
    }

    @Override
    public Cantante read(int codigo) {
    for (Cantante cantante :listaCantantes) {
       if (cantante.getCodigo() == codigo) {
        return cantante;
           }
       }
    return null;
    }

    @Override
    public void update(Cantante cantante) {
      for (int i = 0; i < listaCantantes.size(); i++) {
         Cantante cantanteGuardado = listaCantantes.get(i);
            if(cantanteGuardado.getCodigo()== (cantante.getCodigo())){
              listaCantantes.set(i, cantante);
                break;
            }                        
        }
    }

    @Override
    public void delete(int codigo) {
      for (int i = 0; i < listaCantantes.size(); i++) {
        Cantante cantanteGuardado = listaCantantes.get(i);
            if(cantanteGuardado.getCodigo()==(codigo)){
                listaCantantes.remove(i);
                break;
            }                        
        }  
    }

    @Override
    public List<Cantante> list() {
         return listaCantantes;
    }
    
    public Cantante buscarPorDisco(String valor) {
        //Se recorre la lista personas con el forEach
        for (Cantante cantante : listaCantantes) {
            //Se pregunta si la persona es de tipo Cantante

            // Se recorre la lista de discografias del cantante
            for (Disco disco : cantante.listarDiscos()) {
                if (disco.getNombre().equals(valor)) {
                    //Se retorna el cantante que tiene el disco y se imprime el nombre y el apellido
                    System.out.println(cantante.getNombre() + " " + cantante.getApellido());
                    return cantante;
                }
            }

        }
        return null;

    }

    @Override
    public void createDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        cantante.agregarDisco(codigo,nombre,anioDeLanzamiento);
    }

    @Override
    public Disco readDisco(Cantante cantante, int codigo) {
        return cantante.buscarDisco(codigo);
    }

    @Override
    public void updateDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        cantante.actualizarDisco(codigo, nombre, anioDeLanzamiento);
    }

    @Override
    public void deleteDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        cantante.eliminarDisco(codigo, nombre, anioDeLanzamiento);
    }

    @Override
    public List<Disco> findAllDisco(Cantante cantante) {
        return cantante.listarDiscos();
    }
  
}
