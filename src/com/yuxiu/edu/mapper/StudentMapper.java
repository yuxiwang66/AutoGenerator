package com.yuxiu.edu.mapper;

import com.yuxiu.edu.model.Student;
import com.yuxiu.edu.model.StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    int countByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    int deleteByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    int insert(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    int insertSelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    List<Student> selectByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    Student selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    int updateByPrimaryKeySelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    int updateByPrimaryKey(Student record);
}