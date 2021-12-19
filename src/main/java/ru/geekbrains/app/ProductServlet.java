package ru.geekbrains.app;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.geekbrains.catalog.Product;
import ru.geekbrains.catalog.ProductList;


public class ProductServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(ProductServlet.class);
    private ProductList productList;

    public ProductServlet() {
        productList = new ProductList();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> products = productList.selectAll();
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><head><meta charset=\"UTF-8\"><title>Products</title></head><body><h2>Products List</h2>");
        out.printf("<h3>Records in list - %d</h3>", products.size());
        out.println("<table border=1><tr><th>id</th><th>Title</th><th>Price</th></tr>");
        for (Product product:products) {
            out.printf("<tr><td>%d</td><td>%s</td><td>%.2f</td></tr>", product.getId(), product.getTitle(), product.getCoast());
        }
        out.println("</table></body></html>");
        out.close();

    }

}
