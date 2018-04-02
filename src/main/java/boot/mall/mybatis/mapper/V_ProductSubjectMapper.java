package boot.mall.mybatis.mapper;

import boot.mall.mybatis.model.V_ProductSubject;
import boot.mall.mybatis.model.V_ProductSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface V_ProductSubjectMapper {
    int countByExample(V_ProductSubjectExample example);

    int deleteByExample(V_ProductSubjectExample example);

    int insert(V_ProductSubject record);

    int insertSelective(V_ProductSubject record);

    List<V_ProductSubject> selectByExampleWithRowbounds(V_ProductSubjectExample example, RowBounds rowBounds);

    List<V_ProductSubject> selectByExample(V_ProductSubjectExample example);

    int updateByExampleSelective(@Param("record") V_ProductSubject record, @Param("example") V_ProductSubjectExample example);

    int updateByExample(@Param("record") V_ProductSubject record, @Param("example") V_ProductSubjectExample example);
}