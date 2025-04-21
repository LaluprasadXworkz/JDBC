package com.xworkz.books.repo;

import com.xworkz.books.dto.BookInfoDto;
import com.xworkz.books.util.BookUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookRepoImpl implements BookRepo{
    @Override
    public String saveBook(BookInfoDto dto) {
        Connection connection =BookUtil.getConnection();
        String insertQuery="insert into book_info(bookName,author,price,genre,publisherName,language) values(?,?,?,?,?,?)";
        PreparedStatement preparedStatement=null;
        int check=0;
        try {
          preparedStatement=  connection.prepareStatement(insertQuery);
          preparedStatement.setString(1,dto.getBookName());
          preparedStatement.setString(2,dto.getAuthor());
          preparedStatement.setDouble(3,dto.getPrice());
          preparedStatement.setString(4,dto.getGenre());
          preparedStatement.setString(5,dto.getPublisherName());
          preparedStatement.setString(6 ,dto.getLanguage());
           check= preparedStatement.executeUpdate();
            System.out.println(check);
            if(check>=1){
                return "Data inserted ";
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if(preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return "Data Not inserted ";
    }

    @Override
    public void readAll() {

       Connection connection =BookUtil.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {
         preparedStatement    =connection.prepareStatement("select * from book_info");
         resultSet =preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getInt("bookid"));
            System.out.println(resultSet.getString("bookName"));
            System.out.println(resultSet.getString("author"));
            System.out.println(resultSet.getDouble("price"));
            System.out.println(resultSet.getString("genre"));
            System.out.println(resultSet.getString("publisherName"));
            System.out.println(resultSet.getString("language"));
            System.out.println("----------------------------");
        }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if (preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
