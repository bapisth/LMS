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
                        <ul class="process-steps process-3 bottommargin clearfix">
                            <li>
                                <a href="#ptab1" class="i-bordered i-rounded divcenter icon-edit"></a>
                                <h5>Service Information</h5>
                            </li>
                            <li>
                                <a href="#ptab2" class="i-bordered i-rounded divcenter icon-truck"></a>
                                <h5>Pickup/Delivery Information</h5>
                            </li>
                            <li>
                                <a href="#ptab3" class="i-bordered i-rounded divcenter icon-rupee"></a>
                                <h5>Payment Information</h5>
                            </li>
                            
                        </ul>
                        <div>
                            
                            <div id="ptab1">
                            <!----bggray--->
                              <div class="bg-gray"> 
                               <div class="row">
                                    <div class="form-group">
                                        <div class="col-md-4">
                                            <label for="name"> Your estimated amount of bags <span class="color-red">*</span></label>
                                            <select class="form-control">
                                            	<option>Select Bags</option>
                                                <option>1</option>
                                                <option>2</option>
                                            </select>
                                        </div>
                                        <div class="col-md-4">
                                            <label for="name">  Frequency <span class="color-red">*</span></label>
                                            <select class="form-control">
                                            	<option>Select Period</option>
                                                <option>One Time </option>
                                                <option>Weekly</option>
                                            </select> 
                                        </div>
                                        <div class="col-md-4">
                                            <label for="name">  Laundry Preferences <span class="color-red">*</span></label>
                                            <textarea class="form-control"></textarea>
                                        </div>
                                     </div>   
                               </div>
                              	<div class="form-group">
                                <a href="#" class="button button-3d  button-rounded button-red nomargin tab-linker" >Save</a>
                                <a href="#" class="button button-3d nomargin  tab-linker" rel="2">Next</a>
                               </div> 
                              </div> 
                              
                              <!----///bggray--->  
                               
                                
                            </div>
                            <div id="ptab2">
                                <!----bggray ptab2--->
                              <div class="bg-gray"> 
                               <div class="form-group">
                               		<div class="row">
                                    	<div class="col-md-6">
                                            <label for="name"> First name <span class="color-red">*</span></label>
                                            <input type="text" class="form-control" />
                                        </div>
                                        <div class="col-md-6">
                                            <label for="name">  Last name <span class="color-red">*</span></label>
                                             <input type="text" class="form-control" />
                                        </div>
                                    </div>
                               </div>
                               
                               <div class="form-group">
                               		<div class="row">
                                    	<div class="col-md-12">
                                            <label for="name"> Street Address <span class="color-red">*</span></label>
                                            <input type="text" class="form-control" />
                                        </div>
                                       
                                    </div>
                               </div>
                               
                               <div class="form-group">
                               		<div class="row">
                                    	<div class="col-md-6">
                                            <label for="name"> City<span class="color-red">*</span></label>
                                            <input type="text" class="form-control" />
                                        </div>
                                        <div class="col-md-6">
                                            <label for="name">  State <span class="color-red">*</span></label>
                                             <input type="text" class="form-control" />
                                        </div>
                                    </div>
                               </div>
                               
                                <div class="form-group">
                               		<div class="row">
                                    	<div class="col-md-6">
                                            <label for="name"> PO Box<span class="color-red">*</span></label>
                                            <input type="text" class="form-control" />
                                        </div>
                                        <div class="col-md-6">
                                            <label for="name">  Zip Code <span class="color-red">*</span></label>
                                             <input type="text" class="form-control" />
                                        </div>
                                    </div>
                               </div>
                               
                                <div class="form-group">
                               		<div class="row">
                                    	<div class="col-md-6">
                                            <label for="name"> Email<span class="color-red">*</span></label>
                                            <input type="text" class="form-control" />
                                        </div>
                                        <div class="col-md-6">
                                            <label for="name">  Phone <span class="color-red">*</span></label>
                                             <div class="row">
                                             	<div class="col-sm-2"><input type="text" class="form-control" /></div>
                                                <div class="col-sm-10"><input type="text" class="form-control" /></div>
                                             </div>
                                        </div>
                                    </div>
                               </div>
                               
                                <div class="form-group">
                               		<div class="row">
                                    	<div class="col-md-6">
                                            <label for="name"> When would you like your first pickup ? <span class="color-red">*</span></label>
                                             <select class="form-control">
                                            	<option>Select Time</option>
                                                <option>1</option>
                                                <option>2</option>
                                            </select>
                                        </div>
                                        <div class="col-md-6">
                                            <label for="name">  Will you be present during pickup?  <span class="color-red">*</span></label><br>
                                            <div class="radio-inline">
                                            	<input type="radio" name="present" /> yes
                                            </div>
                                              <div class="radio-inline">
                                            	<input type="radio" name="present" /> No
                                            </div>
                                        </div>
                                    </div>
                               </div>
                               
                               
                               <div class="form-group">
                               		<div class="row">
                                    	<div class="col-md-12">
                                            <label for="name"> Pickup instructions <span class="color-red">*</span></label>
                                            <input type="text" class="form-control" />
                                        </div>
                                       
                                    </div>
                               </div>
                               
                                <div class="form-group">
                               		<div class="row">
                                    	<div class="col-md-6">
                                            <label for="name"> Will you be present during drop off?  <span class="color-red">*</span></label>
                                             <div class="radio-inline">
                                            	<input type="radio" name="present" /> yes
                                            </div>
                                              <div class="radio-inline">
                                            	<input type="radio" name="present" /> No
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <label for="name">  Drop Off Instructions  <span class="color-red">*</span></label><br>
                                             <input type="text" class="form-control" />
                                        </div>
                                    </div>
                                </div>
                                
                                 <div class="form-group">
                               		<div class="row">
                                    	<div class="col-md-12">
                                            <label for="name"> Delivery will be 48 hours from pickup time (except weekends). Do you require next day rush service?  <span class="color-red">*</span></label>
                                            
                                              <select class="form-control">
                                            	<option>Select Option</option>
                                                <option>Yes</option>
                                                <option>No</option>
                                            </select>
                                             
                                        </div>
                                        
                                    </div>
                                </div>
                               
                               <div class="form-group">
                                        <a href="#" class="button button-3d  button-rounded button-red nomargin tab-linker" >Save</a>
                                        <a href="#" class="button button-3d nomargin  tab-linker" rel="3">Next</a>
                                       </div> 
                              	
                              </div> 
                              
                              <!----///bggray ptab2---> 
                            </div>
                            <div id="ptab3">
                                <!--<div class="alert alert-success">
                                    <strong>Thank You.</strong> Your order will be processed once we verify the Payment.
                                </div>-->
                                
                                                                <!----bggray ptab3--->
                              <div class="bg-gray"> 
                               <div class="form-group">
                               		<div class="row">
                                    	<div class="col-md-6">
                                            <label for="name"> Cardholder Name <span class="color-red">*</span></label>
                                            <input type="text" class="form-control" />
                                        </div>
                                        <div class="col-md-6">
                                            <label for="name">  Street Address <span class="color-red">*</span></label>
                                             <input type="text" class="form-control" />
                                        </div>
                                    </div>
                               </div>
                               
                               
                               
                               <div class="form-group">
                               		<div class="row">
                                    	<div class="col-md-6">
                                            <label for="name"> City<span class="color-red">*</span></label>
                                            <input type="text" class="form-control" />
                                        </div>
                                        <div class="col-md-6">
                                            <label for="name">  State <span class="color-red">*</span></label>
                                             <input type="text" class="form-control" />
                                        </div>
                                    </div>
                               </div>
                               
                                <div class="form-group">
                               		<div class="row">
                                    	<div class="col-md-6">
                                            <label for="name"> PO Box<span class="color-red">*</span></label>
                                            <input type="text" class="form-control" />
                                        </div>
                                        <div class="col-md-6">
                                            <label for="name">  Zip Code <span class="color-red">*</span></label>
                                             <input type="text" class="form-control" />
                                        </div>
                                    </div>
                               </div>
                               
                                <div class="form-group">
                               		<div class="row">
                                    	<div class="col-md-6">
                                            <label for="name"> Email<span class="color-red">*</span></label>
                                            <input type="text" class="form-control" />
                                        </div>
                                        <div class="col-md-6">
                                            <label for="name">  Phone <span class="color-red">*</span></label>
                                             <div class="row">
                                             	<div class="col-sm-2"><input type="text" class="form-control" /></div>
                                                <div class="col-sm-10"><input type="text" class="form-control" /></div>
                                             </div>
                                        </div>
                                    </div>
                               </div>
                               
                              <div class="form-group">
                               		<div class="row">
                                    	<div class="col-md-6">
                                            <label for="name"> credit card / Debit card<span class="color-red">*</span></label>
                                           <select class="form-control">
                                           	<option>Select Card type</option>
                                            <option>maestro</option>
                                           </select>
                                        </div>
                                        <div class="col-md-6">
                                           <label>Credit Card Number(Number Only Without Dashes/Spaces)<span class="color-red">*</span> </label> 
                                           <input type="text" class="form-control" />
                                        </div>
                                    </div>
                               </div>
                               
                               <div class="form-group">
                               		<div class="row">
                                    	<div class="col-md-6">
                                            <label for="name"> Expiration Date <span class="color-red">*</span></label>
                                           <div class="row">
                                                <div class="col-sm-6">
                                                    <select class="form-control">
                                                    <option>Select Month</option>
                                                    <option>maestro</option>
                                                   </select>
                                                </div>
                                                <div class="col-sm-6">
                                                    <select class="form-control">
                                                    <option>Select Year</option>
                                                    <option>maestro</option>
                                                   </select>
                                                </div>
                                           </div>
                                        </div>
                                        <div class="col-md-6">
                                           <label>CCV Code <span class="color-red">*</span></label> 
                                           <input type="text" class="form-control" />
                                        </div>
                                    </div>
                               </div>
                               
                               <div class="form-group">
                               		<div class="row">
                                    	<div class="col-md-6">
                                            <label for="name"> How did you find Laundry Care? <span class="color-red">*</span></label>
                                           <select class="form-control">
                                           	<option>Select Answer</option>
                                            <option>maestro</option>
                                           </select>
                                        </div>
                                        <div class="col-md-6">
                                           <label>Coupon Code <span class="color-red">*</span> </label> 
                                           <input type="text" class="form-control" />
                                        </div>
                                    </div>
                               </div>
                               
                               <div class="form-group">
                               	<label>captcha</label>
                                <input type="text" class="form-control" />	
                               </div>
                               
                               
                               <div class="form-group">
                                        <a href="#" class="button button-3d  button-rounded button-red nomargin tab-linker" >Save & Submit</a>
                                       <!-- <a href="#" class="button button-3d nomargin  tab-linker" rel="3">Next</a>-->
                                       </div> 
                              	
                              </div> 
                              
                              <!----///bggray ptab3---> 
                            </div>
                        </div>
                    </div>

                    <script>
                      $(function() {
                        $( "#processTabs" ).tabs({ show: { effect: "fade", duration: 400 } });
                        $( ".tab-linker" ).click(function() {
                            $( "#processTabs" ).tabs("option", "active", $(this).attr('rel') - 1);
                            return false;
                        });
                      });
                    </script>

                    <div class="clear"></div>		
                          
 <!--//process tabs-----> 
 
 			          

              </div>

               

                

                <a class="button button-full center tright topmargin footer-stick">
                    <div class="container clearfix">
                        Need help with your Account? <strong>Start here</strong> <i class="icon-caret-right" style="top:4px;"></i>
                    </div>
                </a>

            </div>

        </section>