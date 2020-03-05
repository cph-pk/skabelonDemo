package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;

public class UpdateUser extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, SQLException {
        String id = request.getParameter( "id" );
        String email = request.getParameter("email");
        request.setAttribute("id", id);
        request.setAttribute("email" ,email);
        return "updateuser";
    }
}
