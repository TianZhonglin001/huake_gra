package dao;

import bean.notice;
import bean.noticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface noticeMapper {
    int countByExample(noticeExample example);

    int deleteByExample(noticeExample example);

    int deleteByPrimaryKey(Integer nid);

    int insert(notice record);

    int insertSelective(notice record);

    List<notice> selectByExample(noticeExample example);

    notice selectByPrimaryKey(Integer nid);

    int updateByExampleSelective(@Param("record") notice record, @Param("example") noticeExample example);

    int updateByExample(@Param("record") notice record, @Param("example") noticeExample example);

    int updateByPrimaryKeySelective(notice record);

    int updateByPrimaryKey(notice record);
}