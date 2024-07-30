package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.appcompat.widget.o;
import com.hamkho.livefoot.R;
import n0.c;

/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements n0.u {

    /* renamed from: s, reason: collision with root package name */
    public final c f948s;

    /* renamed from: t, reason: collision with root package name */
    public final p f949t;

    /* renamed from: u, reason: collision with root package name */
    public final o f950u;

    /* renamed from: v, reason: collision with root package name */
    public final r0.k f951v;

    /* renamed from: w, reason: collision with root package name */
    public final g f952w;

    /* renamed from: x, reason: collision with root package name */
    public a f953x;

    /* loaded from: classes.dex */
    public class a {
        public a() {
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private a getSuperCaller() {
        if (this.f953x == null) {
            this.f953x = new a();
        }
        return this.f953x;
    }

    @Override // n0.u
    public final n0.c a(n0.c cVar) {
        return this.f951v.a(this, cVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c cVar = this.f948s;
        if (cVar != null) {
            cVar.a();
        }
        p pVar = this.f949t;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return r0.j.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        c cVar = this.f948s;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c cVar = this.f948s;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f949t.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f949t.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        o oVar;
        if (Build.VERSION.SDK_INT < 28 && (oVar = this.f950u) != null) {
            TextClassifier textClassifier = oVar.f1211b;
            if (textClassifier == null) {
                return o.a.a(oVar.f1210a);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r1 != null) goto L23;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            androidx.appcompat.widget.p r1 = r7.f949t
            r1.getClass()
            androidx.appcompat.widget.p.h(r7, r0, r8)
            a0.a.T0(r7, r8, r0)
            if (r0 == 0) goto L77
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L77
            java.lang.String[] r2 = n0.c0.f(r7)
            if (r2 == 0) goto L77
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            q0.a.c(r8, r2)
            goto L3e
        L29:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L34
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L34:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L3e:
            q0.d r2 = new q0.d
            r6 = 0
            r2.<init>(r7, r6)
            if (r1 < r5) goto L4d
            q0.e r1 = new q0.e
            r1.<init>(r0, r2)
        L4b:
            r0 = r1
            goto L77
        L4d:
            java.lang.String[] r6 = q0.c.f34552a
            if (r1 < r5) goto L59
            java.lang.String[] r1 = q0.b.c(r8)
            if (r1 == 0) goto L6d
        L57:
            r6 = r1
            goto L6d
        L59:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5e
            goto L6d
        L5e:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L6a
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L6a:
            if (r1 == 0) goto L6d
            goto L57
        L6d:
            int r1 = r6.length
            if (r1 != 0) goto L71
            goto L77
        L71:
            q0.f r1 = new q0.f
            r1.<init>(r0, r2)
            goto L4b
        L77:
            androidx.appcompat.widget.g r1 = r7.f952w
            android.view.inputmethod.InputConnection r8 = r1.h(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatEditText.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z10 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && n0.c0.f(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z10 = l.a(dragEvent, this, activity);
            }
        }
        if (z10) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        ClipData primaryClip;
        c.b c0443c;
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 0;
        if (i11 < 31 && n0.c0.f(this) != null && (i10 == 16908322 || i10 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i11 >= 31) {
                    c0443c = new c.a(primaryClip, 1);
                } else {
                    c0443c = new c.C0443c(primaryClip, 1);
                }
                if (i10 != 16908322) {
                    i12 = 1;
                }
                c0443c.b(i12);
                n0.c0.h(this, c0443c.build());
            }
            i12 = 1;
        }
        if (i12 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c cVar = this.f948s;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        c cVar = this.f948s;
        if (cVar != null) {
            cVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f949t;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f949t;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(r0.j.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f952w.j(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f952w.d(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        c cVar = this.f948s;
        if (cVar != null) {
            cVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        c cVar = this.f948s;
        if (cVar != null) {
            cVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        p pVar = this.f949t;
        pVar.l(colorStateList);
        pVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        p pVar = this.f949t;
        pVar.m(mode);
        pVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        p pVar = this.f949t;
        if (pVar != null) {
            pVar.g(i10, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        o oVar;
        if (Build.VERSION.SDK_INT >= 28 || (oVar = this.f950u) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            oVar.f1211b = textClassifier;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.editTextStyle);
        j0.a(context);
        h0.a(getContext(), this);
        c cVar = new c(this);
        this.f948s = cVar;
        cVar.d(attributeSet, R.attr.editTextStyle);
        p pVar = new p(this);
        this.f949t = pVar;
        pVar.f(attributeSet, R.attr.editTextStyle);
        pVar.b();
        this.f950u = new o(this);
        this.f951v = new r0.k();
        g gVar = new g(this);
        this.f952w = gVar;
        gVar.g(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener d10 = gVar.d(keyListener);
            if (d10 == keyListener) {
                return;
            }
            super.setKeyListener(d10);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
