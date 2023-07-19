/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.Dao;

import ec.edu.ups.edu.practica05_interface.test.IDao.ICompositorDao;
import ec.edu.ups.edu.practica05_interface.test.modelo.Cancion;
import ec.edu.ups.edu.practica05_interface.test.modelo.Compositor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CompositorDAO implements ICompositorDao {
     private String ruta;

    public CompositorDAO() {
        this.ruta = "compositores.dat";
    }
     
     

    @Override
    public void create(Compositor compositor) {
         try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(ruta, true));
            writer.write(compositorToString(compositor));
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Compositor read(int codigo) {
               try {
            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            String linea;
            while ((linea = reader.readLine()) != null) {
                Compositor compositor = stringToCompositor(linea);
                if (compositor.getCodigo() == codigo) {
                    reader.close();
                    return compositor;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    return null;
}

    @Override
    public void update(Compositor compositor) {
    try {
            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            List<String> lineas = new ArrayList<>();
            String linea;
            while ((linea = reader.readLine()) != null) {
                Compositor c = stringToCompositor(linea);
                if (c.getCodigo() == compositor.getCodigo()) {
                    lineas.add(compositorToString(compositor));
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
                Compositor compositor = stringToCompositor(linea);
                if (compositor.getCodigo() != codigo) {
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
    public List<Compositor> list() {
              List<Compositor> listaCantantes = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            String linea;
            while ((linea = reader.readLine()) != null) {
                Compositor compositor = stringToCompositor(linea);
                listaCantantes.add(compositor);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaCantantes;
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
    
  //Metodos para funcionamiento de CRUD
   private String compositorToString(Compositor compositor) {
        StringBuilder sb = new StringBuilder();
        sb.append(compositor.getCodigo()).append(",")
                .append(compositor.getNombre()).append(",")
                .append(compositor.getApellido()).append(",")
                .append(compositor.getEdad()).append(",")
                .append(compositor.getNacionalidad()).append(",")
                .append(compositor.getSalario()).append(",")
                .append(compositor.getSalarioFinal()).append(",")
                .append(compositor.getCancionesTop()).append(",");
        
        List<Cancion> canciones = compositor.getCancionesCompositor();
        if (canciones != null && !canciones.isEmpty()) {
            sb.append("[");
            for (Cancion cancion : canciones) {
                sb.append(cancionToString(cancion)).append(";");
            }
            sb.append("]");
        }
        
        return sb.toString();
    }
   
   private Compositor stringToCompositor(String linea) {
        String[] partes = linea.split(",");
        int codigo = Integer.parseInt(partes[0]);
        String nombre = partes[1];
        String apellido = partes[2];
        int edad = Integer.parseInt(partes[3]);
        String nacionalidad = partes[4];
        double salario = Double.parseDouble(partes[5]);
        double salarioFinal=Double.parseDouble(partes[6]);
        int cancionesTop=Integer.parseInt(partes[7]);
 
        Compositor compositor = new Compositor(salarioFinal, cancionesTop, codigo, nombre, apellido, edad, nacionalidad, salario);
        
        if (partes.length > 8) {
            String ComposicionesStr = partes[8];
            ComposicionesStr = ComposicionesStr.substring(1,ComposicionesStr.length() - 1);
            String[] discos = ComposicionesStr.split(";");
            
            for (String cancionStr : discos) {
                Cancion cancion = stringToCancion(cancionStr);
                compositor.getCancionesCompositor().add(cancion);
            }
        }
        
        return compositor;
    }
   
   private String cancionToString(Cancion cancion) {
        return cancion.getCodigo() + ":" + cancion.getTitulo() + ":" + cancion.getLetra()+ ":" + cancion.getTiempoEnMinutos();
    }
    
    private Cancion stringToCancion(String cancionStr) {
        String[] partes = cancionStr.split(":");
        int codigo = Integer.parseInt(partes[0]);
        String titulo = partes[1];
        String letra = partes[2];
        double tiempo =Double.parseDouble(partes[3]);
        return new Cancion(codigo,titulo,letra,tiempo);
    }



}
