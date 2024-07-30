package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.EditText;
import androidx.cardview.widget.CardView;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.linked.view.LinkedAppDetailView;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ka.f7;
import w0.a;
import w0.g;

/* compiled from: AppCompatEmojiEditTextHelper.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1173a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1174b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1175c;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.f1173a = i10;
        this.f1174b = obj;
        this.f1175c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.appcompat.widget.g b(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L32 java.io.IOException -> L34
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L32 java.io.IOException -> L34
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L32 java.io.IOException -> L34
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L32 java.io.IOException -> L34
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L32 java.io.IOException -> L34
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L32 java.io.IOException -> L34
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L28 java.lang.Error -> L2a java.io.IOException -> L2c
            androidx.appcompat.widget.g r2 = new androidx.appcompat.widget.g     // Catch: java.nio.channels.OverlappingFileLockException -> L22 java.lang.Error -> L24 java.io.IOException -> L26
            r3 = 3
            r2.<init>(r3, r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L22 java.lang.Error -> L24 java.io.IOException -> L26
            return r2
        L22:
            r2 = move-exception
            goto L38
        L24:
            r2 = move-exception
            goto L38
        L26:
            r2 = move-exception
            goto L38
        L28:
            r0 = move-exception
            goto L2d
        L2a:
            r0 = move-exception
            goto L2d
        L2c:
            r0 = move-exception
        L2d:
            r2 = r0
            r0 = r1
            goto L38
        L30:
            r5 = move-exception
            goto L35
        L32:
            r5 = move-exception
            goto L35
        L34:
            r5 = move-exception
        L35:
            r2 = r5
            r5 = r1
            r0 = r5
        L38:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L44
            r0.release()     // Catch: java.io.IOException -> L44
        L44:
            if (r5 == 0) goto L49
            r5.close()     // Catch: java.io.IOException -> L49
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g.b(android.content.Context):androidx.appcompat.widget.g");
    }

    public static g f(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.watchad, (ViewGroup) null, false);
        Button button = (Button) a0.a.H0(R.id.Watch, inflate);
        if (button != null) {
            return new g(4, (CardView) inflate, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.Watch)));
    }

    public final void a() {
        boolean z10;
        ContentRecord contentRecord;
        if (((LinkedAppDetailView) this.f1174b) != null) {
            Object obj = this.f1175c;
            if (((f7) obj) != null) {
                f7 f7Var = (f7) obj;
                if (f7Var != null && (contentRecord = f7Var.f31166b) != null && contentRecord.j0() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ((LinkedAppDetailView) this.f1174b).setAdLandingData(((f7) this.f1175c).f31166b);
                    ((LinkedAppDetailView) this.f1174b).setVisibility(0);
                }
            }
        }
    }

    public final boolean c() {
        Object obj = this.f1174b;
        if (((LinkedAppDetailView) obj) == null || ((LinkedAppDetailView) obj).getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final KeyListener d(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((w0.a) this.f1175c).f36009a.getClass();
            if (!(keyListener instanceof w0.e)) {
                if (keyListener == null) {
                    return null;
                }
                if (!(keyListener instanceof NumberKeyListener)) {
                    return new w0.e(keyListener);
                }
                return keyListener;
            }
            return keyListener;
        }
        return keyListener;
    }

    public final synchronized Map e() {
        if (((Map) this.f1175c) == null) {
            this.f1175c = Collections.unmodifiableMap(new HashMap((Map) this.f1174b));
        }
        return (Map) this.f1175c;
    }

    public final void g(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = ((EditText) this.f1174b).getContext().obtainStyledAttributes(attributeSet, a0.a.K, i10, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            j(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final InputConnection h(InputConnection inputConnection, EditorInfo editorInfo) {
        w0.a aVar = (w0.a) this.f1175c;
        if (inputConnection == null) {
            aVar.getClass();
            return null;
        }
        a.C0497a c0497a = aVar.f36009a;
        c0497a.getClass();
        if (!(inputConnection instanceof w0.c)) {
            return new w0.c(c0497a.f36010a, inputConnection, editorInfo);
        }
        return inputConnection;
    }

    public final void i() {
        try {
            ((FileLock) this.f1175c).release();
            ((FileChannel) this.f1174b).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    public final void j(boolean z10) {
        w0.g gVar = ((w0.a) this.f1175c).f36009a.f36011b;
        if (gVar.f36031v != z10) {
            if (gVar.f36030u != null) {
                androidx.emoji2.text.f a10 = androidx.emoji2.text.f.a();
                g.a aVar = gVar.f36030u;
                a10.getClass();
                a0.a.y0(aVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a10.f1620a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a10.f1621b.remove(aVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            gVar.f36031v = z10;
            if (z10) {
                w0.g.a(gVar.f36028s, androidx.emoji2.text.f.a().b());
            }
        }
    }

    public final String toString() {
        switch (this.f1173a) {
            case 1:
                return ((String) this.f1174b) + ", " + ((String) this.f1175c);
            default:
                return super.toString();
        }
    }

    public g(EditText editText) {
        this.f1173a = 0;
        this.f1174b = editText;
        this.f1175c = new w0.a(editText);
    }

    public g(int i10) {
        this.f1173a = i10;
        if (i10 != 5) {
            this.f1174b = new HashMap();
        }
    }
}
