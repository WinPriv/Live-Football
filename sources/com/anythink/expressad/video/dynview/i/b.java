package com.anythink.expressad.video.dynview.i;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.anythink.core.common.b.n;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f11483a;

    public static b a() {
        if (f11483a == null) {
            synchronized (b.class) {
                if (f11483a == null) {
                    f11483a = new b();
                }
            }
        }
        return f11483a;
    }

    public static Bitmap a(Bitmap bitmap, int i10) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            RenderScript create = RenderScript.create(n.a().g());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(18.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            create.destroy();
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Bitmap a(int i10) {
        Bitmap bitmap = null;
        try {
            bitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_4444);
            if (i10 == 1) {
                bitmap.eraseColor(Color.parseColor("#FF0000"));
            } else {
                bitmap.eraseColor(Color.parseColor("#FFFFFF"));
            }
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
        }
        return bitmap;
    }
}
