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
<script language="javascript"> 

	function toggle1() {
		var ele1 = document.getElementById("create");
		var ele2 = document.getElementById("insert");
		var ele3 = document.getElementById("delete");
		var ele4 = document.getElementById("update");
		//var ele5 = document.getElementById("Query");
			ele2.style.display = "none";
			ele3.style.display = "none";
			ele4.style.display = "none";
		//	ele5.style.display = "none";
			ele1.style.display = "block";
		}
	

	function toggle2() {

		var ele1 = document.getElementById("create");
		var ele2 = document.getElementById("insert");
		var ele3 = document.getElementById("delete");
		var ele4 = document.getElementById("update");
		//var ele5 = document.getElementById("Query");
			ele1.style.display = "none";
			ele3.style.display = "none";
			ele4.style.display = "none";
			//ele5.style.display = "none";
			ele2.style.display = "block";
		}
	

	function toggle3() {

		var ele1 = document.getElementById("create");
		var ele2 = document.getElementById("insert");
		var ele3 = document.getElementById("delete");
		var ele4 = document.getElementById("update");
		//var ele5 = document.getElementById("Query");
			ele1.style.display = "none";
			ele2.style.display = "none";
			ele4.style.display = "none";
			//ele5.style.display = "none";
			ele3.style.display = "block";
		}
	

	function toggle4() {

		var ele1 = document.getElementById("create");
		var ele2 = document.getElementById("insert");
		var ele3 = document.getElementById("delete");
		var ele4 = document.getElementById("update");
		//var ele5 = document.getElementById("Query");
			ele1.style.display = "none";
			ele2.style.display = "none";
			ele3.style.display = "none";
			//ele5.style.display = "none";
			ele4.style.display = "block";
		}
	function toggle5() {

		var ele1 = document.getElementById("create");
		var ele2 = document.getElementById("insert");
		var ele3 = document.getElementById("delete");
		var ele4 = document.getElementById("update");
		//var ele5 = document.getElementById("Query");
			ele1.style.display = "none";
			ele2.style.display = "none";
			ele3.style.display = "none";
			ele4.style.display = "none";
			//ele5.style.display = "block";
		}
