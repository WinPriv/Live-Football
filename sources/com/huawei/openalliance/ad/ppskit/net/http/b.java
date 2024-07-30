package com.huawei.openalliance.ad.ppskit.net.http;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.net.http.e;
import java.io.BufferedInputStream;
import java.util.ArrayList;
import ka.ab;

/* loaded from: classes2.dex */
public abstract class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22748a;

    public b(Context context) {
        this.f22748a = context;
    }

    public static long b(d dVar, a aVar, int i10, BufferedInputStream bufferedInputStream, long j10, Response response) {
        ab abVar = aVar.f22728k;
        if (abVar == null) {
            abVar = ab.a.a(aVar.f22719a);
        }
        response.f(abVar.a(i10, bufferedInputStream, j10, dVar.f22754e));
        return abVar.a();
    }

    public static String c(a aVar) {
        e eVar = aVar.f22720b;
        if (eVar.f22773g) {
            return eVar.f22774h;
        }
        e.a aVar2 = new e.a();
        aVar2.a(aVar.a());
        ArrayList arrayList = aVar.f22725h;
        if (arrayList != null) {
            aVar2.f22779e.addAll(arrayList);
        }
        return new e(aVar2).a();
    }
}
