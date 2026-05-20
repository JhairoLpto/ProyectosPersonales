package packageDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Types;
import packegeVO.userVO;

public class userDAO {
    public static void createUser(userVO newUser, Connection conn){
        String sql = "insert into user (name, weight, height, birthdate) values (?, ?, ?, ?) ";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, newUser.getName());
                ps.setDouble(2, newUser.getWeight());
                ps.setDouble(3, newUser.getHeight());
                ps.setObject(4, newUser.getBirthdate(), Types.TIMESTAMP);
                ps.executeUpdate();               
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateName(String newName, int user_id, Connection conn){
        String sql = "update from user set name = ? where user_id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, newName);
                ps.setInt(2, user_id);
                ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void update
}