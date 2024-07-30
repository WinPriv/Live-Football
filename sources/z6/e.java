package z6;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: TextAppearance.java */
/* loaded from: classes2.dex */
public final class e extends f {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f37325t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ TextPaint f37326u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ f f37327v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f37328w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, Context context, TextPaint textPaint, f fVar) {
        super(0);
        this.f37328w = dVar;
        this.f37325t = context;
        this.f37326u = textPaint;
        this.f37327v = fVar;
    }

    @Override // z6.f
    public final void q(int i10) {
        this.f37327v.q(i10);
    }

    @Override // z6.f
    public final void r(Typeface typeface, boolean z10) {
        this.f37328w.g(this.f37325t, this.f37326u, typeface);
        this.f37327v.r(typeface, z10);
    }
}
