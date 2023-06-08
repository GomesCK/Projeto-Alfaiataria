package Alfaiataria;

import Alfaiataria.Funcionário;
import java.util.ArrayList;

public class AppFunc {

    private ArrayList<Funcionário> listapessoa = new ArrayList();

    public ArrayList<Funcionário> getListapessoa() {
        return listapessoa;
    }
    public void setListapessoa(ArrayList<Funcionário> listapessoa) {
        this.listapessoa = listapessoa;
    }
    public void inserePessoa(Funcionário p) {
        listapessoa.add(p);
    }
    public String listarPessoas() {
        String saida = " ";
        if (listapessoa.isEmpty()) {
            saida = "Nenhuma pessoa cadastrada!!";
        } else {
            for (Funcionário p : listapessoa) {
                saida = saida + p.status() + "\n";
            }
        }
        return saida;
    }
    
}