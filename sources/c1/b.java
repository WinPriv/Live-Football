package c1;

import androidx.activity.n;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import androidx.lifecycle.m;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import java.io.PrintWriter;
import q.j;

/* compiled from: LoaderManagerImpl.java */
/* loaded from: classes.dex */
public final class b extends c1.a {

    /* renamed from: a, reason: collision with root package name */
    public final m f3196a;

    /* renamed from: b, reason: collision with root package name */
    public final C0034b f3197b;

    /* compiled from: LoaderManagerImpl.java */
    /* loaded from: classes.dex */
    public static class a<D> extends q<D> {
        @Override // androidx.lifecycle.LiveData
        public final void e() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        public final void f() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public final void g(r<? super D> rVar) {
            super.g(rVar);
        }

        @Override // androidx.lifecycle.q, androidx.lifecycle.LiveData
        public final void h(D d10) {
            super.h(d10);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #0 : ");
            n.i0(null, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: c1.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0034b extends e0 {

        /* renamed from: e, reason: collision with root package name */
        public static final a f3198e = new a();

        /* renamed from: d, reason: collision with root package name */
        public final j<a> f3199d = new j<>();

        /* compiled from: LoaderManagerImpl.java */
        /* renamed from: c1.b$b$a */
        /* loaded from: classes.dex */
        public static class a implements g0.b {
            @Override // androidx.lifecycle.g0.b
            public final <T extends e0> T a(Class<T> cls) {
                return new C0034b();
            }
        }

        @Override // androidx.lifecycle.e0
        public final void b() {
            j<a> jVar = this.f3199d;
            int i10 = jVar.f34551u;
            if (i10 <= 0) {
                Object[] objArr = jVar.f34550t;
                for (int i11 = 0; i11 < i10; i11++) {
                    objArr[i11] = null;
                }
                jVar.f34551u = 0;
                return;
            }
            ((a) jVar.f34550t[0]).getClass();
            throw null;
        }
    }

    public b(m mVar, i0 i0Var) {
        this.f3196a = mVar;
        this.f3197b = (C0034b) new g0(i0Var, C0034b.f3198e).a(C0034b.class);
    }

    @Deprecated
    public final void b(String str, PrintWriter printWriter) {
        j<a> jVar = this.f3197b.f3199d;
        if (jVar.f34551u > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (jVar.f34551u > 0) {
                a aVar = (a) jVar.f34550t[0];
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(jVar.f34549s[0]);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println((Object) null);
                throw null;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        n.i0(this.f3196a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
