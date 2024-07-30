package b3;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayDeque;
import java.util.Queue;
import ka.u7;

/* compiled from: BaseKeyPool.java */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public Object f2858a;

    public c(int i10) {
        if (i10 == 1) {
            this.f2858a = null;
        } else if (i10 != 2) {
            char[] cArr = t3.l.f35429a;
            this.f2858a = new ArrayDeque(20);
        }
    }

    public abstract c a(String str, String str2);

    public abstract void b(u7 u7Var, int i10, String str);

    public abstract boolean c(String str);

    public final synchronized SQLiteDatabase d() {
        SQLiteDatabase sQLiteDatabase;
        kc.a aVar = (kc.a) this.f2858a;
        synchronized (aVar) {
            try {
                sQLiteDatabase = aVar.f32281a.getWritableDatabase();
            } catch (Exception unused) {
                sQLiteDatabase = null;
            }
        }
        return sQLiteDatabase;
    }

    public boolean e(String str) {
        Object obj = this.f2858a;
        if (((c) obj) != null) {
            return ((c) obj).c(str);
        }
        return false;
    }

    public abstract l f();

    public final l g() {
        l lVar = (l) ((Queue) this.f2858a).poll();
        if (lVar == null) {
            return f();
        }
        return lVar;
    }

    public final void h(l lVar) {
        if (((Queue) this.f2858a).size() < 20) {
            ((Queue) this.f2858a).offer(lVar);
        }
    }

    public /* synthetic */ c(kc.c cVar) {
        this.f2858a = cVar;
    }
}
