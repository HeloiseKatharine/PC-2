/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculdade;

/**
 *
 * @author Heloise
 */
public class ContraCheque {

    Faculdade faculdade;//objeto professor
    public Double vlHa; //Valor da hora aula 
    public Integer nh; //Número de horas semanais (quantHoraSemanal) 
    public Integer qHN;//QHN = Quantidade horas noturnas

    public Double sB() {
        Double sB;
        return sB = vlHa * nh * 4.5; //Salário base
    }

    public Double dsr() {
        return sB() + sB() * 0.167;
    }

    public Double act() {
        return sB() * 0.021;
    }

    public Double adicionalNoturno() {
        return vlHa * qHN * 0.2;
    }

    public Double rB() {
        Double rB;
        return rB = sB() + sB() * 0.167 + sB() * 0.021 + vlHa * qHN * 0.2; //remuneração bruta
    }

    public Double svc() {
        return rB() * 0.002;
    }

    Double sbInss;

    //método para calcular o desconto de INSS   
    public Double Inss() {

        Double inss;

        if (rB() < 1045.00) {
            inss = rB() * 0.075;
        } else if (rB() == 1045.00 && rB() < 2089.61) {
            inss = rB() * 0.09;
        } else if (rB() == 2089.61 && rB() < 3134.41) {
            inss = rB() * 0.12;
        } else {
            inss = 6101.06 * 0.14;
        }

        sbInss = sB();

        return inss;
    }

    Double irpfaux;
    Double sbIrpf;

    //método para calcular o desconto de IRPF
    public Double Irpf(Integer nD) {

        Double irpf;

        Double salarioIPRF = (rB() - this.Inss() - (189.59 * nD));// Salário base para IRPF

        sbIrpf = salarioIPRF;

        if (rB() <= 1903.98) {
            irpf = 0.0;
        } else if (rB() > 1903.98 && rB() <= 2826.65) {
            irpf = salarioIPRF * 0.075 - 142.80;
        } else if (rB() > 2826.65 && rB() <= 3751.05) {
            irpf = salarioIPRF * 0.15 - 354.80;
        } else if (rB() > 3751.05 && rB() <= 4664.68) {
            irpf = salarioIPRF * 0.225 - 636.13;
        } else {
            irpf = salarioIPRF * 0.275 - 869.36;
        }
        irpfaux = irpf;

        return irpf;
    }

    Double sbFgts;

    //método para calcular o FGTS
    public Double Fgts() {
        Double fgts = rB() * 0.08;
        sbFgts = sB();
        return fgts;
    }

    //método para calcular o salário líquido
    public Double salarioLiquido() {
        Double sL = rB() - this.Inss() - irpfaux - ((rB() * 0.2) / 100); //SL = RB – INSS – IRPF – SVC
        return sL;
    }

    public ContraCheque(Double vlHa, Integer nh, Integer qHN) {
        this.vlHa = vlHa;
        this.nh = nh;
        this.qHN = qHN;
    }

    @Override
    public String toString() {
        return "\nSalário Base = " + sB()
                + "\nDescanso Semanal Remunerado: " + dsr()
                + "\nAcordo Coletivo de Trabalho: " + act()
                + "\nAdicional Noturno: " + adicionalNoturno()
                + "\nDesconto do INSS: " + Inss()
                + "\nDesconto do IRPF: " + irpfaux
                + "\nDesconto de Seguro de Vida: " + svc()
                + "\nRendimento Bruto: " + rB()
                + "\nSalário base para INSS: " + sbInss
                + "\nSalário base para FGTS: " + sbFgts
                + "\nSalário base para IRPF: " + sbIrpf
                + "\nFGTS: " + Fgts()
                + "\nSalário Líquido: " + salarioLiquido();

    }

    public Faculdade getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(Faculdade faculdade) {
        this.faculdade = faculdade;
    }

    public Double getVlHa() {
        return vlHa;
    }

    public void setVlHa(Double vlHa) {
        this.vlHa = vlHa;
    }

    public Integer getNh() {
        return nh;
    }

    public void setNh(Integer nh) {
        this.nh = nh;
    }

    public Integer getqHN() {
        return qHN;
    }

    public void setqHN(Integer qHN) {
        this.qHN = qHN;
    }

}
