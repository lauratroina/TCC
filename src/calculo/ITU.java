package calculo;

import estruturas.Celula;
import estruturas.Parede;
import estruturas.PontoAcesso;
import java.util.ArrayList;

public class ITU extends Problema {

    @Override
    public double avalia(double individuo[]) {
        
        for (Celula c : this.planta.celulas) {
            c.setPotencia(-1000);
        }

        this.planta.pas = new ArrayList<PontoAcesso>();
        for (int i = 0; i < (individuo.length / 2); i++) {
            this.planta.pas.add(new PontoAcesso(individuo[i * 2], individuo[(i * 2) + 1]));
        }

        double db = 0, f=1;
        int celulasTaxaDesejada = 0, celulasTaxaAceitavel = 0, contador=0;
        for (Celula c : this.planta.celulas) {
            for (PontoAcesso pa : this.planta.pas) {
                db = 20*Math.log10(f) + (30 * Math.log10(Math.sqrt(Math.pow(pa.getX() - (c.getX() + this.planta.d / 2), 2) + Math.pow(pa.getY() - (c.getY() + this.planta.d / 2), 2))));
                
                for (Parede p : this.planta.paredes) {
                   contador += (interseccao(pa.getX(), pa.getY(), c.getX() + this.planta.d / 2, c.getY() + this.planta.d / 2, p.getReta().getX1(), p.getReta().getY1(), p.getReta().getX2(), p.getReta().getY2()));
                } 
                
                //coeficiente de perda 
                db -= (15+(contador-1)-28);  

                if (db > c.getPotencia()) {
                    c.setPotencia(db);
                }
            }

            if (c.getPotencia() < this.taxaAceitavel) {
                celulasTaxaAceitavel++;
            }
            if (c.getPotencia() > this.taxaDesejada) {
                celulasTaxaDesejada++;
            }
        }
        double qualidade = (100.0 * (celulasTaxaDesejada) / this.planta.celulas.size()) 
                                - 1000.0 * (celulasTaxaAceitavel / this.planta.celulas.size());
        return qualidade;
    }

    private int interseccao(double x1, double y1, double x2, double y2, double x3, double y3, double x4,
            double y4) {
        double d = (x4 - x3) * (y1 - y2) - (x1 - x2) * (y4 - y3);
        if (d == 0) {
            return 0;
        }
        double ta = ((y3 - y4) * (x1 - x3) + (x4 - x3) * (y1 - y3)) / d;
        double tb = ((y1 - y2) * (x1 - x3) + (x2 - x1) * (y1 - y3)) / d;
        return (((ta >= 0) && (ta <= 1)) && ((tb >= 0) && (tb <= 1))) ? 1 : 0;
    }

}
