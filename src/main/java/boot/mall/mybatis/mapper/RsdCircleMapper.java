package boot.mall.mybatis.mapper;

import boot.mall.mybatis.model.RsdCircle;
import boot.mall.mybatis.model.RsdCircleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RsdCircleMapper {
    int countByExample(RsdCircleExample example);

    int deleteByExample(RsdCircleExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(RsdCircle record);

    int insertSelective(RsdCircle record);

    List<RsdCircle> selectByExampleWithRowbounds(RsdCircleExample example, RowBounds rowBounds);

    List<RsdCircle> selectByExample(RsdCircleExample example);

    RsdCircle selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") RsdCircle record, @Param("example") RsdCircleExample example);

    int updateByExample(@Param("record") RsdCircle record, @Param("example") RsdCircleExample example);

    int updateByPrimaryKeySelective(RsdCircle record);

    int updateByPrimaryKey(RsdCircle record);
}