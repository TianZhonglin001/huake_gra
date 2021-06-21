package dao;

import bean.job;
import bean.jobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface jobMapper {
    int countByExample(jobExample example);

    int deleteByExample(jobExample example);

    int deleteByPrimaryKey(Integer jid);

    int insert(job record);

    int insertSelective(job record);

    List<job> selectByExample(jobExample example);

    job selectByPrimaryKey(Integer jid);

    int updateByExampleSelective(@Param("record") job record, @Param("example") jobExample example);

    int updateByExample(@Param("record") job record, @Param("example") jobExample example);

    int updateByPrimaryKeySelective(job record);

    int updateByPrimaryKey(job record);
}