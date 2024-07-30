package j3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import d0.a;
import e0.f;

/* compiled from: DrawableDecoderCompat.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f29635a = true;

    public static Drawable a(Context context, Context context2, int i10, Resources.Theme theme) {
        Context context3;
        try {
            if (f29635a) {
                if (theme != null) {
                    context3 = new i.c(context2, theme);
                } else {
                    context3 = context2;
                }
                return g.a.a(context3, i10);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                Object obj = d0.a.f27248a;
                return a.c.b(context2, i10);
            }
            throw e10;
        } catch (NoClassDefFoundError unused2) {
            f29635a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = e0.f.f27633a;
        return f.a.a(resources, i10, theme);
    }
}
