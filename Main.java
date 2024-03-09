import java.io.File;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Main {
    // Hecho por: Alvaro Escarti
    // 1 DAW
    
    public void limpiarPantalla(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {

        System.out.println("Campeones HashMap:");
        HashMap<Integer, String> campeonesHashMap = Campeones.getHashMap();
        for (Integer key : campeonesHashMap.keySet()) {
            String value = campeonesHashMap.get(key);
            System.out.println(key + ": " + value);
        }

        // Dejo al usuario 30 segundos para ver todos los campeones
        try {
            Thread.sleep(30000); // 30 segundos en milisegundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
                
        // Obtener el nombre del campeón del usuario
        String campeon = JOptionPane.showInputDialog("Ingrese el nombre del campeón:");

        // Obtener la ruta de la imagen del campeón
        String rutaImagen = obtenerRutaImagen(campeon);

        // Verificar si la ruta de la imagen es válida
        if (rutaImagen != null) {
            // Crear un objeto ImageIcon con la imagen
            ImageIcon imagen = new ImageIcon(rutaImagen);

            // Imprimir la ruta de la imagen
            System.out.println("Ruta de la imagen: " + rutaImagen);

            // Crear un componente JLabel para mostrar la imagen
            JLabel etiquetaImagen = new JLabel(imagen);

            // Crear una ventana JFrame para mostrar la imagen
            JFrame ventana = new JFrame();
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // esto sirve para cerrar el programa cuando cierro la ventana de la imagen
            ventana.getContentPane().add(etiquetaImagen);
            ventana.pack();
            ventana.setVisible(true);
        } else {
            // Mostrar un mensaje de error si la imagen no se encuentra
            JOptionPane.showMessageDialog(null, "No tengo la imagen");
        }
    }

    private static String obtenerRutaImagen(String campeon) {
        // Obtener la ruta absoluta del directorio actual
        String directorioActual = System.getProperty("user.dir");
        // Construir la ruta completa de la imagen
        String rutaImagen = directorioActual + File.separator + campeon + ".png";
        // Verificar si la imagen existe en la ruta especificada
        File imagenFile = new File(rutaImagen);
        if (imagenFile.exists()) {
            // Devolver la ruta completa si la imagen existe
            return rutaImagen;
        } else {
            // Intentar con la extensión .jpg
            rutaImagen = directorioActual + File.separator + campeon + ".jpg";
            imagenFile = new File(rutaImagen);
            if (imagenFile.exists()) {
                return rutaImagen;
            } else {
                // Intentar con la extensión .jpeg
                rutaImagen = directorioActual + File.separator + campeon + ".jpeg";
                imagenFile = new File(rutaImagen);
                if (imagenFile.exists()) {
                    return rutaImagen;
                } else {
                    // Devolver null si la imagen no existe
                    return null;
                }
            }
        }
    }
}
