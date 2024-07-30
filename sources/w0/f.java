package w0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: EmojiTextViewHelper.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final b f36023a;

    /* compiled from: EmojiTextViewHelper.java */
    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f36024a;

        /* renamed from: b, reason: collision with root package name */
        public final d f36025b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f36026c = true;

        public a(TextView textView) {
            this.f36024a = textView;
            this.f36025b = new d(textView);
        }

        @Override // w0.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f36026c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                    InputFilter inputFilter = inputFilterArr[i10];
                    if (inputFilter instanceof d) {
                        sparseArray.put(i10, inputFilter);
                    }
                }
                if (sparseArray.size() != 0) {
                    int length = inputFilterArr.length;
                    InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                    int i11 = 0;
                    for (int i12 = 0; i12 < length; i12++) {
                        if (sparseArray.indexOfKey(i12) < 0) {
                            inputFilterArr2[i11] = inputFilterArr[i12];
                            i11++;
                        }
                    }
                    return inputFilterArr2;
                }
                return inputFilterArr;
            }
            int length2 = inputFilterArr.length;
            int i13 = 0;
            while (true) {
                d dVar = this.f36025b;
                if (i13 < length2) {
                    if (inputFilterArr[i13] != dVar) {
                        i13++;
                    } else {
                        return inputFilterArr;
                    }
                } else {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = dVar;
                    return inputFilterArr3;
                }
            }
        }

        @Override // w0.f.b
        public final boolean b() {
            return this.f36026c;
        }

        @Override // w0.f.b
        public final void c(boolean z10) {
            if (z10) {
                TextView textView = this.f36024a;
                textView.setTransformationMethod(e(textView.getTransformationMethod()));
            }
        }

        @Override // w0.f.b
        public final void d(boolean z10) {
            this.f36026c = z10;
            TextView textView = this.f36024a;
            textView.setTransformationMethod(e(textView.getTransformationMethod()));
            textView.setFilters(a(textView.getFilters()));
        }

        @Override // w0.f.b
        public final TransformationMethod e(TransformationMethod transformationMethod) {
            if (this.f36026c) {
                if (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                    return new h(transformationMethod);
                }
                return transformationMethod;
            }
            if (transformationMethod instanceof h) {
                return ((h) transformationMethod).f36033s;
            }
            return transformationMethod;
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    /* loaded from: classes.dex */
    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z10) {
            throw null;
        }

        public void d(boolean z10) {
            throw null;
        }

        public TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    /* loaded from: classes.dex */
    public static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final a f36027a;

        public c(TextView textView) {
            this.f36027a = new a(textView);
        }

        @Override // w0.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            boolean z10;
            if (androidx.emoji2.text.f.f1619j != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return inputFilterArr;
            }
            return this.f36027a.a(inputFilterArr);
        }

        @Override // w0.f.b
        public final boolean b() {
            return this.f36027a.f36026c;
        }

        @Override // w0.f.b
        public final void c(boolean z10) {
            boolean z11;
            if (androidx.emoji2.text.f.f1619j != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                return;
            }
            this.f36027a.c(z10);
        }

        @Override // w0.f.b
        public final void d(boolean z10) {
            boolean z11;
            if (androidx.emoji2.text.f.f1619j != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !z11;
            a aVar = this.f36027a;
            if (z12) {
                aVar.f36026c = z10;
            } else {
                aVar.d(z10);
            }
        }

        @Override // w0.f.b
        public final TransformationMethod e(TransformationMethod transformationMethod) {
            boolean z10;
            if (androidx.emoji2.text.f.f1619j != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return null;
            }
            return this.f36027a.e(null);
        }
    }

    public f(TextView textView) {
        if (textView != null) {
            this.f36023a = new c(textView);
            return;
        }
        throw new NullPointerException("textView cannot be null");
    }
}
