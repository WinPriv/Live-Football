package w0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.f;
import java.lang.ref.WeakReference;

/* compiled from: EmojiInputFilter.java */
/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f36017a;

    /* renamed from: b, reason: collision with root package name */
    public a f36018b;

    /* compiled from: EmojiInputFilter.java */
    /* loaded from: classes.dex */
    public static class a extends f.e {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f36019a;

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference f36020b;

        public a(TextView textView, d dVar) {
            this.f36019a = new WeakReference(textView);
            this.f36020b = new WeakReference(dVar);
        }

        @Override // androidx.emoji2.text.f.e
        public final void b() {
            boolean z10;
            int length;
            InputFilter[] filters;
            TextView textView = (TextView) this.f36019a.get();
            InputFilter inputFilter = (InputFilter) this.f36020b.get();
            if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                for (InputFilter inputFilter2 : filters) {
                    if (inputFilter2 == inputFilter) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            if (z10 && textView.isAttachedToWindow()) {
                CharSequence text = textView.getText();
                androidx.emoji2.text.f a10 = androidx.emoji2.text.f.a();
                if (text == null) {
                    length = 0;
                } else {
                    a10.getClass();
                    length = text.length();
                }
                CharSequence f = a10.f(0, length, text);
                if (text == f) {
                    return;
                }
                int selectionStart = Selection.getSelectionStart(f);
                int selectionEnd = Selection.getSelectionEnd(f);
                textView.setText(f);
                if (f instanceof Spannable) {
                    Spannable spannable = (Spannable) f;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                    } else if (selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionEnd);
                    }
                }
            }
        }
    }

    public d(TextView textView) {
        this.f36017a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        TextView textView = this.f36017a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b10 = androidx.emoji2.text.f.a().b();
        if (b10 != 0) {
            boolean z10 = true;
            if (b10 != 1) {
                if (b10 != 3) {
                    return charSequence;
                }
            } else {
                if (i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == textView.getText()) {
                    z10 = false;
                }
                if (z10 && charSequence != null) {
                    if (i10 != 0 || i11 != charSequence.length()) {
                        charSequence = charSequence.subSequence(i10, i11);
                    }
                    return androidx.emoji2.text.f.a().f(0, charSequence.length(), charSequence);
                }
                return charSequence;
            }
        }
        androidx.emoji2.text.f a10 = androidx.emoji2.text.f.a();
        if (this.f36018b == null) {
            this.f36018b = new a(textView, this);
        }
        a10.g(this.f36018b);
        return charSequence;
    }
}
