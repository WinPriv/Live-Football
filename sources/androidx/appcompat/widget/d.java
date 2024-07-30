package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import g0.a;

/* compiled from: AppCompatCheckedTextViewHelper.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final CheckedTextView f1141a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f1142b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f1143c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1144d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1145e = false;
    public boolean f;

    public d(CheckedTextView checkedTextView) {
        this.f1141a = checkedTextView;
    }

    public final void a() {
        CheckedTextView checkedTextView = this.f1141a;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f1144d || this.f1145e) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f1144d) {
                    a.b.h(mutate, this.f1142b);
                }
                if (this.f1145e) {
                    a.b.i(mutate, this.f1143c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(checkedTextView.getDrawableState());
                }
                checkedTextView.setCheckMarkDrawable(mutate);
            }
        }
    }
}
