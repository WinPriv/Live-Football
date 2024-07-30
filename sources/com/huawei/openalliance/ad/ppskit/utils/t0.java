package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;
import ka.d7;
import ka.n7;
import ka.y6;

/* loaded from: classes2.dex */
public final class t0 implements d7<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SourceParam f23023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f23024b;

    public t0(Context context, SourceParam sourceParam) {
        this.f23023a = sourceParam;
        this.f23024b = context;
    }

    @Override // ka.d7
    public final void a(y6 y6Var) {
        int i10;
        String str;
        String str2 = (String) y6Var.f32211c;
        n7.f("ImageUtil", "get drawable from net, errorCode: %s filePath: %s", Integer.valueOf(y6Var.f32210b), y1.j(str2));
        Context context = this.f23024b;
        SourceParam sourceParam = this.f23023a;
        if (str2 == null) {
            v0.p(sourceParam.r());
            i10 = 3;
            str = "filepath is null";
        } else if (!v0.j(context, sourceParam.r(), str2, sourceParam.C(), sourceParam)) {
            v0.p(sourceParam.r());
            i10 = 4;
            str = "image not download";
        } else {
            return;
        }
        v0.n(context, i10, sourceParam, str, null);
    }
}
