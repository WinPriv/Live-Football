package g7;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import i.c;

/* compiled from: MaterialThemeOverlay.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f28521a = {R.attr.theme, com.hamkho.livefoot.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f28522b = {com.hamkho.livefoot.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i10, int i11) {
        boolean z10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f28522b, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if ((context instanceof c) && ((c) context).f28974a == resourceId) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (resourceId != 0 && !z10) {
            c cVar = new c(context, resourceId);
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f28521a);
            int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
            int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
            obtainStyledAttributes2.recycle();
            if (resourceId2 == 0) {
                resourceId2 = resourceId3;
            }
            if (resourceId2 != 0) {
                cVar.getTheme().applyStyle(resourceId2, true);
            }
            return cVar;
        }
        return context;
    }
}
