package l3;

import android.graphics.Bitmap;
import com.bumptech.glide.o;
import l3.g;

/* compiled from: GifDrawableResource.java */
/* loaded from: classes.dex */
public final class e extends j3.c<c> {
    public e(c cVar) {
        super(cVar);
    }

    @Override // a3.x
    public final void a() {
        c cVar = (c) this.f29636s;
        cVar.stop();
        cVar.f32361v = true;
        g gVar = cVar.f32358s.f32365a;
        gVar.f32371c.clear();
        Bitmap bitmap = gVar.f32379l;
        if (bitmap != null) {
            gVar.f32373e.d(bitmap);
            gVar.f32379l = null;
        }
        gVar.f = false;
        g.a aVar = gVar.f32376i;
        o oVar = gVar.f32372d;
        if (aVar != null) {
            oVar.i(aVar);
            gVar.f32376i = null;
        }
        g.a aVar2 = gVar.f32378k;
        if (aVar2 != null) {
            oVar.i(aVar2);
            gVar.f32378k = null;
        }
        g.a aVar3 = gVar.f32381n;
        if (aVar3 != null) {
            oVar.i(aVar3);
            gVar.f32381n = null;
        }
        gVar.f32369a.clear();
        gVar.f32377j = true;
    }

    @Override // a3.x
    public final Class<c> c() {
        return c.class;
    }

    @Override // a3.x
    public final int getSize() {
        g gVar = ((c) this.f29636s).f32358s.f32365a;
        return gVar.f32369a.f() + gVar.o;
    }

    @Override // j3.c, a3.u
    public final void initialize() {
        ((c) this.f29636s).f32358s.f32365a.f32379l.prepareToDraw();
    }
}
