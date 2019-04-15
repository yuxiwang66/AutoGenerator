package com.gyf.backoffice.mapper;

import com.gyf.backoffice.model.Orderdetail;
import com.gyf.backoffice.model.OrderdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderdetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetail
     *
     * @mbggenerated Sat Mar 16 15:47:13 CST 2019
     */
    int countByExample(OrderdetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetail
     *
     * @mbggenerated Sat Mar 16 15:47:13 CST 2019
     */
    int deleteByExample(OrderdetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetail
     *
     * @mbggenerated Sat Mar 16 15:47:13 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetail
     *
     * @mbggenerated Sat Mar 16 15:47:13 CST 2019
     */
    int insert(Orderdetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetail
     *
     * @mbggenerated Sat Mar 16 15:47:13 CST 2019
     */
    int insertSelective(Orderdetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetail
     *
     * @mbggenerated Sat Mar 16 15:47:13 CST 2019
     */
    List<Orderdetail> selectByExample(OrderdetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetail
     *
     * @mbggenerated Sat Mar 16 15:47:13 CST 2019
     */
    Orderdetail selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetail
     *
     * @mbggenerated Sat Mar 16 15:47:13 CST 2019
     */
    int updateByExampleSelective(@Param("record") Orderdetail record, @Param("example") OrderdetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetail
     *
     * @mbggenerated Sat Mar 16 15:47:13 CST 2019
     */
    int updateByExample(@Param("record") Orderdetail record, @Param("example") OrderdetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetail
     *
     * @mbggenerated Sat Mar 16 15:47:13 CST 2019
     */
    int updateByPrimaryKeySelective(Orderdetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetail
     *
     * @mbggenerated Sat Mar 16 15:47:13 CST 2019
     */
    int updateByPrimaryKey(Orderdetail record);
}