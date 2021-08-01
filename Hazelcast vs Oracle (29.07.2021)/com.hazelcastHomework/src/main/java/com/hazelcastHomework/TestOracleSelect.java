package com.hazelcastHomework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestOracleSelect {

	public static void main(String[] args) {
		
		try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:2130:GoldenDB","berkay2", "berkay2");
            Statement statement = connection.createStatement();
            
            int number;
            long startTime = System.nanoTime();
            
            for(int i = 0; i < 100000; i++)
            {
            	
                ResultSet rs = statement.executeQuery("SELECT VALUE FROM TEST WHERE ID = "+i+"");
                rs.next();
                number = rs.getInt("VALUE");
         
            }
            
            long endTime = System.nanoTime() - startTime;
            double second = (double)endTime / 1000000000.0;
            System.out.println("Oracle 100000 Entry Select Time = "+second);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
	}
}
