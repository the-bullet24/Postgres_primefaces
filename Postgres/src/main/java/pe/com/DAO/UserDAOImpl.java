package pe.com.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pe.com.DTO.UserDTO;
import pe.com.conexion.Conexion;

public class UserDAOImpl implements UserDAO{

	
	
	
	@Override
	public List<UserDTO> getListar() throws SQLException, ClassNotFoundException {
		
		List <UserDTO> users = new ArrayList<>();	
		
		String query = "SELECT * FROM \"Usuario\"" ;
		
		try ( Connection cnx = Conexion.getConexion();
			  Statement stmt = cnx.createStatement();
	          ResultSet rs = stmt.executeQuery(query)){
			
			while (rs.next()) {
                users.add(new UserDTO(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("dni")                                        
                ));
            }			
		} 
				
		return  users;
	}

	@Override
	public UserDTO getId(int id) {

		return null;
	}
	
	

}
