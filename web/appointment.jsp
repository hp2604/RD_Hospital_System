<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Appointment Page</title> 
          <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </head>
    <body>
        <%@include file="navbar.jsp" %>
       
        
          <div class="container">
            <div class="row">
                
                <div class="col s12">
                    
                    <div class="card">
                        <div class="card-content">
                            <h3 class="ms-2"> RD Hospital</h3>
                            <div class="form">
                                <form action="appointment" method="post">
                                    <div class="row">
                                    <div class="input-field col s6 ms-2">
                                         <label class="form-label">Patient Name</label>
                                     <input placeholder="Enter the Patient Name"  type="text" class="form-control" name="pname" required  >
                                  
                                    </div>
                                        <div class="input-field col s6 me-2">
                                            <label class="form-label">Family Member Name</label>
                                     <input placeholder="Enter the Family member name"  type="text" class="form-control" name="fname" required >
                                    
                                    </div>
                                    
                                   
                                    </div>
                                     <div class="row">
                                    <div class="input-field col s6 ms-2">
                                        <label class="form-label">Age</label>
                                     <input placeholder="Enter the Age"  type="number" class="form-control" name="age" required>
                                  
                                    </div>
                                        <div class="input-field col s6 me-2">
                                            <label class="form-label">Gender</label>
                                             <input placeholder="Enter the Gender"  type="text" class="form-control" name="gender" required>
                                    
                                    </div>
                                         <br>
                                   
                                    </div>
                                     <div class="row">
                                    <div class="input-field col s6 ms-2">
                                        <label class="form-label">Contact</label>
                                     <input placeholder="Enter the Contact"  type="number" class="form-control" name="contact"   required >
                                  
                                    </div>
                                        <div class="input-field col s6">
                                            <label class="form-label me-2">Address</label>
                                     <input placeholder="Enter the Address"  type="text" class="form-control" name="address"   required>
                                    
                                    </div>
                                    
                                         <br>
                                    </div>
                                     <div class="row">
                                    <div class="input-field col s6 ms-2">
                                        <label class="form-label">Doctor</label>
                                     <input placeholder="enter the Prefered Doctor"  type="text" class="form-control" name="dname"   required>
                                  
                                    </div>
                                        <div class="input-field col s6 me-2">
                                            <label class="form-label ">Disease</label>
                                     <input placeholder="Enter the Disease"  type="text" class="form-control" name="disease"   required>
                                    
                                    </div>
                                    
                                         <br>
                                   
                                    </div>
                                     <div class="row">
                                    <div class="input-field col s6 ms-2 me-5">
                                        <label class="form-label">Date Of Appointment</label>
                                     <input placeholder="enter the Previous record "  type="date" class="form-control" name="appointment_date"  >
                                  
                                    </div>
                                     </div>
                                    <br>
                                    
                                    <button type="button" class="btn btn-outline-primary ms-2 mb-2 " >   Book</button>
                                    <br>
                                </form>
                            </div>
                        </div>
                         
                    </div>
                </div>
            </div>
       </div>
    </body>
</html>
