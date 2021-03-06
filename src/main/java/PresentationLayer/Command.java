package PresentationLayer;

import FunctionLayer.LoginSampleException;

import java.sql.SQLException;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put( "login", new Login() );
        commands.put( "register", new Register() );
        commands.put("admin" , new admin());
        commands.put("employeepage", new employeepage());
        commands.put("createnewuser", new createNewUser());
        commands.put("createuser", new createUser());
        commands.put("deleteuser", new Deleteuser());
        commands.put("updateuser",new UpdateUser());
        commands.put("updatesql", new UpdateSql());
        commands.put("logout", new Logout());
        commands.put("resetcode", new ResetCode());
    }

    static Command from( HttpServletRequest request ) {
        String TagetName = request.getParameter( "taget" );
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(TagetName, new UnknownCommand() );   // unknowncommand er default.
    }

    abstract String execute( HttpServletRequest request, HttpServletResponse response )
            throws LoginSampleException, SQLException;

}
