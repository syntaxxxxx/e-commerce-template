package com.fiqri.market.connection.callbacks;

import com.fiqri.market.model.NewsInfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CallbackNewsInfo implements Serializable {

    public String status = "";
    public int count = -1;
    public int count_total = -1;
    public int pages = -1;
    public List<NewsInfo> news_infos = new ArrayList<>();

}
