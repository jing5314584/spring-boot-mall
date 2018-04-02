package boot.mall.mybatis.mapper;

import boot.mall.mybatis.model.V_ShoppingCart;
import boot.mall.mybatis.model.V_ShoppingCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface V_ShoppingCartMapper {
    int countByExample(V_ShoppingCartExample example);

    int deleteByExample(V_ShoppingCartExample example);

    int insert(V_ShoppingCart record);

    int insertSelective(V_ShoppingCart record);

    List<V_ShoppingCart> selectByExampleWithRowbounds(V_ShoppingCartExample example, RowBounds rowBounds);

    List<V_ShoppingCart> selectByExample(V_ShoppingCartExample example);

    int updateByExampleSelective(@Param("record") V_ShoppingCart record, @Param("example") V_ShoppingCartExample example);

    int updateByExample(@Param("record") V_ShoppingCart record, @Param("example") V_ShoppingCartExample example);
}