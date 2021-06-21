package dao;

import bean.situation;
import bean.situationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface situationMapper {
    int countByExample(situationExample example);

    int deleteByExample(situationExample example);

    int deleteByPrimaryKey(String sno);

    int insert(situation record);

    int insertSelective(situation record);

    List<situation> selectByExample(situationExample example);

    situation selectByPrimaryKey(String sno);

    int updateByExampleSelective(@Param("record") situation record, @Param("example") situationExample example);

    int updateByExample(@Param("record") situation record, @Param("example") situationExample example);

    int updateByPrimaryKeySelective(situation record);

    int updateByPrimaryKey(situation record);
}