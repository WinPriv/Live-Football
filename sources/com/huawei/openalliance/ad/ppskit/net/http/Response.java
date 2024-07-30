package com.huawei.openalliance.ad.ppskit.net.http;

import android.util.Pair;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.annotations.OuterVisible;
import com.huawei.openalliance.ad.ppskit.beans.inner.HttpConnection;
import com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp;
import ka.n7;

@OuterVisible
@DataKeep
/* loaded from: classes2.dex */
public class Response<DATA> {
    private static final String TAG = "Response";
    private long contentLength;
    private DATA data;
    private long dataConverterCost;

    @ma.f
    private HttpConnection httpConnection;
    private long infoCost;
    private long netDuration1;
    private long netDuration2;
    private long netEndTS;
    private long netStartTS;
    private String origData;
    private long recEngineCost;
    private boolean reqBodyGzipped;

    @ma.f
    private Throwable throwable;
    private int useHuaweiDNS;
    private int httpCode = -1;
    private String exception = "";
    private String exception1 = "";
    private boolean dnserror = false;
    private int requestType = 0;

    public final int A() {
        return this.useHuaweiDNS;
    }

    public final long B() {
        return this.infoCost;
    }

    public final long C() {
        return this.dataConverterCost;
    }

    public final HttpConnection D() {
        return this.httpConnection;
    }

    public final Throwable E() {
        return this.throwable;
    }

    public final boolean F() {
        return this.reqBodyGzipped;
    }

    public final long G() {
        return this.netStartTS;
    }

    public final long H() {
        return this.netEndTS;
    }

    public final int I() {
        return this.requestType;
    }

    public final String J() {
        return this.origData;
    }

    public final long K() {
        return this.recEngineCost;
    }

    public final int a() {
        return this.httpCode;
    }

    public final void b() {
        this.dnserror = true;
    }

    public final void c(int i10) {
        this.httpCode = i10;
    }

    public final void d(long j10) {
        this.contentLength = j10;
    }

    public final void e(long j10, long j11) {
        if (j10 > 0 && j10 < j11) {
            this.netStartTS = j10;
            this.netEndTS = j11;
            this.netDuration1 = j11 - j10;
            n7.e(TAG, "setNetDuration1 " + this.netDuration1);
        }
    }

    public final void f(Pair<DATA, String> pair) {
        if (pair != null) {
            this.data = (DATA) pair.first;
            this.origData = (String) pair.second;
        }
    }

    public final void g(HttpConnection httpConnection) {
        this.httpConnection = httpConnection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(AdContentRsp adContentRsp) {
        this.data = adContentRsp;
    }

    public final void i(String str) {
        this.origData = str;
    }

    public final void j(Throwable th) {
        this.exception = th.getClass().getSimpleName() + w.bE + th.getMessage();
        this.throwable = th;
    }

    public final DATA k() {
        return this.data;
    }

    public final void l() {
        this.useHuaweiDNS = 1;
    }

    public final void m(String str) {
        this.exception = str;
    }

    public final void n(boolean z10) {
        this.reqBodyGzipped = z10;
    }

    public final long o() {
        return this.contentLength;
    }

    public final void p(int i10) {
        this.requestType = i10;
    }

    public final void q(long j10) {
        if (j10 < 0) {
            return;
        }
        this.netDuration2 = j10;
        n7.e(TAG, "setNetDuration2 " + j10);
    }

    public final void r(String str) {
        this.exception1 = str;
    }

    public final String s() {
        return this.exception;
    }

    public final void t(long j10) {
        if (j10 < 0) {
            return;
        }
        this.infoCost = j10;
        n7.e(TAG, "setInfoCost " + j10);
    }

    public final void u(long j10) {
        if (j10 < 0) {
            return;
        }
        this.dataConverterCost = j10;
        n7.e(TAG, "setDataConverterCost " + j10);
    }

    public final boolean v() {
        return this.dnserror;
    }

    public final long w() {
        return this.netDuration1;
    }

    public final long x() {
        return this.netDuration2;
    }

    public final String y() {
        return this.exception1;
    }

    public final void z(long j10) {
        this.recEngineCost = j10;
    }
}
