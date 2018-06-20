import java.sql.*;

public class ViewingResultSet{
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/EMP";
    static final String USER = "root";
    static final String PASS = "123456";


    public static void main (String[] args){
        Connection conn = null;
        Statrment stmt = null;
        try {
            //先在静态代码段中进行注册
            Class.forName("com.mysql.jdbc.Driver");
            //在获得connection
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement(Result.TYPE_SCROLL_INSENSITIVE,
                                        ResultSet.CONCUR_READ_ONLY);
            String sql;
            sql = "SELECT id,firt,last,age FROM Employees";
            //再获得结果表
            //executeQuery的参数设置？
            ResultSet rs = stmt.executeQuery(sql);
            rs.lst();
            
            //从结果表中获取数据
            int id = rs.getInt("id");
            int age = rs.getInt("age");
            String first = rs.getString("first");
            String last = rs.getString("last");


            System.out.println("ID: " + id);
            System.out.println("age:" + age);
            rs.first();



            rs.next();

            rs.close();
            stmt.clsoe();
            conn.close();
        } catch (Exception e) {
            //TODO: handle exception
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();{
        }finally{
            try{
                if(stmt!=null) conn.close();
            }catch(SQLExcecption se2){

            }try{
                if(conn!=null)
                conn.close();
            }catch(SQLExcecption se){
                se.printStackTrace();
            }
        }
    }
}