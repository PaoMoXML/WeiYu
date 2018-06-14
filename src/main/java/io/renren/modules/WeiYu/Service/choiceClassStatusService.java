package io.renren.modules.WeiYu.Service;

import io.renren.modules.WeiYu.model.choiceClassStatus;

import java.util.List;

public interface choiceClassStatusService {
    List<choiceClassStatus> select(String selectclassstudentid);
}
