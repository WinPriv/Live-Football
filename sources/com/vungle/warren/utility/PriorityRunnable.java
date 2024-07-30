package com.vungle.warren.utility;

/* loaded from: classes2.dex */
public abstract class PriorityRunnable implements Comparable, Runnable {
    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof PriorityRunnable) {
            return ((PriorityRunnable) obj).getPriority().compareTo(getPriority());
        }
        return -1;
    }

    public abstract Integer getPriority();
}
