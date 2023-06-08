package Alfaiataria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeitorCSV {
    public boolean abreCSV(String path, String login, String senha) {
        boolean x = false;
        //recebe o diretório como parâmetro, já com o arquivo
        File Arquivo = new File(path);
        ArrayList<String> dadosLeitura = new ArrayList<String>();
        //cria arraylist para guardar as linhas do arquivo
        FileReader leitor = null;
        String line = "";
        try {
            leitor = new FileReader(Arquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader saida = new BufferedReader(leitor);

        try {
            while ((line = saida.readLine()) != null) {
                dadosLeitura.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int linecount = 0;
        for (String value : dadosLeitura) {
            //percorrer as linhas do Array
            //System.out.println(value);
            String[] linevalue = value.split(",");
            for (int j = 0; j < linevalue.length; j++) {
                System.out.println(linevalue[j]);
            }
            if ((linevalue[0].equals(login))&&(linevalue[1].equals(senha))) {
              x = true;
            }
            linecount++;
        }

     

        return x;
    }
}

