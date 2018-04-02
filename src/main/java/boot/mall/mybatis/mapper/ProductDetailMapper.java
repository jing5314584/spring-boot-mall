package boot.mall.mybatis.mapper;

import boot.mall.mybatis.model.ProductDetail;
import boot.mall.mybatis.model.ProductDetailExample;
import boot.mall.mybatis.model.ProductDetailWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ProductDetailMapper {
    int countByExample(ProductDetailExample example);

    int deleteByExample(ProductDetailExample example);

    int deleteByPrimaryKey(Integer productIdx);

    int insert(ProductDetailWithBLOBs record);

    int insertSelective(ProductDetailWithBLOBs record);

    List<ProductDetailWithBLOBs> selectByExampleWithBLOBsWithRowbounds(ProductDetailExample example, RowBounds rowBounds);

    List<ProductDetailWithBLOBs> selectByExampleWithBLOBs(ProductDetailExample example);

    List<ProductDetail> selectByExampleWithRowbounds(ProductDetailExample example, RowBounds rowBounds);

    List<ProductDetail> selectByExample(ProductDetailExample example);

    ProductDetailWithBLOBs selectByPrimaryKey(Integer productIdx);

    int updateByExampleSelective(@Param("record") ProductDetailWithBLOBs record, @Param("example") ProductDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") ProductDetailWithBLOBs record, @Param("example") ProductDetailExample example);

    int updateByExample(@Param("record") ProductDetail record, @Param("example") ProductDetailExample example);

    int updateByPrimaryKeySelective(ProductDetailWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProductDetailWithBLOBs record);

    int updateByPrimaryKey(ProductDetail record);
}