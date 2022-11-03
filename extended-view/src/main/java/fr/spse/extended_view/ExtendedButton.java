package fr.spse.extended_view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Simple class aiming at bringing more options easily to deal with simple things,
 * Android never thought to include them somehow
 */
public class ExtendedButton extends Button implements ExtendedView {

    private ExtendedViewData mExtendedViewData = new ExtendedViewData(this);


    public ExtendedButton(Context context) {
        super(context);
        initExtendedView(context, null);
    }

    public ExtendedButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        initExtendedView(context, attrs);
    }

    public ExtendedButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initExtendedView(context, attrs);
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

    /* Interface implementation starts here. */
    @Override
    public ExtendedViewData getExtendedViewData(){
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
