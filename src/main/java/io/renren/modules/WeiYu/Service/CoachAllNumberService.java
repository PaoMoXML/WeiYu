package io.renren.modules.WeiYu.Service;

import io.renren.modules.WeiYu.model.CoachAllNumber;

import java.util.List;

public interface CoachAllNumberService {
    List<CoachAllNumber> selectallByCid(String signinforclasscoachid);
}
