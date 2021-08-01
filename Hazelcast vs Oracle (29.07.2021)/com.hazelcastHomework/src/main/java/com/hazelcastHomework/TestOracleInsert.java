package com.hazelcastHomework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;



public class TestOracleInsert {

	public static void main(String[] args) throws InterruptedException {
		
		// ORACLE INSERT
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:2130:GoldenDB","berkay2","berkay2");
			Statement statement = connection.createStatement();
			
			Random random = new Random();
			long startTime = System.nanoTime();
			
			for(int i = 0; i< 100000; i++)
			{
				 statement.executeUpdate("INSERT INTO TEST VALUES("+i+","+random.nextInt(100000)+")");
			}
			long endTime = System.nanoTime()- startTime;
			double second = (double)endTime / 1000000000.0;
			System.out.print("Oracle Insert Time = "+second);
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		
		
		
		
	}
	
}
