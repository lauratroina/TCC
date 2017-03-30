package restoDaPorraToda;

import java.util.ArrayList;

public abstract class AlgoritmoGenetico {

    int numeroGenes;
    int numeroIndividuos;
    int numeroGeracoes;
    double probabilidadeCrossover;
    double probabilidadeMutacao;
    int numeroIndividuosSelecionados;
    boolean elitismo;
    double valorMinMax[][];
    double populacaoUm[][];
    double fitnessUm[];
    double populacaoDois[][];
    double fitnessDois[];
    double melhorIndividuo[];
    double melhorFitness;
    double prole[][];

    public void inicializa(int numeroGenes, int numeroIndividuos, int numeroGeracoes, double probabilidadeCrossover, double probabilidadeMutacao, int numeroIndividuosSelecionados, boolean elitismo, double[][] valorMinMax) {
        this.numeroGenes = numeroGenes;
        this.numeroIndividuos = numeroIndividuos;
        this.numeroGeracoes = numeroGeracoes;
        this.probabilidadeCrossover = probabilidadeCrossover;
        this.probabilidadeMutacao = probabilidadeMutacao;
        this.numeroIndividuosSelecionados = numeroIndividuosSelecionados;
        this.elitismo = elitismo;
        this.valorMinMax = valorMinMax;
        this.populacaoUm = new double[numeroIndividuos][numeroGenes];
        this.fitnessUm = new double[numeroIndividuos];
        this.populacaoDois = new double[numeroIndividuos][numeroGenes];
        this.fitnessDois = new double[numeroIndividuos];
        this.melhorFitness = -Double.MAX_VALUE;
        this.prole = new double[2][numeroGenes];
    }

    double inicializacaoUniforme(int gene) {
        return (valorMinMax[gene][0] + Math.random() * (valorMinMax[gene][1] - valorMinMax[gene][0]));
    }

    double mutacaoUniforme(int gene) {
        return (inicializacaoUniforme(gene));
    }

    void cruzamentoUmPonto(int individuoUm, int individuoDois) {
        int posicao = (int) (Math.random() * numeroGenes);
        for (int gene = 0; (gene < numeroGenes); gene++) {
            if (gene < posicao) {
                prole[0][gene] = populacaoUm[individuoDois][gene];
                prole[1][gene] = populacaoUm[individuoUm][gene];
            } else {
                prole[0][gene] = populacaoUm[individuoUm][gene];
                prole[1][gene] = populacaoUm[individuoDois][gene];
            }
        }
    }

    int selecaotorneio() {
        int individuoUm, individuoDois;

        individuoUm = (int) (Math.random() * numeroIndividuos);
        for (int i = 1; i < numeroIndividuosSelecionados; i++) {
            do {
                individuoDois = (int) (Math.random() * numeroIndividuos);
            } while (individuoUm == individuoDois);
            if (fitnessUm[individuoDois] > fitnessUm[individuoUm]) {
                individuoUm = individuoDois;
            }
        }
        return (individuoUm);
    }

    abstract double avalia(double individuo[]);

    public void executa() {
        int geracaoAtual = 0;
        int individuoUm, individuoDois;
        for (int individuo = 0; (individuo < numeroIndividuos); individuo++) {
            for (int gene = 0; (gene < numeroGenes); gene++) {
                populacaoUm[individuo][gene] = inicializacaoUniforme(gene);
            }
            fitnessUm[individuo] = avalia(populacaoUm[individuo]);
            if (fitnessUm[individuo] > melhorFitness) {
                melhorIndividuo = populacaoUm[individuo].clone();
                melhorFitness = fitnessUm[individuo];
            }

            for (geracaoAtual = 1; geracaoAtual <= numeroGeracoes; geracaoAtual++) {
                if (elitismo) {
                    populacaoDois[0] = melhorIndividuo.clone();
                    fitnessDois[0] = melhorFitness;
                }
                int i = elitismo ? 1 : 0;
                while (i < numeroIndividuos) {
                    individuoUm = selecaotorneio();
                    do {
                        individuoDois = selecaotorneio();
                    } while (individuoUm == individuoDois);
                    if (Math.random() < probabilidadeCrossover) {
                        cruzamentoUmPonto(individuoUm, individuoDois);
                        for (individuoUm = 0; ((individuoUm < 2) && (i < numeroIndividuos)); individuoUm++) {
                            for (int gene = 0; (gene < numeroGenes); gene++) {
                                populacaoDois[i][gene] = (Math.random() < probabilidadeMutacao) ? mutacaoUniforme(gene) : prole[individuoUm][gene];
                            }
                            fitnessDois[i] = avalia(populacaoDois[i]);
                            if (fitnessUm[individuo] > melhorFitness) {
                                melhorIndividuo = populacaoUm[individuo].clone();
                                melhorFitness = fitnessUm[individuo];
                            }
                            i++;
                        }
                    }
                }
                populacaoUm = populacaoDois.clone();
            }

        }

    }

}
