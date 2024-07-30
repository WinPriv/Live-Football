package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;
import java.util.HashMap;
import q.e;

/* loaded from: classes.dex */
public class CircularFlow extends VirtualLayout {
    public static int M;
    public static float N;
    public ConstraintLayout C;
    public int D;
    public float[] E;
    public int[] F;
    public int G;
    public int H;
    public String I;
    public String J;
    public Float K;
    public Integer L;

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.H = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                q(str.substring(i10).trim());
                return;
            } else {
                q(str.substring(i10, indexOf).trim());
                i10 = indexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.G = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                r(str.substring(i10).trim());
                return;
            } else {
                r(str.substring(i10, indexOf).trim());
                i10 = indexOf + 1;
            }
        }
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.E, this.H);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.F, this.G);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.f34521z);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 33) {
                    this.D = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == 29) {
                    String string = obtainStyledAttributes.getString(index);
                    this.I = string;
                    setAngles(string);
                } else if (index == 32) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.J = string2;
                    setRadius(string2);
                } else if (index == 30) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, N));
                    this.K = valueOf;
                    setDefaultAngle(valueOf.floatValue());
                } else if (index == 31) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, M));
                    this.L = valueOf2;
                    setDefaultRadius(valueOf2.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.I;
        if (str != null) {
            this.E = new float[1];
            setAngles(str);
        }
        String str2 = this.J;
        if (str2 != null) {
            this.F = new int[1];
            setRadius(str2);
        }
        Float f = this.K;
        if (f != null) {
            setDefaultAngle(f.floatValue());
        }
        Integer num = this.L;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        this.C = (ConstraintLayout) getParent();
        for (int i10 = 0; i10 < this.f1357t; i10++) {
            View b10 = this.C.b(this.f1356s[i10]);
            if (b10 != null) {
                int i11 = M;
                float f10 = N;
                int[] iArr = this.F;
                HashMap<Integer, String> hashMap = this.f1362z;
                if (iArr != null && i10 < iArr.length) {
                    i11 = iArr[i10];
                } else {
                    Integer num2 = this.L;
                    if (num2 != null && num2.intValue() != -1) {
                        this.G++;
                        if (this.F == null) {
                            this.F = new int[1];
                        }
                        int[] radius = getRadius();
                        this.F = radius;
                        radius[this.G - 1] = i11;
                    } else {
                        Log.e("CircularFlow", "Added radius to view with id: " + hashMap.get(Integer.valueOf(b10.getId())));
                    }
                }
                float[] fArr = this.E;
                if (fArr != null && i10 < fArr.length) {
                    f10 = fArr[i10];
                } else {
                    Float f11 = this.K;
                    if (f11 != null && f11.floatValue() != -1.0f) {
                        this.H++;
                        if (this.E == null) {
                            this.E = new float[1];
                        }
                        float[] angles = getAngles();
                        this.E = angles;
                        angles[this.H - 1] = f10;
                    } else {
                        Log.e("CircularFlow", "Added angle to view with id: " + hashMap.get(Integer.valueOf(b10.getId())));
                    }
                }
                ConstraintLayout.a aVar = (ConstraintLayout.a) b10.getLayoutParams();
                aVar.f1402r = f10;
                aVar.f1398p = this.D;
                aVar.f1400q = i11;
                b10.setLayoutParams(aVar);
            }
        }
        f();
    }

    public final void q(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.f1358u == null || (fArr = this.E) == null) {
            return;
        }
        if (this.H + 1 > fArr.length) {
            this.E = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.E[this.H] = Integer.parseInt(str);
        this.H++;
    }

    public final void r(String str) {
        Context context;
        int[] iArr;
        if (str == null || str.length() == 0 || (context = this.f1358u) == null || (iArr = this.F) == null) {
            return;
        }
        if (this.G + 1 > iArr.length) {
            this.F = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.F[this.G] = (int) (Integer.parseInt(str) * context.getResources().getDisplayMetrics().density);
        this.G++;
    }

    public void setDefaultAngle(float f) {
        N = f;
    }

    public void setDefaultRadius(int i10) {
        M = i10;
    }
}
