/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.controlador;

import ec.edu.ups.edu.practica05_interface.test.IDao.ICantanteDao;
import ec.edu.ups.edu.practica05_interface.test.modelo.Cantante;
import ec.edu.ups.edu.practica05_interface.test.modelo.Disco;
import java.util.List;


public class CantanteControlador {
    private Cantante cantante;
    private ICantanteDao cantanteDAO;
    private List<Disco> listaDiscos;

    public CantanteControlador(ICantanteDao cantanteDAO) {        
        this.cantanteDAO = cantanteDAO;
    }
    
    public void crear(Cantante cantante){
        this.cantante = cantante;
        cantanteDAO.create(cantante);
    }
    
    public Cantante buscar(int codigo){
        this.cantante = cantanteDAO.read(codigo);
        return this.cantante;
    }
    
    public Cantante Eliminar(int codigo){
        this.cantante = cantante;
        cantanteDAO.delete(codigo);
        return cantante;
        
    }
        public boolean actualizar (Cantante cantante){
     Cantante cantanteEncontrado = this.buscar(cantante.getCodigo());
        if(cantanteEncontrado != null){
        cantanteDAO.update(cantante);
        return true;
        }
        return false;
    }
    
    public List<Cantante> Listar (){
        return cantanteDAO.list();
    }
    
      public void ingresarDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        this.cantante = cantante;

        cantanteDAO.createDisco(this.cantante, codigo, nombre, anioDeLanzamiento);
        cantanteDAO.update(this.cantante);
    }

    public Disco buscarDisco(Cantante cantante, int codigo) {
        this.cantante = cantante;
        return cantanteDAO.readDisco(this.cantante, codigo);
    }

    public boolean eliminarDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        this.cantante = cantante;
        Disco disco = this.buscarDisco(this.cantante, codigo);
        if (disco != null) {
            cantanteDAO.deleteDisco(this.cantante, codigo, nombre, anioDeLanzamiento);
            cantanteDAO.update(this.cantante);
            return true;
        } else {
            return false;
        }
    }

    public boolean actualizarDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        this.cantante = cantante;
        Disco disco = this.buscarDisco(cantante, codigo);
        if (disco != null) {
            cantanteDAO.updateDisco(this.cantante, codigo, nombre, anioDeLanzamiento);
            cantanteDAO.update(this.cantante);
            return true;
        } else {
            return false;
        }
    }

    public List<Disco> listarDiscos(Cantante cantante) {
        this.cantante = cantante;
        return cantanteDAO.findAllDisco(this.cantante);
    }
    
}
    


