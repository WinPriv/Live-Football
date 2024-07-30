package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.emoji2.text.f;
import androidx.emoji2.text.n;
import f0.c;

/* compiled from: EmojiProcessor.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final f.i f1645a;

    /* renamed from: b, reason: collision with root package name */
    public final n f1646b;

    /* renamed from: c, reason: collision with root package name */
    public final f.d f1647c;

    /* compiled from: EmojiProcessor.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f1648a = 1;

        /* renamed from: b, reason: collision with root package name */
        public final n.a f1649b;

        /* renamed from: c, reason: collision with root package name */
        public n.a f1650c;

        /* renamed from: d, reason: collision with root package name */
        public n.a f1651d;

        /* renamed from: e, reason: collision with root package name */
        public int f1652e;
        public int f;

        public a(n.a aVar) {
            this.f1649b = aVar;
            this.f1650c = aVar;
        }

        public final int a(int i10) {
            n.a aVar;
            boolean z10;
            SparseArray<n.a> sparseArray = this.f1650c.f1669a;
            if (sparseArray == null) {
                aVar = null;
            } else {
                aVar = sparseArray.get(i10);
            }
            int i11 = 1;
            if (this.f1648a != 2) {
                if (aVar == null) {
                    b();
                } else {
                    this.f1648a = 2;
                    this.f1650c = aVar;
                    this.f = 1;
                    i11 = 2;
                }
            } else {
                if (aVar != null) {
                    this.f1650c = aVar;
                    this.f++;
                } else {
                    boolean z11 = false;
                    if (i10 == 65038) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        b();
                    } else {
                        if (i10 == 65039) {
                            z11 = true;
                        }
                        if (!z11) {
                            n.a aVar2 = this.f1650c;
                            if (aVar2.f1670b != null) {
                                if (this.f == 1) {
                                    if (c()) {
                                        this.f1651d = this.f1650c;
                                        b();
                                    } else {
                                        b();
                                    }
                                } else {
                                    this.f1651d = aVar2;
                                    b();
                                }
                                i11 = 3;
                            } else {
                                b();
                            }
                        }
                    }
                }
                i11 = 2;
            }
            this.f1652e = i10;
            return i11;
        }

        public final void b() {
            this.f1648a = 1;
            this.f1650c = this.f1649b;
            this.f = 0;
        }

        public final boolean c() {
            boolean z10;
            boolean z11;
            v0.a c10 = this.f1650c.f1670b.c();
            int a10 = c10.a(6);
            if (a10 != 0 && c10.f35905b.get(a10 + c10.f35904a) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
            if (this.f1652e == 65039) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                return false;
            }
            return true;
        }
    }

    public j(n nVar, f.i iVar, d dVar) {
        this.f1645a = iVar;
        this.f1646b = nVar;
        this.f1647c = dVar;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        boolean z11;
        k[] kVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11 && (kVarArr = (k[]) editable.getSpans(selectionStart, selectionEnd, k.class)) != null && kVarArr.length > 0) {
            for (k kVar : kVarArr) {
                int spanStart = editable.getSpanStart(kVar);
                int spanEnd = editable.getSpanEnd(kVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i10, int i11, i iVar) {
        int i12;
        if (iVar.f1644c == 0) {
            f.d dVar = this.f1647c;
            v0.a c10 = iVar.c();
            int a10 = c10.a(8);
            if (a10 != 0) {
                c10.f35905b.getShort(a10 + c10.f35904a);
            }
            d dVar2 = (d) dVar;
            dVar2.getClass();
            ThreadLocal<StringBuilder> threadLocal = d.f1615b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = threadLocal.get();
            sb2.setLength(0);
            while (i10 < i11) {
                sb2.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = dVar2.f1616a;
            String sb3 = sb2.toString();
            int i13 = f0.c.f27903a;
            if (c.a.a(textPaint, sb3)) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            iVar.f1644c = i12;
        }
        if (iVar.f1644c != 2) {
            return false;
        }
        return true;
    }
}
