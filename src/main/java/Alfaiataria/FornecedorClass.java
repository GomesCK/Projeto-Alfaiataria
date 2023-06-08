package Alfaiataria;
public class FornecedorClass {
    private String rSocial, nFantasia,CNPJ,enderecoF,telefone, email;

    public String getrSocial() {
        return rSocial;
    }

    public void setrSocial(String rSocial) {
        this.rSocial = rSocial;
    }

    public String getnFantasia() {
        return nFantasia;
    }

    public void setnFantasia(String nFantasia) {
        this.nFantasia = nFantasia;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getEnderecoF() {
        return enderecoF;
    }

    public void setEnderecoF(String enderecoF) {
        this.enderecoF = enderecoF;
    }

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }  
    
    public String status(){
        return "Razão Social: "+this.rSocial + "\n Nome Fantasía: "+this.nFantasia+"\n CNPJ: "+this.CNPJ
                +"\n Endereco: "+this.enderecoF+"\n telefone: "+this.telefone;
    }
}
