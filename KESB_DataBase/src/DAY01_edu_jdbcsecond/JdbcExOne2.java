import java.sql.*;

public class JdbcExOne2 {

    public static void main(String[] args) {

        System.out.println("JDBC Start");

        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//MySQL 드라이버 로컬호스트

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + "sampledb?useSSL=" + "false&serverTimezone=Asia/Seoul", "root", "do1020833@@");//JDBC연결


            if (conn != null) {
                System.out.println("DB 연결 완료");
                stmt = conn.createStatement(); //SQL문 처리
                ResultSet srs = stmt.executeQuery("select * from student");
                printData(srs, "name", "id", "dept");
                System.out.println("특정레코드만 검색");
                ResultSet src = stmt.executeQuery("select * from student where name = '최고봉'");
                printData2(src, "name", "id", "dept");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버 로드 오류");

        } catch (SQLException e) {
            System.out.println("DB 연결 오류");
        }
//    }
        finally {

            try {
                stmt.close();
                conn.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }//end of finally block
    } // end of main()


    // 레코드의 각 열의 값 화면에 출력
    private static void printData(
            ResultSet srs,
            String col1, String col2,
            String col3) throws SQLException {
        while (srs.next()) {
            if (!col1.equals(""))
                System.out.print(srs.getString("name"));
            if (!col2.equals(""))
                System.out.print("\t|\t" + srs.getString("id"));
            if (!col3.equals(""))
                System.out.println("\t|\t" + srs.getString("dept"));
            else
                System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    private static void printData2(
            ResultSet src,
            String bol1, String bol2,
            String bol3) throws SQLException {
        while (src.next()) {
            if (!bol1.equals(""))
                System.out.print(src.getString("name"));
            if (!bol2.equals(""))
                System.out.print("\t|\t" + src.getString("id"));
            if (!bol3.equals(""))
                System.out.println("\t|\t" + src.getString("dept"));
            else
                System.out.println();
        }//end of while(rs.next() )
    }
}
