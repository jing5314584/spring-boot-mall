package boot.mall.mybatis.mapper;

import boot.mall.mybatis.model.V_IndexProduct;
import boot.mall.mybatis.model.V_IndexProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface V_IndexProductMapper {
    int countByExample(V_IndexProductExample example);

    int deleteByExample(V_IndexProductExample example);

    int insert(V_IndexProduct record);

    int insertSelective(V_IndexProduct record);

    List<V_IndexProduct> selectByExampleWithRowbounds(V_IndexProductExample example, RowBounds rowBounds);

    List<V_IndexProduct> selectByExample(V_IndexProductExample example);

    int updateByExampleSelective(@Param("record") V_IndexProduct record, @Param("example") V_IndexProductExample example);

    int updateByExample(@Param("record") V_IndexProduct record, @Param("example") V_IndexProductExample example);
}