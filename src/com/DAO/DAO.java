package com.DAO;
import com.beans.*;
import java.sql.*;
import java.util.ArrayList;
public class DAO {
	
	/**
	 * @param args
	 * @throws SQLException 
	 */
	public int CreateStaff(Staff staff) throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String pwd = "admin";
		Connection con = null;
		PreparedStatement ps = null;
		int i=0;
			
			try{
				Class.forName(driver);
				con = DriverManager.getConnection(url, username, pwd);
				ps = con.prepareStatement("INSERT INTO Staff VALUES(?,?,?,?,?,?,?,?)");	
				ps.setString(1, staff.getStaff_id());
				ps.setString(2, staff.getS_name());
				ps.setString(3, staff.getStaff_add());
				ps.setInt(4, staff.getS_SSN());
				ps.setString(5, staff.getS_role());
				ps.setInt(6, staff.getSalary());
				ps.setInt(7, staff.getRating());
				ps.setString(8, staff.getUser_id());
				i=ps.executeUpdate();
			}finally{
				if(ps!=null)
					ps.close();
				if(con!=null)
					con.close();
			}
			System.out.println(i);
			return i;
	}

	public int CreateDistributor(Distributor d) throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String pwd = "admin";
		Connection con = null;
		PreparedStatement ps = null;
		int i=0;
			
			try{
				Class.forName(driver);
				con = DriverManager.getConnection(url, username, pwd);
				ps = con.prepareStatement("INSERT INTO Distributor VALUES(?,?,?,?,?,?,?)");	
				ps.setString(1, d.getD_id());
				ps.setString(2, d.getD_name());
				ps.setString(3, d.getD_add());
				ps.setInt(4, d.getD_SSN());
				ps.setString(5, d.getD_product_category());
				ps.setInt(6, d.getD_contact());
				ps.setString(7, d.getUser_id());
				i=ps.executeUpdate();
			}finally{
				if(ps!=null)
					ps.close();
				if(con!=null)
					con.close();
			}
			System.out.println(i);
			return i;
	}
	
	public int CreateCustomer(Customer c) throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String pwd = "admin";
		Connection con = null;
		PreparedStatement ps = null;
		int i=0;
			
			try{
				Class.forName(driver);
				con = DriverManager.getConnection(url, username, pwd);
				ps = con.prepareStatement("INSERT INTO Customer VALUES(?,?,?,?,?,?)");	
				ps.setString(1, c.getC_id());
				ps.setString(2, c.getC_name());
				ps.setString(3, c.getC_add());
				ps.setInt(4, c.getC_SSN());
				ps.setInt(5, c.getDiscount_offered());
				ps.setString(6, c.getUser_id());
				i=ps.executeUpdate();
			}finally{
				if(ps!=null)
					ps.close();
				if(con!=null)
					con.close();
			}
			System.out.println(i);
			return i;
	}
	public int insertItems(Items i) throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String pwd = "admin";
		Connection con = null;
		PreparedStatement ps = null;
		int ic=0;
			
			try{
				Class.forName(driver);
				con = DriverManager.getConnection(url, username, pwd);
				ps = con.prepareStatement("INSERT INTO Items VALUES(?,?,?,?,?,?,?,?,?,?,?)");	
				ps.setString(1, i.getItem_id());
				ps.setString(2, i.getI_name());
				ps.setString(3, i.getI_category());
				ps.setInt(4, i.getStock());
				ps.setInt(5, i.getPurchase_price());
				ps.setInt(6, i.getMRP());
				ps.setString(7, i.getItem_description());
				ps.setString(8,   i.getMf_date());
				ps.setString(9, i.getExp_date());
				ps.setString(10, i.getD_id());
				ps.setString(11, i.getA_id());
				ic=ps.executeUpdate();
			}finally{
				if(ps!=null)
					ps.close();
				if(con!=null)
					con.close();
			}
			System.out.println(ic);
			return ic;
	}
	public int insertOrders(Orders o) throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String pwd = "admin";
		Connection con = null;
		PreparedStatement ps = null;
		int ic=0;
			
			try{
				Class.forName(driver);
				con = DriverManager.getConnection(url, username, pwd);
				ps = con.prepareStatement("INSERT INTO Orders VALUES(?,?,?,?,?,?,?)");	
				ps.setString(1, o.getOrder_id());
				ps.setInt(2, o.getAmount());
				ps.setInt(3, o.getDiscount_applied());
				ps.setString(4, o.getC_id());
				ps.setString(5, o.getStaff_id());
				ps.setString(6, o.getOrder_date());
				ps.setString(7, o.getBill_id());
				ic=ps.executeUpdate();
			}finally{
				if(ps!=null)
					ps.close();
				if(con!=null)
					con.close();
			}
			System.out.println(ic);
			return ic;
	}
	public int insertFeedback(Feedback f) throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String pwd = "admin";
		Connection con = null;
		PreparedStatement ps = null;
		int ic=0;
			
			try{
				Class.forName(driver);
				con = DriverManager.getConnection(url, username, pwd);
				ps = con.prepareStatement("INSERT INTO Feedback VALUES(?,?,?,?,?,?)");	
				ps.setString(1, f.getFd_id());
				ps.setString(2, f.getC_id());
				ps.setString(3, f.getFd_info());
				ps.setInt(4, f.getRating());
				ps.setString(5, f.getComments());
				ps.setString(6, f.getFeedback_date());
				ic=ps.executeUpdate();
			}finally{
				if(ps!=null)
					ps.close();
				if(con!=null)
					con.close();
			}
			System.out.println(ic);
			return ic;
	}
	public int deleteStaff(String staff_id) throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String pwd = "admin";
		Connection con = null;
		PreparedStatement ps = null;
		int ic=0;
			
			try{
				Class.forName(driver);
				con = DriverManager.getConnection(url, username, pwd);
				ps = con.prepareStatement("Delete Staff where STAFF_ID=?");	
				System.out.println(staff_id);
				ps.setString(1, staff_id);
				ic=ps.executeUpdate();
			}catch(SQLException e)
			{
				System.out.println(e.getMessage());
			}
				finally{
				if(ps!=null)
					ps.close();
				if(con!=null)
					con.close();
			}
			System.out.println(ic);
			return ic;
	}
	public int deleteDistributor(String D_id) throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String pwd = "admin";
		Connection con = null;
		PreparedStatement ps = null;
		int ic=0;
			
			try{
				Class.forName(driver);
				con = DriverManager.getConnection(url, username, pwd);
				ps = con.prepareStatement("Delete From Distributor where D_id=?");	
				ps.setString(1, D_id);
				ic=ps.executeUpdate();
			}finally{
				if(ps!=null)
					ps.close();
				if(con!=null)
					con.close();
			}
			System.out.println(ic);
			return ic;
	}
	public int deleteCustomer(String C_id) throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String pwd = "admin";
		Connection con = null;
		PreparedStatement ps = null;
		int ic=0;
			
			try{
				Class.forName(driver);
				con = DriverManager.getConnection(url, username, pwd);
				ps = con.prepareStatement("Delete From Customer where C_id=?");	
				ps.setString(1, C_id);
				ic=ps.executeUpdate();
			}finally{
				if(ps!=null)
					ps.close();
				if(con!=null)
					con.close();
			}
			System.out.println(ic);
			return ic;
	}
	public int deleteItems(String Item_id) throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String pwd = "admin";
		Connection con = null;
		PreparedStatement ps = null;
		int ic=0;
			
			try{
				Class.forName(driver);
				con = DriverManager.getConnection(url, username, pwd);
				ps = con.prepareStatement("Delete From Items where Item_id=?");	
				System.out.println(Item_id);
				ps.setString(1, Item_id);
				ic=ps.executeUpdate();
			}finally{
				if(ps!=null)
					ps.close();
				if(con!=null)
					con.close();
			}
			System.out.println(ic);
			return ic;
	}
	public Items searchItems(String Item_id) throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String pwd = "admin";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		Items i=new Items();
			
			try{
				Class.forName(driver);
				con = DriverManager.getConnection(url, username, pwd);
				ps = con.prepareStatement("Select * from Items where Item_id=?");	
				ps.setString(1, Item_id);
				rs=ps.executeQuery();
				while(rs!=null){
					i.setItem_id(rs.getString(0));					
					i.setI_name(rs.getString(1));
					i.setI_category(rs.getString(2));
					i.setStock(rs.getInt(3));
					i.setPurchase_price(rs.getInt(4));
					i.setMRP(rs.getInt(5));
					i.setItem_description(rs.getString(6));
					i.setMf_date(rs.getDate(7).toString());
					i.setExp_date(rs.getDate(8).toString());
					i.setD_id(rs.getString(9));
					i.setA_id(rs.getString(10));
				}
			}finally{
				if(ps!=null)
					ps.close();
				if(con!=null)
					con.close();
			}
			
			return i;
	}
	public ArrayList<String> query1() throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String pwd = "admin";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		ArrayList<String> s=new ArrayList<String>();
			
			try{
				Class.forName(driver);
				con = DriverManager.getConnection(url, username, pwd);
				ps = con.prepareStatement("SELECT o.Order_id FROM Orders o, Customer c, Staff s WHERE o.Staff_id=s.Staff_id and o.C_id=c.C_id and s.Rating=4 and c.C_add='Arlington'");	
			//	ps.setString(1, Item_id);
				rs=ps.executeQuery();
				while(rs.next()){
					s.add(rs.getString("Order_id"));
					//System.out.println(rs.getString(0));
				}
			}finally{
				if(ps!=null)
					ps.close();
				if(con!=null)
					con.close();
			}
			
			return s;
	}
	public ArrayList<Items> query2() throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String pwd = "admin";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		ArrayList<Items> s=new ArrayList<Items>();
			
			try{
				Class.forName(driver);
				con = DriverManager.getConnection(url, username, pwd);
				ps = con.prepareStatement("SELECT SUM(i.purchase_price),i.i_category FROM Items i, Distributor d, Admins a WHERE i.D_id=d.D_id and i.D_id='D101' and i.exp_date<=CURRENT_DATE and i.A_id=a.A_id and i.A_id='A002' group by i.i_category having SUM(i.purchase_price)<1000");	
			//	ps.setString(1, Item_id);
				rs=ps.executeQuery();
				while(rs.next()){
					Items i=new Items();
					i.setPurchase_price(rs.getInt("SUM(I.PURCHASE_PRICE)"));
					i.setI_category(rs.getString("I_CATEGORY"));
					
					s.add(i);
					//s.add(rs.getString("I.PURCHASE_PRICE"));
					//System.out.println(rs.getString(0));
				}
			}finally{
				if(ps!=null)
					ps.close();
				if(con!=null)
					con.close();
			}
			
			return s;
	}
	public ArrayList<Online_Orders> query3() throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String pwd = "admin";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		ArrayList<Online_Orders> s=new ArrayList<Online_Orders>();
			
			try{
				Class.forName(driver);
				con = DriverManager.getConnection(url, username, pwd);
				ps = con.prepareStatement("SELECT oo.Tracking_id,oo.C_add FROM Online_Orders oo, Bill_Reciept b, Orders o WHERE oo.Order_id=o.Order_id and oo.Bill_id=b.Bill_id and b.order_date='11-DEC-2015' and o.Amount>100");	
			//	ps.setString(1, Item_id);
				rs=ps.executeQuery();
				while(rs.next()){
					Online_Orders o=new Online_Orders();
					o.setTracking_id(rs.getString("Tracking_id"));
					o.setC_add(rs.getString("C_add"));
					
					s.add(o);
					//s.add(rs.getString("I.PURCHASE_PRICE"));
					//System.out.println(rs.getString(0));
				}
			}finally{
				if(ps!=null)
					ps.close();
				if(con!=null)
					con.close();
			}
			
			return s;
	}
	public ArrayList<Items> query4() throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String pwd = "admin";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		ArrayList<Items> s=new ArrayList<Items>();
			
			try{
				Class.forName(driver);
				con = DriverManager.getConnection(url, username, pwd);
				ps = con.prepareStatement("SELECT SUM(i.MRP),i.i_category FROM Items i,Admins a where i.A_id=a.A_id and a.A_id='A001' group by i.i_category order by SUM(i.MRP) ASC");	
			//	ps.setString(1, Item_id);
				rs=ps.executeQuery();
				while(rs.next()){
					Items i=new Items();
					i.setMRP(rs.getInt("SUM(I.MRP)"));
					i.setI_category(rs.getString("I_CATEGORY"));
					
					s.add(i);
					//s.add(rs.getString("I.PURCHASE_PRICE"));
					//System.out.println(rs.getString(0));
				}
			}finally{
				if(ps!=null)
					ps.close();
				if(con!=null)
					con.close();
			}
			
			return s;
	}
	public ArrayList<Staff> query5() throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String pwd = "admin";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		ArrayList<Staff> s=new ArrayList<Staff>();
			
			try{
				Class.forName(driver);
				con = DriverManager.getConnection(url, username, pwd);
				ps = con.prepareStatement("SELECT s.S_name,s.S_role FROM Staff s, Admins a, Account acc WHERE s.User_id=acc.User_id and acc.A_id=a.A_id and a.A_id IN('A001','A002','A003')");	
			//	ps.setString(1, Item_id);
				rs=ps.executeQuery();
				while(rs.next()){
					Staff st=new Staff();
					st.setS_name(rs.getString("S_NAME"));
					st.setS_role(rs.getString("S_ROLE"));
					
					s.add(st);
					//s.add(rs.getString("I.PURCHASE_PRICE"));
					//System.out.println(rs.getString(0));
				}
			}finally{
				if(ps!=null)
					ps.close();
				if(con!=null)
					con.close();
			}
			
			return s;
	}
	public ArrayList<Events_Offers> query6() throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String pwd = "admin";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		ArrayList<Events_Offers> s=new ArrayList<Events_Offers>();
			
			try{
				Class.forName(driver);
				con = DriverManager.getConnection(url, username, pwd);
				ps = con.prepareStatement("SELECT e.Event_id FROM Events_Offers e,Admins a WHERE e.A_id=a.A_id and a.A_id='A001' and e.Discount_offered=5");	
			//	ps.setString(1, Item_id);
				rs=ps.executeQuery();
				while(rs.next()){
					Events_Offers e=new Events_Offers();
					e.setEvent_id(rs.getString("EVENT_ID"));
					s.add(e);
					//s.add(rs.getString("I.PURCHASE_PRICE"));
					//System.out.println(rs.getString(0));
				}
			}finally{
				if(ps!=null)
					ps.close();
				if(con!=null)
					con.close();
			}
			
			return s;
	}
	public ArrayList<Expenses> query7() throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String pwd = "admin";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		ArrayList<Expenses> s=new ArrayList<Expenses>();
			
			try{
				Class.forName(driver);
				con = DriverManager.getConnection(url, username, pwd);
				ps = con.prepareStatement("SELECT SUM(Daily_expense) AS Total_Expense FROM Expenses WHERE TO_CHAR(Expense_date,'MM')=12 and TO_CHAR(Expense_date,'YYYY')=2015");	
			//	ps.setString(1, Item_id);
				rs=ps.executeQuery();
				while(rs.next()){
					Expenses e=new Expenses();
					e.setDaily_expense(rs.getInt("Total_Expense"));
					
					s.add(e);
					//s.add(rs.getString("I.PURCHASE_PRICE"));
					//System.out.println(rs.getString(0));
				}
			}finally{
				if(ps!=null)
					ps.close();
				if(con!=null)
					con.close();
			}
			
			return s;
	}
}
