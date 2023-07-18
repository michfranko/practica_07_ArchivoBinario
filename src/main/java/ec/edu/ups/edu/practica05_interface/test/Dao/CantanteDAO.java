/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.Dao;
import ec.edu.ups.edu.practica05_interface.test.IDao.ICantanteDao;
import ec.edu.ups.edu.practica05_interface.test.modelo.Cantante;
import ec.edu.ups.edu.practica05_interface.test.modelo.Disco;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CantanteDAO implements ICantanteDao {
    private String ruta;

    public CantanteDAO() {
        this.ruta = "cantantes.txt";
    }

    @Override
    public void create(Cantante cantante) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(ruta, true));
            writer.write(cantanteToString(cantante));
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Cantante read(int codigo) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            String linea;
            while ((linea = reader.readLine()) != null) {
                Cantante cantante = stringToCantante(linea);
                if (cantante.getCodigo() == codigo) {
                    reader.close();
                    return cantante;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(Cantante cantante) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            List<String> lineas = new ArrayList<>();
            String linea;
            while ((linea = reader.readLine()) != null) {
                Cantante c = stringToCantante(linea);
                if (c.getCodigo() == cantante.getCodigo()) {
                    lineas.add(cantanteToString(cantante));
                } else {
                    lineas.add(linea);
                }
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(ruta));
            for (String l : lineas) {
                writer.write(l);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int codigo) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            List<String> lineas = new ArrayList<>();
            String linea;
            while ((linea = reader.readLine()) != null) {
                Cantante cantante = stringToCantante(linea);
                if (cantante.getCodigo() != codigo) {
                    lineas.add(linea);
                }
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(ruta));
            for (String l : lineas) {
                writer.write(l);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Cantante> list() {
        List<Cantante> listaCantantes = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            String linea;
            while ((linea = reader.readLine()) != null) {
                Cantante cantante = stringToCantante(linea);
                listaCantantes.add(cantante);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaCantantes;
    }


     @Override
    public void createDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        cantante.agregarDisco(codigo, nombre, anioDeLanzamiento);
        update(cantante);
    }

    @Override
    public Disco readDisco(Cantante cantante, int codigo) {
        return cantante.buscarDisco(codigo);
    }

    @Override
    public void updateDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        cantante.actualizarDisco(codigo, nombre, anioDeLanzamiento);
        update(cantante);
    }

    @Override
    public void deleteDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        cantante.eliminarDisco(codigo, nombre, anioDeLanzamiento);
        update(cantante);
    }

    @Override
    public List<Disco> findAllDisco(Cantante cantante) {
        return cantante.listarDiscos();
    }

   
//Metodos funcionamiento CRUD
        private String cantanteToString(Cantante cantante) {
        StringBuilder sb = new StringBuilder();
        sb.append(cantante.getCodigo()).append(",")
                .append(cantante.getNombre()).append(",")
                .append(cantante.getApellido()).append(",")
                .append(cantante.getEdad()).append(",")
                .append(cantante.getNacionalidad()).append(",")
                .append(cantante.getSalario()).append(",")
                .append(cantante.getSalarioFinal()).append(",")
                .append(cantante.getGeneroMusical()).append(",")
                .append(cantante.getNombreArtistico()).append(",")
                .append(cantante.getNumeroDeSencillos()).append(",")
                .append(cantante.getNumeroDeGiras()).append(",");
        
        List<Disco> discografia = cantante.getDiscografia();
        if (discografia != null && !discografia.isEmpty()) {
            sb.append("[");
            for (Disco disco : discografia) {
                sb.append(discoToString(disco)).append(";");
            }
            sb.append("]");
        }
        
        return sb.toString();
    }

    private Cantante stringToCantante(String linea) {
        String[] partes = linea.split(",");
        int codigo = Integer.parseInt(partes[0]);
        String nombre = partes[1];
        String apellido = partes[2];
        int edad = Integer.parseInt(partes[3]);
        String nacionalidad = partes[4];
        double salario = Double.parseDouble(partes[5]);
        double salarioFinal=Double.parseDouble(partes[6]);
        String generoMusical=partes[7];
        String nombreArtistico=partes[8];
        int sencillos=Integer.parseInt(partes[9]);
        int giras=Integer.parseInt(partes[10]);
 
        Cantante cantante = new Cantante(nombreArtistico, generoMusical, sencillos, giras, salarioFinal, codigo, nombre, apellido, edad, nacionalidad, salario);
        
        if (partes.length > 11) {
            String discografiaStr = partes[11];
            discografiaStr = discografiaStr.substring(1, discografiaStr.length() - 1);
            String[] discos = discografiaStr.split(";");
            
            for (String discoStr : discos) {
                Disco disco = stringToDisco(discoStr);
                cantante.getDiscografia().add(disco);
            }
        }
        
        return cantante;
    }
    
    private String discoToString(Disco disco) {
        return disco.getCodigo() + ":" + disco.getNombre() + ":" + disco.getAnioDeLanzamiento();
    }
    
    private Disco stringToDisco(String discoStr) {
        String[] partes = discoStr.split(":");
        int codigo = Integer.parseInt(partes[0]);
        String nombre = partes[1];
        int anioDeLanzamiento = Integer.parseInt(partes[2]);
        return new Disco(codigo, nombre, anioDeLanzamiento);
    }


}