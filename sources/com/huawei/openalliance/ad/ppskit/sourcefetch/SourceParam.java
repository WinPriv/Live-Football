package com.huawei.openalliance.ad.ppskit.sourcefetch;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.inner.HttpConnection;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import ma.f;

@DataKeep
/* loaded from: classes2.dex */
public class SourceParam {

    @f
    private Long adRequestStartTime;

    @f
    private ContentRecord contentRecord;
    private Integer downloadSource;
    private String dstFilePath;

    @f
    private HttpConnection httpConnection;

    @f
    private String loadFailReason;

    @f
    private Long resDownloadEndTime;
    private String resType;
    private String sha256;
    private String subDir;

    @f
    private long totalDownloadSize;
    private String url;
    private long limit = 53687091200L;
    private int sptImgFormat = 1;
    private boolean checkDigest = true;
    private boolean useDiskCache = false;
    private boolean cleanDisk = false;
    private String cacheType = "normal";
    private boolean isExtByUrl = false;
    private int connectTimeout = 10000;
    private int readTimeOut = 10000;
    private boolean onlyDownFromNet = false;
    private boolean useCacheDir = true;

    public final long A() {
        return this.totalDownloadSize;
    }

    public final Long B() {
        return this.resDownloadEndTime;
    }

    public final String C() {
        return this.cacheType;
    }

    public final boolean D() {
        return this.isExtByUrl;
    }

    public final int E() {
        return this.connectTimeout;
    }

    public final int F() {
        return this.readTimeOut;
    }

    public final String G() {
        return this.loadFailReason;
    }

    public final int H() {
        return this.sptImgFormat;
    }

    public final boolean I() {
        return this.onlyDownFromNet;
    }

    public final Integer J() {
        return this.downloadSource;
    }

    public final String K() {
        return this.dstFilePath;
    }

    public final boolean L() {
        return this.useCacheDir;
    }

    public final void a() {
        this.cleanDisk = true;
    }

    public final void b(int i10) {
        this.limit = i10 * 1024;
    }

    public final void c(long j10) {
        this.limit = j10;
    }

    public final void d(HttpConnection httpConnection) {
        this.httpConnection = httpConnection;
    }

    public final void e(ContentRecord contentRecord) {
        this.contentRecord = contentRecord;
    }

    public final void f(Integer num) {
        this.downloadSource = num;
    }

    public final void g(Long l10) {
        this.adRequestStartTime = l10;
    }

    public final void h(String str) {
        this.subDir = str;
    }

    public final String i() {
        return this.subDir;
    }

    public final void j() {
        this.connectTimeout = 2000;
    }

    public final void k(String str) {
        this.sha256 = str;
    }

    public final void l(boolean z10) {
        this.checkDigest = z10;
    }

    public final void m() {
        this.readTimeOut = 2000;
    }

    public final void n(String str) {
        this.url = str;
    }

    public final void o(boolean z10) {
        this.useDiskCache = z10;
    }

    public final void p() {
        this.resType = "arzip";
    }

    public final void q(boolean z10) {
        this.isExtByUrl = z10;
    }

    public final String r() {
        return this.url;
    }

    public final void s() {
        this.onlyDownFromNet = true;
    }

    public final void t(String str) {
        this.cacheType = str;
    }

    public final void u(String str) {
        this.loadFailReason = str;
    }

    public final Long v() {
        return this.adRequestStartTime;
    }

    public final ContentRecord w() {
        return this.contentRecord;
    }

    public final boolean x() {
        return this.useDiskCache;
    }

    public final String y() {
        return this.resType;
    }

    public final HttpConnection z() {
        return this.httpConnection;
    }
}
