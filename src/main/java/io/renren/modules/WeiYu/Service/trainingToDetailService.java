package io.renren.modules.WeiYu.Service;

import io.renren.modules.WeiYu.model.trainingToDetail;

import java.util.List;

public interface trainingToDetailService {
    List<trainingToDetail> selectByid(String trainingid);
}
