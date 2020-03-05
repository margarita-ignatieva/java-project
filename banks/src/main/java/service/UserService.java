package service;

import bl.Util;
import dao.userDAO;
import entity.User;


import java.util.List;
import java.sql.*;


public class UserService extends Util implements userDAO {
    Connection connection=getConnection();


    @Override
    public void add(User user) {

    }

    @Override
    public List<User> getAll() throws SQLException {
        List<User> userList= new UserList<>();

        String sql ="SELECT userid, name, surName FROM user";

        Statement statement =null;
        try{
            statement =connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                User user =new User();
                user.setId(resultSet.getLong(columnLable: "userid"));
                user.setName(resultSet.getString(columnLable: "name"));
                user.setSurname(resultSet.getString(columnLable: "surName"));

                userList.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            if (statement !=null){
                connection.close();
            }
        }
        return userList;
    }

    @Override
    public User getById(Long userid) {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void remove(User user) {

    }
}
