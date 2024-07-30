package androidx.constraintlayout.utils.widget;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatButton;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class MotionButton extends AppCompatButton {

    /* renamed from: v, reason: collision with root package name */
    public float f1340v;

    /* renamed from: w, reason: collision with root package name */
    public float f1341w;

    /* renamed from: x, reason: collision with root package name */
    public Path f1342x;
    public ViewOutlineProvider y;

    /* renamed from: z, reason: collision with root package name */
    public RectF f1343z;

    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            MotionButton motionButton = MotionButton.this;
            outline.setRoundRect(0, 0, motionButton.getWidth(), motionButton.getHeight(), (Math.min(r3, r4) * motionButton.f1340v) / 2.0f);
        }
    }

    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            MotionButton motionButton = MotionButton.this;
            outline.setRoundRect(0, 0, motionButton.getWidth(), motionButton.getHeight(), motionButton.f1341w);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getRound() {
        return this.f1341w;
    }

    public float getRoundPercent() {
        return this.f1340v;
    }

    public void setRound(float f) {
        boolean z10;
        if (Float.isNaN(f)) {
            this.f1341w = f;
            float f10 = this.f1340v;
            this.f1340v = -1.0f;
            setRoundPercent(f10);
            return;
        }
        if (this.f1341w != f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1341w = f;
        if (f != gl.Code) {
            if (this.f1342x == null) {
                this.f1342x = new Path();
            }
            if (this.f1343z == null) {
                this.f1343z = new RectF();
            }
            if (this.y == null) {
                b bVar = new b();
                this.y = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f1343z.set(gl.Code, gl.Code, getWidth(), getHeight());
            this.f1342x.reset();
            Path path = this.f1342x;
            RectF rectF = this.f1343z;
            float f11 = this.f1341w;
            path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z10;
        if (this.f1340v != f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1340v = f;
        if (f != gl.Code) {
            if (this.f1342x == null) {
                this.f1342x = new Path();
            }
            if (this.f1343z == null) {
                this.f1343z = new RectF();
            }
            if (this.y == null) {
                a aVar = new a();
                this.y = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f1340v) / 2.0f;
            this.f1343z.set(gl.Code, gl.Code, width, height);
            this.f1342x.reset();
            this.f1342x.addRoundRect(this.f1343z, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }
}
