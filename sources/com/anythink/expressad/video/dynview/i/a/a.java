package com.anythink.expressad.video.dynview.i.a;

import android.graphics.Bitmap;
import android.view.View;
import com.anythink.expressad.foundation.h.p;
import com.anythink.expressad.video.dynview.c;
import com.anythink.expressad.video.dynview.g.a;
import com.anythink.expressad.video.dynview.i.b;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f11479a;

    /* renamed from: b, reason: collision with root package name */
    private View f11480b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f11481c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f11482d;

    private a() {
    }

    public static a a() {
        a aVar;
        if (f11479a == null) {
            synchronized (a.class) {
                if (f11479a == null) {
                    f11479a = new a();
                }
                aVar = f11479a;
            }
            return aVar;
        }
        return f11479a;
    }

    public final void b() {
        if (this.f11480b != null) {
            this.f11480b = null;
        }
        Bitmap bitmap = this.f11481c;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f11481c.recycle();
            this.f11481c = null;
        }
        Bitmap bitmap2 = this.f11482d;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.f11482d.recycle();
            this.f11482d = null;
        }
    }

    public final void a(Map map, c cVar, View view) {
        Bitmap bitmap;
        List<com.anythink.expressad.foundation.d.c> g6;
        this.f11480b = view;
        int e10 = cVar.e();
        float d10 = cVar.d();
        float c10 = cVar.c();
        if (map != null && map.size() > 1 && (g6 = cVar.g()) != null && g6.size() > 1) {
            if (map.get(p.a(g6.get(0).be())) != null && (map.get(p.a(g6.get(0).be())) instanceof Bitmap)) {
                Bitmap bitmap2 = (Bitmap) map.get(p.a(g6.get(0).be()));
                if (g6.get(0) != null && bitmap2 != null && !bitmap2.isRecycled()) {
                    b.a();
                    this.f11481c = b.a(bitmap2, 0);
                }
            }
            if (map.get(p.a(g6.get(1).be())) != null && (map.get(p.a(g6.get(1).be())) instanceof Bitmap)) {
                Bitmap bitmap3 = (Bitmap) map.get(p.a(g6.get(1).be()));
                if (g6.get(1) != null && !bitmap3.isRecycled()) {
                    b.a();
                    this.f11482d = b.a(bitmap3, 1);
                }
            }
        }
        Bitmap bitmap4 = this.f11481c;
        if (bitmap4 == null || bitmap4.isRecycled() || (bitmap = this.f11482d) == null || bitmap.isRecycled()) {
            return;
        }
        a(e10, d10, c10, this.f11481c, this.f11482d);
    }

    private synchronized void a(int i10, float f, float f10, Bitmap bitmap, Bitmap bitmap2) {
        a.C0137a a10 = com.anythink.expressad.video.dynview.g.a.a();
        a10.a(i10).a(bitmap).b(bitmap2);
        if (i10 != 2) {
            a10.a(f).b(f10);
        } else if (f > f10) {
            a10.a(f).b(f10);
        } else {
            a10.a(f10).b(f);
        }
        this.f11480b.setBackgroundDrawable(a10.b());
    }
}
