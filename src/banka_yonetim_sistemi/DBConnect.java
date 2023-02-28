package banka_yonetim_sistemi;

import java.sql.*;


public class DBConnect {
    public Connection con;
    public Statement stmt;
    public ResultSet rs;
    
    /*
     * Database baglantýsý için bir method oluþturdum.
     */
    
    public DBConnect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","123gsnuman");
            stmt=con.createStatement();
        }
        catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }
    public void getData()
    {
        try
        {
        String Query="select * from admin";
        rs=stmt.executeQuery(Query);
        while(rs.next())
        {
            String id=rs.getString("admin_id");
            String name=rs.getString("admin_user");
            String password=rs.getString("admin_password");
            System.out.println("id" + id+ "NAME"+ name + "password"+ password);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
