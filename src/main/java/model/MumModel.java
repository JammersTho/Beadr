package main.java.model;

import main.java.util.DbUtil;

import java.util.ArrayList;

/**
 * Created by JammersBlah on 03/06/2017.
 */
public class MumModel
{
    DbUtil dbUtil;
    public MumModel()
    {
        try {
            dbUtil = new DbUtil();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //TODO I think this class is unnecessary, stuff in here currently should be moved to the controller
    //TODO the Kotlin POJOs are the Model as seen here - https://www.tutorialspoint.com/design_pattern/mvc_pattern.htm




    //TODO MODEL contains the data, performs the calculations and provides access to the data
    private int calcValue;

    public void addTwoNumbers(int firstNumber, int secondNumber)
    {
        calcValue = firstNumber + secondNumber;
    }

    public int getCalcValue()
    {
        return calcValue;
    }

    private static ArrayList<String> userList;

    public void selectUserList() {
        try {


//            //TODO This is a super simple implementation, follow here for more https://www.youtube.com/watch?v=HE6ZHSuHcu0
//
//            PreparedStatement select = getConnection().prepareStatement("SELECT first_name, last_name FROM users");
//            ResultSet resultSet = select.executeQuery();
//            ArrayList<String> array = new ArrayList<String>();
//            while (resultSet.next()) {
//                System.out.print(resultSet.getString("first_name"));
//                System.out.print(" ");
//                System.out.println(resultSet.getString("last_name"));
//
//                array.add(resultSet.getString("first_name"));
//                array.add(resultSet.getString("last_name"));
//            }
//            userList = array;
        } catch (Exception e) {System.out.println(e);}
    }

    public ArrayList<String> getUserList()
    {
        return userList;
    }

    public void insertCustomer(Customer customer)
    {
        dbUtil.insertCustomer(customer);
        System.out.println("Insert completed.");
    }

    public void deleteAll(String table)
    {
        dbUtil.deleteAll(table);
    }

    public void createTable() throws Exception {
        //TODO Check data types
        dbUtil.createTable();
    }


}
