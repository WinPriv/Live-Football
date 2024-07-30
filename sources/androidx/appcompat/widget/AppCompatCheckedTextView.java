package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: s, reason: collision with root package name */
    public final d f944s;

    /* renamed from: t, reason: collision with root package name */
    public final c f945t;

    /* renamed from: u, reason: collision with root package name */
    public final p f946u;

    /* renamed from: v, reason: collision with root package name */
    public h f947v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081 A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:3:0x0047, B:5:0x004e, B:8:0x0054, B:10:0x0063, B:12:0x0069, B:14:0x006f, B:15:0x007a, B:17:0x0081, B:18:0x0088, B:20:0x008f), top: B:2:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #0 {all -> 0x00a7, blocks: (B:3:0x0047, B:5:0x004e, B:8:0x0054, B:10:0x0063, B:12:0x0069, B:14:0x006f, B:15:0x007a, B:17:0x0081, B:18:0x0088, B:20:0x008f), top: B:2:0x0047 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppCompatCheckedTextView(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            androidx.appcompat.widget.j0.a(r8)
            r0 = 2130968804(0x7f0400e4, float:1.7546272E38)
            r7.<init>(r8, r9, r0)
            android.content.Context r8 = r7.getContext()
            androidx.appcompat.widget.h0.a(r8, r7)
            androidx.appcompat.widget.p r8 = new androidx.appcompat.widget.p
            r8.<init>(r7)
            r7.f946u = r8
            r8.f(r9, r0)
            r8.b()
            androidx.appcompat.widget.c r8 = new androidx.appcompat.widget.c
            r8.<init>(r7)
            r7.f945t = r8
            r8.d(r9, r0)
            androidx.appcompat.widget.d r8 = new androidx.appcompat.widget.d
            r8.<init>(r7)
            r7.f944s = r8
            android.content.Context r8 = r7.getContext()
            int[] r3 = a0.a.N
            androidx.appcompat.widget.m0 r8 = androidx.appcompat.widget.m0.m(r8, r9, r3, r0)
            android.content.Context r2 = r7.getContext()
            android.content.res.TypedArray r5 = r8.f1206b
            r6 = 2130968804(0x7f0400e4, float:1.7546272E38)
            r1 = r7
            r4 = r9
            n0.c0.k(r1, r2, r3, r4, r5, r6)
            r1 = 1
            boolean r2 = r8.l(r1)     // Catch: java.lang.Throwable -> La7
            r3 = 0
            if (r2 == 0) goto L60
            int r2 = r8.i(r1, r3)     // Catch: java.lang.Throwable -> La7
            if (r2 == 0) goto L60
            android.content.Context r4 = r7.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L60 java.lang.Throwable -> La7
            android.graphics.drawable.Drawable r2 = g.a.a(r4, r2)     // Catch: android.content.res.Resources.NotFoundException -> L60 java.lang.Throwable -> La7
            r7.setCheckMarkDrawable(r2)     // Catch: android.content.res.Resources.NotFoundException -> L60 java.lang.Throwable -> La7
            goto L61
        L60:
            r1 = r3
        L61:
            if (r1 != 0) goto L7a
            boolean r1 = r8.l(r3)     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto L7a
            int r1 = r8.i(r3, r3)     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto L7a
            android.content.Context r2 = r7.getContext()     // Catch: java.lang.Throwable -> La7
            android.graphics.drawable.Drawable r1 = g.a.a(r2, r1)     // Catch: java.lang.Throwable -> La7
            r7.setCheckMarkDrawable(r1)     // Catch: java.lang.Throwable -> La7
        L7a:
            r1 = 2
            boolean r2 = r8.l(r1)     // Catch: java.lang.Throwable -> La7
            if (r2 == 0) goto L88
            android.content.res.ColorStateList r1 = r8.b(r1)     // Catch: java.lang.Throwable -> La7
            r7.setCheckMarkTintList(r1)     // Catch: java.lang.Throwable -> La7
        L88:
            r1 = 3
            boolean r2 = r8.l(r1)     // Catch: java.lang.Throwable -> La7
            if (r2 == 0) goto L9c
            r2 = -1
            int r1 = r8.h(r1, r2)     // Catch: java.lang.Throwable -> La7
            r2 = 0
            android.graphics.PorterDuff$Mode r1 = androidx.appcompat.widget.x.c(r1, r2)     // Catch: java.lang.Throwable -> La7
            r7.setCheckMarkTintMode(r1)     // Catch: java.lang.Throwable -> La7
        L9c:
            r8.n()
            androidx.appcompat.widget.h r8 = r7.getEmojiTextViewHelper()
            r8.b(r9, r0)
            return
        La7:
            r9 = move-exception
            r8.n()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatCheckedTextView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private h getEmojiTextViewHelper() {
        if (this.f947v == null) {
            this.f947v = new h(this);
        }
        return this.f947v;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f946u;
        if (pVar != null) {
            pVar.b();
        }
        c cVar = this.f945t;
        if (cVar != null) {
            cVar.a();
        }
        d dVar = this.f944s;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return r0.j.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        c cVar = this.f945t;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c cVar = this.f945t;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        d dVar = this.f944s;
        if (dVar != null) {
            return dVar.f1142b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        d dVar = this.f944s;
        if (dVar != null) {
            return dVar.f1143c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f946u.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f946u.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a0.a.T0(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c cVar = this.f945t;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        c cVar = this.f945t;
        if (cVar != null) {
            cVar.f(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        d dVar = this.f944s;
        if (dVar != null) {
            if (dVar.f) {
                dVar.f = false;
            } else {
                dVar.f = true;
                dVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f946u;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f946u;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(r0.j.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        c cVar = this.f945t;
        if (cVar != null) {
            cVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        c cVar = this.f945t;
        if (cVar != null) {
            cVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        d dVar = this.f944s;
        if (dVar != null) {
            dVar.f1142b = colorStateList;
            dVar.f1144d = true;
            dVar.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        d dVar = this.f944s;
        if (dVar != null) {
            dVar.f1143c = mode;
            dVar.f1145e = true;
            dVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        p pVar = this.f946u;
        pVar.l(colorStateList);
        pVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        p pVar = this.f946u;
        pVar.m(mode);
        pVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        p pVar = this.f946u;
        if (pVar != null) {
            pVar.g(i10, context);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(g.a.a(getContext(), i10));
    }
}
