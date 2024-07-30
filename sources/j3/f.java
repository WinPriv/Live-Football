package j3;

import a3.x;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import y2.g;
import y2.i;

/* compiled from: UnitDrawableDecoder.java */
/* loaded from: classes.dex */
public final class f implements i<Drawable, Drawable> {
    @Override // y2.i
    public final /* bridge */ /* synthetic */ boolean a(Drawable drawable, g gVar) throws IOException {
        return true;
    }

    @Override // y2.i
    public final x<Drawable> b(Drawable drawable, int i10, int i11, g gVar) throws IOException {
        Drawable drawable2 = drawable;
        if (drawable2 != null) {
            return new d(drawable2);
        }
        return null;
    }
}
