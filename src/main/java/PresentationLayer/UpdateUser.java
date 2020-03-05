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
        //HttpSession session = request.getSession();
        String id = request.getParameter( "id" );
        request.setAttribute("id", id);
        //LogicFacade.UpdateUser( Integer.parseInt(id) );

        return "updateuser";
    }
}
