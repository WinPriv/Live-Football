package com.huawei.openalliance.ad.ppskit.db.bean;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import pa.a;

@DataKeep
/* loaded from: classes2.dex */
public class AppDownloadRecord extends a {
    public static final int DELETED = 1;
    public static final String DELETE_ATTR = "deleted";
    public static final String PACKAGE_NAME = "packageName";
    private int agdDownloadSource;
    private String contentId;
    private String data1;
    private String data2;
    private int deleted;
    private int downloadSource;
    private String packageName;
    private String showId;
    private int status;
    private String venusExt;
}
