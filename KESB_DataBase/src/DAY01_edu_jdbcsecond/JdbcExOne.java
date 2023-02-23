import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExOne {

    public static void main(String[] args) {

        System.out.println("JDBC Start");

        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//MySQL 드라이버 로컬호스트

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + "malldb?useSSL=" + "false&serverTimezone=Asia/Seoul", "root", "do1020833@@");//JDBC연결


            if (conn != null) {
                System.out.println("DB 연결 완료");
                stmt = conn.createStatement(); //SQL문 처리
                ResultSet srs = stmt.executeQuery("select * from userTbl");
                printData(srs, "userID", "name", "birthYear", "addr", "mobile1", "mobile2", "height", "mDate");
                ResultSet src = stmt.executeQuery("select * from buyTbl");
                printData2(src, "num", "userID", "prodName", "groupName", "price", "amount");
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
            String col3, String col4,
            String col5, String col6,
            String col7, String col8) throws SQLException {
        while (srs.next()) {
            if (!col1.equals(""))
                System.out.print(srs.getString("userID"));
            if (!col2.equals(""))
                System.out.print("\t|\t" + srs.getString("name"));
            if (!col3.equals(""))
                System.out.print("\t|\t" + srs.getString("birthYear"));
            if (!col4.equals(""))
                System.out.print("\t|\t" + srs.getString("addr"));
            if (!col5.equals(""))
                System.out.print("\t|\t" + srs.getString("mobile1"));
            if (!col6.equals(""))
                System.out.print("\t|\t" + srs.getString("mobile2"));
            if (!col7.equals(""))
                System.out.print("\t|\t" + srs.getString("height"));
            if (!col8.equals(""))
                System.out.println("\t|\t" + srs.getString("mDate"));
            else
                System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    private static void printData2(
            ResultSet src,
            String bol1, String bol2,
            String bol3, String bol4,
            String bol5, String bol6) throws SQLException {
        while (src.next()) {
            if (!bol1.equals(""))
                System.out.print(src.getString("num"));
            if (!bol2.equals(""))
                System.out.print("\t|\t" + src.getString("userID"));
            if (!bol3.equals(""))
                System.out.print("\t|\t" + src.getString("prodName"));
            if (!bol4.equals(""))
                System.out.print("\t|\t" + src.getString("groupName"));
            if (!bol5.equals(""))
                System.out.print("\t|\t" + src.getString("price"));
            if (!bol6.equals(""))
                System.out.println("\t|\t" + src.getString("amount"));
            else
                System.out.println();
        }//end of while(rs.next() )

    }

}
