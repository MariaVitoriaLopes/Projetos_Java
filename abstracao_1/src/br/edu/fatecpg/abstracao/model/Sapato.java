package br.edu.fatecpg.abstracao.model;

public class Sapato {
public int tamanho;
public boolean usando=false;


public void usando(){
	if(!usando) {
	System.out.println("o sapato ta no seu pé!!!");
}else { System.out.println("esqueceu de calçar");
}}
public void usando2(){
	if(usando==false) {
	System.out.println("esqueceu de calçar");
}else { System.out.println("o sapato ta no seu pé!!!");
}}
}