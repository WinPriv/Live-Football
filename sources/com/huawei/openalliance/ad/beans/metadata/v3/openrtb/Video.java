package com.huawei.openalliance.ad.beans.metadata.v3.openrtb;

import com.huawei.openalliance.ad.annotations.DataKeep;
import java.io.Serializable;
import y9.a;

@DataKeep
/* loaded from: classes2.dex */
public class Video implements Serializable {
    private static final long serialVersionUID = -9078513959338975690L;
    private int checkSHA256Flag;
    private long duration;
    private String format;

    @a(Code = "H")
    private int height;
    private String localPath;
    private String sha256;
    private long size;
    private String url;

    @a(Code = "W")
    private int width;
}
