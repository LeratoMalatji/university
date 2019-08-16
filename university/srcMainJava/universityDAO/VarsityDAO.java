package universityDAO;

import java.util.List;

public interface VarsityDAO <T>{
	
	public void create (T t);
	public boolean update (T t);
	public List<T> selectAll ();
	public Boolean delete (T t);
	public T getId (int i);

}
