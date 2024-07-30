package androidx.emoji2.text;

import androidx.emoji2.text.f;

/* compiled from: EmojiCompat.java */
/* loaded from: classes.dex */
public final class e extends f.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f.a f1617a;

    public e(f.a aVar) {
        this.f1617a = aVar;
    }

    @Override // androidx.emoji2.text.f.h
    public final void a(Throwable th) {
        this.f1617a.f1629a.d(th);
    }

    @Override // androidx.emoji2.text.f.h
    public final void b(n nVar) {
        f.a aVar = this.f1617a;
        aVar.f1628c = nVar;
        aVar.f1627b = new j(aVar.f1628c, new f.i(), aVar.f1629a.f1626h);
        aVar.f1629a.e();
    }
}
