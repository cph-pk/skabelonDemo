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
            if ( !password1.isEmpty()) {
                LogicFacade.createNewUser(email, password1, role);
                List<User> allUsers = LogicFacade.showAllCustomers();
                session.setAttribute("allusers", allUsers);
                request.setAttribute("admin", allUsers);
                return "admin";
            } else {
                request.setAttribute("email" ,email);
                request.setAttribute("besked", "password is empty!" );
                return "createnewuser";
            }
        } else {
            request.setAttribute("email" ,email);
            request.setAttribute("besked", "the two passwords did not match" );
            return "createnewuser";
        }
    }
}
