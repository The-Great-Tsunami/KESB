import java.sql.*;

public class bookdbInsert {
    public static void main(String[] args) {
        System.out.println("JDBC Start");

        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//MySQL 드라이버 로컬호스트

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + "bookdb?useSSL=" + "false&serverTimezone=Asia/Seoul", "root", "do1020833@@");//JDBC연결


            if (conn != null) {
                System.out.println("DB 연결 완료");
                stmt = conn.createStatement(); //SQL문 처리
                System.out.println();
                System.out.println("---레코드 변경 전---");
                System.out.println();
                printData(stmt);
              // 레코드 삽입
                stmt.executeUpdate("insert into book(id, title, publisher, author) " + "values(0, 'Harry Potter', 'Bloomsbury', 'J.K Rowling')");
                stmt.executeUpdate("insert into book(id, title, publisher, author) " + "values(1, 'THE Lord of the Rings', 'Allen & Unwin', 'J.R.R Tolkein')");
                stmt.executeUpdate("insert into book(id, title, publisher, author) " + "values(2, 'Pride and Prejudice', 'T.Egerton Kingdom', 'Jane Auston')");
                System.out.println("---레코드 삽입 후---");
                System.out.println("");
                printData(stmt);
//              // 레코드 변경
//                stmt.executeUpdate(("update book set title = 'THE Lord of the Rings'  where id = '1'"));
//                System.out.println("---레코드 변경 후---");
//                System.out.println("");
//                printData(stmt);

//                //레코드 삭제
//                stmt.executeUpdate(("delete from book where id = '2'"));
//                System.out.println("---레코드 삭제 후---");
//                System.out.println("");
//                printData(stmt);
            }
        } catch(ClassNotFoundException e){
            System.out.println("JDBC 드라이버 로드 오류");

        } catch(SQLException e){
            System.out.println("DB 연결 오류");
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

        ResultSet srs = pstmt.executeQuery("select * from book"); // 테이블의 모든 데이터
        System.out.printf(" %s  | %-32s| %-32s| %s\n","ID", "TITLE", "PUBLISHER", "AUTHOR");

        while (srs.next()) {
            System.out.printf("%3s", srs.getString("id"));
            System.out.printf("%3s %-30s", '|', srs.getString("title"));
            System.out.printf("%3s %-30s", '|', srs.getString("publisher"));
            System.out.printf("%3s %-30s\n", '|', srs.getString("author"));
        }
        System.out.println();
        System.out.println("---------------------");
        System.out.println();
    }
}
