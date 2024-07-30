package com.huawei.openalliance.ad.ppskit.download;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.inner.DownloadBlockInfo;
import com.huawei.openalliance.ad.ppskit.beans.inner.HttpConnection;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentResource;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import java.util.concurrent.atomic.AtomicLong;
import ka.n7;
import ma.f;
import qa.g;

@DataKeep
/* loaded from: classes2.dex */
public class DownloadTask implements Comparable<DownloadTask> {
    private static final AtomicLong SEQ = new AtomicLong(0);
    private String agVerifyCode;
    private boolean allowedMobileNetowrk;
    private ContentResource contentResource;
    private DownloadBlockInfo downloadBlockInfo;
    private boolean downloadFromSafeUrl;
    private String downloadParameter;
    private long downloadStartSize;
    private long downloadedSize;
    private long fileTotalSize;

    @f
    private HttpConnection httpConnection;

    /* renamed from: id, reason: collision with root package name */
    private int f22475id;
    private boolean isWorking;
    private String localPath;
    private int priority;
    private int progress;
    private int redirectCount;
    private String redirectUrl;
    private String safeUrl;
    private String sha256;
    private boolean shouldNotUploadPauseEvent;
    private String tmpLocalPath;
    private String url;
    private g worker;
    private final byte[] lock = new byte[0];
    private boolean checkSha256 = true;
    private int status = 0;
    private int failedReason = 0;
    private int pauseReason = 0;
    private boolean canceled = false;
    private String cacheType = "normal";
    private int agRealFailedReason = 0;
    private final long seqNum = SEQ.getAndIncrement();

    public final void A(String str) {
        this.sha256 = str;
    }

    public final String B() {
        return this.sha256;
    }

    public final void C(int i10) {
        this.failedReason = i10;
    }

    public final void D(String str) {
        this.localPath = str;
    }

    public final String E() {
        return this.localPath;
    }

    public final void F(int i10) {
        this.priority = i10;
    }

    public final void G(String str) {
        this.tmpLocalPath = str;
    }

    public final void H(boolean z10) {
        this.checkSha256 = z10;
    }

    public final String I() {
        return this.tmpLocalPath;
    }

    public final void J(int i10) {
        this.progress = i10;
    }

    public final void K(String str) {
        this.redirectUrl = str;
    }

    public final long L() {
        return this.fileTotalSize;
    }

    public final void M(int i10) {
        this.pauseReason = i10;
    }

    public final void N(String str) {
        this.downloadParameter = str;
    }

    public final long O() {
        return this.downloadedSize;
    }

    public final void P(int i10) {
        this.redirectCount = i10;
    }

    public final void Q(String str) {
        this.cacheType = str;
    }

    public final int R() {
        int i10;
        synchronized (this.lock) {
            i10 = this.status;
        }
        return i10;
    }

    public final int S() {
        return this.failedReason;
    }

    public final int T() {
        return this.priority;
    }

    public final int U() {
        return this.progress;
    }

    public final long V() {
        return this.seqNum;
    }

    public String W() {
        return this.url;
    }

    public final boolean X() {
        return this.allowedMobileNetowrk;
    }

    public final int Y() {
        return this.pauseReason;
    }

    public final boolean Z() {
        return this.canceled;
    }

    public final String a() {
        return this.downloadParameter;
    }

    public final boolean a0() {
        return this.downloadFromSafeUrl;
    }

    public final HttpConnection b() {
        return this.httpConnection;
    }

    public final String b0() {
        return this.redirectUrl;
    }

    public final void c() {
        g gVar = this.worker;
        if (gVar != null && equals(gVar.f34734u) && f() == 1 && !gVar.i()) {
            synchronized (gVar) {
                gVar.f34736w = true;
            }
            if (n7.d()) {
                n7.c("DownloadWorker", "cancelCurrentTask, taskId:%s", W());
            }
            p2.a(new qa.f(gVar), 2);
        }
    }

    public final int c0() {
        return this.redirectCount;
    }

    @Override // java.lang.Comparable
    public final int compareTo(DownloadTask downloadTask) {
        DownloadTask downloadTask2 = downloadTask;
        if (downloadTask2 == null) {
            return -1;
        }
        int i10 = downloadTask2.priority - this.priority;
        if (i10 == 0) {
            if (this.seqNum < downloadTask2.seqNum) {
                return -1;
            }
            return 1;
        }
        return i10;
    }

    public final DownloadBlockInfo d() {
        return this.downloadBlockInfo;
    }

    public String d0() {
        return "";
    }

    public final void e() {
        boolean z10;
        DownloadBlockInfo downloadBlockInfo = this.downloadBlockInfo;
        if (downloadBlockInfo == null) {
            return;
        }
        if (this.downloadStartSize <= 0 && this.downloadedSize == this.fileTotalSize) {
            z10 = true;
        } else {
            z10 = false;
        }
        downloadBlockInfo.b(z10);
    }

    public boolean equals(Object obj) {
        if (obj != null) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof DownloadTask) && TextUtils.equals(W(), ((DownloadTask) obj).W())) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return 1;
    }

    public final boolean g() {
        return this.checkSha256;
    }

    public final boolean h() {
        return this.shouldNotUploadPauseEvent;
    }

    public int hashCode() {
        if (W() != null) {
            return W().hashCode();
        }
        return super.hashCode();
    }

    public final ContentResource i() {
        return this.contentResource;
    }

    public final String j() {
        return this.agVerifyCode;
    }

    public final String k() {
        return this.cacheType;
    }

    public final void l(long j10) {
        this.fileTotalSize = j10;
    }

    public final void m(DownloadBlockInfo downloadBlockInfo) {
        this.downloadBlockInfo = downloadBlockInfo;
    }

    public final void n(HttpConnection httpConnection) {
        this.httpConnection = httpConnection;
    }

    public final void o(ContentResource contentResource) {
        this.contentResource = contentResource;
    }

    public final void p(String str) {
        this.url = str;
    }

    public final void q(g gVar) {
        this.worker = gVar;
    }

    public final void r(boolean z10) {
        this.allowedMobileNetowrk = z10;
    }

    public final String s() {
        return this.url;
    }

    public final void t(long j10) {
        this.downloadedSize = j10;
    }

    public final void u(String str) {
        this.safeUrl = str;
    }

    public final void v(boolean z10) {
        this.canceled = z10;
    }

    public final String w() {
        return this.safeUrl;
    }

    public final void x() {
        this.downloadFromSafeUrl = true;
    }

    public final void y(int i10) {
        synchronized (this.lock) {
            this.status = i10;
        }
    }

    public final void z(long j10) {
        this.downloadStartSize = j10;
    }
}
