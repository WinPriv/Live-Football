package w0;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.f;
import java.lang.ref.WeakReference;

/* compiled from: EmojiTextWatcher.java */
/* loaded from: classes.dex */
public final class g implements TextWatcher {

    /* renamed from: s, reason: collision with root package name */
    public final EditText f36028s;

    /* renamed from: u, reason: collision with root package name */
    public a f36030u;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f36029t = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f36031v = true;

    /* compiled from: EmojiTextWatcher.java */
    /* loaded from: classes.dex */
    public static class a extends f.e {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f36032a;

        public a(EditText editText) {
            this.f36032a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.f.e
        public final void b() {
            g.a((EditText) this.f36032a.get(), 1);
        }
    }

    public g(EditText editText) {
        this.f36028s = editText;
    }

    public static void a(EditText editText, int i10) {
        int length;
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.f a10 = androidx.emoji2.text.f.a();
            if (editableText == null) {
                length = 0;
            } else {
                a10.getClass();
                length = editableText.length();
            }
            a10.f(0, length, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r1 == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            android.widget.EditText r0 = r4.f36028s
            boolean r1 = r0.isInEditMode()
            if (r1 != 0) goto L54
            boolean r1 = r4.f36031v
            r2 = 1
            if (r1 == 0) goto L1b
            boolean r1 = r4.f36029t
            r3 = 0
            if (r1 != 0) goto L1c
            androidx.emoji2.text.f r1 = androidx.emoji2.text.f.f1619j
            if (r1 == 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r3
        L19:
            if (r1 != 0) goto L1c
        L1b:
            r3 = r2
        L1c:
            if (r3 == 0) goto L1f
            goto L54
        L1f:
            if (r7 > r8) goto L54
            boolean r7 = r5 instanceof android.text.Spannable
            if (r7 == 0) goto L54
            androidx.emoji2.text.f r7 = androidx.emoji2.text.f.a()
            int r7 = r7.b()
            if (r7 == 0) goto L40
            if (r7 == r2) goto L35
            r5 = 3
            if (r7 == r5) goto L40
            goto L54
        L35:
            android.text.Spannable r5 = (android.text.Spannable) r5
            androidx.emoji2.text.f r7 = androidx.emoji2.text.f.a()
            int r8 = r8 + r6
            r7.f(r6, r8, r5)
            goto L54
        L40:
            androidx.emoji2.text.f r5 = androidx.emoji2.text.f.a()
            w0.g$a r6 = r4.f36030u
            if (r6 != 0) goto L4f
            w0.g$a r6 = new w0.g$a
            r6.<init>(r0)
            r4.f36030u = r6
        L4f:
            w0.g$a r6 = r4.f36030u
            r5.g(r6)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.g.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
