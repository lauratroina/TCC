package calculo;

import estruturas.*;
import java.util.ArrayList;

public class Cost231 implements FuncaoObjetivo {

    public double avalia(double individuo[], Planta planta) {
        planta.pas = new ArrayList<PontoAcesso>();

        for(Celula c: planta.celulas){
            c.setPotencia(-1000);
        }

        for (int i = 0; i < (individuo.length / 2); i++) {
            planta.pas.add(new PontoAcesso(individuo[i * 2], individuo[(i * 2) + 1]));
        }
        
        double db = 0;
        int cmaior24 = 0, cmenor0 = 0;
            for (Celula c : planta.celulas) {
            for (PontoAcesso pa : planta.pas) {
                db = 20 - 45 - 10 * 1.4 * Math.log10(Math.sqrt(Math.pow(pa.getX() - (c.getX() + planta.d / 2), 2) + Math.pow(pa.getY() - (c.getY() + planta.d / 2), 2)));

                for (Reta r : planta.retas) {
                    db -= interseccao(pa.getX(), pa.getY(), c.getX() + planta.d / 2, c.getY() + planta.d / 2, r.getX1(), r.getY1(), r.getX2(), r.getY2()) * r.getP();
                }

                if (db > c.getPotencia()) {
                    c.setPotencia(db);
                }
            }

            if (c.getPotencia() < -89) {
                cmenor0++;
            }
            if (c.getPotencia() > -72) {
                cmaior24++;
            }
        }
        double qualidade = (100.0 * (cmaior24) / planta.celulas.size()) - 1000.0 * (cmenor0 / planta.celulas.size());    
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
