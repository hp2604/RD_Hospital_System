<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admit</title>
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
         <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    </head>
    <body>
        <%@include file="navbar.jsp" %>
        <div class="container">
        <div class="row">
         <div class="col s12">
            <div class="card">
                <div class="card-content">
                    <h3>Patient Details</h3>
                    <div class="form">
                        <form action="admitPatient" method="post">
                            <div class="row">
                                <div class="input-field col s6">
                                    <h6>Patient Name</h6>
                                    <input placeholder="Enter Patient Name"  type="text" class="validate" name="patient_name" required >
                                </div>
                                <div class="input-field col s6">
                                   <h6>Father or Husband  Name</h6>
                                   <input placeholder="Enter family  Name"  type="text" class="validate" name="family_name" required >
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s6">
                                     <h6>Age</h6>
                                 <input placeholder="Enter the Age"  type="number" class="validate" name="age" required>
                              
                                </div>
                                    <div class="input-field col s6">
                                         <h6>Gender</h6>
                                         <input placeholder="Enter the Gender"  type="text" class="validate" name="gender" required>
                                
                                </div>
                             </div>
                            <div class="row">
                                <div class="input-field col s6">
                                    <h6>Contact</h6>
                                    <input placeholder="Enter Contact Number"  type="text" class="validate" name="contact" required >
                                </div>
                                <div class="input-field col s6">
                                   <h6>Address</h6>
                                   <input placeholder="Enter address"  type="text" class="validate" name="address" required >
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s6">
                                    <h6>Doctor Name</h6>
                                    <input placeholder="Enter Doctor Name"  type="text" class="validate" name="doctor_name" required >
                                </div>
                                <div class="input-field col s6">
                                   <h6>Disease  Name</h6>
                                   <input placeholder="Enter Disease Name"  type="text" class="validate" name="disease_name" required >
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s6">
                                    <h6>Appointment Number </h6>
                                    <input placeholder="Enter Appointment Number"  type="number" class="validate" name="appointment_no" required >
                                </div>
                                <div class="input-field col s6">
                                   <h6>Date of Admit</h6>
                                   <input   type="date" class="validate" name="date_of_admit" required >
                                </div>
                            </div>
                            <button  class="btn" >Admit</button>
                        </form>
                    </div>
                </div>

            </div>
         </div>       
        </div>
               
    </div>
    </body>
</html>
