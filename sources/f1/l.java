package f1;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SharedSQLiteStatement.java */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f27985a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final h f27986b;

    /* renamed from: c, reason: collision with root package name */
    public volatile k1.e f27987c;

    public l(h hVar) {
        this.f27986b = hVar;
    }

    public final k1.e a() {
        this.f27986b.a();
        if (this.f27985a.compareAndSet(false, true)) {
            if (this.f27987c == null) {
                String b10 = b();
                h hVar = this.f27986b;
                hVar.a();
                hVar.b();
                this.f27987c = new k1.e(((k1.a) hVar.f27953c.H()).f30288s.compileStatement(b10));
            }
            return this.f27987c;
        }
        String b11 = b();
        h hVar2 = this.f27986b;
        hVar2.a();
        hVar2.b();
        return new k1.e(((k1.a) hVar2.f27953c.H()).f30288s.compileStatement(b11));
    }

    public abstract String b();

    public final void c(k1.e eVar) {
        if (eVar == this.f27987c) {
            this.f27985a.set(false);
        }
    }
}
