package beans.managing;

import java.util.List;

import jakarta.ejb.Local;

@Local
public interface Liberation_definitiveLocal {
	public String addLiberation_definitiveLocal(Liberation_definitiveImpl lib_def) ;
	public String updateLiberation_definitiveLocal(Liberation_definitiveImpl lib_def) ;
	public String deleteLiberation_definitiveLocal(Liberation_definitiveImpl lib_def) ;
	public List<Liberation_definitiveImpl> getAllLiberation_definitiveLocal(Liberation_definitiveImpl lib_def) ;
}
