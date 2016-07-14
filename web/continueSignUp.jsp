	<%@page import="com.urja.model.Customer"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

         <!-- Page Title
        ============================================= -->
        <section id="page-title" class="page-title-parallax page-title-dark" style="<c:out value="${topStyle}"/>" data-stellar-background-ratio="0.3">

            <div class="container clearfix">
                <h1 data-animate="fadeInUp">Continue Sign Up</h1>
                <span data-animate="fadeInUp" data-delay="300">Please provide your detailed information</span>
                <ol class="breadcrumb">
                    <li><a href="#">Home</a></li>
                    
                    <li class="active">Continue Sign Up </li>
                </ol>
            </div>

        </section><!-- #page-title end -->
        <!-- Content
        ============================================= -->
        <section id="content">

            <div class="content-wrap">

                <div class="container clearfix">
				<!----process tabs----> 
				  		<div>
							<form action="customer" method="post">
							<input type="hidden" name="cmd" value="continueSignUp" />
							<div id="ptab1">
								<!----bggray--->
								<div class="bg-gray" style="padding: 50px;">
									<div class="row">
										<div class="col-md-12">
										<h5><i class="icon-user"></i> &nbsp; Personal Details</h5>
										</div>
									</div>
									<div class="row">
										<div class="form-group">
											<div class="col-md-4">
												<label for="name">First Name <span class="color-red">*</span></label> 
												<input type="text" name="firstname" id="firstname" class="form-control not-dark" placeholder="Enter Your First Name"  autocomplete="off" required="required"/>
											</div>
											<div class="col-md-4">
												<label for="name">Middle Name</label>
												<input type="text" name="middlename" id="middlename" class="form-control not-dark" placeholder="Enter Your Middle Name" autocomplete="off"/>
											</div>
											<div class="col-md-4">
												<label for="name">Last Name <span class="color-red">*</span></label>
												<input type="text" name="lastname" id="lastname" class="form-control not-dark" placeholder="Enter Your Last Name"  autocomplete="off" required="required"/>
											</div>
										</div>
									</div> 
									<div class="gapMedium"></div>
									<div class="row">
										<div class="form-group">
											<div class="col-md-4">
												<label for="login-form-password">Email ID</label>
												<div class="input-group">
													<span class="input-group-addon"><i class="icon-email3"></i></span>
			                                        <input type="email" id="email" name="email" value="<c:out value="${customer.email}" />" class="form-control not-dark" placeholder="Enter Your Email ID."  autocomplete="off"/>
		                                    	</div>
											</div>
											<div class="col-md-4">
												<label for="name"> Mobile</label>
												<div class="input-group">
													<span class="input-group-addon"><i class="icon-phone"></i></span>
													<input type="text" value="+91" style="width: 17%; border-right-width: 0px;" class="form-control not-dark" disabled="disabled">
			                                        <input type="text" id="phone1" name="phone1" value="<c:out value="${customer.phone1}" />" class="form-control not-dark" autocomplete="off" style="width: 83%; border-left-width: 0px;" disabled="disabled"/>
		                                    	</div>
											</div>
											<div class="col-md-4">
												<label for="name"> Phone</label>
												<div class="input-group">
													<span class="input-group-addon"><i class="icon-phone2"></i></span>
			                                        <input type="text" id="phone2" name="phone2" value="" class="form-control not-dark" autocomplete="off" placeholder="Enter Your Another Contact Number"/>
		                                    	</div>
											</div>
										</div>
									</div>
									<div class="row">
										<div class="form-group">
											<div class="col-md-1"></div>
											<div class="col-md-10"> <br /><hr style="border-top: 1px solid #bcbcbc;"/></div>
											<div class="col-md-1"></div>
										</div>
									</div>
									<div class="row">
										<div class="col-md-12">
										<h5><i class="icon-location"></i> &nbsp; Address Details</h5>
										</div>
									</div>
									<div class="row">
										<div class="form-group">
											<div class="col-md-12">
												<label for="name"> Address Line 1 <span class="color-red">*</span></label> 
												<input type="text" id="address1" name="address1" placeholder="Enter Your Address Line 1" value="" class="form-control not-dark" autocomplete="off" required="required"/>
											</div>
										</div>
									</div>
									<div class="gapMedium"></div>
									<div class="row">
										<div class="form-group">
											<div class="col-md-12">
												<label for="name"> Address Line 2 </label> 
												<input type="text" id="address2" name="address2" placeholder="Enter Your Address Line 2" value="" class="form-control not-dark" autocomplete="off"/>
											</div>
										</div>
									</div>
									<div class="gapMedium"></div>
									<div class="row">
										<div class="form-group">
											<div class="col-md-6">
												<label for="name"> Landmark </label> 
												<input type="text" id="landmark" name="landmark" placeholder="Enter Your Landmark" value="" class="form-control not-dark" autocomplete="off"/>
											</div>
											<div class="col-md-6">
												<label for="name"> Postal Code <span class="color-red">*</span></label> 
												<input type="text" id="postalcode" name="postalcode" placeholder="Enter Your Postal Code" value="" class="form-control not-dark" autocomplete="off" required="required"/>
											</div>
										</div>
									</div>
									<div class="gapMedium"></div>
									<div class="row">
										<div class="form-group">
											<div class="col-md-4">
												<label for="name"> District <span class="color-red">*</span></label>
												<input type="text" id="district" name="district" placeholder="Enter Your District" value="" class="form-control not-dark" autocomplete="off" required="required"/>
											</div>
											<div class="col-md-4">
												<label for="name"> State</label>
												<input type="text" id="state" name="state" value="Odisha" class="form-control not-dark" readonly="readonly"/>
											</div>
											<div class="col-md-4">
												<label for="name"> Country</label>
												<input type="text" id="country" name="country" value="India" class="form-control not-dark" readonly="readonly"/>
											</div>
										</div>
									</div>
									<div class="gapMedium"></div>
									<div class="gapMedium"></div>
									<div class="form-group">
										<button class="button button-3d  button-rounded button-red nomargin tab-linker"><i class="icon-save"></i> &nbsp; Save</button>
										 
									</div>
								</div>
		
								<!----///bggray--->
		
		
							</div>
							</form>
					  	</div>
					</div>
				</div>
			</section>