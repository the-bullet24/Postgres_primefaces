package pe.com.DAO;


import java.util.List;

import pe.com.DTO.UserDTO;

public interface UserDAO  {

	List <UserDTO> getListar() throws Exception;
	
	UserDTO getId( int id );
	
}
