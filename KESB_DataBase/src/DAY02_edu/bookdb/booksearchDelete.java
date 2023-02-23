package edu.bookdb;

import java.sql.*;

public class booksearchDelete {
    public static void main(String[] args) {
        System.out.println("JDBC Start");

        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//MySQL Driver LocalHost

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + "bookdb?useSSL=" + "false&serverTimezone=Asia/Seoul", "root", "do1020833@@");//JDBC연결


            if (conn != null) {
                System.out.println("DB Connection Complete!");
                stmt = conn.createStatement(); //SQLQuery
                System.out.println();
                System.out.println("---Before Record Change---");
                System.out.println();
                printData(stmt);

//              // Record Insert
//                stmt.executeUpdate("insert into book(id, title, publisher, author) " + "values(0, 'Harry Potter', 'Bloomsbury', 'J.K Rowling')");
//                stmt.executeUpdate("insert into book(id, title, publisher, author) " + "values(1, 'THE Lord of the Rings', 'Allen & Unwin', 'J.R.R Tolkein')");
//                stmt.executeUpdate("insert into book(id, title, publisher, author) " + "values(2, 'Pride and Prejudice', 'T.Egerton Kingdom', 'Jane Auston')");
//                System.out.println("---After Record Insert---");
//                System.out.println("");
//                printData(stmt);

//                // Record Update
//                stmt.executeUpdate(("update book set author = 'J.doyun'  where id = '0'"));
//                System.out.println("---After Record Update---");
//                System.out.println("");
//                printData(stmt);

                //Record Delete
                stmt.executeUpdate(("delete from book where id = '2'"));
                System.out.println("---After Record Delete---");
                System.out.println("");
                printData(stmt);
            }
        } catch(ClassNotFoundException e){
            System.out.println("JDBC Driver Load ERROR!");

        } catch(SQLException e){
            System.out.println("DB Connection ERROR!");
        }
        finally {
            try {
                stmt.close();
                conn.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }//end of finally block
    }
    private static void printData(Statement pstmt) throws SQLException {

        ResultSet srs = pstmt.executeQuery("select * from book"); // All data of table
        System.out.printf(" %s  | %-32s| %-32s| %s\n","ID", "TITLE", "PUBLISHER", "AUTHOR");

        while (srs.next()) {
            System.out.printf("%3s", srs.getString("id"));
            System.out.printf("%3s %-30s", '|', srs.getString("title"));
            System.out.printf("%3s %-30s", '|', srs.getString("publisher"));
            System.out.printf("%3s %-30s\n", '|', srs.getString("author"));
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();
    }
}
