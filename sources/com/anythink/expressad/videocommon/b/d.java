package com.anythink.expressad.videocommon.b;

import android.text.TextUtils;
import com.anythink.expressad.videocommon.b.i;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class d implements i.c {

    /* renamed from: a, reason: collision with root package name */
    private static String f12348a = "DownLoadH5SourceListener";

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentMap<String, d> f12349b;

    /* renamed from: c, reason: collision with root package name */
    private m f12350c;

    /* renamed from: d, reason: collision with root package name */
    private CopyOnWriteArrayList<i.d> f12351d;

    /* renamed from: e, reason: collision with root package name */
    private String f12352e;

    public d(ConcurrentMap<String, d> concurrentMap, m mVar, i.d dVar, String str) {
        CopyOnWriteArrayList<i.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f12351d = copyOnWriteArrayList;
        this.f12349b = concurrentMap;
        this.f12350c = mVar;
        copyOnWriteArrayList.add(dVar);
        this.f12352e = str;
    }

    @Override // com.anythink.expressad.videocommon.b.i.c
    public final void a() {
    }

    public final void a(i.d dVar) {
        this.f12351d.add(dVar);
    }

    @Override // com.anythink.expressad.videocommon.b.i.c
    public final void a(byte[] bArr, String str) {
        String str2;
        ConcurrentMap<String, d> concurrentMap;
        try {
            concurrentMap = this.f12349b;
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
            try {
                str2 = e10.getMessage();
            } catch (Throwable th) {
                com.anythink.expressad.foundation.h.o.b(f12348a, th.getMessage(), th);
                str2 = "";
            }
        }
        if (concurrentMap == null) {
            Iterator<i.d> it = this.f12351d.iterator();
            while (it.hasNext()) {
                i.d next = it.next();
                if (next != null) {
                    next.a(str, "mResDownloadingMap  is null");
                    this.f12351d.remove(next);
                }
            }
            return;
        }
        if (concurrentMap.containsKey(str)) {
            this.f12349b.remove(str);
        }
        if (bArr == null || bArr.length <= 0) {
            str2 = "response data is error";
        } else {
            String a10 = this.f12350c.a(str, bArr);
            if (TextUtils.isEmpty(a10)) {
                Iterator<i.d> it2 = this.f12351d.iterator();
                while (it2.hasNext()) {
                    i.d next2 = it2.next();
                    if (next2 != null) {
                        next2.a(str);
                        this.f12351d.remove(next2);
                    }
                }
                return;
            }
            str2 = "data save failed:".concat(String.valueOf(a10));
        }
        Iterator<i.d> it3 = this.f12351d.iterator();
        while (it3.hasNext()) {
            i.d next3 = it3.next();
            if (next3 != null) {
                next3.a(str, str2);
            }
        }
    }

    @Override // com.anythink.expressad.videocommon.b.i.c
    public final void a(String str) {
        ConcurrentMap<String, d> concurrentMap;
        try {
            concurrentMap = this.f12349b;
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
            try {
                str = e10.getMessage();
            } catch (Throwable th) {
                com.anythink.expressad.foundation.h.o.b(f12348a, th.getMessage(), th);
            }
        }
        if (concurrentMap == null) {
            Iterator<i.d> it = this.f12351d.iterator();
            while (it.hasNext()) {
                i.d next = it.next();
                if (next != null) {
                    next.a(this.f12352e, "mResDownloadingMap  is null");
                    this.f12351d.remove(next);
                }
            }
            return;
        }
        if (concurrentMap.containsKey(this.f12352e)) {
            this.f12349b.remove(this.f12352e);
        }
        Iterator<i.d> it2 = this.f12351d.iterator();
        while (it2.hasNext()) {
            i.d next2 = it2.next();
            if (next2 != null) {
                next2.a(this.f12352e, str);
                this.f12351d.remove(next2);
            }
        }
    }
}
