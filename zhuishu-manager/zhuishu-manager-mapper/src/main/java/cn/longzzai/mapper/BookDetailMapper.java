package cn.longzzai.mapper;

import cn.longzzai.pojo.BookDetail;
import cn.longzzai.pojo.BookDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_detail
     *
     * @mbggenerated
     */
    int countByExample(BookDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_detail
     *
     * @mbggenerated
     */
    int deleteByExample(BookDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_detail
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long bookDetailId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_detail
     *
     * @mbggenerated
     */
    int insert(BookDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_detail
     *
     * @mbggenerated
     */
    int insertSelective(BookDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_detail
     *
     * @mbggenerated
     */
    List<BookDetail> selectByExample(BookDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_detail
     *
     * @mbggenerated
     */
    BookDetail selectByPrimaryKey(Long bookDetailId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_detail
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BookDetail record, @Param("example") BookDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_detail
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BookDetail record, @Param("example") BookDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BookDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BookDetail record);
}