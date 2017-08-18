<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>主页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type = "text/javascript" src = "<%=path %>/assert/js/jquery-2.1.1.min.js"></script>
	<link rel = "stylesheet" type = "text/css" href = "<%=path %>/assert/bootstrap-3.3.7/css/bootstrap.min.css" />
	<script type = "text/javascript" src = "<%=path %>/assert/bootstrap-3.3.7/js/bootstrap.min.js"></script>
	
	<link rel = "stylesheet" type = "text/css" href = "<%=path %>/assert/navigation/css/niuqiqi-demo.css" />
	<link rel = "stylesheet" type = "text/css" href = "<%=path %>/assert/navigation/css/style.css" />

  </head>
  
  <body>
  	 <div id="wrapper">
        <div class="overlay"></div>
    
        <!-- Sidebar -->
        <nav class="navbar navbar-inverse navbar-fixed-top" id="sidebar-wrapper" role="navigation">
            <ul class="nav sidebar-nav">
                <li class="sidebar-brand">
                    <a href="#">
                       Bootstrap 3
                    </a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-fw fa-home"></i> Home</a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-fw fa-tint"></i> Page one</a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-fw fa-file-o"></i> Second page</a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-fw fa-cog"></i> Third page</a>
                </li>
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-fw fa-plus"></i> Dropdown <span class="caret"></span></a>
                  <ul class="dropdown-menu" role="menu">
                    <li class="dropdown-header">Dropdown heading</li>
                    <li><a href="#">Action</a></li>
                    <li><a href="#">Another action</a></li>
                    <li><a href="#">Something else here</a></li>
                    <li><a href="#">Separated link</a></li>
                    <li><a href="#">One more separated link</a></li>
                  </ul>
                </li>
                <li class = "active">
                    <a href="#"><i class="fa fa-fw fa-bank"></i> Page four</a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-fw fa-dropbox"></i> Page 5</a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-fw fa-twitter"></i> Last page</a>
                </li>
            </ul>
        </nav>
        <!-- /#sidebar-wrapper -->

        <!-- Page Content -->
        <div id="page-content-wrapper">
          <button type="button" class="hamburger is-closed animated fadeInLeft" data-toggle="offcanvas">
            <span class="hamb-top"></span>
            <span class="hamb-middle"></span>
            <span class="hamb-bottom"></span>
          </button>
            <div class="container">
                <!-- 
                 <div class="row">
                    <div class="col-lg-7 col-lg-offset-2">
                        <h1 class="page-header">自定义左侧滑动导航栏</h1>  
                    </div>
                </div>
                 -->
                 <div class = "panel panel-default">
                 	<div class = "panel panel-heading" style = "background:#583e7e">
                 		<h3 class = "panel-title">编辑面板<a href = "#" style = "float:right;display:inline-block">返回</a></h3>
                 	</div>
                 	<div class = "panel-body">
                 		<div class = "page-header">
                 			<h5>基本配置修改</h5>
                 			
                 		</div>
                 		<form class = "form-horizontal">
	                 			<div class = "control-grop" style = "border:1px solid red">
	                 				<label class = "control-label" for = "key_name" >策略名:</label>
	                 				<div class = "controls">
	                 					<input class = "form-control" id = "key_name" type = "text" name = "key_name" />
	                 				</div>
	                 			</div>
	                 			<div class="control-group">
								    <label class="control-label" for="inputEmail">Email</label>
								    <div class="controls">
								      <input type="text" id="inputEmail" placeholder="Email">
								    </div>
								</div>
                 		</form>
                 		<br/>
                 		<div class = "page-header">
                 			<h5>第二个要修改的项目
                 			</h5>
                 		</div>
                 		<p>修改的内容2</p>
                 	</div>
                 </div>
            </div>
        </div>
        <!-- /#page-content-wrapper -->

    </div>
    <!-- /#wrapper -->
  	 <script type="text/javascript">
		$(document).ready(function () {
		  var trigger = $('.hamburger'),
		      overlay = $('.overlay'),
		     isClosed = false;

		    trigger.click(function () {
		      hamburger_cross();      
		    });

		    function hamburger_cross() {

		      if (isClosed == true) {          
		        overlay.hide();
		        trigger.removeClass('is-open');
		        trigger.addClass('is-closed');
		        isClosed = false;
		      } else {   
		        overlay.show();
		        trigger.removeClass('is-closed');
		        trigger.addClass('is-open');
		        isClosed = true;
		      }
		  }
		  
		  $('[data-toggle="offcanvas"]').click(function () {
		        $('#wrapper').toggleClass('toggled');
		  });
		  //给dropdown下的li下的a标签(就是dropdown的下拉标签)添加阻止事件传播的方法。在a标签中添加data-stopPropagation = "true"是一样的效果
		  $('.dropdown').find("li").find("a").each(function(){
			 $(this).on("click", this, function(e){
				e.stopPropagation();
			 });
		  });
		  
		});
	</script>
  </body>
</html>
