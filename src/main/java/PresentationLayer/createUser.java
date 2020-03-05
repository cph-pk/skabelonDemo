package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class createUser extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        String email = request.getParameter( "email" );
        String password1 = request.getParameter( "password1" );
        String password2 = request.getParameter( "password2" );
        String role = request.getParameter("role");
        if ( password1.equals( password2 ) ) {
            User user = LogicFacade.createNewUser( email, password1,role );
            
            return "admin";
        } else {
            throw new LoginSampleException( "the two passwords did not match" );
        }
    }
}
