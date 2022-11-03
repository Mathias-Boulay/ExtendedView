package fr.spse.extended_view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;


public class ExtendedTextView extends TextView implements ExtendedView {

    private final ExtendedViewData mExtendedViewData = new ExtendedViewData(this);

    public ExtendedTextView(Context context) {
        super(context);
        initExtendedView(context, null);
    }

    public ExtendedTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initExtendedView(context,  attrs);
    }

    public ExtendedTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initExtendedView(context,  attrs);
    }

    @Override
    public void setCompoundDrawables(Drawable left, Drawable top, Drawable right, Drawable bottom) {
        super.setCompoundDrawablesRelative(left, top, right, bottom);
        postProcessDrawables();
    }

    @Override
    public void setCompoundDrawablesWithIntrinsicBounds(int left, int top, int right, int bottom) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(left, top, right, bottom);
        postProcessDrawables();
    }

    @Override
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable left, Drawable top, Drawable right, Drawable bottom) {
        super.setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom);
        postProcessDrawables();
    }

    @Override
    public void setCompoundDrawablesRelative(Drawable start, Drawable top, Drawable end, Drawable bottom) {
        super.setCompoundDrawablesRelative(start, top, end, bottom);
        postProcessDrawables();
    }

    @Override
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int start, int top, int end, int bottom) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
        postProcessDrawables();
    }

    @Override
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable start, Drawable top, Drawable end, Drawable bottom) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
        postProcessDrawables();
    }

    @Override
    public ExtendedViewData getExtendedViewData() {
        return mExtendedViewData;
    }

    @Override
    public Drawable[] getCompoundsDrawables() {
        return getCompoundDrawablesRelative();
    }

    @Override
    public void setCompoundsDrawables(Drawable[] drawables) {
        setCompoundDrawablesRelative(drawables[0], drawables[1], drawables[2], drawables[3]);
    }
}

