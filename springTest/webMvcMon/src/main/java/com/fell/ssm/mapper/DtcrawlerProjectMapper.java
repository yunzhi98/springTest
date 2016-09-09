package com.fell.ssm.mapper;

import com.fell.ssm.pojo.DtcrawlerProject;
import com.fell.ssm.pojo.DtcrawlerProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtcrawlerProjectMapper {
    int countByExample(DtcrawlerProjectExample example);

    int deleteByExample(DtcrawlerProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DtcrawlerProject record);

    int insertSelective(DtcrawlerProject record);

    List<DtcrawlerProject> selectByExample(DtcrawlerProjectExample example);

    DtcrawlerProject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DtcrawlerProject record, @Param("example") DtcrawlerProjectExample example);

    int updateByExample(@Param("record") DtcrawlerProject record, @Param("example") DtcrawlerProjectExample example);

    int updateByPrimaryKeySelective(DtcrawlerProject record);

    int updateByPrimaryKey(DtcrawlerProject record);
}