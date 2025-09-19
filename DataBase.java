package Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://neondb_owner:npg_IrpUGckn6zL7@ep-late-brook-ad2xe7xf-pooler.c-2.us-east-1.aws.neon.tech/neondb?sslmode=require&channel_binding=require";

        try {
            Class.forName("org.postgresql.Driver"); 

        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver PostgreSQL não encontrado!", e);
        }

        return DriverManager.getConnection(url);
    }
