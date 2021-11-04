import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Refresh extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setIntHeader("Refresh",5);
        Calendar calendar = new GregorianCalendar();
        String am_pm;
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(calendar.SECOND);
        if(calendar.get(Calendar.AM_PM)==0){
            am_pm = "AM";
        }
        else{am_pm = "PM"; }
        String CT = hour+":"+ minute +":"+second+ am_pm;
        PrintWriter out = resp.getWriter();

  }
}
