package com.huawei.openalliance.ad.beans.metadata.v3;

import com.huawei.openalliance.ad.annotations.DataKeep;
import com.huawei.openalliance.ad.beans.metadata.v3.openrtb.Data;
import com.huawei.openalliance.ad.beans.metadata.v3.openrtb.Image;
import com.huawei.openalliance.ad.beans.metadata.v3.openrtb.Title;
import com.huawei.openalliance.ad.beans.metadata.v3.openrtb.Video;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class Asset implements Serializable {
    private static final long serialVersionUID = 5132069519973155133L;
    private String alias;
    private String context;
    private Data data;
    private String filePath;

    /* renamed from: id, reason: collision with root package name */
    private int f21963id;
    private Image img;
    private Title title;
    private Video video;
}
