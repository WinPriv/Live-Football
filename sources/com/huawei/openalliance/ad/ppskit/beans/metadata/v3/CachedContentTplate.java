package com.huawei.openalliance.ad.ppskit.beans.metadata.v3;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.io.Serializable;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class CachedContentTplate implements Serializable {
    private static final long serialVersionUID = 3809421214062903233L;
    private String contentId;
    private List<String> templateIds;

    public CachedContentTplate() {
    }

    public CachedContentTplate(String str, List<String> list) {
        this.contentId = str;
        this.templateIds = list;
    }
}
