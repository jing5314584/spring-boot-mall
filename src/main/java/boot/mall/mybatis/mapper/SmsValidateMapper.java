package boot.mall.mybatis.mapper;

import boot.mall.mybatis.model.SmsValidate;
import boot.mall.mybatis.model.SmsValidateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SmsValidateMapper {
    int countByExample(SmsValidateExample example);

    int deleteByExample(SmsValidateExample example);

    int deleteByPrimaryKey(String phoneNum);

    int insert(SmsValidate record);

    int insertSelective(SmsValidate record);

    List<SmsValidate> selectByExampleWithRowbounds(SmsValidateExample example, RowBounds rowBounds);

    List<SmsValidate> selectByExample(SmsValidateExample example);

    SmsValidate selectByPrimaryKey(String phoneNum);

    int updateByExampleSelective(@Param("record") SmsValidate record, @Param("example") SmsValidateExample example);

    int updateByExample(@Param("record") SmsValidate record, @Param("example") SmsValidateExample example);

    int updateByPrimaryKeySelective(SmsValidate record);

    int updateByPrimaryKey(SmsValidate record);
}