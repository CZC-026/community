package com.czc.dao;

import com.czc.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    //获取文章列表
    List<DiscussPost> selectDiscussPosts(int userId, int offset,int limit);
    //获取具体user的文章
    // @Param注解用于给参数取别名,
    // 如果只有一个参数,并且在<if>里使用,则必须加别名.
    int selectDiscussPostRows(@Param("userId")int userId);
}
