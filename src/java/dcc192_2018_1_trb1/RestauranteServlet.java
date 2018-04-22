package dcc192_2018_1_trb1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ice
 */
@WebServlet(name = "RestauranteServlet", urlPatterns = {"/mesas.html", "/pedidos.html"})
public class RestauranteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if ("/mesas.html".equals(request.getServletPath())) {
            listarMesas(request, response);
        } 
        if ("/pedidos.html".equals(request.getServletPath())) {
            listarPedidos(request,response);
        }
    }

    private void listarMesas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Mesa> mesas = ListaDeMesas.getInstance();
        request.setAttribute("mesas", mesas);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/listar-mesas.jsp");
        despachante.forward(request, response);
    }

    private void listarPedidos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int numMesa = Integer.parseInt(request.getParameter("linha"));
        List<Mesa> mesas = ListaDeMesas.getInstance();
        List<Pedido> pedidos = mesas.get(numMesa).getPedidos();
        request.setAttribute("pedidos", pedidos);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/listar-pedidos.jsp");
        despachante.forward(request, response);
    }

    
}