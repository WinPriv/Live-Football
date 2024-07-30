package w0;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.o;

/* compiled from: EmojiEditableFactory.java */
/* loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f36012a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile b f36013b;

    /* renamed from: c, reason: collision with root package name */
    public static Class<?> f36014c;

    @SuppressLint({"PrivateApi"})
    public b() {
        try {
            f36014c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f36014c;
        if (cls != null) {
            return new o(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
