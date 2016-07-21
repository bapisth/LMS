		
						<!-- start: PANEL CONFIGURATION MODAL FORM -->
						<div class="modal fade" id="panel-config" tabindex="-1" role="dialog" aria-hidden="true">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
											&times;
										</button>
										<h4 class="modal-title">Panel Configuration</h4>
									</div>
									<div class="modal-body">
										Here will be a configuration form
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-default" data-dismiss="modal">
											Close
										</button>
										<button type="button" class="btn btn-primary">
											Save changes
										</button>
									</div>
								</div>
								<!-- /.modal-content -->
							</div>
							<!-- /.modal-dialog -->
						</div>
						<!-- /.modal -->
						<!-- end: SPANEL CONFIGURATION MODAL FORM -->
						
						
						
						
						
						
						
						
						<!-- start: BREADCRUMB -->
						<div class="row">
							<div class="col-md-12">
								<ol class="breadcrumb">
									<li>
										<a href="#">
											Dashboard
										</a>
									</li>
									<li class="active">
										search
									</li>
								</ol>
							</div>
						</div>
						<!-- end: BREADCRUMB -->
						<!-- start: PAGE CONTENT -->
						<div class="row">
							<div class="col-md-12">
								
                                
                                
                                <!---items panel-->
                                <div class="panel panel-white">
									<div class="panel-heading">
										<h4 class="panel-title">search Details</h4>
										<div class="panel-tools">										
											<div class="dropdown">
											<a data-toggle="dropdown" class="btn btn-xs dropdown-toggle btn-transparent-grey">
												<i class="fa fa-cog"></i>
											</a>
											<ul class="dropdown-menu dropdown-light pull-right" role="menu">
												<li>
													<a class="panel-collapse collapses" href="#"><i class="fa fa-angle-up"></i> <span>Collapse</span> </a>
												</li>
												<li>
													<a class="panel-refresh" href="#"> <i class="fa fa-refresh"></i> <span>Refresh</span> </a>
												</li>
												<li>
													<a class="panel-config" href="#panel-config" data-toggle="modal"> <i class="fa fa-wrench"></i> <span>Configurations</span></a>
												</li>
												<li>
													<a class="panel-expand" href="#"> <i class="fa fa-expand"></i> <span>Fullscreen</span></a>
												</li>										
											</ul>
											</div>
											<a class="btn btn-xs btn-link panel-close" href="#"> <i class="fa fa-times"></i> </a>
										</div>
									</div>
									<div class="panel-body">
                                    	<!----tabs---->
                                        <div class="tabbable">
											<ul id="myTab2" class="nav nav-tabs">
														<li class="active">
															<a href="#myTab2_example1" data-toggle="tab">
																Booking
															</a>
														</li>
														<li>
															<a href="#myTab2_example2" data-toggle="tab">
																Customer list
															</a>
														</li>
														
													</ul>
                                                    <div class="tab-content">
                                                        <div class="tab-pane fade in active" id="myTab2_example1">
                                                            <!--search bar--->
                                                          <div class="row">
                                                            <div class="col-md-6 col-md-offset-3">
                                                                <div class="input-group well">
                                                            <input type="text" class="form-control" placeholder="Enter EMail-id or Contact Number or Booking ID">
                                                            <span class="input-group-btn">
                                                                <button class="btn btn-green" type="button">
                                                                    <i class="fa fa-search"></i> Search
                                                                </button> </span>
                                                        </div>
                                                            </div>
                                                          </div>  
												
                                                    <!---//search bar-->
                                                    		
                                                            
                                                     <div class="table-responsive">
                                                     	<table class="table table-striped table-bordered table-hover table-full-width" id="sample_1">
											<thead>
												<tr>
													<th>Booking Id</th>
													<th class="hidden-xs">Customer Name</th>
													<th>Contact No.</th>
													<th class="hidden-xs"> Email ID</th>
													<th>Total Items</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td><a href="#">XX001</a></td>
													<td class="hidden-xs">Janmenjaya Mohanty</td>
													<td>51515151515</td>
													<td class="hidden-xs">janmenjaya@gmail.com</td>
													<td>23</td>
												</tr>
												<tr>
													<td><a href="#">XX002</a></td>
													<td class="hidden-xs">Subhashis Mohanty</td>
													<td>51515151515</td>
													<td class="hidden-xs">Subhashis@gmail.com</td>
													<td>2</td>
												</tr>
												<tr>
													<td><a href="#">XX001</a></td>
													<td class="hidden-xs">Janmenjaya Mohanty</td>
													<td>51515151515</td>
													<td class="hidden-xs">janmenjaya@gmail.com</td>
													<td>23</td>
												</tr>
												<tr>
													<td><a href="#">XX002</a></td>
													<td class="hidden-xs">Subhashis Mohanty</td>
													<td>51515151515</td>
													<td class="hidden-xs">Subhashis@gmail.com</td>
													<td>2</td>
												</tr>
												<tr>
													<td><a href="#">XX001</a></td>
													<td class="hidden-xs">Janmenjaya Mohanty</td>
													<td>51515151515</td>
													<td class="hidden-xs">janmenjaya@gmail.com</td>
													<td>23</td>
												</tr>
												<tr>
													<td><a href="#">XX002</a></td>
													<td class="hidden-xs">Subhashis Mohanty</td>
													<td>51515151515</td>
													<td class="hidden-xs">Subhashis@gmail.com</td>
													<td>2</td>
												</tr>
												<tr>
													<td><a href="#">XX001</a></td>
													<td class="hidden-xs">Janmenjaya Mohanty</td>
													<td>51515151515</td>
													<td class="hidden-xs">janmenjaya@gmail.com</td>
													<td>23</td>
												</tr>
												<tr>
													<td><a href="#">XX002</a></td>
													<td class="hidden-xs">Subhashis Mohanty</td>
													<td>51515151515</td>
													<td class="hidden-xs">Subhashis@gmail.com</td>
													<td>2</td>
												</tr>
                                                <tr>
													<td><a href="#">XX001</a></td>
													<td class="hidden-xs">Janmenjaya Mohanty</td>
													<td>51515151515</td>
													<td class="hidden-xs">janmenjaya@gmail.com</td>
													<td>23</td>
												</tr>
												<tr>
													<td><a href="#">XX002</a></td>
													<td class="hidden-xs">Subhashis Mohanty</td>
													<td>51515151515</td>
													<td class="hidden-xs">Subhashis@gmail.com</td>
													<td>2</td>
												</tr>
                                                <tr>
													<td><a href="#">XX001</a></td>
													<td class="hidden-xs">Janmenjaya Mohanty</td>
													<td>51515151515</td>
													<td class="hidden-xs">janmenjaya@gmail.com</td>
													<td>23</td>
												</tr>
												<tr>
													<td><a href="#">XX002</a></td>
													<td class="hidden-xs">Subhashis Mohanty</td>
													<td>51515151515</td>
													<td class="hidden-xs">Subhashis@gmail.com</td>
													<td>2</td>
												</tr>
                                                <tr>
													<td><a href="#">XX001</a></td>
													<td class="hidden-xs">Janmenjaya Mohanty</td>
													<td>51515151515</td>
													<td class="hidden-xs">janmenjaya@gmail.com</td>
													<td>23</td>
												</tr>
												<tr>
													<td><a href="#">XX002</a></td>
													<td class="hidden-xs">Subhashis Mohanty</td>
													<td>51515151515</td>
													<td class="hidden-xs">Subhashis@gmail.com</td>
													<td>2</td>
												</tr>
                                                <tr>
													<td><a href="#">XX001</a></td>
													<td class="hidden-xs">Janmenjaya Mohanty</td>
													<td>51515151515</td>
													<td class="hidden-xs">janmenjaya@gmail.com</td>
													<td>23</td>
												</tr>
												<tr>
													<td><a href="#">XX002</a></td>
													<td class="hidden-xs">Subhashis Mohanty</td>
													<td>51515151515</td>
													<td class="hidden-xs">Subhashis@gmail.com</td>
													<td>2</td>
												</tr>
												
												
												
											</tbody>
										</table>
                                                     </div>       
                                                            
                                                            
												</div>
												<div class="tab-pane fade" id="myTab2_example2">
													<div class="table-responsive">
                                                     	<table class="table table-striped table-bordered table-hover table-full-width" id="sample_2">
											<thead>
												<tr>
													<th>Booking Id</th>
													<th class="hidden-xs">Date & time</th>
													<th>Status</th>
													
												</tr>
											</thead>
											<tbody>
												<tr>
													<td><a href="#">XX001</a></td>
													<td class="hidden-xs">16-05-2016 4:00P.M</td>
													<td><span class="label label-info">Accepted</span></td>
													
												</tr>
												<tr>
													<td><a href="#">XX002</a></td>
													<td class="hidden-xs">16-05-2016 4:00P.M</td>
													<td><span class="label label-danger">Closed</span></td>
													
												</tr>
												<tr>
													<td><a href="#">XX001</a></td>
													<td class="hidden-xs">16-05-2016 4:00P.M</td>
													<td><span class="label label-primary">Pending</span></td>
													
												</tr>
												<tr>
													<td><a href="#">XX002</a></td>
													<td class="hidden-xs">16-05-2016 4:00P.M</td>
													<td><span class="label label-warning">Process</span></td>
													
												</tr>
												<tr>
													<td><a href="#">XX001</a></td>
													<td class="hidden-xs">16-05-2016 4:00P.M</td>
													<td>51515151515</td>
													
												</tr>
												<tr>
													<td><a href="#">XX002</a></td>
													<td class="hidden-xs">16-05-2016 4:00P.M</td>
													<td>51515151515</td>
													
												</tr>
												<tr>
													<td><a href="#">XX001</a></td>
													<td class="hidden-xs">Janmenjaya Mohanty</td>
													<td>51515151515</td>
													
												</tr>
												<tr>
													<td><a href="#">XX002</a></td>
													<td class="hidden-xs">Subhashis Mohanty</td>
													<td>51515151515</td>
													
												</tr>
                                                <tr>
													<td><a href="#">XX001</a></td>
													<td class="hidden-xs">Janmenjaya Mohanty</td>
													<td>51515151515</td>
													
												</tr>
												<tr>
													<td><a href="#">XX002</a></td>
													<td class="hidden-xs">Subhashis Mohanty</td>
													<td>51515151515</td>
													
												</tr>
                                                <tr>
													<td><a href="#">XX001</a></td>
													<td class="hidden-xs">Janmenjaya Mohanty</td>
													<td>51515151515</td>
													
												</tr>
												<tr>
													<td><a href="#">XX002</a></td>
													<td class="hidden-xs">Subhashis Mohanty</td>
													<td>51515151515</td>
													
												</tr>
                                                <tr>
													<td><a href="#">XX001</a></td>
													<td class="hidden-xs">Janmenjaya Mohanty</td>
													<td>51515151515</td>
													
												</tr>
												<tr>
													<td><a href="#">XX002</a></td>
													<td class="hidden-xs">Subhashis Mohanty</td>
													<td>51515151515</td>
													
												</tr>
                                                <tr>
													<td><a href="#">XX001</a></td>
													<td class="hidden-xs">Janmenjaya Mohanty</td>
													<td>51515151515</td>
													
												</tr>
												<tr>
													<td><a href="#">XX002</a></td>
													<td class="hidden-xs">Subhashis Mohanty</td>
													<td>51515151515</td>
													
												</tr>
												
												
												
											</tbody>
										</table>
                                                     </div>  			
												</div>
												
											</div>
									  </div>
                                        
                                        
                                        
                                        <!--//tabs---->
                                        
                                        
                                        
                                        
									</div>
								</div>
                                
                                <!----//items panel-->
                                
                                
                                
                                
                                
							</div>
						</div>