package h6;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* compiled from: ImageMatrixProperty.java */
/* loaded from: classes2.dex */
public final class e extends Property<ImageView, Matrix> {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f28776a;

    public e() {
        super(Matrix.class, "imageMatrixProperty");
        this.f28776a = new Matrix();
    }

    @Override // android.util.Property
    public final Matrix get(ImageView imageView) {
        Matrix matrix = this.f28776a;
        matrix.set(imageView.getImageMatrix());
        return matrix;
    }

    @Override // android.util.Property
    public final void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
