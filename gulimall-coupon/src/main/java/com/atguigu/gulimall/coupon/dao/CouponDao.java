package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wjm
 * @email wustwjm@gmail.com
 * @date 2023-04-10 18:20:44
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
