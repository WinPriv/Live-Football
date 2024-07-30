package com.anythink.core.common.d;

import android.content.Context;
import com.anythink.core.common.c.j;
import com.anythink.core.common.e.x;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    j f5381a;

    /* renamed from: b, reason: collision with root package name */
    protected int f5382b;

    public a(Context context) {
        this.f5381a = j.a(com.anythink.core.common.c.c.a(context));
    }

    public final void a(String str, int i10, int i11) {
        this.f5381a.a(this.f5382b, str, i10, i11);
    }

    public final void a(String str, long j10) {
        this.f5381a.a(this.f5382b, str, j10);
    }

    public final void a(String str, String str2) {
        this.f5381a.a(str, this.f5382b, str2);
    }

    private List<x> a() {
        return this.f5381a.a(this.f5382b);
    }

    public final List<x> a(List<String> list) {
        return this.f5381a.a(list, this.f5382b);
    }
}
