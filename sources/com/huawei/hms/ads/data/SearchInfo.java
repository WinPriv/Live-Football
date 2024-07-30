package com.huawei.hms.ads.data;

import com.huawei.hms.ads.annotation.AllApi;
import com.huawei.openalliance.ad.annotations.DataKeep;
import java.util.List;
import y9.a;

@DataKeep
@AllApi
/* loaded from: classes2.dex */
public class SearchInfo {

    @a(Code = "chnl")
    private String channel;

    @a(Code = "kws")
    private List<Keyword> keywords;

    @a(Code = "qry")
    private String query;

    @AllApi
    public SearchInfo() {
    }

    @AllApi
    public SearchInfo(String str, List<Keyword> list, String str2) {
        this.query = str;
        this.keywords = list;
        this.channel = str2;
    }

    @AllApi
    public String getChannel() {
        return this.channel;
    }

    @AllApi
    public List<Keyword> getKeywords() {
        return this.keywords;
    }

    @AllApi
    public String getQuery() {
        return this.query;
    }

    @AllApi
    public void setChannel(String str) {
        this.channel = str;
    }

    @AllApi
    public void setKeywords(List<Keyword> list) {
        this.keywords = list;
    }

    @AllApi
    public void setQuery(String str) {
        this.query = str;
    }
}
