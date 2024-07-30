package oc;

import android.content.Context;
import java.util.HashMap;
import mc.c;
import mc.f;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f33807s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ JSONObject f33808t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ JSONObject f33809u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f33810v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f33811w;

    /* renamed from: oc.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0450a implements c {
        public C0450a() {
        }

        @Override // mc.c
        public final void a() {
        }

        @Override // mc.c
        public final void b() {
            jc.b a10 = jc.b.a();
            Context context = jc.b.a().f30202a;
            a10.getClass();
            rc.b.a().b(new jc.c(a10, context));
        }

        @Override // mc.c
        public final void a(int i10, Object obj) {
            HashMap hashMap;
            Runnable runnable;
            if (2 == i10 && (hashMap = a.this.f33811w.f33814a) != null && (runnable = (Runnable) hashMap.remove(Integer.valueOf(i10))) != null) {
                runnable.run();
            }
            jc.b a10 = jc.b.a();
            Context context = jc.b.a().f30202a;
            a10.getClass();
            rc.b.a().b(new jc.c(a10, context));
        }
    }

    public a(b bVar, String str, JSONObject jSONObject, JSONObject jSONObject2, int i10) {
        this.f33811w = bVar;
        this.f33807s = str;
        this.f33808t = jSONObject;
        this.f33809u = jSONObject2;
        this.f33810v = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = new f(jc.b.a().f30202a, this.f33807s, this.f33808t, this.f33809u);
        fVar.f33027a = new C0450a();
        rc.b.a().f34993a.execute(new mc.a(fVar, this.f33810v));
    }
}
