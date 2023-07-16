/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.Dao;

import ec.edu.ups.edu.practica05_interface.test.IDao.ICantanteDao;
import ec.edu.ups.edu.practica05_interface.test.modelo.Cantante;
import ec.edu.ups.edu.practica05_interface.test.modelo.Disco;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class CantanteDAO implements ICantanteDao {
    private static final String FOLDER_NAME = "Administración de Datos Musik UPS";
    private static final String FILE_NAME = "cantantes.dat";
    private static final String DISCOS_FILE_NAME = "Discos.dat";
    private Set<Integer> cantantesGuardados;
    private String rutaActual;
    private List<Cantante> listaCantantes;

    public CantanteDAO() {
        listaCantantes = loadCantantes();
        rutaActual = "";
        cantantesGuardados = new HashSet<>();
        for (Cantante cantante : listaCantantes) {
            cantantesGuardados.add(cantante.getCodigo());
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

    private String getDiscosFilePath() {
        return getFolderPath() + File.separator + DISCOS_FILE_NAME;
    }

   private List<Cantante> loadCantantes() {
    List<Cantante> cantantes = new ArrayList<>();
    RandomAccessFile file = null;

    try {
        file = new RandomAccessFile(getFilePath(), "r");
        String line;
        while ((line = file.readLine()) != null) {
            if (line.startsWith("------Datos cantante")) {
                continue; // Saltar la línea de separación
            }
            if (!line.contains(":")) {
                continue; // Ignorar líneas que no contienen campos válidos
            }
            String[] data = line.split(":", 2);
            String fieldName = data[0].trim();
            String fieldValue = data[1].trim();

            Cantante cantante = new Cantante(); // Crear el objeto Cantante

            switch (fieldName) {
                case "Código":
                    int codigo = Integer.parseInt(fieldValue);
                    cantante.setCodigo(codigo);
                    break;
                case "Nombre":
                    cantante.setNombre(fieldValue);
                    break;
                case "Apellido":
                    cantante.setApellido(fieldValue);
                    break;
                case "Edad":
                    int edad = Integer.parseInt(fieldValue);
                    cantante.setEdad(edad);
                    break;
                case "Nacionalidad":
                    cantante.setNacionalidad(fieldValue);
                    break;
                case "Salario":
                    double salario = Double.parseDouble(fieldValue);
                    cantante.setSalario(salario);
                    break;
                case "Nombre Artistico":
                    cantante.setNombreArtistico(fieldValue);
                    break;
                case "Genero Musical":
                    cantante.setGeneroMusical(fieldValue);
                    break;
                case "Número de Sencillos":
                    int numeroDeSencillos = Integer.parseInt(fieldValue);
                    cantante.setNumeroDeSencillos(numeroDeSencillos);
                    break;
                case "Número de Conciertos":
                    int numeroDeConciertos = Integer.parseInt(fieldValue);
                    cantante.setNumeroDeConciertos(numeroDeConciertos);
                    break;
                case "Número de Giras":
                    int numeroDeGiras = Integer.parseInt(fieldValue);
                    cantante.setNumeroDeGiras(numeroDeGiras);
                    break;
                case "Salario Final":
                    double salarioFinal = Double.parseDouble(fieldValue);
                    cantante.setSalarioFinal(salarioFinal);
                    break;
                // Resto de los campos...
            }

            cantantes.add(cantante); // Agregar el cantante a la lista
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

    return cantantes;
}


private void saveCantantes() {
    RandomAccessFile file = null;
    try {
        file = new RandomAccessFile(getFilePath(), "rw");
            file.setLength(0);
        for (Cantante cantante : listaCantantes) {

            file.seek(file.length()); 
            file.writeBytes("------Datos cantante " + cantante.getCodigo() + "----------\n");
            file.writeBytes("Código: " + cantante.getCodigo() + "    \n");
            file.writeBytes("Nombre: " + cantante.getNombre() + "              \n");
            file.writeBytes("Apellido: " + cantante.getApellido() + "            \n");
            file.writeBytes("Edad: " + cantante.getEdad() + "   \n");
            file.writeBytes("Nacionalidad: " + cantante.getNacionalidad() + "         \n");
            file.writeBytes("Salario: " + cantante.getSalario() + "     \n");
            file.writeBytes("Nombre Artistico: " + cantante.getNombreArtistico() + "         \n");
            file.writeBytes("Genero Musical: " + cantante.getGeneroMusical() + "              \n");
            file.writeBytes("Número de Sencillos: " + cantante.getNumeroDeSencillos() + " \n");
            file.writeBytes("Número de Giras: " + cantante.getNumeroDeGiras() + "     \n");
            file.writeBytes("Discografía: " + cantante.getDiscografia().size() + "       \n");
            file.writeBytes("Salario Final: " + cantante.getSalarioFinal() + "       \n\n");
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
    public void create(Cantante cantante) {
        if (cantantesGuardados.contains(cantante.getCodigo())) {
            update(cantante); // El cantante ya existe, actualizar sus datos
            return;
        }

        listaCantantes.add(cantante);
        cantantesGuardados.add(cantante.getCodigo());
        saveCantantes();
    }

    @Override
    public Cantante read(int codigo) {
        Cantante cantante = null;
        for (Cantante c : listaCantantes) {
            if (c.getCodigo() == codigo) {
                cantante = c;
                break;
            }
        }

        if (cantante != null) {

        }

        return cantante;
    }

    @Override
    public void update(Cantante cantante) {
        boolean existeCantante = false;
        int index = -1;

        // Verificar si el cantante ya existe en la lista
        for (int i = 0; i < listaCantantes.size(); i++) {
            Cantante cantanteGuardado = listaCantantes.get(i);
            if (cantanteGuardado.getCodigo() == cantante.getCodigo()) {
                existeCantante = true;
                index = i;
                break;
            }
        }

        // Si el cantante existe, actualizar sus datos y guardar los cambios
        if (existeCantante && index != -1) {
            listaCantantes.set(index, cantante);
            saveCantantes();
        }
    }

    @Override
    public void delete(int codigo) {
        Cantante cantanteEncontrado = null;

        // Buscar el cantante por código
        for (Cantante cantante : listaCantantes) {
            if (cantante.getCodigo() == codigo) {
                cantanteEncontrado = cantante;
                break;
            }
        }

        // Si se encontró el cantante, eliminarlo de la lista y guardar los cambios
        if (cantanteEncontrado != null) {
            listaCantantes.remove(cantanteEncontrado);
            saveCantantes();
        }
    }

    @Override
    public List<Cantante> list() {
        return listaCantantes;
    }

    // Implementación para Disco
    public Cantante buscarPorDisco(String valor) {
        for (Cantante cantante : listaCantantes) {
            for (Disco disco : cantante.listarDiscos()) {
                if (disco.getNombre().equals(valor)) {
                    System.out.println(cantante.getNombre() + " " + cantante.getApellido());
                    return cantante;
                }
            }
        }
        return null;
    }

    private void saveDiscos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(getDiscosFilePath()))) {
            for (Cantante cantante : listaCantantes) {
                for (Disco disco : cantante.listarDiscos()) {
                    writer.write("_________________________datos de disco " + disco.getCodigo() + "______________________");
                    writer.newLine();
                    writer.write("---------datos de Dueño-------");
                    writer.newLine();
                    writer.write("nombre: " + cantante.getNombre());
                    writer.newLine();
                    writer.write("apellido: " + cantante.getApellido());
                    writer.newLine();
                    writer.write("edad: " + cantante.getEdad());
                    writer.newLine();
                    writer.write("nombre artístico: " + cantante.getNombreArtistico());
                    writer.newLine();
                    writer.write("---------datos de disco--------");
                    writer.newLine();
                    writer.write("código: " + disco.getCodigo());
                    writer.newLine();
                    writer.write("nombre: " + disco.getNombre());
                    writer.newLine();
                    writer.write("Año de lanzamiento: " + disco.getAnioDeLanzamiento());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            // Manejar excepciones en caso de que no se pueda escribir en el archivo
        }
    }

    @Override
    public void createDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        cantante.agregarDisco(codigo, nombre, anioDeLanzamiento);
        saveDiscos();
    }

    @Override
    public Disco readDisco(Cantante cantante, int codigo) {
        Disco disco = cantante.buscarDisco(codigo);
        if (disco != null) {

        }
        return disco;
    }

    @Override
    public void updateDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        Disco disco = cantante.buscarDisco(codigo);
        if (disco != null) {
            disco.setNombre(nombre);
            disco.setAnioDeLanzamiento(anioDeLanzamiento);
            saveDiscos();
        }
    }

    @Override
    public void deleteDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        cantante.eliminarDisco(codigo, nombre, anioDeLanzamiento);
        saveDiscos();
    }

    @Override
    public List<Disco> findAllDisco(Cantante cantante) {
        return cantante.listarDiscos();
    }
}