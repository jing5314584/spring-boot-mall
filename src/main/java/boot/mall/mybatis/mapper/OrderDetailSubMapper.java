package boot.mall.mybatis.mapper;

import boot.mall.mybatis.model.OrderDetailSub;
import boot.mall.mybatis.model.OrderDetailSubExample;
import boot.mall.mybatis.model.OrderDetailSubKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrderDetailSubMapper {
    int countByExample(OrderDetailSubExample example);

    int deleteByExample(OrderDetailSubExample example);

    int deleteByPrimaryKey(OrderDetailSubKey key);

    int insert(OrderDetailSub record);

    int insertSelective(OrderDetailSub record);

    List<OrderDetailSub> selectByExampleWithRowbounds(OrderDetailSubExample example, RowBounds rowBounds);

    List<OrderDetailSub> selectByExample(OrderDetailSubExample example);

    OrderDetailSub selectByPrimaryKey(OrderDetailSubKey key);

    int updateByExampleSelective(@Param("record") OrderDetailSub record, @Param("example") OrderDetailSubExample example);

    int updateByExample(@Param("record") OrderDetailSub record, @Param("example") OrderDetailSubExample example);

    int updateByPrimaryKeySelective(OrderDetailSub record);

    int updateByPrimaryKey(OrderDetailSub record);
}