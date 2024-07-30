package h3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;

/* compiled from: BitmapDrawableDecoder.java */
/* loaded from: classes.dex */
public final class a<DataType> implements y2.i<DataType, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    public final y2.i<DataType, Bitmap> f28680a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f28681b;

    public a(Resources resources, y2.i<DataType, Bitmap> iVar) {
        this.f28681b = resources;
        this.f28680a = iVar;
    }

    @Override // y2.i
    public final boolean a(DataType datatype, y2.g gVar) throws IOException {
        return this.f28680a.a(datatype, gVar);
    }

    @Override // y2.i
    public final a3.x<BitmapDrawable> b(DataType datatype, int i10, int i11, y2.g gVar) throws IOException {
        a3.x<Bitmap> b10 = this.f28680a.b(datatype, i10, i11, gVar);
        if (b10 == null) {
            return null;
        }
        return new e(this.f28681b, b10);
    }
}
