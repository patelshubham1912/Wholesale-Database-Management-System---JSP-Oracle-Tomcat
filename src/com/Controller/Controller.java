package com.Controller;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.DAO.DAO;
import com.beans.*;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action=request.getParameter("hidden");
		DAO dao=new DAO();
		if(action.equals("Staff"))
		{
			String Staff_id= request.getParameter("Staff_id").toString();
			String S_name= request.getParameter("S_name").toString();
			String Staff_add= request.getParameter("Staff_add").toString();
			int S_SSN= Integer.parseInt(request.getParameter("S_SSN").toString());
			String S_role= request.getParameter("S_role").toString();
			int Salary= Integer.parseInt(request.getParameter("Salary").toString());
			int Rating= Integer.parseInt(request.getParameter("Rating").toString());
			String User_id= request.getParameter("User_id").toString();
			
			Staff staff=new Staff();
			staff.setStaff_id(Staff_id);
			staff.setS_name(S_name);
			staff.setStaff_add(Staff_add);
			staff.setS_SSN(S_SSN);
			staff.setS_role(S_role);
			staff.setSalary(Salary);
			staff.setRating(Rating);
			staff.setUser_id(User_id);

			try {
				dao.CreateStaff(staff);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd=request.getRequestDispatcher("Create.jsp");
			rd.forward(request, response);
			
		}else if(action.equals("Distributor"))
		{
			String D_id= request.getParameter("D_id").toString();
			String D_name= request.getParameter("D_name").toString();
			String D_add= request.getParameter("D_add").toString();
			int D_SSN= Integer.parseInt(request.getParameter("D_SSN").toString());
			String D_product_category= request.getParameter("D_product_category").toString();
			int D_contact= Integer.parseInt(request.getParameter("D_contact").toString());
			String User_id= request.getParameter("User_id").toString();
			
			Distributor d=new Distributor();
			d.setD_id(D_id);
			d.setD_name(D_name);
			d.setD_add(D_add);
			d.setD_SSN(D_SSN);
			d.setD_product_category(D_product_category);
			d.setD_contact(D_contact);
			d.setUser_id(User_id);
			
			
			try {
				dao.CreateDistributor(d);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd=request.getRequestDispatcher("Create.jsp");
			rd.forward(request, response);
			
		}else if(action.equals("Customer"))
		{
			String C_id= request.getParameter("C_id").toString();
			String C_name= request.getParameter("C_name").toString();
			String C_add= request.getParameter("C_add").toString();
			int C_SSN= Integer.parseInt(request.getParameter("C_SSN").toString());
			int Discount_offered= Integer.parseInt(request.getParameter("Discount_offered").toString());
			String User_id= request.getParameter("User_id").toString();
			
			Customer c=new Customer();
			c.setC_id(C_id);
			c.setC_name(C_name);
			c.setC_add(C_add);
			c.setC_SSN(C_SSN);
			c.setDiscount_offered(Discount_offered);
			c.setUser_id(User_id);
			
			
			try {
				dao.CreateCustomer(c);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			RequestDispatcher rd=request.getRequestDispatcher("Create.jsp");
			rd.forward(request, response);
			
		}else if(action.equals("insertItems"))
		{
			String Item_id=request.getParameter("Item_id");
			String i_name=request.getParameter("i_name");
			String i_category=request.getParameter("i_category");
			int stock=Integer.parseInt(request.getParameter("stock"));
			int purchase_price=Integer.parseInt(request.getParameter("purchase_price"));
			int MRP=Integer.parseInt(request.getParameter("MRP"));
			String item_description=request.getParameter("item_description");
			SimpleDateFormat formatter = new SimpleDateFormat("DD-MM-YYYY");
			String mf_Date=request.getParameter("mf_date").toString();
			String exp_Date=request.getParameter("exp_date").toString();
			String D_id=request.getParameter("D_id");
			String A_id=request.getParameter("A_id");
			
			Items i=new Items();
			i.setItem_id(Item_id);
			i.setI_name(i_name);
			i.setI_category(i_category);
			i.setStock(stock);
			i.setPurchase_price(purchase_price);
			i.setMRP(MRP);
			i.setItem_description(item_description);
			i.setMf_date(mf_Date);
			i.setExp_date(exp_Date);
			i.setD_id(D_id);
			i.setA_id(A_id);
			
			
			try {
				dao.insertItems(i);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd=request.getRequestDispatcher("Insert.jsp");
			rd.forward(request, response);
		}
		else if(action.equals("insertOrders"))
		{
			String Order_id=request.getParameter("Order_id");
			int Amount=Integer.parseInt(request.getParameter("Amount"));
			int Discount_applied=Integer.parseInt(request.getParameter("Discount_applied"));
			String C_id=request.getParameter("C_id");
			String Staff_id=request.getParameter("Staff_id");
			SimpleDateFormat formatter = new SimpleDateFormat("DD-MM-YYYY");
			String order_date=request.getParameter("order_date").toString();
	       			
			String Bill_id=request.getParameter("Bill_id");
			
			Orders o=new Orders();
			o.setOrder_id(Order_id);
			o.setAmount(Amount);
			o.setDiscount_applied(Discount_applied);
			o.setC_id(C_id);
			o.setStaff_id(Staff_id);
			o.setOrder_date(order_date);
			o.setBill_id(Bill_id);
			
			
			
			
			try {
				dao.insertOrders(o);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd=request.getRequestDispatcher("Insert.jsp");
			rd.forward(request, response);
		}
		else if(action.equals("Feedback"))
		{
			String Fd_id=request.getParameter("Fd_id");
			String C_id=request.getParameter("C_id");
			String fd_info=request.getParameter("fd_info");
			int Rating=Integer.parseInt(request.getParameter("Rating"));
			String Comments=request.getParameter("Comments");
			SimpleDateFormat formatter = new SimpleDateFormat("DD-MM-YYYY");
			String Feedback_date=request.getParameter("Feedback_date").toString();

			Feedback f=new Feedback();
			f.setFd_id(Fd_id);
			f.setC_id(C_id);
			f.setFd_info(fd_info);
			f.setRating(Rating);
			f.setComments(Comments);
			f.setFeedback_date(Feedback_date);
			
			
			try {
				dao.insertFeedback(f);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd=request.getRequestDispatcher("Insert.jsp");
			rd.forward(request, response);
		}
		else if(action.equals("deleteStaff"))
		{
			String Staff_id= request.getParameter("Staff_id").toString();
			
			System.out.println(Staff_id);
			try {
				dao.deleteStaff(Staff_id);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd=request.getRequestDispatcher("Delete.jsp");
			rd.forward(request, response);
		}
		else if(action.equals("deleteDistributor"))
		{
			String D_id= request.getParameter("D_id").toString();
			
			try {
				dao.deleteDistributor(D_id);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd=request.getRequestDispatcher("Delete.jsp");
			rd.forward(request, response);
		}else if(action.equals("deleteCustomer"))
		{
			String C_id= request.getParameter("C_id").toString();

			try {
				dao.deleteCustomer(C_id);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd=request.getRequestDispatcher("Delete.jsp");
			rd.forward(request, response);
		}else if(action.equals("deleteItems"))
		{
			String Item_id=request.getParameter("Item_id");
			
			try {
				dao.deleteItems(Item_id);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd=request.getRequestDispatcher("Delete.jsp");
			rd.forward(request, response);
		}
		else if(action.equals("updateItems"))
		{
			String query=request.getParameter("button").toString();
			System.out.println(query);
			if(query.equals("Search"))
			{
				String Item_id=request.getParameter("Item_id");
				System.out.println(Item_id);
				Items i=new Items();
				try {
					i=dao.searchItems(Item_id);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				request.setAttribute("Items", i);
				RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
				rd.forward(request, response);
			}
			else if(action.equals("Update"))
			{
				String Item_id=request.getParameter("Item_id");
				String i_name=request.getParameter("i_name");
				String i_category=request.getParameter("i_category");
				int stock=Integer.parseInt(request.getParameter("stock"));
				int purchase_price=Integer.parseInt(request.getParameter("purchase_price"));
				int MRP=Integer.parseInt(request.getParameter("MRP"));
				String item_description=request.getParameter("item_description");
				SimpleDateFormat formatter = new SimpleDateFormat("DD-MM-YYYY");
				String mf_Date=request.getParameter("mf_date").toString();
				String exp_Date=request.getParameter("exp_date").toString();	
				String D_id=request.getParameter("D_id");
				String A_id=request.getParameter("A_id");
			}
//			String D_id= request.getParameter("D_id").toString();
//			String D_name= request.getParameter("D_name").toString();
//			String D_add= request.getParameter("D_add").toString();
//			int D_SSN= Integer.parseInt(request.getParameter("D_SSN").toString());
//			String D_product_category= request.getParameter("D_product_category").toString();
//			int D_contact= Integer.parseInt(request.getParameter("D_contact").toString());
//			String User_id= request.getParameter("User_id").toString();
//			
//			Distributor d=new Distributor();
//			d.setD_id(D_id);
//			d.setD_name(D_name);
//			d.setD_add(D_add);
//			d.setD_SSN(D_SSN);
//			d.setD_product_category(D_product_category);
//			d.setD_contact(D_contact);
//			d.setUser_id(User_id);
//			
//			DAO dao=new DAO();
//			try {
//				dao.CreateDistributor(d);
//			} catch (ClassNotFoundException | SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		else if(action.equals("Query1"))
		{
			System.out.println("Query1");
			ArrayList<String> s=new ArrayList<String>();
			try {
				s=dao.query1();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("Query", "Query1");
			request.setAttribute("result", s);
			RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
			rd.forward(request, response);
			//response.sendRedirect("result.jsp");
			
		}
		else if(action.equals("Query2"))
		{
			
			System.out.println("Query2");
			ArrayList<Items> s=new ArrayList<Items>();
			try {
				s=dao.query2();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("Query", "Query2");
			request.setAttribute("result", s);
			RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
			rd.forward(request, response);
		}
		else if(action.equals("Query3"))
		{
			
			System.out.println("Query3");
			ArrayList<Online_Orders> s=new ArrayList<Online_Orders>();
			try {
				s=dao.query3();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("Query", "Query3");
			request.setAttribute("result", s);
			RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
			rd.forward(request, response);
		}
		else if(action.equals("Query4"))
		{
			
			System.out.println("Query4");
			ArrayList<Items> s=new ArrayList<Items>();
			try {
				s=dao.query4();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("Query", "Query4");
			request.setAttribute("result", s);
			RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
			rd.forward(request, response);
		}
		else if(action.equals("Query5"))
		{
			
			System.out.println("Query5");
			ArrayList<Staff> s=new ArrayList<Staff>();
			try {
				s=dao.query5();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("Query", "Query5");
			request.setAttribute("result", s);
			RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
			rd.forward(request, response);
		}
		else if(action.equals("Query6"))
		{
			
			System.out.println("Query6");
			ArrayList<Events_Offers> s=new ArrayList<Events_Offers>();
			try {
				s=dao.query6();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("Query", "Query6");
			request.setAttribute("result", s);
			RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
			rd.forward(request, response);
		}
		else if(action.equals("Query7"))
		{
			
			System.out.println("Query7");
			ArrayList<Expenses> s=new ArrayList<Expenses>();
			try {
				s=dao.query7();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("Query", "Query7");
			request.setAttribute("result", s);
			RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
			rd.forward(request, response);
		}
		
		
	}

}
