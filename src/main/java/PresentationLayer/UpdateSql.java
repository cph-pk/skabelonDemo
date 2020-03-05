package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;

public class UpdateSql extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, SQLException {
        HttpSession session = request.getSession();
        int id = Integer.parseInt(request.getParameter( "id" ));
        String email = request.getParameter( "email" );
        String role = request.getParameter( "role" );
        LogicFacade.updateUser( id,email,role );
        List<User> allUsers = LogicFacade.showAllCustomers();
        session.setAttribute("allusers",allUsers);
        request.setAttribute("admin", allUsers);
        return "admin";
    }
}
