package com.huawei.openalliance.ad.beans.metadata.v3.openrtb;

import com.huawei.openalliance.ad.annotations.DataKeep;
import java.io.Serializable;
import y9.a;

@DataKeep
/* loaded from: classes2.dex */
public class Image implements Serializable {
    private static final long serialVersionUID = 3793768731771300290L;

    @a(Code = "Ext")
    private ImageExt ext;

    @a(Code = "H")
    private int height;
    private String localPath;
    private String url;

    @a(Code = "W")
    private int width;
}
