package restoDaPorraToda;

import estruturas.Parede;
import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class MontaParede {

    public static ArrayList<Parede> Monta(File arquivo) {
        ArrayList<Parede> retorno = new ArrayList<Parede>();
        try {
            Document documento = (Document) DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(arquivo);
            documento.getDocumentElement().normalize();
            NodeList paredes = documento.getElementsByTagName("parede");
            for (int i = 0; i < paredes.getLength(); i++) {
                Node nodo = paredes.item(i);
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element parede = (Element) nodo;
                    double x = Double.parseDouble(parede.getAttribute("x"));
                    double y = Double.parseDouble(parede.getAttribute("y"));
                    double altura = Double.parseDouble(parede.getAttribute("altura"));
                    double largura = Double.parseDouble(parede.getAttribute("largura"));
                    double perda = Double.parseDouble(parede.getAttribute("perda"));
                    retorno.add(new Parede(x, y, largura, altura, perda));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retorno;
    }
}
