<%@page import="dcc192_2018_1_trb1.Mesa"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mesas</title>
    </head>
    <body>
        <h1>Mesas</h1>
        <ul>
            <%
                List<Mesa> mesas = (List<Mesa>) request.getAttribute("mesas");
                for (int i = 0; i < mesas.size(); i++) {
                    int numMesa = mesas.get(i).getNumMesa();
            %>
            <li><a href="pedidos.html?linha=<%=numMesa%>">Mesa <%=numMesa%></li> 
                <%}%>
        </ul>
    </body>
</html>
