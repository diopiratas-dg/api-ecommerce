package br.com.digitalhouse.apiecommerce.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Database {
    private Statement executorQuery;
    private Connection conn;

    public Database() {
        try {
            String url = "jdbc:mysql://localhost:3306/loja_virtual";
            String usuario = "root";
            String senha = "KRIUQ0hx6At2YwbS";
            conn = DriverManager.getConnection(url, usuario, senha);

            this.executorQuery  = conn.createStatement();
        } catch (SQLException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Category> getCategories() {
        ArrayList listaCategoria = new ArrayList<Category>();
        ResultSet resultado;
        try {
            resultado = this.executorQuery.executeQuery("SELECT * from categoria");

            while(resultado.next()){
                Category categoria = new Category(resultado.getString("id"),
                        resultado.getString("descricao"));
                listaCategoria.add(categoria);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listaCategoria;
    }
}
