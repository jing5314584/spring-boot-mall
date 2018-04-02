package boot.mall.mybatis.mapper;

import boot.mall.mybatis.model.ConfProductSubject;
import boot.mall.mybatis.model.ConfProductSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ConfProductSubjectMapper {
    int countByExample(ConfProductSubjectExample example);

    int deleteByExample(ConfProductSubjectExample example);

    int deleteByPrimaryKey(Integer idx);

    int insert(ConfProductSubject record);

    int insertSelective(ConfProductSubject record);

    List<ConfProductSubject> selectByExampleWithRowbounds(ConfProductSubjectExample example, RowBounds rowBounds);

    List<ConfProductSubject> selectByExample(ConfProductSubjectExample example);

    ConfProductSubject selectByPrimaryKey(Integer idx);

    int updateByExampleSelective(@Param("record") ConfProductSubject record, @Param("example") ConfProductSubjectExample example);

    int updateByExample(@Param("record") ConfProductSubject record, @Param("example") ConfProductSubjectExample example);

    int updateByPrimaryKeySelective(ConfProductSubject record);

    int updateByPrimaryKey(ConfProductSubject record);
}