package edu.psu.bd.cs.smc6823.jdbclab.main;

import java.sql.*;
import java.io.*;
import java.util.Scanner;

public class JDBCLab
{
    public static void main(String[] args) {

        Connection c;
        boolean flag = true;

        try{
            c = DriverManager.getConnection( "jdbc:sqlite:\\Users\\Cici\\IdeaProjects\\jdbclab\\src\\main\\resources\\mybookstore (1)");

            while(flag)
            {
                File myFile = new File("pokemon go database.txt");
                Scanner inputFile = new Scanner(myFile);
                String input = keyboard.nextLine();

                String sql = "SELECT * FROM main.titles AS t INNER JOIN authors As a ON t.au_id = a.au_id INNER JOIN main.publishers AS p ON t.pub_id = p.pub_id WHERE title = ?";

                PreparedStatement p = c.prepareStatement( sql );

                p.setString(1, input);

                ResultSet r = p.executeQuery();

                if ( input.equals("quit") )
                {
                    flag = false;
                    break;
                }
                else {
                    System.out.println( "Title is " + r.getString( "title" ));
                    System.out.println( "Author is " + r.getString( "au_fname" ) + " " + r.getString( "au_lname"));
                    System.out.println( "Publisher is " + r.getString( "pub_name" ));
                    System.out.println();
                }
                r.close();
            }
        }
        catch ( SQLException sqle)
        {
            sqle.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
