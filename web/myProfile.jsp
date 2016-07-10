	<%@page import="com.urja.model.Customer"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

         <!-- Page Title
        ============================================= -->
        <section id="page-title" class="page-title-parallax page-title-dark" style="<c:out value="${topStyle}"/>" data-stellar-background-ratio="0.3">

            <div class="container clearfix">
                <h1 data-animate="fadeInUp">Get Service</h1>
                <span data-animate="fadeInUp" data-delay="300">We are Providing good services</span>
                <ol class="breadcrumb">
                    <li><a href="#">Home</a></li>
                    
                    <li class="active">Get services</li>
                </ol>
            </div>

        </section><!-- #page-title end -->
        <!-- Content
        ============================================= -->
        <section id="content">

            <div class="content-wrap">

                <div class="container clearfix">
				<!----process tabs---->
				  	<div id="processTabs">
				 
				  		name : ${customer.firstname}
				  	</div>
				</div>
			</div>
		</section>