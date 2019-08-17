package serviceTransection;

import java.util.List;

public interface StudentService <T>{
	
	public Boolean validate(T t);
	
	public T checkFees(T t);
	
	public List<T> getGrades(T t);
	
	public T moduleRegister (T t);
	
	public Boolean validatePoints(T t);
	
	public T updateProfile(T t);
	 
	public T viewProfile (T t);
	
	public List<T> getModule(T t);
	
	public Boolean registerNew(T t);
	

}
