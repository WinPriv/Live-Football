package com.anythink.expressad.video.module.a.a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class e implements com.anythink.expressad.foundation.g.d.c {

    /* renamed from: b, reason: collision with root package name */
    protected static final String f11880b = "ImageLoaderListener";

    /* renamed from: a, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.c f11881a;

    /* renamed from: c, reason: collision with root package name */
    protected WeakReference<ImageView> f11882c;

    /* renamed from: d, reason: collision with root package name */
    private String f11883d;

    public e(ImageView imageView) {
        this.f11882c = new WeakReference<>(imageView);
    }

    @Override // com.anythink.expressad.foundation.g.d.c
    public void a(String str, String str2) {
    }

    @Override // com.anythink.expressad.foundation.g.d.c
    public void a(Bitmap bitmap, String str) {
        try {
            if (bitmap == null) {
                com.anythink.expressad.foundation.h.o.d(f11880b, "bitmap=null");
                return;
            }
            WeakReference<ImageView> weakReference = this.f11882c;
            if (weakReference == null || weakReference.get() == null || bitmap.isRecycled()) {
                return;
            }
            this.f11882c.get().setImageBitmap(bitmap);
            this.f11882c.get().setVisibility(0);
        } catch (Throwable th) {
            if (com.anythink.expressad.a.f6552a) {
                th.printStackTrace();
            }
        }
    }

    public e(ImageView imageView, com.anythink.expressad.foundation.d.c cVar, String str) {
        this.f11882c = new WeakReference<>(imageView);
        this.f11881a = cVar;
        this.f11883d = str;
    }
}
