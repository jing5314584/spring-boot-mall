package boot.mall.mybatis.mapper;

import boot.mall.mybatis.model.Doctor;
import boot.mall.mybatis.model.DoctorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DoctorMapper {
    int countByExample(DoctorExample example);

    int deleteByExample(DoctorExample example);

    int deleteByPrimaryKey(Integer userIdx);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    List<Doctor> selectByExampleWithRowbounds(DoctorExample example, RowBounds rowBounds);

    List<Doctor> selectByExample(DoctorExample example);

    Doctor selectByPrimaryKey(Integer userIdx);

    int updateByExampleSelective(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByExample(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);
}