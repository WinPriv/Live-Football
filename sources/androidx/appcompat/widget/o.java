package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: AppCompatTextClassifierHelper.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f1210a;

    /* renamed from: b, reason: collision with root package name */
    public TextClassifier f1211b;

    /* compiled from: AppCompatTextClassifierHelper.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static TextClassifier a(TextView textView) {
            TextClassifier textClassifier;
            TextClassifier textClassifier2;
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                textClassifier2 = textClassificationManager.getTextClassifier();
                return textClassifier2;
            }
            textClassifier = TextClassifier.NO_OP;
            return textClassifier;
        }
    }

    public o(TextView textView) {
        textView.getClass();
        this.f1210a = textView;
    }
}
