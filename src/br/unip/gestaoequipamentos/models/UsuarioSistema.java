package br.unip.gestaoequipamentos.models;

public class UsuarioSistema {

    private int idUsuario;
    private String nomeUsuario;
    private String email;
    private int tipoCargo;
    private String nomeCargo;
    private String senhaAcesso;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTipoCargo() {
        return tipoCargo;
    }

    public void setTipoCargo(int tipoCargo) {
        this.tipoCargo = tipoCargo;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public String getSenhaAcesso() {
        return senhaAcesso;
    }

    public void setSenhaAcesso(String senhaAcesso) {
        this.senhaAcesso = senhaAcesso;
    }
}
