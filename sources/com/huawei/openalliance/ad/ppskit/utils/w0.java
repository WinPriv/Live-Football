package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import java.util.List;
import ka.ce;
import ka.n7;

/* loaded from: classes2.dex */
public final class w0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f23051s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f23052t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f23053u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f23054v;

    public w0(Context context, int i10, List list, String str) {
        this.f23051s = context;
        this.f23052t = i10;
        this.f23053u = list;
        this.f23054v = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ce ceVar = new ce(this.f23051s);
        ceVar.f31050c = this.f23052t;
        List<String> list = this.f23053u;
        ceVar.f31049b = list;
        if (androidx.transition.n.M(list)) {
            n7.e("ContentProcessor", "invalidContentIds is empty");
        } else {
            for (String str : ceVar.f31049b) {
                if (str != null) {
                    ceVar.l(str);
                }
            }
        }
        ceVar.h(com.huawei.openalliance.ad.ppskit.handlers.l.d(r1).H(this.f23054v));
    }
}
