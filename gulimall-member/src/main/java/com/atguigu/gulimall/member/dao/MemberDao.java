package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wjm
 * @email wustwjm@gmail.com
 * @date 2023-04-10 18:45:41
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
