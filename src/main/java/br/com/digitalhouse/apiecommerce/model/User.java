package br.com.digitalhouse.apiecommerce.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "usuarios")
public class User {

    @Id
    private Integer idUsuario;

    @Column(nullable = false, name = "nome")
    private String username;

    @Column(nullable = false, name = "data_admissao")
    private Date dataAdmissao;

    @Column(nullable = false)
    private String salario;

    @Column(nullable = false)
    private String password;

    public User(){};

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
