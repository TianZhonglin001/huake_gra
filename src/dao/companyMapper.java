package dao;

import bean.company;
import bean.companyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface companyMapper {
    int countByExample(companyExample example);

    int deleteByExample(companyExample example);

    int deleteByPrimaryKey(Integer eno);

    int insert(company record);

    int insertSelective(company record);

    List<company> selectByExample(companyExample example);

    company selectByPrimaryKey(Integer eno);

    int updateByExampleSelective(@Param("record") company record, @Param("example") companyExample example);

    int updateByExample(@Param("record") company record, @Param("example") companyExample example);

    int updateByPrimaryKeySelective(company record);

    int updateByPrimaryKey(company record);
}