package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;

public class admin extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        HttpSession session = request.getSession();
        List<User> allUsers = (List<User>) session.getAttribute("alluser");
        String userList = request.getParameter("userList");

        if (allUsers == null) {
            allUsers = LogicFacade.showAllCustomers(userList);
        } else {
            allUsers = (List<User>) session.getAttribute("alluser");
        }
        request.setAttribute("admin",allUsers);
        if (userList.equals("customer")) {
            request.setAttribute("userList","employee");
            request.setAttribute("buttonName","employee");
            request.setAttribute("listName","Customer");
        } else {
            request.setAttribute("userList","customer");
            request.setAttribute("buttonName","customer");
            request.setAttribute("listName","Employee");
        }
        return "admin";
    }
}
