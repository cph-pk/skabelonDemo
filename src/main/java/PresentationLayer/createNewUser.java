package PresentationLayer;

import FunctionLayer.LoginSampleException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class createNewUser extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
       /* String email = request.getParameter( "email" );
        String password1 = request.getParameter( "password1" );
        String password2 = request.getParameter( "password2" );
        String role = request.getParameter("role");
        if ( password1.equals( password2 ) ) {*/
            // a lot of stuff missing!!
            return "createnewuser";
       /* } else {
            throw new LoginSampleException( "the two passwords did not match" );
        }*/

    }
}
