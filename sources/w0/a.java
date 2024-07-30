package w0;

import android.widget.EditText;

/* compiled from: EmojiEditTextHelper.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0497a f36009a;

    /* compiled from: EmojiEditTextHelper.java */
    /* renamed from: w0.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0497a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final EditText f36010a;

        /* renamed from: b, reason: collision with root package name */
        public final g f36011b;

        public C0497a(EditText editText) {
            this.f36010a = editText;
            g gVar = new g(editText);
            this.f36011b = gVar;
            editText.addTextChangedListener(gVar);
            if (w0.b.f36013b == null) {
                synchronized (w0.b.f36012a) {
                    if (w0.b.f36013b == null) {
                        w0.b.f36013b = new w0.b();
                    }
                }
            }
            editText.setEditableFactory(w0.b.f36013b);
        }
    }

    /* compiled from: EmojiEditTextHelper.java */
    /* loaded from: classes.dex */
    public static class b {
    }

    public a(EditText editText) {
        if (editText != null) {
            this.f36009a = new C0497a(editText);
            return;
        }
        throw new NullPointerException("editText cannot be null");
    }
}
