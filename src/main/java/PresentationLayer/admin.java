package PresentationLayer;

import DBAccess.UserMapper;
import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class admin extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, SQLException {
        HttpSession session = request.getSession();
        List<User> allUsers = (List<User>) session.getAttribute("alluser");
        if (allUsers == null) {
            allUsers = LogicFacade.showAllCustomers();
        } else {
            allUsers = (List<User>) session.getAttribute("alluser");
        }
        request.setAttribute("admin",allUsers);
        return "admin";
    }
}
