package com.anythink.expressad.video.module.a.a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class j extends e {

    /* renamed from: a, reason: collision with root package name */
    private int f11885a;

    public j(ImageView imageView, int i10) {
        super(imageView);
        this.f11885a = i10;
    }

    @Override // com.anythink.expressad.video.module.a.a.e, com.anythink.expressad.foundation.g.d.c
    public final void a(Bitmap bitmap, String str) {
        Bitmap a10;
        if (bitmap == null) {
            return;
        }
        try {
            WeakReference<ImageView> weakReference = this.f11882c;
            if (weakReference != null && weakReference.get() != null && !bitmap.isRecycled() && (a10 = com.anythink.expressad.foundation.h.n.a(bitmap, this.f11885a)) != null) {
                this.f11882c.get().setImageBitmap(a10);
            }
        } catch (Throwable th) {
            if (com.anythink.expressad.a.f6552a) {
                th.printStackTrace();
            }
        }
    }
}
