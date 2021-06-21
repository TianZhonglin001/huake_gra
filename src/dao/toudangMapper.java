package dao;

import bean.toudang;
import bean.toudangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface toudangMapper {
    int countByExample(toudangExample example);

    int deleteByExample(toudangExample example);

    int deleteByPrimaryKey(Integer sno);

    int insert(toudang record);

    int insertSelective(toudang record);

    List<toudang> selectByExample(toudangExample example);

    toudang selectByPrimaryKey(Integer sno);

    int updateByExampleSelective(@Param("record") toudang record, @Param("example") toudangExample example);

    int updateByExample(@Param("record") toudang record, @Param("example") toudangExample example);

    int updateByPrimaryKeySelective(toudang record);

    int updateByPrimaryKey(toudang record);
}