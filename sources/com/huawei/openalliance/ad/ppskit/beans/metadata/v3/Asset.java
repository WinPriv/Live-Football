package com.huawei.openalliance.ad.ppskit.beans.metadata.v3;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.openrtb.Data;
import com.huawei.openalliance.ad.ppskit.beans.openrtb.Image;
import com.huawei.openalliance.ad.ppskit.beans.openrtb.Title;
import com.huawei.openalliance.ad.ppskit.beans.openrtb.Video;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class Asset implements Serializable {
    private static final long serialVersionUID = 1094499159973642680L;
    private String alias;
    private String context;
    private Data data;
    private String filePath;

    /* renamed from: id, reason: collision with root package name */
    private int f22463id;
    private Image img;
    private Title title;
    private Video video;

    public final String h() {
        return this.context;
    }

    public final String k() {
        return this.alias;
    }

    public final void l(String str) {
        this.filePath = str;
    }

    public final Image p() {
        return this.img;
    }

    public final Video q() {
        return this.video;
    }

    public final String r() {
        return this.filePath;
    }
}
