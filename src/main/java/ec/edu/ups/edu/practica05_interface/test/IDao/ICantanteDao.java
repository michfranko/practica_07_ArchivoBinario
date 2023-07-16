/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.IDao;
import ec.edu.ups.edu.practica05_interface.test.modelo.Cantante;
import ec.edu.ups.edu.practica05_interface.test.modelo.Disco;
import java.util.List;

/**
 *
 * @author jf001
 */
public interface ICantanteDao {
    
    
    
    public void create(Cantante cantante);
    public Cantante read(int codigo);
    public void update(Cantante cantante);
    public void delete(int codigo);
    public List<Cantante> list();
    
   public void createDisco (Cantante cantante, int codigo, String nombre, int anioDeLanzamiento);
    public Disco readDisco(Cantante cantante, int codigo);
    public void updateDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento);
    public void deleteDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento);
    public List<Disco> findAllDisco(Cantante cantante);
    
}
