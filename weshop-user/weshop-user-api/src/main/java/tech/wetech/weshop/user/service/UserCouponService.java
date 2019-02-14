package tech.wetech.weshop.user.service;

import org.springframework.web.bind.annotation.RequestMapping;
import tech.wetech.weshop.service.IService;
import tech.wetech.weshop.user.po.UserCoupon;

@RequestMapping("/userCoupon")
public interface UserCouponService extends IService<UserCoupon> {
}