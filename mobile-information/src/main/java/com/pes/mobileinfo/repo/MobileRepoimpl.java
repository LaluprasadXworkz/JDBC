package com.pes.mobileinfo.repo;

import com.pes.mobileinfo.entity.MobileEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MobileRepoimpl implements MobileRepo{
    @Override
    public void saveMobileInfo(MobileEntity entity) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/mobileApplication";
            String userName="root";
            String psw="root";
            Connection connection =DriverManager.getConnection(url,userName,psw);
            PreparedStatement statement =connection.prepareStatement("insert into mobile_info(id,mobile_name,price,ram,brand)" +
                    " values("+entity.getId()+","+entity.getMobileName()+","+entity.getPrice()+","+entity.getRam() +")");
            statement.executeQuery();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(){

    }
}
