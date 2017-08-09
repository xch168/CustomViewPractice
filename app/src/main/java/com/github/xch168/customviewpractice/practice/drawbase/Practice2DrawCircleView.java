package com.github.xch168.customviewpractice.practice.drawbase;


import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View
{
    public Practice2DrawCircleView(Context context)
    {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs)
    {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);

    }
}
