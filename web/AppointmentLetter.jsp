
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Appointment Letter</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
        <script> window.print()</script>
    </head>
    
    <body >
          
          <div class="container border border-black ">
            <h1 >RD Hospital</h1>
              <hr>
            <div class="row">
              <div class="col">
            <h6 >Name : <c:out value="${details.patient_name}" /> </h6>
              </div>
              <div class="col">
                <h6 >Age : <c:out value="${details.age}" /> </h6>
              </div>
            </div>
            <div class="row">
                <div class="col">
              <h6 > Family Member : <c:out value="${details.member_name}" /> </h6>
                </div>
                <div class="col">
                  <h6 >Gender : <c:out value="${details.gender}" /> </h6>
                </div>
                           
              </div>
              <div class="row">
                <div class="col">
              <h6 >Doctor  : <c:out value="${details.doctor_name}" /> </h6>
                </div>
                <div class="col">
                  <h6 >Disease : <c:out value="${details.disease}" /> </h6>
                </div>            
              </div>
              <div class="row">
                <div class="col">
              <h6  >Record no. <c:out value="${details.appointment_number}" /> </h6>
                </div>
                <div class="col">
                  <h6 >Date of Appointment : <c:out value="${details.appointment_date}" /> </h6>
                </div>
              </div>
          </div>

    </body>
</html>
