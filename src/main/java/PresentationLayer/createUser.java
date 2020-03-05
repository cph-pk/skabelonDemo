package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;

public class createUser extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, SQLException {
        HttpSession session = request.getSession();
        String email = request.getParameter( "email" );
        String password1 = request.getParameter( "password1" );
        String password2 = request.getParameter( "password2" );
        String role = request.getParameter("role");
        if ( password1.equals( password2 ) ) {
            LogicFacade.createNewUser( email, password1,role );
            List<User> allUsers = LogicFacade.showAllCustomers();
            session.setAttribute("allusers",allUsers);
            request.setAttribute("admin", allUsers);
            return "admin";
        } else {
            throw new LoginSampleException( "the two passwords did not match" );
        }
    }
}
