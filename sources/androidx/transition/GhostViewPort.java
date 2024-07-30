package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
class GhostViewPort extends ViewGroup {
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        throw null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            canvas.enableZ();
        } else if (i10 != 28) {
            if (!b.f2431b) {
                try {
                    Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    b.f2430a = declaredMethod;
                    declaredMethod.setAccessible(true);
                    Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]).setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                b.f2431b = true;
            }
            try {
                Method method = b.f2430a;
                if (method != null) {
                    method.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        } else {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        canvas.setMatrix(null);
        u.b(0, null);
        throw null;
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
