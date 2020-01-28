
package exemploarrays;

import javax.swing.JOptionPane;

public class PedirDatos {
    
    
    public static int pedirInt(){
        return Integer.parseInt(JOptionPane.showInputDialog("Teclea Int:"));
    }
    
    public static String pedirString(){
        return JOptionPane.showInputDialog("Teclea String: ");
    }
    
}
