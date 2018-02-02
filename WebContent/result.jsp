<%@page import="com.beans.Expenses"%>
<%@page import="com.beans.Events_Offers"%>
<%@page import="com.beans.Staff"%>
<%@page import="com.beans.Online_Orders"%>
<%@page import="com.beans.Items"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>
        Wholesale Database Management System
    </title>

    <!-- Bootstrap Core CSS -->
    <link href="CSS/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="CSS/one-page-wonder.css" rel="stylesheet">
    <style>
        .mini-submenu {
            display: none;
            background-color: rgba(0, 0, 0, 0);
            border: 1px solid rgba(0, 0, 0, 0.9);
            border-radius: 4px;
            padding: 9px;
            /*position: relative;*/
            width: 42px;
        }
        
        .mini-submenu:hover {
            cursor: pointer;
        }
        
        .mini-submenu .icon-bar {
            border-radius: 1px;
            display: block;
            height: 2px;
            width: 22px;
            margin-top: 3px;
        }
        
        .mini-submenu .icon-bar {
            background-color: #000;
        }
        
        #slide-submenu {
            background: rgba(0, 0, 0, 0.45);
            display: inline-block;
            padding: 0 8px;
            border-radius: 4px;
            cursor: pointer;
        }
    </style>

</head>

<body>

<!-- Navigation -->

    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
             
            <h1 class="logo">
        <div class="header" style="color:PURPLE">
			<center> <p><color>WHOLESALE DATABASE MANAGEMENT SYSTEM </p></center>
        </div>
      </h1>
	  
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <!-- /.navbar-collapse -->
		
    </div>
    <!-- /.container -->


<!-- Full Width Image Header -->


