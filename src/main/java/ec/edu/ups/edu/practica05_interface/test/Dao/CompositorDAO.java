/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.Dao;

import ec.edu.ups.edu.practica05_interface.test.IDao.ICompositorDao;
import ec.edu.ups.edu.practica05_interface.test.modelo.Cancion;
import ec.edu.ups.edu.practica05_interface.test.modelo.Compositor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CompositorDAO implements ICompositorDao {
    private static final String FOLDER_NAME = "Administración de Datos Musik UPS";
    private static final String FILE_NAME = "compositores.dat";
    private static final String CANCIONES_FILE_NAME = "Canciones.dat";
    private Set<Integer> compositoresGuardados;
    private String rutaActual;
    private List<Compositor> listaCompositores;

    public CompositorDAO() {
        listaCompositores = loadCompositores();
        rutaActual = "";
        compositoresGuardados = new HashSet<>();
        for (Compositor compositor : listaCompositores) {
            compositoresGuardados.add(compositor.getCodigo());
        }
    }

    public void setRutaActual(String ruta) {
        rutaActual = ruta;
    }

    public String getRutaActual() {
        return rutaActual;
    }

    private String getFolderPath() {
        String folderPath = rutaActual + File.separator + FOLDER_NAME;
        File folder = new File(folderPath);

        // Si la carpeta no existe, se crea
        if (!folder.exists()) {
            folder.mkdirs();
        }

        return folderPath;
    }

    private String getFilePath() {
        return getFolderPath() + File.separator + FILE_NAME;
    }

    private String getCancionesFilePath() {
        return getFolderPath() + File.separator + CANCIONES_FILE_NAME;
    }

    private List<Compositor> loadCompositores() {
        List<Compositor> compositores = new ArrayList<>();
        RandomAccessFile file = null;

        try {
            file = new RandomAccessFile(getFilePath(), "r");
            String line;
            while ((line = file.readLine()) != null) {
                if (line.startsWith("------Datos compositor")) {
                    continue; // Saltar la línea de separación
                }
                if (!line.contains(":")) {
                    continue; // Ignorar líneas que no contienen campos válidos
                }
                String[] data = line.split(":", 2);
                String fieldName = data[0].trim();
                String fieldValue = data[1].trim();

                Compositor compositor = new Compositor(); // Crear el objeto Compositor

                switch (fieldName) {
                    case "Código":
                        int codigo = Integer.parseInt(fieldValue);
                        compositor.setCodigo(codigo);
                        break;
                    case "Nombre":
                        compositor.setNombre(fieldValue);
                        break;
                    case "Apellido":
                        compositor.setApellido(fieldValue);
                        break;
                    case "Edad":
                        int edad = Integer.parseInt(fieldValue);
                        compositor.setEdad(edad);
                        break;
                    case "Nacionalidad":
                        compositor.setNacionalidad(fieldValue);
                        break;
                    case "Número de Composiciones":
                        int numeroDeComposiciones = Integer.parseInt(fieldValue);
                        compositor.setNumeroDeComposiciones(numeroDeComposiciones);
                        break;
                    case "Salario Final":
                        double salarioFinal = Double.parseDouble(fieldValue);
                        compositor.setSalarioFinal(salarioFinal);
                        break;
                    case "Canciones Top":
                        int cancionesTop = Integer.parseInt(fieldValue);
                        compositor.setCancionesTop(cancionesTop);
                        break;
                    // Resto de los campos...
                }

                compositores.add(compositor); // Agregar el compositor a la lista
            }
        } catch (IOException e) {
            // Manejar excepciones en caso de que el archivo no exista o no se pueda leer
        } finally {
            if (file != null) {
                try {
                    file.close(); // Cerrar el archivo
                } catch (IOException e) {
                    // Manejar excepciones en caso de que no se pueda cerrar el archivo
                }
            }
        }

        return compositores;
    }

    private void saveCompositores() {
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile(getFilePath(), "rw");
            file.setLength(0);
            for (Compositor compositor : listaCompositores) {
                file.seek(file.length());
                file.writeBytes("------Datos compositor " + compositor.getCodigo() + "----------\n");
                file.writeBytes("Código: " + compositor.getCodigo() + "    \n");
                file.writeBytes("Nombre: " + compositor.getNombre() + "              \n");
                file.writeBytes("Apellido: " + compositor.getApellido() + "            \n");
                file.writeBytes("Edad: " + compositor.getEdad() + "   \n");
                file.writeBytes("Nacionalidad: " + compositor.getNacionalidad() + "         \n");
                file.writeBytes("Número de Composiciones: " + compositor.getNumeroDeComposiciones() + " \n");
                file.writeBytes("Salario Final: " + compositor.getSalarioFinal() + "       \n");
                file.writeBytes("Canciones Top: " + compositor.getCancionesTop() + "     \n");
                // Resto de los campos...
            }
        } catch (IOException e) {
            // Manejar excepciones en caso de que no se pueda escribir en el archivo
        } finally {
            if (file != null) {
                try {
                    file.close(); // Cerrar el archivo
                } catch (IOException e) {
                    // Manejar excepciones en caso de que no se pueda cerrar el archivo
                }
            }
        }
    }

    @Override
    public void create(Compositor compositor) {
        if (compositoresGuardados.contains(compositor.getCodigo())) {
            update(compositor); // El compositor ya existe, actualizar sus datos
            return;
        }

        listaCompositores.add(compositor);
        compositoresGuardados.add(compositor.getCodigo());
        saveCompositores();
    }

    @Override
    public Compositor read(int codigo) {
        Compositor compositor = null;
        for (Compositor c : listaCompositores) {
            if (c.getCodigo() == codigo) {
                compositor = c;
                break;
            }
        }

        if (compositor != null) {
            // Realizar acciones adicionales si es necesario
        }

        return compositor;
    }

    @Override
    public void update(Compositor compositor) {
        boolean existeCompositor = false;
        int index = -1;

        // Verificar si el compositor ya existe en la lista
        for (int i = 0; i < listaCompositores.size(); i++) {
            Compositor compositorGuardado = listaCompositores.get(i);
            if (compositorGuardado.getCodigo() == compositor.getCodigo()) {
                existeCompositor = true;
                index = i;
                break;
            }
        }

        // Si el compositor existe, actualizar sus datos y guardar los cambios
        if (existeCompositor && index != -1) {
            listaCompositores.set(index, compositor);
            saveCompositores();
        }
    }

    @Override
    public void delete(int codigo) {
        Compositor compositorEncontrado = null;

        // Buscar el compositor por código
        for (Compositor compositor : listaCompositores) {
            if (compositor.getCodigo() == codigo) {
                compositorEncontrado = compositor;
                break;
            }
        }

        // Si se encontró el compositor, eliminarlo de la lista y guardar los cambios
        if (compositorEncontrado != null) {
            listaCompositores.remove(compositorEncontrado);
            saveCompositores();
        }
    }

    @Override
    public List<Compositor> list() {
        return listaCompositores;
    }

    // Implementación para Cancion
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

    private void saveCanciones() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(getCancionesFilePath()))) {
            for (Compositor compositor : listaCompositores) {
                for (Cancion cancion : compositor.listarCanciones()) {
                    writer.write("_________________________datos de cancion " + cancion.getCodigo() + "______________________");
                    writer.newLine();
                    writer.write("---------datos de Compositor-------");
                    writer.newLine();
                    writer.write("nombre: " + compositor.getNombre());
                    writer.newLine();
                    writer.write("apellido: " + compositor.getApellido());
                    writer.newLine();
                    writer.write("edad: " + compositor.getEdad());
                    writer.newLine();
                    writer.write("---------datos de cancion--------");
                    writer.newLine();
                    writer.write("código: " + cancion.getCodigo());
                    writer.newLine();
                    writer.write("titulo: " + cancion.getTitulo());
                    writer.newLine();
                    writer.write("letra: " + cancion.getLetra());
                    writer.newLine();
                    writer.write("tiempo en minutos: " + cancion.getTiempoEnMinutos());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            // Manejar excepciones en caso de que no se pueda escribir en el archivo
        }
    }

    @Override
    public void createCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
        compositor.agregarCancion(codigo, titulo, letra, tiempoEnMinutos);
        saveCanciones();
    }

    @Override
    public Cancion readCancion(Compositor compositor, int codigo) {
        Cancion cancion = compositor.buscarCancion(codigo);
        if (cancion != null) {
            // Realizar acciones adicionales si es necesario
        }
        return cancion;
    }

    @Override
    public void updateCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
        Cancion cancion = compositor.buscarCancion(codigo);
        if (cancion != null) {
            cancion.setTitulo(titulo);
            cancion.setLetra(letra);
            cancion.setTiempoEnMinutos(tiempoEnMinutos);
            saveCanciones();
        }
    }

    @Override
    public void deleteCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
        compositor.eliminarCancion(codigo, titulo, letra, tiempoEnMinutos);
        saveCanciones();
    }

    @Override
    public List<Cancion> findAllCanciones(Compositor compositor) {
        return compositor.listarCanciones();
    }
}
