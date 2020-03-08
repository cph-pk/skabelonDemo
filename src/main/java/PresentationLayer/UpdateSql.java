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
        return getString(request, session);
    }

    static String getString(HttpServletRequest request, HttpSession session) throws SQLException {
        List<User> allUsers = LogicFacade.showAllCustomers("customer");
        session.setAttribute("allusers",allUsers);
        request.setAttribute("admin", allUsers);
        request.setAttribute("userList","employee");
        request.setAttribute("buttonName","employee");
        request.setAttribute("listName","Customer");
        return "admin";
    }
}
