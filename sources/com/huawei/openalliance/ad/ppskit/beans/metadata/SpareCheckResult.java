package com.huawei.openalliance.ad.ppskit.beans.metadata;

/* loaded from: classes2.dex */
public class SpareCheckResult {
    private String filePath;
    private String realPath;
    private boolean valid;

    public SpareCheckResult() {
    }

    public SpareCheckResult(String str) {
        this.valid = true;
        this.filePath = str;
    }

    public final boolean a() {
        return this.valid;
    }

    public final String b() {
        return this.filePath;
    }

    public final String c() {
        return this.realPath;
    }

    public SpareCheckResult(String str, String str2, boolean z10) {
        this.valid = z10;
        this.filePath = str;
        this.realPath = str2;
    }
}
