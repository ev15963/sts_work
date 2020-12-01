import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lsw.biz.board.boardVO;


public interface SqlMapperInter {

	@Select("select * from membertab")
	public List<boardVO> selectDataAll();
	
	@Select("select id, name, pass, reg_date from membertab where id=#{id}")
	public boardVO selectData(String arg);
	
	@Insert("insert into membertab values(#{id}, #{name}, #{pass}, now())")
	public int insertData(boardVO bVO);
	
	@Update("update membertab set name=#{name}, pass=#{pass} where id=#{id}")
	public int updateData(boardVO bVO);
	
	@Delete("delete from membertab where id=#{id}")
	public int deleteData(String arg);
}