</script>
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
                            <li class="tab active"><a href="javascript:toggle1();">CREATE</a></li>
                            <li class="tab"><a href="javascript:toggle2();">INSERT</a></li>
                            <li class="tab"><a href="javascript:toggle3();">DELETE</a></li>
                            <li class="tab"><a href="javascript:toggle4();">UPDATE</a></li>
                            <li class="tab"><a href="javascript:toggle5();">QUERY</a></li>                
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
                
                
          
                
                <div class="create" id="create">
                <div class="list-group" align="left">
                        
                        <div class="form1" id="createStaff" name="createStaff">
                        <form action="Controller" class="list-group" method="post">
                        <span href="#" class="list-group-item active"  align="center">
			            Create Staff
                        </span>

                    		<input type="text" class="list-group-item" placeholder="Enter Staff Id" name="Staff_id" id="Staff_id" />
                    		<input type="text" class="list-group-item" placeholder="Enter Staff name" name="S_name" id="S_name" />
                    		<input type="text" class="list-group-item" placeholder="Enter Staff address" name="Staff_add" id="Staff_add" />
                    		<input type="text" class="list-group-item" placeholder="Enter Staff SSN" name="S_SSN" id="S_SSN" />
                    		<input type="text" class="list-group-item" placeholder="Enter Staff's Role" name="S_role" id="S_role" />
                    		<input type="text" class="list-group-item" placeholder="Enter Staff Salary" name="Salary" id="Salary" />
                    		<input type="text" class="list-group-item" placeholder="Enter Staff Rating" name="Rating" id="Rating" />
                    		<input type="text" class="list-group-item" placeholder="Enter Staff's User Id" name="User_id" id="User_id" />
                    		<span href="#" class="list-group-item">
                    		<select class="btn btn-primary 	dropdown-toggle"  type="button" data-toggle="dropdown">
                    		<option>1234</option>
                    		<option>12sds34</option>
                    		</select>
                    		</span>                  		
                    		<span href="#" class="list-group-item"  align="center">
                    		<input type="hidden" name="hidden" value="Staff"/>
                    		<input type="submit" value="Submit"/>
                    		<input type="reset" value="Reset"/>
                    		</span>
                    	</form>
                    	</div>
                    	
                    
                    
                    
                    
                    	<div class="form2" id="createDistributor" name="createDistributor">
                    		<form action="Controller" class="list-group" method="post">
                        <span href="#" class="list-group-item active"  align="center">
			            Create Distributor
                        </span>
                    		<input type="text" class="list-group-item" placeholder="Enter Distributor Id" name="D_id" id="D_id" />
                    		<input type="text" class="list-group-item" placeholder="Enter Distributor name" name="D_name" id="D_name" />
                    		<input type="text" class="list-group-item" placeholder="Enter Distributor address" name="D_add" id="D_add" />
                    		<input type="text" class="list-group-item" placeholder="Enter Distributor SSN" name="D_SSN" id="D_SSN" />
                    		<input type="text" class="list-group-item" placeholder="Enter Distributor's Product Category" name="D_product_category" id="D_product_category" />
                    		<input type="text" class="list-group-item" placeholder="Enter Distributor Contact" name="D_contact" id="D_contact" />
                    		<input type="text" class="list-group-item" placeholder="Enter Distributor's User Id" name="User_id" id="User_id" />
                    		<span href="#" class="list-group-item">
                    		<select class="btn btn-primary 	dropdown-toggle"  type="button" data-toggle="dropdown">
                    		<option>1234</option>
                    		<option>12sds34</option>
                    		</select>
                    		</span>                  		
                    		<span href="#" class="list-group-item"  align="center">
                    		<input type="hidden" name="hidden" value="Distributor"/>
                    		<input type="submit" value="Submit"/>
                    		<input type="reset" value="Reset"/>
                    		</span>
                    	</form>
                    	</div>
                    	
                    
                    	
                    	<div class="form3" id="createCustomer" name="createCustomer">
                    		<form action="Controller" class="list-group" method="post">
                        <span href="#" class="list-group-item active"  align="center">
			            Create Customer
                        </span>
                    		<input type="text" class="list-group-item" placeholder="Enter Customer Id" name="C_id" id="C_id" />
                    		<input type="text" class="list-group-item" placeholder="Enter Customer name" name="C_name" id="C_name" />
                    		<input type="text" class="list-group-item" placeholder="Enter Customer address" name="C_add" id="C_add" />
                    		<input type="text" class="list-group-item" placeholder="Enter Customer SSN" name="C_SSN" id="C_SSN" />
                    		<input type="text" class="list-group-item" placeholder="Enter Discount Offered (%)" name="Discount_offered" id="Discount_offered" />
                    		<input type="text" class="list-group-item" placeholder="Enter Customer's User Id" name="User_id" id="User_id" />
                    		<span href="#" class="list-group-item">
                    		<select class="btn btn-primary 	dropdown-toggle"  type="button" data-toggle="dropdown">
                    		<option>1234</option>
                    		<option>12sds34</option>
                    		</select>
                    		</span>                  		
                    		<span href="#" class="list-group-item"  align="center">
                    		<input type="submit" value="Submit"/>
                    		<input type="reset" value="Reset"/>
                    		</span>
                    	</form>
                    	</div>	
                    	
                    	
                    	
                    	
              
                    	
                </div>                      
                </div> 
                
                
                <!-- End Of Create -->
                <!-- Start of Insert -->
                
                <div class="insert" id="insert">
                
                     <div class="list-group" align="left">
                        
                        <div class="form1" id="insertItems" name="insertItems">
                        <form action="Controller" class="list-group" name="createuser" method="post">
                        <span href="#" class="list-group-item active"  align="center">
			            Item
                        </span>
                    	
                    		<input type="text" class="list-group-item" placeholder="Enter Item Id" name="Item_id" id="Item_id" />
                    		<input type="text" class="list-group-item" placeholder="Enter Item name" name="i_name" id="i_name" />
                    		<input type="text" class="list-group-item" placeholder="Enter Item Category" name="i_category" id="i_category" />               		
                    		<input type="text" class="list-group-item" placeholder="Enter Item's stock" name="stock" id="stock" />
                    		<input type="text" class="list-group-item" placeholder="Enter Purchase Price" name="purchase_price" id="purchase_price" />
                    		<input type="text" class="list-group-item" placeholder="Enter MRP" name="MRP" id="MRP" />
                    		<input type="text" class="list-group-item" placeholder="Enter Item Description" name="item_description" id="item_description" />
                    		<input type="date" class="list-group-item" placeholder="Enter manufacture date" name="mf_date" id="mf_date" />               		
                    		<input type="date" class="list-group-item" placeholder="Enter Expiry date" name="exp_date" id="exp_date" />
                    		<input type="text" class="list-group-item" placeholder="Enter Distributor's Id" name="D_id" id="D_id" />
                    		<input type="text" class="list-group-item" placeholder="Enter Admin Id" name="A_id" id="A_id" />
                    		<span href="#" class="list-group-item"  align="center">
                    		<input type="submit" value="Submit"/>
                    		<input type="reset" value="Reset"/>
                    		</span>
                    	</form>
                    	</div>
                    	
                    
                    
                    
                    
                    	<div class="form2" id="form2">
                    		<form action="Controller" class="list-group" name="createuser" method="post">
                        <span href="#" class="list-group-item active"  align="center">
			            Item
                        </span>
                    	
                    		<input type="text" class="list-group-item" placeholder="Enter name" name="name" id="name" />
                    		<input type="text" class="list-group-item" placeholder="Enter name" name="name" id="name" />
                    		<input type="text" class="list-group-item" placeholder="Enter name" name="name" id="name" />
                    		<span href="#" class="list-group-item">
                    		<select class="btn btn-primary 	dropdown-toggle"  type="button" data-toggle="dropdown">
                    		<option>1234</option>
                    		<option>12sds34</option>
                    		</select>
                    		</span>                  		
                    		<input type="text" class="list-group-item" placeholder="Enter name" name="name" id="name" />
                    		<input type="text" class="list-group-item" placeholder="Enter name" name="name" id="name" />
                    		<span href="#" class="list-group-item"  align="center">
                    		<input type="submit" value="Submit"/>
                    		<input type="reset" value="Reset"/>
                    		</span>
                    	</form>
                    	</div>
                </div>   
                </div>
                    
                    
                    
                    <!-- Delete -->
                    <div class="delete" id="delete">
                
                     <div class="list-group" align="left">
                        
                        <div class="form1" id="deleteStaff" name="deleteStaff">
                        <form action="Controller" class="list-group" name="deleteStaff" method="post">
                        <span href="#" class="list-group-item active"  align="center">
			            Delete Staff
                        </span>
                    	
                    		<input type="text" class="list-group-item" placeholder="Enter Staff Id" name="Staff_id" id="Staff_id" />
                    		<span href="#" class="list-group-item"  align="center">
                    		<input type="submit" value="Delete"/>
                    		<input type="reset" value="Reset"/>
                    		</span>
                    	</form>
                    	</div>
                    	
                    	
                    	<div class="form2" id="deleteDistributor" name="deleteDistributor">
                        <form action="Controller" class="list-group" name="deleteDistributor" method="post">
                        <span href="#" class="list-group-item active"  align="center">
			            Delete Distributor
                        </span>
                    		<input type="text" class="list-group-item" placeholder="Enter Distributor Id" name="D_id" id="D_id" />
                    		<span href="#" class="list-group-item"  align="center">
                    		<input type="submit" value="Delete"/>
                    		<input type="reset" value="Reset"/>
                    		</span>
                    	</form>
                    	</div>
                    	
                        <div class="form3" id="deleteCustomer" name="deleteCustomer">
                        <form action="Controller" class="list-group" name="deleteCustomer" method="post">
                        <span href="#" class="list-group-item active"  align="center">
			            Delete Customer
                        </span>
                    		<input type="text" class="list-group-item" placeholder="Enter Customer Id" name="C_id" id="C_id" />
                    		<span href="#" class="list-group-item"  align="center">
                    		<input type="submit" value="Delete"/>
                    		<input type="reset" value="Reset"/>
                    		</span>
                    	</form>
                    	</div>
                        
                        
                        <div class="form4" id="deleteItems" name="deleteItems">
                        <form action="Controller" class="list-group" name="createuser" method="post">
                        <span href="#" class="list-group-item active"  align="center">
			            Delete Item
                        </span>    	
                    		<input type="text" class="list-group-item" placeholder="Enter Item Id" name="Item_id" id="Item_id" />
                    		<span href="#" class="list-group-item"  align="center">
                    		<input type="submit" value="Delete"/>
                    		<input type="reset" value="Reset"/>
                    		</span>
                    	</form>
                    	</div>
                    	
                    
                    
                    
                    	
                    	
                </div>   
                </div>
                    <!-- --End OF Delete -->
                    <!-- --Start Of Update -->
                    
                    
                <div class="update" id="update">
                
                     <div class="list-group" align="left">
                        
                        <div class="form1" id="updateItems" name="updateItems">
                        <form action="Controller" class="list-group" name="updateItems" method="post">
                        <span href="#" class="list-group-item active"  align="center">
			            Update Item
                        </span>
                    	
                    		<input type="text" class="list-group-item" placeholder="Enter Item Id" name="Item_id" id="Item_id" />
                    		<span href="#" class="list-group-item"  align="center">
                    		<input type="submit" name="button" value="Search" onclick="toggle4()"/>
                    		</span>
                    		<input type="text" class="list-group-item" placeholder="Enter Item name" name="i_name" id="i_name" />
                    		<input type="text" class="list-group-item" placeholder="Enter Item Category" name="i_category" id="i_category" />               		
                    		<input type="text" class="list-group-item" placeholder="Enter Item's stock" name="stock" id="stock" />
                    		<input type="text" class="list-group-item" placeholder="Enter Purchase Price" name="purchase_price" id="purchase_price" />
                    		<input type="text" class="list-group-item" placeholder="Enter MRP" name="MRP" id="MRP" />
                    		<input type="text" class="list-group-item" placeholder="Enter Item Description" name="item_description" id="item_description" />
                    		<input type="date" class="list-group-item" placeholder="Enter manufacture date" name="mf_date" id="mf_date" />               		
                    		<input type="date" class="list-group-item" placeholder="Enter Expiry date" name="exp_date" id="exp_date" />
                    		<input type="text" class="list-group-item" placeholder="Enter Distributor's Id" name="D_id" id="D_id" />
                    		<input type="text" class="list-group-item" placeholder="Enter Admin Id" name="A_id" id="A_id" />
                    		<span href="#" class="list-group-item"  align="center">
                    		<input type="hidden" name="hidden" value="updateItems"/>
                    		<input type="submit" name="button" value="Update"/>
                    		<input type="reset" value="Reset"/>
                    		</span>
                    	</form>
                    	</div>
                    	
                    
                    
                    
                    
                    	<div class="form2" id="form2">
                    		<form action="Controller" class="list-group" name="createuser" method="post">
                        <span href="#" class="list-group-item active"  align="center">
			            Item
                        </span>
                    	
                    		<input type="text" class="list-group-item" placeholder="Enter name" name="name" id="name" />
                    		<input type="text" class="list-group-item" placeholder="Enter name" name="name" id="name" />
                    		<input type="text" class="list-group-item" placeholder="Enter name" name="name" id="name" />
                    		<span href="#" class="list-group-item">
                    		<select class="btn btn-primary 	dropdown-toggle"  type="button" data-toggle="dropdown">
                    		<option>1234</option>
                    		<option>12sds34</option>
                    		</select>
                    		</span>                  		
                    		<input type="text" class="list-group-item" placeholder="Enter name" name="name" id="name" />
                    		<input type="text" class="list-group-item" placeholder="Enter name" name="name" id="name" />
                    		<span href="#" class="list-group-item"  align="center">
                    		<input type="submit" value="Submit"/>
                    		<input type="reset" value="Reset"/>
                    		</span>
                    	</form>
                    	</div>
                </div>   
                </div>
                
                
                
                    
                    
                    
                    
                    
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