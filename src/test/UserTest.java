package test;

import org.hibernate.Session;

import com.UserDetails;
import com.Vehicle;

import comUtil.HibernateUtil;

public class UserTest {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		
		UserDetails user1 = new UserDetails();
		user1.setUserName("Carla");
		session.save(user1);
		
		
		UserDetails user2 = new UserDetails("Emily");
		session.save(user2);
		
		Vehicle veh = new Vehicle();
		veh.setVehicleName("Toyota");
		session.save(veh);
		
		Vehicle veh2 = new Vehicle();
		veh2.setVehicleName("Tesla");
		session.save(veh2);
		
		
		//mapping between user and veh objects
		user1.addVehicle(veh);
		user1.addVehicle(veh2);
		
		
		
		// Commit the transaction
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}
	
}
