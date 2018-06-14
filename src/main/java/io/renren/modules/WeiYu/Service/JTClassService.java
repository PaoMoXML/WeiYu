package io.renren.modules.WeiYu.Service;

import io.renren.modules.WeiYu.model.JTClass;

import java.util.List;

public interface JTClassService {
    List<JTClass> selectByOther(JTClass record);
}
