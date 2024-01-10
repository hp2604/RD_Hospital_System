
package com.NHHospital.dao;
import java.sql.*;
import com.NHHospital.connection.ConnectionProvider;
import com.NHHospital.entity.Patient;

public class PatientDao {

//  Conection Establishment     
    private Connection con =ConnectionProvider.getConnection();

// Obtatin Prepared Statement  
    private PreparedStatement ps;
    
//  check status of data in db
   private boolean status =false;
    
 
// method to save Patient in database
    public boolean savePatient(Patient p) 
    {
        try
        {
        // Query to insert data in Database .
          
         String query ="insert into appointment (patient_name,family_name,age,gender,contact,address,doctor_name,disease,date_of_appointment) values (?,?,?,?,?,?,?,?,?) ";
         ps=con.prepareStatement(query);
         ps.setString(1,p.getPatient_name());
         ps.setString(2,p.getMember_name());
         ps.setInt(3,p.getAge());
         ps.setString(4,p.getGender());
         ps.setString(5,p.getContact());
         ps.setString(6,p.getAddress());
         ps.setString(7,p.getDoctor_name());
         ps.setString(8,p.getDisease());
         ps.setDate(9,p.getAppointment_date());
         ps.executeUpdate();
         String quer1="select max(sn) from appointment ; ";
         ps=con.prepareStatement(quer1);
         ResultSet rs= ps.executeQuery();
         
          while(rs.next())
        {
            p.setAppointment_number(rs.getInt(1));
        }
        
         status=true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return status;
    }
}
