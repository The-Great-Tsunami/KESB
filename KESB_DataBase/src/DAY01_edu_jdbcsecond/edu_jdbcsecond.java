package edu_jdbcsecond;

import java.sql.*;

public class edu_jdbcsecond {
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
                System.out.println("---레코드 변경 전---");
                printData(stmt);
//              // 레코드 삽입
//                stmt.executeUpdate("insert into student(name,id,dept) " + "values('윤정무', '1217036', '기계공학과')");
//                System.out.println("---레코드 삽입 후---");
//                printData(stmt);
//              // 레코드 변경
//                stmt.executeUpdate(("update student set dept = '국어국문' where name = '강호동'"));
//                System.out.println("---레코드 변경 후---");
//                printData(stmt);

//                //레코드 삭제
//                stmt.executeUpdate(("delete from student where name = '윤정무'"));
//                System.out.println("---레코드 삭제 후---");
//                printData(stmt);
        }
        } catch(ClassNotFoundException e){
                System.out.println("JDBC 드라이버 로드 오류");

            } catch(SQLException e){
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
    }
    private static void printData(Statement pstmt) throws SQLException {

        ResultSet srs = pstmt.executeQuery("select * from student"); // 테이블의 모든 데이터

        while (srs.next()) {

            System.out.print(srs.getString("name"));
            System.out.print("\t|\t" + srs.getString("id"));
            System.out.println("\t|\t" + srs.getString("dept"));
        }
        System.out.println();
    }
}