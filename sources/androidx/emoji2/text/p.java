package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* compiled from: TypefaceEmojiSpan.java */
/* loaded from: classes.dex */
public final class p extends k {
    public p(i iVar) {
        super(iVar);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, float f, int i12, int i13, int i14, Paint paint) {
        f.a().getClass();
        i iVar = this.f1654t;
        n nVar = iVar.f1643b;
        Typeface typeface = nVar.f1668d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText(nVar.f1666b, iVar.f1642a * 2, 2, f, i13, paint);
        paint.setTypeface(typeface2);
    }
}
