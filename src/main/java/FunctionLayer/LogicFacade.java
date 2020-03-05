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

    public static List<User> showAllCustomers() throws SQLException {
        return UserMapper.showAllCustomers();
    }
    /*
    public static User UpdateUser (String email,String role ) throws LoginSampleException {
        User user = new User(email,password, role);
        UserMapper.updateNewUser( user );
        return user;
    }

     */
}
