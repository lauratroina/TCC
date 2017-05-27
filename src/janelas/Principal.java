package janelas;
import estruturas.Parametros;
public class Principal {    
    public static void main (String[] args){
        Parametros parametros = null;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal(parametros).setVisible(true);
            }
        });
    
        
    }
    
}
