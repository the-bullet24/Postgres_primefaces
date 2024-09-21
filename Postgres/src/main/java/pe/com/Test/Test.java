	package pe.com.Test;
	
	import pe.com.DAO.UserDAO;
	import pe.com.DAO.UserDAOImpl;
	import pe.com.DTO.UserDTO;
	
	public class Test {
	
		public static void main(String[] args) {
			
			UserDAO userDAO = new UserDAOImpl() ;
			
			try {
				
				System.out.println("Todos los usuarios");
				
				for (UserDTO  userDTO : userDAO.getListar() ) {
					  System.out.println(userDTO.getNombre() + " - " + userDTO.getDni());
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
	
		}
	
	}