<!-- Page Content -->
<div class="container">

    <h1 class="thick-heading">

  </h1>

    <!-- First Featurette -->
    <div class="featurette" id="about">
        <!------------------------code---------------start---------------->
        <nav class="navbar navbar-default" role="navigation">
            <div class="container-fluid">
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                	    <ul class="nav navbar-nav">
                            <li class="tab active"><a href="Query.jsp">Results</a></li>             
                        </ul>                    
                     <!--   <form class="navbar-form navbar-left" role="search">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Search">
                            </div>
                            <button type="submit" class="btn btn-default">Submit</button>
                        </form>
                        <ul class="nav navbar-nav navbar-right">
                            <li><a href="#">Link</a></li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">Action</a></li>
                                    <li><a href="#">Another action</a></li>
                                    <li><a href="#">Something else here</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#">Separated link</a></li>
                                </ul>
                            </li>
                        </ul>
                        --> 
                    </div>
                    <!-- /.navbar-collapse -->
                </div>
            </nav>
            
            
            
            
            <div class="row">
                <div class="col-sm-4 col-md-3 sidebar">
                <span href="#" class="list-group-item"  align="center" style="width:1100px;margin-left:20px;align:center;">
               
   
   <%String query=request.getAttribute("Query").toString();
            if(query.equals("Query1"))
            {%>
            	<table class="table">
        	    <thead>
        	      <tr>
        	        <th>Order_id</th>       	      
        	      </tr>
        	    </thead>
        	    <tbody>
        	    <%
            	ArrayList<String> s=(ArrayList<String>)request.getAttribute("result");
            	for(String i:s)
            	{%>
            		
            	      <tr>
            	        <td><%=i %></td>
            	      </tr>  
            	
           <% }
            	}else if(query.equals("Query2")){
            		%>
                	<table class="table">
            	    <thead>
            	      <tr>
            	        <th>SUM(I.PURCHASE_PRICE)</th>
            	        <th>I_CATEGORY</th>       	      
            	      </tr>
            	    </thead>
            	    <tbody>
            	    <%
        	   ArrayList<Items> s=(ArrayList<Items>)request.getAttribute("result");
           	for(Items i:s)
           	{%>
           		<tr>        	        
            	         <td><%=i.getPurchase_price() %></td>
            	         <td><%=i.getI_category() %></td>
            	      </tr>  
           <% 	
           }
            }else if(query.equals("Query3")){
            		%>
                	<table class="table">
            	    <thead>
            	      <tr>
            	        <th>Tracking_id</th>
            	        <th>C_add</th>       	      
            	      </tr>
            	    </thead>
            	    <tbody>
            	    <%
        	   ArrayList<Online_Orders> s=(ArrayList<Online_Orders>)request.getAttribute("result");
           	for(Online_Orders i:s)
           	{%>
           		<tr>        	        
            	         <td><%=i.getTracking_id() %></td>
            	         <td><%=i.getC_add() %></td>
            	      </tr>  
           <% 	
           }
            }else if(query.equals("Query4")){
            		%>
                	<table class="table">
            	    <thead>
            	      <tr>
            	        <th>SUM(I.MRP)</th>
            	        <th>I_CATEGORY</th>       	      
            	      </tr>
            	    </thead>
            	    <tbody>
            	    <%
        	   ArrayList<Items> s=(ArrayList<Items>)request.getAttribute("result");
           	for(Items i:s)
           	{%>
           		<tr>        	        
            	         <td><%=i.getMRP() %></td>
            	         <td><%=i.getI_category() %></td>
            	      </tr>  
           <% 	
           }
            }else if(query.equals("Query5")){
            		%>
                	<table class="table">
            	    <thead>
            	      <tr>
            	        <th>S_NAME</th>
            	        <th>S_ROLE</th>       	      
            	      </tr>
            	    </thead>
            	    <tbody>
            	    <%
        	   ArrayList<Staff> s=(ArrayList<Staff>)request.getAttribute("result");
           	for(Staff i:s)
           	{%>
           		<tr>        	        
            	         <td><%=i.getS_name() %></td>
            	         <td><%=i.getS_role() %></td>
            	      </tr>  
           <% 	
           }
            }else if(query.equals("Query6")){
            		%>
                	<table class="table">
            	    <thead>
            	      <tr>
            	        <th>EVENT_ID</th>       	      
            	      </tr>
            	    </thead>
            	    <tbody>
            	    <%
        	   ArrayList<Events_Offers> s=(ArrayList<Events_Offers>)request.getAttribute("result");
           	for(Events_Offers i:s)
           	{%>
           		<tr>        	        
            	         <td><%=i.getEvent_id() %></td>
            	      </tr>  
           <% 	
           }
            }else if(query.equals("Query7")){
            		%>
                	<table class="table">
            	    <thead>
            	      <tr>
            	        <th>Total_Expense</th>      	      
            	      </tr>
            	    </thead>
            	    <tbody>
            	    <%
        	   ArrayList<Expenses> s=(ArrayList<Expenses>)request.getAttribute("result");
           	for(Expenses i:s)
           	{%>
           		<tr>        	        
            	         <td><%=i.getDaily_expense() %></td>
            	      </tr>  
           <% 	
           }
            }%>
            </tbody>
            	  </table>
  </span>
            
                    
              </div>       
                    
                </div>
            </div>
            <!----Code------end----------------------------------->
        </div>
        
        
        <!-- /.container -->
        <div class="footer-copyright" style="margin-top: 50px;height:50px">
            <div class="container">
                
                    
                    <div class="footerModified">
                        <p>
                            © Copyright 2015. All Rights Reserved.
                        </p>
                    </div>
              
            </div>
        </div>
        <!-- jQuery -->
     <script src="http://www.tutorialspoint.com/bootstrap/scripts/jquery.min.js">
        </script>
        <script>
            $(function () {

                $('#slide-submenu').on('click', function () {
                    $(this).closest('.list-group').fadeOut('slide', function () {
                        $('.mini-submenu').fadeIn();
                    });

                });

                $('.mini-submenu').on('click', function () {
                    $(this).next('.list-group').toggle('slide');
                    $('.mini-submenu').hide();
                })
            })
        </script>
        <!-- Bootstrap Core JavaScript -->
        <script src="http://www.tutorialspoint.com/bootstrap/js/bootstrap.min.js">
        </script>

</body>
</html>