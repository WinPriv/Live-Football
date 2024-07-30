package w0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* compiled from: EmojiTransformationMethod.java */
/* loaded from: classes.dex */
public final class h implements TransformationMethod {

    /* renamed from: s, reason: collision with root package name */
    public final TransformationMethod f36033s;

    public h(TransformationMethod transformationMethod) {
        this.f36033s = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f36033s;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && androidx.emoji2.text.f.a().b() == 1) {
            androidx.emoji2.text.f a10 = androidx.emoji2.text.f.a();
            a10.getClass();
            return a10.f(0, charSequence.length(), charSequence);
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.f36033s;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i10, rect);
        }
    }
}
