package paneles;
import javax.swing.JPanel;

/** Clase para cambiar de panel interno en el FrameInicio **/

public class CambiarPanel {
    
    private JPanel container;
    private JPanel content;
    
    /**
     * Este metodo cambia el panel Interno del panel Contenedor
     * en el FrameInicio.
     * @param container Panel Contenedor
     * @param content  Panel Interno
     */
    
    public CambiarPanel(JPanel container, JPanel content) {
        this.container = container;
        this.content = content;
        this.container.removeAll();
        this.container.revalidate();
        this.container.repaint();
        this.container.add(this.content);
        this.container.revalidate();
        this.container.repaint();
    }

}