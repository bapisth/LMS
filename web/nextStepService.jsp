<%@page import="com.urja.model.Customer"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Page Title
        ============================================= -->
<section id="page-title" class="page-title-parallax page-title-dark"
	style="background-image: url('images/parallax/9.jpg'); padding: 120px 0;"
	data-stellar-background-ratio="0.3">

	<div class="container clearfix">
		<h1 data-animate="fadeInUp">Get Service</h1>
		<span data-animate="fadeInUp" data-delay="300">We are Providing
			good services</span>
		<ol class="breadcrumb">
			<li><a href="#">Home</a></li>
			<li class="active">Get services</li>
		</ol>
	</div>
</section>
<!-- #page-title end -->

<!-- Content
        ============================================= -->
<section id="content">
	<div class="content-wrap">
		<div class="container clearfix">
			<!----process tabs---->
			<div id="processTabs">
				<ul class="process-steps process-3 bottommargin clearfix">
					<li><a href="#ptab1"
						class="i-bordered i-rounded divcenter icon-edit"></a>
						<h5>Service Information</h5></li>
					<li><a href="#ptab2"
						class="i-bordered i-rounded divcenter icon-truck"></a>
						<h5>Pickup/Delivery Information</h5></li>
					<li><a href="#ptab3"
						class="i-bordered i-rounded divcenter icon-rupee"></a>
						<h5>Payment Information</h5></li>

				</ul>
				<div>

					<div id="ptab1">
						<!----bggray--->
						<div class="bg-gray">

							<div class="service-type-area">

								<div class="row form-group">
									<div class="col-md-4">
										<a href="#" class="button button-3d  button-rounded"><i
											class="icon-plus"></i>Click here to Add more service</a>
									</div>
									<div class="col-md-2">
										<label for="name"> Service Type<span class="color-red">*</span></label>
									</div>
									<div class="col-md-6">

										<select class="form-control">
											<option>Service Type1</option>
											<option>Service Type2</option>
											<option>Service Type3</option>
										</select>

									</div>


								</div>

								<div class="row form-group">
									<div class="col-md-4">
										<a href="#"
											class="button button-3d  button-rounded button-blue"><i
											class="icon-plus"></i>Click here to Add more item</a>
									</div>
									<div class="col-md-4">
										<div class="row">
											<div class="col-sm-6">
												<label for="name"> Item Name<span class="color-red">*</span></label>

											</div>
											<div class="col-sm-6">

												<input type="text" class="form-control" value="pant" />
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="row">
											<div class="col-sm-6">
												<label for="name"> Quantity <span class="color-red">*</span></label>

											</div>
											<div class="col-sm-6">

												<input type="text" class="form-control" value="Shirt" />
											</div>
										</div>
									</div>

								</div>

							</div>


							<div class="form-group">
								<a href="#" class="button button-3d  button-rounded button-red"
									data-toggle="modal" data-target=".popup1">Submit</a>
								<!-- <a href="#" class="button button-3d nomargin  tab-linker" rel="2">Next</a>-->
							</div>
						</div>


						<!----///bggray--->

						<!----popup modal-->
						<div class="modal fade popup1" tabindex="-1" role="dialog"
							aria-labelledby="mySmallModalLabel" aria-hidden="true">
							<div class="modal-dialog modal-sm">

								<div class="modal-body" data-animate="flipInY">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-hidden="true">&times;</button>
											<h4 class="modal-title" id="myModalLabel">Confirmation
												Message</h4>
										</div>
										<div class="modal-body">
											<p class="nobottommargin">All total confirmation message
												show here</p>


										</div>
										<div class="modal-footer">
											<button type="button" class="btn btn-default"
												data-dismiss="modal">Close</button>
											<button type="button"
												class="button button-3d nomargin  tab-linker" rel="2">OK</button>
										</div>
									</div>
								</div>
							</div>
						</div>
						<!---//popup modal-->


					</div>
					<div id="ptab2">
						<!----bggray ptab2--->
						<div class="bg-gray">
							<div class="col-md-8 col-md-offset-3">
								<div class="row form-group border-bottom">
									<div class="col-md-3">
										<label for="name"> Customer id :</label>

									</div>
									<div class="col-md-6">
										<input type="text" class="form-control" value=" xxx062365" />
									</div>
								</div>

								<div class="row form-group border-bottom">
									<div class="col-md-3">
										<label for="name"> Customer Name :</label>

									</div>
									<div class="col-md-6">
										<input type="text" class="form-control" value="" />
									</div>
								</div>

								<div class="row form-group border-bottom">
									<div class="col-md-3">
										<label for="name"> Contact number :</label>

									</div>
									<div class="col-md-6">
										<input type="text" class="form-control" value="" />
									</div>
								</div>

								<div class="row form-group border-bottom">
									<div class="col-md-3">
										<label for="name"> Customer address :</label>

									</div>
									<div class="col-md-6">
										<input type="text" class="form-control" value="" />
									</div>
								</div>

								<div class="row form-group border-bottom">
									<div class="col-md-3">
										<label for="name"> Landmark:</label>

									</div>
									<div class="col-md-6">
										<input type="text" class="form-control" value="" />
									</div>
								</div>

								<div class="row form-group border-bottom">
									<div class="col-md-3">
										<label for="name"> Pickup time:</label>

									</div>
									<div class="col-md-6">
										<div class="input-group date form_datetime "
											data-date="2016-07-13T05:25:07Z"
											data-date-format="dd MM yyyy - HH:ii p"
											data-link-field="dtp_input1">
											<input class="form-control " type="text" value=""> <span
												class="input-group-addon"><span
												class="icon-remove glyphicon-remove"></span></span> <span
												class="input-group-addon"><span
												class="icon-calendar-1 glyphicon-th"></span></span>
										</div>

									</div>
								</div>


							</div>




















							<div class="form-group center">
								<a href="#"
									class="button button-3d  button-rounded button-red nomargin tab-linker"
									rel="3">Place order</a> <a href="#"
									class="button button-3d nomargin  tab-linker">Cancel</a>
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
								<h3 class="text-center">Messages</h3>
								<p class="text-center">your booking is in progress</p>
							</div>


							<div class="form-group center">
								<a href="#"
									class="button button-3d  button-rounded button-red nomargin tab-linker"
									rel="3">Confirm</a> <a href="#"
									class="button button-3d nomargin  tab-linker">Cancel</a>
							</div>

						</div>

						<!----///bggray ptab3--->
					</div>
				</div>
			</div>

			<script>
				$(function() {
					$("#processTabs").tabs({
						show : {
							effect : "fade",
							duration : 400
						}
					});
					$(".tab-linker").click(
							function() {
								$("#processTabs").tabs("option", "active",
										$(this).attr('rel') - 1);
								return false;
							});
				});
			</script>

			<div class="clear"></div>

			<!--//process tabs----->



		</div>





		<a class="button button-full center tright topmargin footer-stick">
			<div class="container clearfix">
				Need help with your Account? <strong>Start here</strong> <i
					class="icon-caret-right" style="top: 4px;"></i>
			</div>
		</a>
	</div>
</section>