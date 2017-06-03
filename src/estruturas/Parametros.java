package estruturas;

import calculo.FuncaoObjetivo;

public class Parametros {

    private int numeroIndividuos;
    private int numeroGeracoes;
    private double probabilidadeCrossover;
    private double probabilidadeMutacao;
    private int numeroIndividuosSelecionados;
    private boolean elitismo;
    private int metodoCalculo;
    private double discretizacao;
    private int taxaDesejada;
    private int taxaAceitavel;
    private double intervaloHillClimbing;

    public void setParametros(int numeroIndividuos, int numeroGeracoes, double probabilidadeCrossover, double probabilidadeMutacao, int numeroIndividuosSelecionados, boolean elitismo, int metodoCalculo, int taxaDesejada, int taxaAceitavel, double intervaloHillClimbing) {
        this.numeroIndividuos = numeroIndividuos;
        this.numeroGeracoes = numeroGeracoes;
        this.probabilidadeCrossover = probabilidadeCrossover;
        this.probabilidadeMutacao = probabilidadeMutacao;
        this.numeroIndividuosSelecionados = numeroIndividuosSelecionados;
        this.elitismo = elitismo;
        this.metodoCalculo = metodoCalculo;
        this.taxaDesejada = taxaDesejada;
        this.taxaAceitavel = taxaAceitavel;
        this.intervaloHillClimbing = intervaloHillClimbing;
    }

    public int getNumeroIndividuos() {
        return numeroIndividuos;
    }

    public int getNumeroGeracoes() {
        return numeroGeracoes;
    }

    public double getProbabilidadeCrossover() {
        return probabilidadeCrossover;
    }

    public double getProbabilidadeMutacao() {
        return probabilidadeMutacao;
    }

    public int getNumeroIndividuosSelecionados() {
        return numeroIndividuosSelecionados;
    }

    public boolean isElitismo() {
        return elitismo;
    }

    public int getMetodoCalculo() {
        return metodoCalculo;
    }

    public double getDiscretizacao() {
        return discretizacao;
    }

    public void setDiscretizacao(double discretizacao) {
        this.discretizacao = discretizacao;
    }

    public int getTaxaDesejada() {
        return taxaDesejada;
    }

    public int getTaxaAceitavel() {
        return taxaAceitavel;
    }

    public double getIntervaloHillClimbing() {
        return intervaloHillClimbing;
    }

    public void setElitismo(boolean elitismo) {
        this.elitismo = elitismo;
    }

    public boolean getElitismo() {
        return this.elitismo;
    }

}
