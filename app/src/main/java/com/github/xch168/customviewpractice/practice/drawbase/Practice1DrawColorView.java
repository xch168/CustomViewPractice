package com.github.xch168.customviewpractice.practice.drawbase;


import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice1DrawColorView extends View
{
    public Practice1DrawColorView(Context context)
    {
        super(context);
    }

    public Practice1DrawColorView(Context context, @Nullable AttributeSet attrs)
    {
        super(context, attrs);
    }

    public Practice1DrawColorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);

    }
}
