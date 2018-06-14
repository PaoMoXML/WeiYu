package io.renren.modules.WeiYu.Service;

import io.renren.modules.WeiYu.model.QDdetail;

import java.util.List;

public interface QDdetailService {
    List<QDdetail> select(String signinforclassid);
}
