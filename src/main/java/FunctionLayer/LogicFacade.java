package FunctionLayer;

import DBAccess.UserMapper;

import java.sql.SQLException;
import java.util.List;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }

    public static User createNewUser( String email, String password, String role ) throws LoginSampleException {
        User user = new User(email, password, role);
        UserMapper.createNewUser( user );
        return user;
    }

    public static List<User> showAllCustomers(String userRole) throws SQLException {
        return UserMapper.showAllCustomers(userRole);
    }

    public static void deleteUser(int id) throws LoginSampleException {
        UserMapper.deleteUser(id);
    }

    public static void updateUser(int id, String email, String role) throws LoginSampleException {
        UserMapper.updateUser(id,email,role);
    }

    public static void resetCode(int id, String newCode) throws LoginSampleException {
        UserMapper.resetCode(id,newCode);
    }

}
