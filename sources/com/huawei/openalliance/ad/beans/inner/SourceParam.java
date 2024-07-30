package com.huawei.openalliance.ad.beans.inner;

import com.huawei.openalliance.ad.annotations.DataKeep;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import y9.b;

@DataKeep
/* loaded from: classes2.dex */
public class SourceParam {

    @b
    private AdContentData contentRecord;

    @b
    private String loadFailReason;
    private String sha256;
    private String subDir;
    private String url;
    private long limit = 53687091200L;
    private int sptImgFormat = 1;
    private boolean checkDigest = false;
    private boolean useDiskCache = false;
    private boolean cleanDisk = false;

    public final String a() {
        return this.url;
    }

    public final void b() {
        this.limit = 52428800L;
    }

    public final void c(int i10) {
        this.limit = i10 * 1024;
    }

    public final void d(AdContentData adContentData) {
        this.contentRecord = adContentData;
    }

    public final void e(String str) {
        this.subDir = str;
    }

    public final String f() {
        return this.loadFailReason;
    }

    public final AdContentData g() {
        return this.contentRecord;
    }

    public final void h() {
        this.useDiskCache = true;
    }

    public final void i(String str) {
        this.url = str;
    }

    public final void j(int i10) {
        this.sptImgFormat = i10;
    }

    public final void k(String str) {
        this.sha256 = str;
    }

    public final void l(boolean z10) {
        this.checkDigest = z10;
    }

    public final void m(String str) {
        this.loadFailReason = str;
    }
}
