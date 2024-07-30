package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.g.g;
import com.huawei.hms.framework.network.grs.g.h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: i, reason: collision with root package name */
    private static final String f21820i = "c";

    /* renamed from: j, reason: collision with root package name */
    private static final ExecutorService f21821j = ExecutorsUtils.newSingleThreadExecutor("GRS_GrsClient-Init");

    /* renamed from: k, reason: collision with root package name */
    private static long f21822k = -TimeUnit.DAYS.toMillis(2);

    /* renamed from: a, reason: collision with root package name */
    private GrsBaseInfo f21823a;

    /* renamed from: b, reason: collision with root package name */
    private Context f21824b;

    /* renamed from: c, reason: collision with root package name */
    private g f21825c;

    /* renamed from: d, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.a f21826d;

    /* renamed from: e, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.c f21827e;
    private com.huawei.hms.framework.network.grs.e.c f;

    /* renamed from: g, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.a f21828g;

    /* renamed from: h, reason: collision with root package name */
    private FutureTask<Boolean> f21829h;

    /* loaded from: classes2.dex */
    public class a implements Callable<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f21830a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GrsBaseInfo f21831b;

        public a(Context context, GrsBaseInfo grsBaseInfo) {
            this.f21830a = context;
            this.f21831b = grsBaseInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() {
            c.this.f21825c = new g();
            c.this.f21827e = new com.huawei.hms.framework.network.grs.e.c(this.f21830a, GrsApp.getInstance().getBrand("_") + "share_pre_grs_conf_");
            c.this.f = new com.huawei.hms.framework.network.grs.e.c(this.f21830a, GrsApp.getInstance().getBrand("_") + "share_pre_grs_services_");
            c cVar = c.this;
            cVar.f21826d = new com.huawei.hms.framework.network.grs.e.a(cVar.f21827e, c.this.f, c.this.f21825c);
            c cVar2 = c.this;
            cVar2.f21828g = new com.huawei.hms.framework.network.grs.a(cVar2.f21823a, c.this.f21826d, c.this.f21825c, c.this.f);
            if (com.huawei.hms.framework.network.grs.f.b.a(this.f21830a.getPackageName()) == null) {
                new com.huawei.hms.framework.network.grs.f.b(this.f21830a, true).a(this.f21831b);
            }
            String c10 = new com.huawei.hms.framework.network.grs.g.j.c(this.f21831b, this.f21830a).c();
            Logger.v(c.f21820i, "scan serviceSet is: " + c10);
            String a10 = c.this.f.a("services", "");
            String a11 = h.a(a10, c10);
            if (!TextUtils.isEmpty(a11)) {
                c.this.f.b("services", a11);
                Logger.i(c.f21820i, "postList is:" + StringUtils.anonymizeMessage(a11));
                Logger.i(c.f21820i, "currentServices:" + StringUtils.anonymizeMessage(a10));
                if (!a11.equals(a10)) {
                    c.this.f21825c.a(c.this.f21823a.getGrsParasKey(true, true, this.f21830a));
                    c.this.f21825c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.f21831b, this.f21830a), (String) null, c.this.f);
                }
            }
            if (TimeUnit.MILLISECONDS.toHours(SystemClock.elapsedRealtime() - c.f21822k) > 24) {
                c cVar3 = c.this;
                cVar3.a(cVar3.f21827e.a());
                long unused = c.f21822k = SystemClock.elapsedRealtime();
            }
            c.this.f21826d.b(this.f21831b, this.f21830a);
            return Boolean.TRUE;
        }
    }

    public c(Context context, GrsBaseInfo grsBaseInfo) {
        this.f21829h = null;
        this.f21824b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        a(grsBaseInfo);
        GrsBaseInfo grsBaseInfo2 = this.f21823a;
        FutureTask<Boolean> futureTask = new FutureTask<>(new a(this.f21824b, grsBaseInfo2));
        this.f21829h = futureTask;
        f21821j.execute(futureTask);
        Logger.i(f21820i, "GrsClient Instance is init, GRS SDK version: %s, GrsBaseInfoParam: app_name=%s, reg_country=%s, ser_country=%s, issue_country=%s", com.huawei.hms.framework.network.grs.h.a.a(), grsBaseInfo2.getAppName(), grsBaseInfo.getRegCountry(), grsBaseInfo.getSerCountry(), grsBaseInfo.getIssueCountry());
    }

    public c(GrsBaseInfo grsBaseInfo) {
        this.f21829h = null;
        a(grsBaseInfo);
    }

    private boolean e() {
        String str;
        String str2;
        FutureTask<Boolean> futureTask = this.f21829h;
        if (futureTask == null) {
            return false;
        }
        try {
            return futureTask.get(8L, TimeUnit.SECONDS).booleanValue();
        } catch (InterruptedException e10) {
            e = e10;
            str = f21820i;
            str2 = "init compute task interrupted.";
            Logger.w(str, str2, e);
            return false;
        } catch (CancellationException unused) {
            Logger.i(f21820i, "init compute task canceled.");
            return false;
        } catch (ExecutionException e11) {
            e = e11;
            str = f21820i;
            str2 = "init compute task failed.";
            Logger.w(str, str2, e);
            return false;
        } catch (TimeoutException unused2) {
            Logger.w(f21820i, "init compute task timed out");
            return false;
        } catch (Exception e12) {
            e = e12;
            str = f21820i;
            str2 = "init compute task occur unknown Exception";
            Logger.w(str, str2, e);
            return false;
        }
    }

    public boolean b() {
        GrsBaseInfo grsBaseInfo;
        Context context;
        if (!e() || (grsBaseInfo = this.f21823a) == null || (context = this.f21824b) == null) {
            return false;
        }
        this.f21826d.a(grsBaseInfo, context);
        return true;
    }

    private boolean b(long j10) {
        return System.currentTimeMillis() - j10 <= 604800000;
    }

    public String a(String str, String str2) {
        if (this.f21823a == null || str == null || str2 == null) {
            Logger.w(f21820i, "invalid para!");
            return null;
        }
        if (e()) {
            return this.f21828g.a(str, str2, this.f21824b);
        }
        return null;
    }

    public Map<String, String> a(String str) {
        if (this.f21823a != null && str != null) {
            return e() ? this.f21828g.a(str, this.f21824b) : new HashMap();
        }
        Logger.w(f21820i, "invalid para!");
        return new HashMap();
    }

    public void a() {
        if (e()) {
            String grsParasKey = this.f21823a.getGrsParasKey(true, true, this.f21824b);
            this.f21827e.a(grsParasKey);
            this.f21827e.a(grsParasKey + "time");
            this.f21827e.a(grsParasKey + "ETag");
            this.f21825c.a(grsParasKey);
        }
    }

    private void a(GrsBaseInfo grsBaseInfo) {
        try {
            this.f21823a = grsBaseInfo.m3clone();
        } catch (CloneNotSupportedException e10) {
            Logger.w(f21820i, "GrsClient catch CloneNotSupportedException", e10);
            this.f21823a = grsBaseInfo.copy();
        }
    }

    public void a(String str, IQueryUrlsCallBack iQueryUrlsCallBack) {
        if (iQueryUrlsCallBack == null) {
            Logger.w(f21820i, "IQueryUrlsCallBack is must not null for process continue.");
            return;
        }
        if (this.f21823a == null || str == null) {
            iQueryUrlsCallBack.onCallBackFail(-6);
        } else if (e()) {
            this.f21828g.a(str, iQueryUrlsCallBack, this.f21824b);
        } else {
            Logger.i(f21820i, "grs init task has not completed.");
            iQueryUrlsCallBack.onCallBackFail(-7);
        }
    }

    public void a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack) {
        if (iQueryUrlCallBack == null) {
            Logger.w(f21820i, "IQueryUrlCallBack is must not null for process continue.");
            return;
        }
        if (this.f21823a == null || str == null || str2 == null) {
            iQueryUrlCallBack.onCallBackFail(-6);
        } else if (e()) {
            this.f21828g.a(str, str2, iQueryUrlCallBack, this.f21824b);
        } else {
            Logger.i(f21820i, "grs init task has not completed.");
            iQueryUrlCallBack.onCallBackFail(-7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, ?> map) {
        if (map == null || map.isEmpty()) {
            Logger.v(f21820i, "sp's content is empty.");
            return;
        }
        for (String str : map.keySet()) {
            if (str.endsWith("time")) {
                String a10 = this.f21827e.a(str, "");
                long j10 = 0;
                if (!TextUtils.isEmpty(a10) && a10.matches("\\d+")) {
                    try {
                        j10 = Long.parseLong(a10);
                    } catch (NumberFormatException e10) {
                        Logger.w(f21820i, "convert expire time from String to Long catch NumberFormatException.", e10);
                    }
                }
                if (!b(j10)) {
                    Logger.i(f21820i, "init interface auto clear some invalid sp's data.");
                    String substring = str.substring(0, str.length() - 4);
                    String h10 = com.ironsource.adapters.facebook.a.h(substring, "ETag");
                    this.f21827e.a(substring);
                    this.f21827e.a(str);
                    this.f21827e.a(h10);
                }
            }
        }
    }

    public boolean a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass() && (obj instanceof c)) {
            return this.f21823a.compare(((c) obj).f21823a);
        }
        return false;
    }
}
