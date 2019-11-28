package howispentmoney;

import java.sql.*;
import javax.swing.JFrame;
import java.util.Calendar;

public class DatabaseConnection {
    static String user_name;
    static String sql;

    public static String login_check(String user, String password) {
        Connection connect = null;
        Statement s = null;
        String userid = null;
        
        try {
            
            connect = DriverManager.getConnection("jdbc:derby:C:\\Users\\Thitiwut\\Documents\\GitHub\\HowISpentMoney\\.derby\\db_hism", "", "");
            s = connect.createStatement();
            sql = "select * FROM APP.USERID WHERE USERNAME = '"+user+"' AND PASSWORD = '"+ password+"'";
            ResultSet rec = s.executeQuery(sql);//row data
            
            while (rec.next()) {
//                System.out.print(rec.getString(1));
//                System.out.println(rec.getString(2));
                userid = rec.getString(1);//select col
            }
            
// To do something
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        try {
            if (connect != null) {
                s.close();
                connect.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        System.out.println("login success");
        
//        frame.setVisible(false);
        user_name = userid;
        System.out.println(DatabaseConnection.user_name);
        return userid;
    }
    public static void regiserUser(String user, String password){
        Connection connect = null;
        Statement s = null;
        try {
            
            connect = DriverManager.getConnection("jdbc:derby:C:\\Users\\Thitiwut\\Documents\\GitHub\\HowISpentMoney\\.derby\\db_hism", "", "");
            s = connect.createStatement();
            sql = "INSERT INTO USERID(USERNAME, PASSWORD)"+" VALUES ('"+user+"','"+password+"')";

            s.executeUpdate(sql);//row data
            s.close();

            System.out.println("Complete");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (connect != null) {
                s.close();
                connect.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }    
    }
    public static void insert_data(String ex_des, double incomeValue, double expendValue) {
        Connection connect = null;
        Statement s = null;
        String tp = null;
                
        try {
            
            connect = DriverManager.getConnection("jdbc:derby:C:\\Users\\Thitiwut\\Documents\\GitHub\\HowISpentMoney\\.derby\\db_hism", "", "");
            s = connect.createStatement();
            Calendar calendar = Calendar.getInstance();
            java.sql.Timestamp timestampObject = new java.sql.Timestamp(calendar.getTime().getTime());
            
            if (incomeValue == 0 && expendValue != 0){
                tp = "Ex";
                sql = "INSERT INTO USERDATA(USERNAME, TIMESTAMP, TYPE, TYPE_DES, VALUE)"+"VALUES ('"+user_name+"','"+timestampObject+"','"+tp+"','"+ex_des+"',"+expendValue+")";
                s.executeUpdate(sql);//row data
                s.close();
            }else if(incomeValue != 0 && expendValue == 0){
                tp = "In";
                sql = "INSERT INTO USERDATA(USERNAME, TIMESTAMP, TYPE, TYPE_DES, VALUE)"+"VALUES ('"+user_name+"','"+timestampObject+"','"+tp+"','Income',"+incomeValue+")";
                s.executeUpdate(sql);//row data
                s.close();
            }else if(incomeValue != 0 && expendValue != 0){
                tp = "In";
                sql = "INSERT INTO USERDATA(USERNAME, TIMESTAMP, TYPE, TYPE_DES, VALUE)"+"VALUES ('"+user_name+"','"+timestampObject+"','"+tp+"','Income',"+incomeValue+")";
                s.executeUpdate(sql);
                s.close();
                insert_data(ex_des, 0, expendValue);
            }
            
            System.out.println(user_name);
            System.out.println("Complete");
            HaveDone done = new HaveDone();
            done.setVisible(true);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (connect != null) {
                s.close();
                connect.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }    
    }
    
    public static String getMonth(){
        String[] monthName = {"January", "February",
                "March", "April", "May", "June", "July",
                "August", "September", "October", "November",
                "December"};
        Calendar cal = Calendar.getInstance();
        String month = monthName[cal.get(Calendar.MONTH)];
        return(month);
    }
}

