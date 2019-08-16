package universityDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import contact.Address;
import util.Database;

public class AddressDAO<T> implements VarsityDAO <T>{

	Database base = new Database();
	
	//prepared statement
	private String queryAddress = "INSERT INTO `address`(`provence`, `city`, `street`, `houseNumber`, `postalCode`) VALUES (?,?,?,?,?)";

	
	@Override
	public void create(T t) {
		
		//costing the address to type;
		Address address = (Address)t;
	
		
		try {
			
			//local variables to store numbers of row affected and the address primary key
			int count =0;
			int key=0;
			
			
			PreparedStatement ps= base.getConnection().prepareStatement(queryAddress,Statement.RETURN_GENERATED_KEYS);
			
			//passing in unknown values of the prepared stetement qeury
			ps.setString(1, address.getProvence());
			ps.setString(2, address.getCity());
			ps.setString(3,address.getStreet());
			ps.setInt(4,address.getHouseNumber());
			ps.setString(5, address.getPostalCode());
			count = ps.executeUpdate();
			
			// returned result set of the generated Id for the inserted record
			ResultSet rs = ps.getGeneratedKeys();
			
			
			// getting auto incremented address id from the DB
			if(rs.next())
			{
				key =rs.getInt(1);
				
				System.out.println("address key is :"+key);
				//passing address back to address to be used in student on the transection table studentAddress
				address.setAddressId(key);
				
				
				
				
			}
		
			System.out.println("address table raws affected :" + count);
			
			System.out.println(address.getCity());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public boolean update(T t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<T> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
