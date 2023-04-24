package com.zll.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zll.common.to.SkuReductionTo;
import com.zll.common.utils.PageUtils;
import com.zll.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author 夏沫止水
 * @email HeJieLin@gulimall.com
 * @date 2020-05-22 19:35:30
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo skuReductionTo);
}

